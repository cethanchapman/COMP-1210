// Imports
import java.text.DecimalFormat;

/**
 * Defines the attributes of a BallPlayer.
 *
 * Project 09
 * @author Ethan Chapman 
 * @version 4/8/2022
 */
public abstract class BallPlayer {
// Instance Variables
   protected String number;
   protected String name;
   protected String position;
   protected double baseSalary;
   protected double bonusAdjustment;
   protected double battingAvg;
// Class Variable
   protected static int totalPlayers = 0;
/** Base Salary Constant. */      

      
   /**
    * BallPlayer constructor.
    *
    * @param numberIn - used
    * @param nameIn - used
    * @param positionIn - used
    * @param baseSalaryIn - used
    * @param bonusAdjustmentIn - used
    * @param battingAvgIn - used
    */
   public BallPlayer(String numberIn, String nameIn, String positionIn, 
      double baseSalaryIn, double bonusAdjustmentIn, double battingAvgIn) {
      number = numberIn;
      name = nameIn;
      position = positionIn;
      baseSalary = baseSalaryIn;
      bonusAdjustment = bonusAdjustmentIn;
      battingAvg = battingAvgIn;
      totalPlayers++;
   }
   
   /**
    * Returns player number.
    *
    * @return String number
    */
   public String getNumber() {
      return number;
   }
   
   /**
    * Sets player number.
    * 
    * @param numberIn - used
    */
   public void setNumber(String numberIn) {
      number = numberIn;
   }
   
   /**
    * Returns player name.
    *
    * @return String name
    */
   public String getName() {
      return name;
   }
   
   /**
    * Sets player name.
    *
    * @param nameIn - used
    */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
    * Returns player position.
    *
    * @return String position
    */
   public String getPosition() {
      return position;
   }
   
   /**
    * Sets player position.
    *
    * @param positionIn - used
    */
   public void setPosition(String positionIn) {
      position = positionIn;
   }   
/**
    * Returns baseSalary.
    *
    * @return double baseSalary
    */
   public double getBaseSalary() {
      return baseSalary;
   }
   
   /**
    * Sets baseSalary.
    *
    * @param baseSalaryIn - used
    */
   public void setBaseSalary(double baseSalaryIn) {
      baseSalary = baseSalaryIn;
   }

   
   /**
    * Returns bonusAdjustment.
    *
    * @return double bonusAdjustment
    */
   public double getBonusAdjustmentFactor() {
      return bonusAdjustment;
   }
   
   /**
    * Sets bonusAdjustment.
    *
    * @param bonusAdjustmentIn - used
    */
   public void setBonusAdjustmentFactor(double bonusAdjustmentIn) {
      bonusAdjustment = bonusAdjustmentIn;
   }
   
   /**
    * Returns batting average.
    *
    * @return double avg
    */
   public double getBattingAvg() {
      return battingAvg;
   }
   
   /**
    * Sets batting average.
    * 
    * @param battingAvgIn - used
    */
   public void setBattingAvg(double battingAvgIn) {
      battingAvg = battingAvgIn;
   }
   
   /**
    * Returns player count.
    * 
    * @return int count
    */
   public static int getCount() {
      return totalPlayers;
   }
   
   /**
    * Resets player count.
    */
   public static void resetCount() {
      totalPlayers = 0;
   }
   
   /**
    * Creates a stats string from batting avg.
    *
    * @return String stats
    */
   public String stats() {
      DecimalFormat stats = new DecimalFormat(".000");
      return stats.format(getBattingAvg());
   }
   
   /**
    * Abstract player total earnings.
    *
    * @return double
    */
   public abstract double totalEarnings();
   
   /**
    * BallPlayer toString.
    *
    * @return String toString
    */
   public String toString() {
      DecimalFormat format = new DecimalFormat("'$'###,##0.00");
      //DecimalFormat format2 = new DecimalFormat("'$'###,##0.00");    
      String output = number + " " + name + " (";
      output += position + ") " + stats();
      output += "\nBase Salary: " + format.format(baseSalary) 
         + " Bonus Adjustment Factor: " + bonusAdjustment;
      output += "\nTotal Earnings: " + format.format(totalEarnings()) 
         + " (" + this.getClass() + ")";
      return output;
   }
}
