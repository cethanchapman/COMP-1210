import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*
* Bank Loan program.
* Activity 7a
* @author Ethan Chapman
* @version 03/14/2022
*/


public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
  // @Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
         //   + "this test once you have added your own.", 0, 1);
  // }
   
   /**
   * Tests the chargeInterest method.
   */
   @Test public void changeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }
   // Tests the rest of the methods.
   @Test public void test() {
      BankLoan loan2 = new BankLoan("Bob", 0.1);
      loan2.borrowFromBank(100);
      loan2.payBank(50.00);
      loan2.getBalance();
      loan2.setInterestRate(0.2);
      loan2.getInterestRate();
      loan2.isAmountValid(2);
      loan2.isInDebt(loan2);
      BankLoan.getLoansCreated();
      BankLoan.resetLoansCreated();
   }
   
}
