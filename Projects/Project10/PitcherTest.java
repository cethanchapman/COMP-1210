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

public class PitcherTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests pitcher number.
    */
   @Test public void numberTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP", 150000,
         3.50, .125, 22, 4, 2.85);
      player.setNumber("0");
      Assert.assertEquals("0", player.getNumber());
   }
   
   /**
    * Tests pitcher name.
    */
   @Test public void nameTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP", 150000,
         3.50, .125, 22, 4, 2.85);
      player.setName("empty");
      Assert.assertEquals("empty", player.getName());
   }
   
   /**
    * Tests pitcher position.
    */
   @Test public void positionTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP", 150000,
         3.50, .125, 22, 4, 2.85);
      player.setPosition("none");
      Assert.assertEquals("none", player.getPosition());
   }
   
   /**
    * Tests pitcher bonusAdjustment factor.
    */
   @Test public void bonusAdjustmentTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP", 150000,
         3.50, .125, 22, 4, 2.85);
      player.setBonusAdjustmentFactor(99.9);
      Assert.assertEquals(99.9, player.getBonusAdjustmentFactor(), .000001);
   }
   
   /**
    * Tests pitcher batting avg.
    */
   @Test public void battingAvgTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP", 150000,
         3.50, .125, 22, 4, 2.85);
      player.setBattingAvg(0.999);
      Assert.assertEquals(0.999, player.getBattingAvg(), .000001);
   }
   
   /**
    * Tests pitcher wins.
    */
   @Test public void winsTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP", 150000,
         3.50, .125, 22, 4, 2.85);
      player.setWins(0);
      Assert.assertEquals(0, player.getWins());
   }
   
   /**
    * Tests pitcher losses.
    */
   @Test public void lossesTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP", 150000,
         3.50, .125, 22, 4, 2.85);
      player.setLosses(0);
      Assert.assertEquals(0, player.getLosses());
   }
   
   /**
    * Tests pitcher ERA.
    */
   @Test public void eraTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP", 150000,
         3.50, .125, 22, 4, 2.85);
      player.setEra(1.99);
      Assert.assertEquals(1.99, player.getEra(), .000001);
   }
   
   
   /**
    * Tests pitcher stats override.
    */
   @Test public void statsTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP", 150000,
         3.50, .125, 22, 4, 2.85);
      String stats = "22 wins, 4 losses, 2.85 ERA";
      Assert.assertEquals(stats, player.stats());
   }
   
   /**
    * Tests pitcher rating override.
    */
   @Test public void totalEarningsTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP", 150000,
         3.50, .125, 22, 4, 2.85);
      Assert.assertEquals(248181.81818181818,
         player.totalEarnings(), .000001);
   }
   
   /**
    * Tests pitcher count.
    */
   @Test public void countTest() {
      BallPlayer.resetCount();
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP", 150000,
         3.50, .125, 22, 4, 2.85);
      Assert.assertEquals(1, BallPlayer.getCount());
   }
   
   /**
    * Tests pitcher toString.
    */
   @Test public void toStringTest() {
      Pitcher player = new Pitcher("43", "Jo Williams", "RHP", 150000,
         3.50, .125, 22, 4, 2.85);
      String test = "43 Jo Williams (RHP) 22 wins, 4 losses, 2.85 ERA";
      test += "\nBase Salary: $150,000.00 Bonus Adjustment Factor: 3.5";
      test += "\nTotal Earnings: $248,181.82 (class Pitcher)";
      Assert.assertEquals(test, player.toString());
   }
}
