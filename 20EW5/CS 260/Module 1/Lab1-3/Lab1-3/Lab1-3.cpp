//============================================================================
// Name        : Lab1-3.cpp
// Author      : Danny Faught, CS-260, 5/10/20
// Version     : 1.0
// Copyright   : Copyright © 2017 SNHU COCE
// Description : Lab 1-3 Up to Speed in C++
//============================================================================

#include <algorithm>
#include <iostream>

using namespace std;

//============================================================================
// Global definitions visible to all methods and classes
//============================================================================

// struct to hold item data
struct auctionItemData {
	string itemTitle;
	string itemFund;
	string vehicleId;
	double bidAmount;
};

/**
 * Display the bid information
 *
 * @param auctionItemData data structure containing the bid info
 */
void displayBid(auctionItemData item) {
    cout << "Title: " << item.itemTitle << endl;
    cout << "Fund: " << item.itemFund << endl;
    cout << "Vehicle: " << item.vehicleId << endl;
    cout << "Bid Amount: " << item.bidAmount << endl;

    return;
}

/**
 * Simple C function to convert a string to a double
 * after stripping out unwanted char
 *
 * credit: http://stackoverflow.com/a/24875936
 *
 * @param ch The character to strip out
 */
double strToDouble(string str, char ch) {
    str.erase(remove(str.begin(), str.end(), ch), str.end());
    return atof(str.c_str());
}

/**
 * Prompt user for bid information
 *
 * @return data structure containing the bid info
 */
auctionItemData getBid() {
    auctionItemData newBid;

    cout << "Enter title: ";
    cin.ignore();
    getline(cin, newBid.itemTitle);

    cout << "Enter fund: ";
    cin >> newBid.itemFund;

    cout << "Enter vehicle: ";
    cin.ignore();
    getline(cin, newBid.vehicleId);

    cout << "Enter amount: ";
    cin.ignore();
    string strAmount;
    getline(cin, strAmount);
    newBid.bidAmount = strToDouble(strAmount, '$');

    return newBid;
}


/**
 * The one and only main() method
 */
int main() {

    // instance of struct
	auctionItemData theBid;

    // loop to display menu until exit chosen
    int choice = 0;
    while (choice != 9) {
        cout << "Menu:" << endl;
        cout << "  1. Enter Bid" << endl;
        cout << "  2. Display Bid" << endl;
        cout << "  9. Exit" << endl;
        cout << "Enter choice: ";
        cin >> choice;

        // decision tree
        switch (choice) {
            case 1:
            	theBid = getBid();
                break;
            case 2:
                displayBid(theBid);
                break;
        }
    }

    cout << "Good bye." << endl;

    return 0;
}
