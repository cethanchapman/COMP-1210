 /**
 * Scores.
 *
 * @author Ethan Chapman
 * @version 03/29/2022
 */
 
public class Scores {
   
   private int[] numbers;
   /**
   * scores.
   *
   * @param numbersIn takes in numbers and assigns it.
   */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }  
   /**
   * Scores.
   *
   * @return returns the even digits in the array.
   */
   public int[] findEvens() {
   
      int numberEvens = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      
      int[] evens = new int[numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   /**
   * scores.
   *
   * @return returns the odd digits in the array.
   */
   public int[] findOdds() {
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   /**
   * Scores.
   *
   * @return returns the average of the elements in the array.
   */
   public double calculateAverage() {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      return sum / numbers.length;
   }
   /**
   * Scores.
   *
   * @return returns the array.
   */
   public String toString() {
      String result = "";
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
   }
   /**
   * Scores.
   *
   * @return returns the array in reverse.
   */
   public String toStringInReverse() {
      String result = "";
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      return result;
   }
}
