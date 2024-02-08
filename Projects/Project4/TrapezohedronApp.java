import java.util.Scanner;
/**
* Program that calculates the information of a trapezohedron.
*
* Project 04
* @author Ethan Chapman - COMP 1210 - 001
* @version 02/11/2022
*/
public class TrapezohedronApp {
/**
* Creates prompts for user inputs of variables then calculates
* the Trapezohedron information.
*
* @param args Command line arguments - not used
*/
   public static void main(String[] args) {
   // Scanner
      Scanner user = new Scanner(System.in);
      Trapezohedron prism = new Trapezohedron("", "", 0);
   // Initial prompt
      System.out.println("Enter label, color, " 
         + "and short edge length for a trapezohedron.");
   // Label prompt
      System.out.print("\tlabel: ");
   // Defines user label
      String label = user.nextLine();
      prism.setLabel(label);
   // Color prompt
      System.out.print("\tcolor: ");
   // Defines input color.
      String color = user.nextLine();
      prism.setColor(color);
   // Short edge prompt
      System.out.print("\tshort edge: ");
      double shortEdge = Double.parseDouble(user.nextLine());
      prism.setShortEdge(shortEdge);
   // if edge is invalid
      if (!prism.setShortEdge(shortEdge)) {
         System.out.println("Error: short edge must "
            +  "be greater than zero.");
         return;
      }
      //print list
      System.out.println("\n" + prism);         
   }       
}v
