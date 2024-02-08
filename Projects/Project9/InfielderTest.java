import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Defines the attributes of a BallPlayer.
 *
 * Project 09
 * @author Ethan Chapman 
 * @version 4/8/2022
 */
public class InfielderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests infielder number.
    */
   @Test public void numberTest() {
      Infielder player = new Infielder("23", "Jackie Smith", "3B", 150000,
         2.50, .275, .850);
      player.setNumber("0");
      Assert.assertEquals("0", player.getNumber());
   }
   
   /**
    * Tests infielder name.
    */
   @Test public void nameTest() {
      Infielder player = new Infielder("23", "Jackie Smith", "3B", 150000,
         2.50, .275, .850);
      player.setName("empty");
      Assert.assertEquals("empty", player.getName());
   }
   
   /**
    * Tests infielder position.
    */
   @Test public void positionTest() {
      Infielder player = new Infielder("23", "Jackie Smith", "3B", 150000,
         2.50, .275, .850);
      player.setPosition("none");
      Assert.assertEquals("none", player.getPosition());
   }
   
   /**
    * Tests infielder bonusAdjustment factor.
    */
   @Test public void bonusAdjustmentTest() {
      Infielder player = new Infielder("23", "Jackie Smith", "3B", 150000,
         2.50, .275, .850);
      player.setBonusAdjustmentFactor(99.9);
      Assert.assertEquals(99.9, player.getBonusAdjustmentFactor(), .000001);
   }
   
   /**
    * Tests infielder batting avg.
    */
   @Test public void battingAvgTest() {
      Infielder player = new Infielder("23", "Jackie Smith", "3B", 150000,
         2.50, .275, .850);
      player.setBattingAvg(0.999);
      Assert.assertEquals(0.999, player.getBattingAvg(), .000001);
   }
   
   /**
    * Tests infielder fielding avg.
    */
   @Test public void infielderFieldingAvgTest() {
      Infielder player = new Infielder("23", "Jackie Smith", "3B", 150000,
         2.50, .275, .850);
      player.setInfielderFieldingAvg(.999);
      Assert.assertEquals(.999, player.getInfielderFieldingAvg(), .000001);
   }
   
   /**
    * Tests infielder stats.
    */
   @Test public void statsTest() {
      Infielder player = new Infielder("23", "Jackie Smith", "3B", 150000,
         2.50, .275, .850);
      Assert.assertEquals(".275", player.stats());
   }
   
   /**
    * Tests infielder rating override.
    */
   @Test public void totalEarningsTest() {
      Infielder player = new Infielder("23", "Jackie Smith", "3B", 150000,
         2.50, .275, .850);
      Assert.assertEquals(237656.25, player.totalEarnings(), .000001);
   }
   
   /**
    * Tests infielder count.
    */
   @Test public void countTest() {
      BallPlayer.resetCount();
      Infielder player = new Infielder("23", "Jackie Smith", "3B", 150000,
         2.50, .275, .850);
      Assert.assertEquals(1, BallPlayer.getCount());
   }
   
   /**
    * Tests infielder toString.
    */
   @Test public void toStringTest() {
      Infielder player = new Infielder("23", "Jackie Smith", "3B", 150000,
         2.50, .275, .850);
      String test = "23 Jackie Smith (3B) .275";
      test += "\nBase Salary: $150,000.00 Bonus Adjustment Factor: 2.5";
      test += "\nTotal Earnings: $237,656.25 (class Infielder)";
        
      Assert.assertEquals(test, player.toString());
   }
}
