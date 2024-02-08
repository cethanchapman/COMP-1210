/** A program that accepts input and completes a math expression.
*
* Project 03
* @author Ethan Chapman - Comp 1210 - 001
* @version 02/04/22
*/
import java.text.DecimalFormat;
import java.util.Scanner;
/**
* Public class to find expression result.
*/
public class MathExpression {  
/** 
* Takes a user input and modifies it based on instructions.
* @param args Command line arguments - not used
*/
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      double x = 0.0;
      
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();
      
      double numerator = Math.sqrt(Math.abs(3 + (3 * x)
         + Math.pow(x, 2) * 3 + Math.pow(x, 3) * 3 + Math.pow(x, 4) * 3))
         + Math.pow(x, 5) * 3;
      
      double denominator = Math.abs(x) + 3;
      
      double result = numerator / denominator;
      System.out.println("Result: " + result);
      
      String resultStr = Double.toString(result);
      
      int position = resultStr.indexOf(".");
      int leftCharacterCount = position;
      int rightCharacterCount = resultStr.length() - position - 1;
      
      System.out.println("# of characters to left of decimal"
         + " point: " + leftCharacterCount);
      System.out.println("# of characters to right of decimal"
         + " point: " + rightCharacterCount);
      
      String pattern = "#,##0.0##";
      DecimalFormat formatter = new DecimalFormat(pattern);
      String formattedResult = formatter.format(result);
      System.out.println("Formatted Result: " + formattedResult);
      
   }
}
