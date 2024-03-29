/**
*
* Bank Loan program.
* Activity 7a
* @author Ethan Chapman
* @version 03/14/2022
*/

public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
   
/**
* Bank Loan constructor.
*
* @param customerNameIn used.
* @param interestRateIn used.
*/

   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
      
   }
   
/**
* Adds an amount that someone borrows from the bank.
*
* @param amount used.
* @return boolean.
*/
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

/**
* Subtracts an amountPaid from the total balance of someone.
*
* @param amountPaid used.
* @return double.
*/

   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
   *gets someone's balance.
   *
   *@return double.
   */
   
   public double getBalance() {
      return balance;
   }
   
   /**
   *sets an interest rate.
   *
   *@param interestRateIn used.
   *@return boolean
   */
   
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   * Gets the interest rate.
   *
   * @return double.
   */
   
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
   * Charges interest.
   */
   
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
   * Changes the information to a string.
   *
   * @return String
   */
   
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   
   /**
   * Checks for validity of the amount.
   *
   * @return boolean.
   * @param amount used.
   */
   
   public static boolean isAmountValid(double amount) {
      boolean validity = false;
      
      if (amount >= 0) {
         validity = true;
      }
      
      return validity;
   }
   
   /**
   * Checks to see if a person has a balance.
   *
   * @return boolean.
   * @param loan used.
   */
   public static boolean isInDebt(BankLoan loan) {
      boolean inDebt = false;
      
      if (loan.getBalance() > 0) {
         inDebt = true;
      }
      
      return inDebt;
   }
   
   /**
   * Gets the number of loans created.
   *
   * @return int.
   */
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**
   * Resets the number of loans created.
   *
   * @return int.
   */
   
   public static int resetLoansCreated() {
      loansCreated = 0;
      
      return loansCreated;
   }
   
}
