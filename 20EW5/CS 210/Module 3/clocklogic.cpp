/**
 * Original Author: Danny Faught
 * Created: 5/23/2020
 * SNHU, CS-210, 3-1 Project One
 * 
 * Component of: clocks.cpp
 * Purpose: Displays current time in 12 and 24 hour format and allows
 * for modification of time by adding hours, minutes, or seconds.
**/

#include <iostream>
#include <iomanip>
#include <string>
#include <ctime>

using namespace std;

struct userAdd { 
    int hours;
    int min;
    int sec;
    userAdd() {
        hours = 0;
        min = 0;
        sec = 0;
    }
};

/*
Accepts user defined struct and adds it's
elements (hour, min, sec) to the current time
and then displays the output in 24 hr format.
*/

void Display24HrTime(userAdd add) {
    time_t now =  time(0);
    tm *myTime = localtime(&now);

    int hours = myTime->tm_hour + add.hours;
    int min = myTime->tm_min + add.min;
    int sec = myTime->tm_sec + add.sec;

    if (sec >= 60) { // Overflow to min
        sec %= 60;
        min++;
    }
    
    if (min >= 60) { // Overflow to hour
        min %= 60;
        hours++;
    }

    if (hours >= 24) { // Overflow causes set to 0
        hours %= 24;
    }

    cout << "24-Hour Clock" << endl
    << setw(2) << setfill('0') << hours << ":"
    << setw(2) << min << ":"
    << setw(2) << sec << endl;
}


/*
Accepts user defined struct and adds it's
elements (hour, min, sec) to the current time
and then displays the output in 12 hr format.
*/
void Display12HrTime(userAdd add) {
    time_t now =  time(0);
    tm *myTime = localtime(&now);
    
    string suffix = "AM";

    int hours = myTime->tm_hour + add.hours;
    int min = myTime->tm_min + add.min;
    int sec = myTime->tm_sec + add.sec;

    if (sec >= 60) { // Overflow to min
        sec %= 60;
        min++;
    }
    
    if (min >= 60) { // Overflow to hour
        min %= 60;
        hours++;
    }

    /* 
    If hours > 12, if hours % 12 is 0
    then set hours to 12, if not, set
    hours to hours % 12. Count the number
    of times hours can be divded by 12.
    If it's odd, switch the suffix (AM/PM).
    */
    if (hours == 0) {
        hours = 12;
        suffix = "AM";
    }
    else if (hours == 12) {
        suffix = "PM";
    }
    else if (hours > 12) {
        int i = 0;
        i = hours / 12;
        if (hours % 12 == 0) {
            hours = 12;
        }
        else {
            hours %= 12;
        }
        if (i % 2 == 1) {
            if (suffix == "AM") {
                suffix = "PM";
            }
            else if (suffix == "PM") {
                suffix = "AM";
            }
        }
    }


    cout << "12-Hour Clock" << endl
    << setw(2) << setfill('0') << hours << ":" 
    << setw(2) << min << ":" 
    << setw(2) << sec << " " << suffix << endl;

}