 // Imports
import java.util.Comparator;

/**
 * Defines comparison by name.
 *
 * Project 10
 * @author Ethan Chapman
 * @version 4/15/2022
 */
public class NameComparator implements Comparator<BallPlayer> {
   /**
    * Compares players based on lastname firstname.
    *
    * @param p1 - used 
    * @param p2 - used
    * @return int comparison
    */
   public int compare(BallPlayer p1, BallPlayer p2) {
      int p1i = p1.getName().indexOf(" ");
      int p2i = p2.getName().indexOf(" ");
      String p1Name = (p1.getName().substring(p1i + 1) 
         + p1.getName().substring(0, p1i)).toUpperCase();
      String p2Name = (p2.getName().substring(p2i + 1) 
         + p2.getName().substring(0, p2i)).toUpperCase();
         
      return p1Name.compareTo(p2Name);
   }
}
