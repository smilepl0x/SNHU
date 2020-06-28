/**
 * Original Author: Danny Faught
 * Created: 5/23/2020
 * SNHU, CS-210, 3-1 Project One
 * 
 * Purpose: Displays current time in 12 and 24 hour format and allows
 * for modification of time by adding hours, minutes, or seconds.
**/

#include <iostream>
#include <conio.h>
#include <windows.h>

#include "clocklogic.cpp"
#include "menufunctions.cpp"

using namespace std;

int main() {
    userAdd add; // User definition object
    int keyPress = 0;

    while (keyPress == 0) {
    
        while (!_kbhit()) { // Displays until keystroke in buffer
            system("CLS");
            Display12HrTime(add);
            Display24HrTime(add);
            Sleep(1000);
        }
        
        system("CLS");
        DisplayMenu();
        cout << "Please make a selection: ";
        cin >> keyPress;
        if (cin.fail()) { // Checks for numeric response
            cin.clear();
            cin.ignore(INT_MAX, '\n');
            keyPress = 0;
        }

        switch (keyPress) {
            case 1:
                add = AddHour(add);
                keyPress = 0;
                break;
            case 2:
                add = AddMin(add);
                keyPress = 0;
                break;
            case 3:
                add = AddSec(add);
                keyPress = 0;
                break;
            case 4:
                cout << "Goodbye";
                break;
            default:
                cout << "Invalid Response";
                Sleep(1000);
                keyPress = 0;
                break;
        }
    }

    return 0;
}