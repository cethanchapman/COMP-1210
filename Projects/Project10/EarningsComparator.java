// Imports
import java.util.Comparator;

/**
 * Defines comparison by earnings.
 *
 * Project 10
 * @author Ethan Chapman
 * @version 4/15/2022
 */
public class EarningsComparator implements Comparator<BallPlayer> {
   /**
    * Compares players based on lastname firstname.
    *
    * @param p1 - used 
    * @param p2 - used
    * @return int comparison
    */
   public int compare(BallPlayer p1, BallPlayer p2) {
      double p1Earnings = p1.totalEarnings();
      double p2Earnings = p2.totalEarnings();
      
      if (Math.abs(p1Earnings - p2Earnings) < .00001) {
         return 0;
      }
      else {
         return p1Earnings > p2Earnings ? -1 : 1;
      }
   }
}
