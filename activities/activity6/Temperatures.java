import java.util.ArrayList;
/**
* Temperatures input program.
*
* Activity 06
* @author-Ethan Chapman
* @version-02/21/2022
*/
public class Temperatures {
// instance variables
   private ArrayList<Integer> temperatures;
/**
* Constructor.
* @param temperaturesIn used.
*/
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
//methods
/**
* Gets the lowest temperature from an array list.
*
* @return int.
*/
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   /**
   * Gets the highest temperature from an array list.
   *
   * @return int.
   */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
   /**
   * Creates a string from the information.
   *
   * @return String.
   */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
      
   }
   /**
   * Takes an int value and sees if it is lower than getLowTemp.
   *
   * @return int.
   * @param lowIn used.
   */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   /**
   * Takes an int value and sees if it is higher than getHighTemp.
   *
   * @return int.
   * @param highIn used.
   */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
}   
