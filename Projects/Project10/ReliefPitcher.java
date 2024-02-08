/**
 * Defines the attributes of a BallPlayer.
 *
 * Project 09
 * @author Ethan Chapman 
 * @version 4/8/2022
 */

public class ReliefPitcher extends Pitcher {
// Instance Variable
   private int saves;

   /**
    * ReliefPitcher constructor.
    *
    * @param numberIn - used
    * @param nameIn - used
    * @param positionIn - used
    * @param baseSalaryIn - used
    * @param bonusAdjustmentIn - used
    * @param battingAvgIn - used
    * @param winsIn - used
    * @param lossesIn - used
    * @param eraIn - used
    * @param savesIn - used
    */ 
   public ReliefPitcher(String numberIn, String nameIn, String positionIn,
      double baseSalaryIn, double bonusAdjustmentIn, double battingAvgIn,
      int winsIn, int lossesIn, double eraIn, int savesIn) {
      super(numberIn, nameIn, positionIn, baseSalaryIn, bonusAdjustmentIn,
         battingAvgIn, winsIn, lossesIn, eraIn);
      saves = savesIn;
   }
   
   /**
    * Returns saves.
    *
    * @return int saves
    */
   public int getSaves() {
      return saves;
   }
   
   /**
    * Sets saves.
    *
    * @param savesIn - used
    */
   public void setSaves(int savesIn) {
      saves = savesIn;
   }
   
   /**
    * Calculates relief pitcher rating.
    *
    * @return double rating
    */
   public double totalEarnings() {
      double rate = baseSalary  * bonusAdjustment * (1.0 / (1.0 + era))
         * ((wins - losses + saves) / 30.0);
      return rate + baseSalary;
      
   }
   
   /**
    * Overrides stats() for relief pitchers.
    *
    * @return String stats
    */
   public String stats() {
      String stats = wins + " wins, " + losses + " losses, ";
      stats += saves + " saves, " + era + " ERA";
      return stats;
   }
}
