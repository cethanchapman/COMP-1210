import java.util.Scanner;
/** program that calculates a three variable expression. 
*
* Project 02
* @author Ethan Chapman - Comp 1210 - 001
* @version 01/25/22
*/

public class ThreeVariableExpression {
  /** Plugs a variable into the expression and calculates the answer.
   * @param args Command line arguments - not used
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = " ";
 
   
      // establishes expression
      System.out.println("result = (3.5x - 7.75) (2.85y + 6.0)" 
         + " (1.5z - 3.1) / xyz");
      // asks for x input
      System.out.print("\tx = ");
      double x = userInput.nextDouble();
      // asks for y input
      System.out.print("\ty = ");
      double y = userInput.nextDouble();
      // asks for z input
      System.out.print("\tz = ");
      double z = userInput.nextDouble();
      // prints "undefined" if result is 0
      if (x * y * z == 0) {
         System.out.println("result is \"undefined\"");
      }
      else {
         double result = ((3.5 * x) - 7.75) * ((2.85 * y) 
            + 6.0) * ((1.5 * z) - 3.1);
         result = result / (x * y * z);
         System.out.println("result = " + result);
         
      }
   }
}
