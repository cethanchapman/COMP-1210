import java.util.Scanner;
import java.util.ArrayList;

/**
 * Demonstrates the NumberOperations class.
 */
public class NumberOpsDriver {

   /**
    * Reads a set of positive numbers from the user until the user enters 0.
	 * Prints odds under and powers of 2 under for each number.
	 *
    * @param args - Standard commandline arguments
    */
   public static void main(String[] args) {
   	
      Scanner in = new Scanner(System.in);
      
      // declare and instantiate ArrayList with generic type <NumberOperations>
      ArrayList<NumberOperations> numberOpsList = new ArrayList
         <NumberOperations>();
      
      // prompt user for set of numbers
      System.out.println("Enter a list of positive integers separated "
                        + "with a space followed by 0:");
   
      // get first user input using in.nextInt()
      int userInput = in.nextInt();
      
      // add a while loop as described below: 
   	// while the input is not equal to 0 
         // add a new NumberOperations object to numOpsList based on user input
         // get the next user input using in.nextInt()
      while (userInput != 0) {
         NumberOperations enter = new NumberOperations(userInput);
         numberOpsList.add(enter);
         userInput = in.nextInt();
      }
       
      int index = 0;
      while (index < numberOpsList.size()) {
         NumberOperations number = numberOpsList.get(index);
         System.out.println("For: " + number);
      	// add print statement for odds under num
      	// add print statement for powers of 2 under num
         System.out.println("\tOdds under: " + number.oddsUnder());
         System.out.println("\tPowers of 2 under: " + number.powersTwoUnder());
            
         index++;
      }
   }
}
