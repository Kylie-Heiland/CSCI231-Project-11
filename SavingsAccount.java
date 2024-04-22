//SAVINGSACCOUNT CLASS  
    public class SavingsAccount extends Account
    {
    //Creates a private variable to represent the interest rate of the account.
    private double interestRate;
    
    //Sets the interest rate.
    public void setInterestRate(double rate)
    {
        interestRate = rate;
    }
    
    //Returns the interest rate.
    public double getInterestRate()
    {
        return interestRate;
    }
    
    //Removes a specific amount from the account balance.
    public void withdraw(double amount)
    {
        System.out.print(super.toString());
        
        System.out.println("...Withdrawing $" + amount + " from your account.");
        
        //The minimum balance must be 500 at all times. The withdraw amount MUST be over zero.
        if(getBalance() >= 500.00 && amount > 0 && (getBalance() - amount >= 500.00))
        {
            setBalance(getBalance() - amount);
        }
        else if(getBalance() < 500.00)
        {
            System.out.println("The minimum balance for a savings account must be $500 at all times.");
            return;
        }
        else
        {
            System.out.println("The withdraw amount is invalid. It must be over zero.");
            return;
        }
    }
    
    //Adds interest.
    public void addInterest()
    {
        //Creates a double variable that is the interest rate in decimal form.
        double interestDecimal = getInterestRate() / 100;
        
        //Updates the account balance so that the interest is included.
        setBalance(getBalance() * (1 + interestDecimal));
    }
    
    //Returns a string representation of the object.
    public String toString()
    {
        return("Account " + getId() + "'s balance with the interest rate of " + getInterestRate() + "% is now $" + Math.floor(getBalance() * 100) / 100 + ".");
    }
    }
