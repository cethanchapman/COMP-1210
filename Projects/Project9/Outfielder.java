/**
 * Defines the attributes of a BallPlayer.
 *
 * Project 09
 * @author Ethan Chapman 
 * @version 4/8/2022
 */
public class Outfielder extends BallPlayer {
// Instance Variable
   private double outfielderFieldingAvg;
  
  /**
    * Outfielder constructor.
    *
    * @param numberIn - used
    * @param nameIn - used
    * @param positionIn - used
    * @param bonusAdjustmentIn - used
    * @param baseSalaryIn -used
    * @param battingAvgIn - used
    * @param fieldingAvgIn - used
    */ 
   public Outfielder(String numberIn, String nameIn, String positionIn,
      double baseSalaryIn,
      double bonusAdjustmentIn, double battingAvgIn, double fieldingAvgIn) {
      super(numberIn, nameIn, positionIn, baseSalaryIn,
         bonusAdjustmentIn, battingAvgIn);
      outfielderFieldingAvg = fieldingAvgIn;
   }
   
   /**
    * Returns outfielder fielding average.
    *
    * @return double fielding avg
    */
   public double getOutfielderFieldingAvg() {
      return outfielderFieldingAvg;
   }
   
   /**
    * Sets outfielder fielding average.
    *
    * @param fieldingAvgIn - used
    */
   public void setOutfielderFieldingAvg(double fieldingAvgIn) {
      outfielderFieldingAvg = fieldingAvgIn;
   }
   
   /**
    * Calculates outfielder rating.
    *
    * @return double rating
    */
   public double totalEarnings() {
      double rate = baseSalary * bonusAdjustment * battingAvg 
         * outfielderFieldingAvg;
      return baseSalary + rate;
   }
}
