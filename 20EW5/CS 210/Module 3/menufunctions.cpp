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
#include <ctime>
#include <conio.h>

using namespace std;

void DisplayMenu() {
    cout << "1 - Add One Hour" << endl
         << "2 - Add One Minute" << endl
         << "3 - Add One Second" << endl
         << "4 - Exit Program" << endl;  
}

/*
These methods accept a userAdd object,
modify it, and then pass it back to the
caller.
*/
userAdd AddHour(userAdd add) {
    add.hours++;
    return add;
}

userAdd AddMin(userAdd add) {
    add.min++;
    return add;
}

userAdd AddSec(userAdd add) {
    add.sec++;
    return add;
}