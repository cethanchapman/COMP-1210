/**
 * Defines the attributes of a BallPlayer.
 *
 * Project 09
 * @author Ethan Chapman 
 * @version 4/8/2022
 */

public class Pitcher extends BallPlayer {
// Instance Variables
   protected int wins;
   protected int losses;
   protected double era;
   
   /**
    * Pitcher constructor.
    *
    * @param numberIn - used
    * @param nameIn - used
    * @param positionIn - used
    * @param bonusAdjustmentIn - used
    * @param baseSalaryIn - used
    * @param battingAvgIn - used
    * @param winsIn - used
    * @param lossesIn - used
    * @param eraIn - used
    */ 
   public Pitcher(String numberIn, String nameIn, String positionIn,
      double baseSalaryIn, double bonusAdjustmentIn, double battingAvgIn,
      int winsIn, int lossesIn, double eraIn) {
      super(numberIn, nameIn, positionIn, baseSalaryIn, bonusAdjustmentIn,
         battingAvgIn);
      wins = winsIn;
      losses = lossesIn;
      era = eraIn;
   }
   
   /**
    * Returns wins.
    *
    * @return int wins
    */
   public int getWins() {
      return wins;
   }
   
   /**
    * Sets wins.
    *
    * @param winsIn - used
    */
   public void setWins(int winsIn) {
      wins = winsIn;
   }
   
   /**
    * Returns losses.
    *
    * @return int losses
    */
   public int getLosses() {
      return losses;
   }
   
   /**
    * Sets losses.
    *
    * @param lossesIn - used
    */
   public void setLosses(int lossesIn) {
      losses = lossesIn;
   }
   
   /**
    * Returns ERA.
    *
    * @return double era
    */
   public double getEra() {
      return era;
   }
   
   /**
    * Sets ERA.
    *
    * @param eraIn - used
    */
   public void setEra(double eraIn) {
      era = eraIn;
   }
   
   /**
    * Calculates pitcher earnings.
    *
    * @return double totalEarnings
    */
   public double totalEarnings() {
      double rate = baseSalary * bonusAdjustment * (1.0 / (1.0 + era))
         * ((wins - losses) / 25.0);
      return rate + baseSalary;
   }
   
   /**
    * Overrides stats() for pitchers.
    *
    * @return String stats
    */
   public String stats() {
      String stats = wins + " wins, " + losses + " losses, " + era + " ERA";
      return stats;
   }
}
