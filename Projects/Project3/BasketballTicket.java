/** A program that organizes ticket information .
*
* Project 03
* @author Ethan Chapman - Comp 1210 - 001
* @version 02/02/22
*/
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;
/**
* Public class to find ticket information.
*/
public class BasketballTicket {
/** 
* Takes a ticket input and sorts the information.
* @param args Command line arguments - not used
*/
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      String inputTicket = ""; 
      System.out.print("Enter ticket code: ");
      
   
      
      DecimalFormat df2 = new DecimalFormat("$#,##0.00");
      DecimalFormat df4 = new DecimalFormat("0%");
      DecimalFormat df6 = new DecimalFormat("000000");
      inputTicket = input.nextLine();
      System.out.println("");
      String ticket = inputTicket.trim();
      
      if (ticket.length() >= 27) {
         Random rand = new Random();
         double price = Double.parseDouble(ticket.substring(0, 4) + "."
            + ticket.substring(4, 6));
         double discount = Double.parseDouble(ticket.substring(6, 8));
         String time = ticket.substring(8, 12);
         String date = ticket.substring(12, 20);
         String section = ticket.substring(20, 23);
         String row = ticket.substring(23, 25);
         String seat = ticket.substring(25, 27);
         String desc = "";
         desc = ticket.substring(27, ticket.length());
         double cost = price - ((discount / 100) * price);
         int prizenumber = rand.nextInt(999999);
         System.out.println("Ticket: " + desc);
         System.out.println("Date: " 
            + date.substring(0, 2) + "/"
            + date.substring(2, 4) + "/" + date.substring(4, 8) + "   Time: "
            + time.substring(0, 2) + ":" + time.substring(2, 4));
         System.out.println("Section: " + section + "   "
            + "Row: " + row + "   Seat: " + seat);
         System.out.println("Price: " + df2.format(price)
            + "   Discount: " + ((int) discount)
            + "%   Cost: " + df2.format(cost));
         System.out.println("Prize Number: "
            + df6.format(prizenumber));
      }
      else 
      {
         System.out.println("*** Invalid Ticket Code ***");
         System.out.println("Ticket code must have at least 28 characters.");
      }   
   }
}
