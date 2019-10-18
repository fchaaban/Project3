class SavingsAccount {
    private static double annualInterestRate = 0;
    private double savingsBalance;

    public SavingsAccount(double balance){
        savingsBalance=balance;
    }
    public void calculateMonthlyInterest(){
        savingsBalance += savingsBalance * (annualInterestRate/12.0);
    }
    public static void modifyInterestRate(double newRate){
        annualInterestRate = (newRate >= 0 && newRate <= 1.0)
                ?newRate: 0.04;
    }
    public String toString() {
        return String.format("$%.2f", savingsBalance);

    }


}
