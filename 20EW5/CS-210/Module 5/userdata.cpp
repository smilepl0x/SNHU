#include <iostream>
#include <iomanip>
#include <math.h>
#include <string>
#include "userdata.h"

using namespace std;

// Computes interest without additional deposits
double ComputeInterest(UserData t_userData)
{
    const int NUM_MONTHS = 12;
    double principal = t_userData.GetInitialInvestment();
    double annualRate = t_userData.GetAnnualInterestRate();

    for (int i = 0; i < NUM_MONTHS; ++i)
    {
        principal = principal * (1 + annualRate / NUM_MONTHS);
    }

    return principal;
}

// Computes interest including additional deposits
double ComputeInterestWithDeposits(UserData t_userData)
{
    const int NUM_MONTHS = 12;
    double principal = t_userData.GetInitialInvestment();
    double monthlyDeposit = t_userData.GetMonthlyDeposit();
    double annualRate = t_userData.GetAnnualInterestRate();

    for (int i = 0; i < NUM_MONTHS; ++i)
    {
        principal = (principal + monthlyDeposit) * (1 + annualRate / NUM_MONTHS);
    }

    return principal;
}

// These functions print everything in formatted list
void PrintBalanceWithoutDeposits(UserData t_userData)
{
    cout << fixed;
    cout << setprecision(2);

    cout << "Balance and Interest Without Additional Monthly Deposits" << endl
    << "--------------------------------------------------------" << endl
    << "Year      Year End Balance      Year End Earned Interest" << endl
    << "--------------------------------------------------------" << endl;

    for (int i = 1; i < t_userData.GetNumYears() + 1; ++i)
    {
        cout << i;
        for (int j = 0; j < 10 - to_string(i).length(); ++j) // Prints correct number of spaces
        {
            cout << " ";
        }
        cout << ComputeInterest(t_userData);
        for (int j = 0; j < 26 - to_string(ComputeInterest(t_userData)).length(); ++j) // Prints correct number of spaces
        {
            cout << " ";
        }
        cout << ComputeInterest(t_userData) - t_userData.GetInitialInvestment() << endl;
        t_userData.SetInitialInvestment(ComputeInterest(t_userData));
    }

    cout << endl;
}

void PrintBalanceWithDeposits(UserData t_userData)
{
    cout << "Balance and Interest With Additional Monthly Deposits" << endl
    << "--------------------------------------------------------" << endl
    << "Year      Year End Balance      Year End Earned Interest" << endl
    << "--------------------------------------------------------" << endl;

    for (int i = 1; i < t_userData.GetNumYears() + 1; ++i)
    {
        cout << i;
        for (int j = 0; j < 10 - to_string(i).length(); ++j) // Prints correct number of spaces
        {
            cout << " ";
        }
        cout << ComputeInterestWithDeposits(t_userData);
        for (int j = 0; j < 26 - to_string(ComputeInterestWithDeposits(t_userData)).length(); ++j) // Prints correct number of spaces
        {
            cout << " ";
        }
        cout << ComputeInterestWithDeposits(t_userData) - t_userData.GetInitialInvestment() << endl;
        t_userData.SetInitialInvestment(ComputeInterestWithDeposits(t_userData));
    }
}