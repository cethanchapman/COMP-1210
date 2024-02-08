import java.util.Scanner;
/** program that calculates number of bills needed for atm withdrawal. 
*
* Project 02
* @author Ethan Chapman - Comp 1210 - 001
* @version 01/25/22
*/

public class ATM {
  /** Plugs a variable into the expression and calculates the answer.
   * @param args Command line arguments - not used
   */
   public static void main(String[] args) {
      
      int amount, bills20, bills10, bills5, bills1, amountCopy;
      
           
      System.out.print("Enter the amount: ");
      Scanner userInput = new Scanner(System.in);
      amount = userInput.nextInt();
      amountCopy = amount;
      
      if (amountCopy > 500) {
         System.out.println("Limit of $500 exceeded!");
      }
      else {
         System.out.println("Bills by denomination:");
         
         bills20 = (amountCopy / 20);
         System.out.println("\t$20: " + bills20);
         amountCopy = amountCopy % 20;
      
         bills10 = (amountCopy / 10);
         System.out.println("\t$10: " + bills10);
         amountCopy = amountCopy % 10;
      
         bills5 = (amountCopy / 5);
         System.out.println("\t$5: " + bills5);
         amountCopy = amountCopy % 5;
      
         bills1 = (amountCopy / 1);
         System.out.println("\t$1: " + bills1);
         amountCopy = amountCopy % 1;
         
         System.out.println("$" + amount + " = (" + bills20 + " * $20) + ("
            + bills10 + " * $10) + (" + bills5 
            + " * $5) + (" + bills1 + " * $1)");
      }
      
   }
}   
