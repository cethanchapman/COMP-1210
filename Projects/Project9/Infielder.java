/**
* Defines the attributes of a BallPlayer.
*
* Project 09
* @author Ethan Chapman 
* @version 4/8/2022
*/

public class Infielder extends BallPlayer {
// Instance Variable
   private double infielderFieldingAvg;

  /**
    * Infielder constructor.
    *
    * @param numberIn - used
    * @param nameIn - used
    * @param positionIn - used
    * @param baseSalaryIn - used
    * @param bonusAdjustmentIn - used
    * @param battingAvgIn - used
    * @param fieldingAvgIn - used
    */ 
   public Infielder(String numberIn, String nameIn, String positionIn, 
      double baseSalaryIn, double bonusAdjustmentIn, double battingAvgIn,
         double fieldingAvgIn) {
      super(numberIn, nameIn, positionIn, baseSalaryIn,
         bonusAdjustmentIn, battingAvgIn);
      infielderFieldingAvg = fieldingAvgIn;
   }
   
   /**
    * Returns infielder fielding average.
    *
    * @return double fielding avg
    */
   public double getInfielderFieldingAvg() {
      return infielderFieldingAvg;
   }
   
   /**
    * Sets infielder fielding average.
    *
    * @param fieldingAvgIn - used
    */
   public void setInfielderFieldingAvg(double fieldingAvgIn) {
      infielderFieldingAvg = fieldingAvgIn;
   }
   
   /**
    * Calculates infielder rating.
    *
    * @return double rating
    */
   public double totalEarnings() {
      double rate = baseSalary * bonusAdjustment * battingAvg 
         * infielderFieldingAvg;
      return rate + baseSalary;
   }
}
