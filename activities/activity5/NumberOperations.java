/**
* Program that will hold an integer value and 
* provide methods to perform various operations on that value.
*
* Assignment 05
* @author Ethan Chapman - COMP 1210 - 001
* @version 02/15/2022
*/

public class NumberOperations {
   private int number;
/**
* Number int.
* @param numberIn - used.
*/
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
/**
* Gets value.
* @return returns number
*/
   public int getValue() {
      return number; 
   }
/** 
* String odds.
* @return returns a string
*/
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      } 
      return output; 
   }
/**
* Powers two under.
* @return returns number
*/
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t"; // concentrate to output
         powers = powers * 2; // get next power of 2
      }
      
      return output; 
   }
/**
* Public int.
* @return returns number
* @param compareNumber - used
*/
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0; 
      }
   }
/**
* String.
* @return returns number
*/
   public String toString() {
      return number + "";
   }


}
