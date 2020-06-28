#ifndef USERDATA_H
#define USERDATA_H

// Class to store user's data. Defined getters and setters here for better readablilty.
class UserData
{
    private:
        double m_initialInvestment;
        double m_monthlyDeposit;
        double m_annualInterestRate;
        int m_numYears;
    public:
        void SetInitialInvestment(double t_initialInvestment)
        {
            m_initialInvestment = t_initialInvestment;
        }
        void SetAnnualInterestRate(double t_annualInterestRate)
        {
            m_annualInterestRate = t_annualInterestRate;
        }
        void SetMonthlyDeposit(double t_monthlyDeposit)
        {
            m_monthlyDeposit = t_monthlyDeposit;
        }
        void SetNumYears(int t_numYears)
        {
            m_numYears = t_numYears;
        }

        double GetInitialInvestment()
        {
            return m_initialInvestment;
        }
        double GetAnnualInterestRate()
        {
            return m_annualInterestRate;
        }
        double GetMonthlyDeposit() {
            return m_monthlyDeposit;
        }
        int GetNumYears()
        {
            return m_numYears;
        }

        // Default constructor
        UserData()
        {
            m_initialInvestment = -1.0;
            m_monthlyDeposit = -1.0;
            m_annualInterestRate = -1.0;
            m_numYears = -1;
        }
};

// Functions        
double ComputeInterest(UserData t_userData);
double ComputeInterestWithDeposits(UserData t_userData);
void PrintBalanceWithoutDeposits(UserData t_userData);
void PrintBalanceWithDeposits(UserData t_userData);

#endif