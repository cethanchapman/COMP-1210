import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests EarningsComparator.
 *
 * Project 10
 * @author Ethan Chapman
 * @version 4/15/2022
 */
public class EarningsComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests comparator by rating.
    */
   @Test public void earningsComparatorTest() {
      EarningsComparator ec = new EarningsComparator();
      
      Infielder player3 = new Infielder("40", "Champ Chump", "1B",
         150000, 2.50, .279, .950);
      Infielder player4 = new Infielder("10", "J Jackson", "SS",
         150000, 3.50, .375, .250);
      Assert.assertTrue(ec.compare(player3, player4) == -1);
      Assert.assertTrue(ec.compare(player4, player3) == 1);
      Assert.assertTrue(ec.compare(player4, player4) == 0);
   }
}
