#include <iostream>
#include <string>
#include "userdata.h"

using namespace std;

int main()
{
    /* Display header, get user inputs, declare initial userData object. Throws
    error in case of letter input or repeats output if negative number input.
    */

    cout << "Welcome to Airgead Banking - Compound Interest Calculator" << endl
    << "---------------------------------------------------------" << endl;

    UserData userData;

    cout << "Please input your data." << endl;
    double userInputDouble;
    int userInputInt;
    try
    {
        while (userData.GetInitialInvestment() < 0)
        {
            cout << "Initial Investment Amount: $";
            cin >> userInputDouble;
            if (cin.fail())
            {
                throw "Not a number";
            }
            if (userInputDouble < 0) {
                cout << "Not a valid number" << endl;
            }
            userData.SetInitialInvestment(userInputDouble);
        }
        while (userData.GetMonthlyDeposit() < 0)
        {
            cout << "Monthly Deposit Amount: $";
            cin >> userInputDouble;
            if (cin.fail())
            {
                throw "Not a number";
            }
            if (userInputDouble < 0) {
                cout << "Not a valid number" << endl;
            }
            userData.SetMonthlyDeposit(userInputDouble);
        }
        while (userData.GetAnnualInterestRate() < 0)
        {
            cout << "Annual Interest Rate (%): ";
            cin >> userInputDouble;
            if (cin.fail())
            {
                throw "Not a number";
            }
            if (userInputDouble < 0) {
                cout << "Not a valid number" << endl;
            }
            userInputDouble /= 100;
            userData.SetAnnualInterestRate(userInputDouble);
        }
        while (userData.GetNumYears() < 0)
        {
            cout << "Number of Years in Bank: ";
            cin >> userInputInt;
            if (cin.fail())
            {
                throw "Not a number";
            }
            if (userInputInt < 0) {
                cout << "Not a valid number" << endl;
            }
            userData.SetNumYears(userInputInt);
        }
        system("pause");
    }
    catch (const char* e)
    {
        cout << "An error occurred: " << e << endl
        << "Please restart the program.";
    }

    PrintBalanceWithoutDeposits(userData);
    PrintBalanceWithDeposits(userData);
}