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

public class ReliefPitcherTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests relief pitcher number.
    */
   @Test public void numberTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James",
         "LHP", 150000, 3.50, .125, 5, 4, 3.85, 17);
      player.setNumber("0");
      Assert.assertEquals("0", player.getNumber());
   }
   
   /**
    * Tests relief pitcher name.
    */
   @Test public void nameTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James",
         "LHP", 150000, 3.50, .125, 5, 4, 3.85, 17);
      player.setName("empty");
      Assert.assertEquals("empty", player.getName());
   }
   
   /**
    * Tests relief pitcher position.
    */
   @Test public void positionTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James",
         "LHP", 150000, 3.50, .125, 5, 4, 3.85, 17);
      player.setPosition("none");
      Assert.assertEquals("none", player.getPosition());
   }
   
   /**
    * Tests relief pitcher specialization factor.
    */
   @Test public void bonusAdjustmentTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James",
         "LHP", 150000, 3.50, .125, 5, 4, 3.85, 17);
      player.setBonusAdjustmentFactor(99.9);
      Assert.assertEquals(99.9, player.getBonusAdjustmentFactor(), .000001);
   }
   
   /**
    * Tests relief pitcher batting avg.
    */
   @Test public void battingAvgTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James",
         "LHP", 150000, 3.50, .125, 5, 4, 3.85, 17);
      player.setBattingAvg(0.999);
      Assert.assertEquals(0.999, player.getBattingAvg(), .000001);
   }
   
   /**
    * Tests relief pitcher wins.
    */
   @Test public void winsTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", 
         "LHP", 150000, 3.50, .125, 5, 4, 3.85, 17);
      player.setWins(0);
      Assert.assertEquals(0, player.getWins());
   }
   
   /**
    * Tests relief pitcher losses.
    */
   @Test public void lossesTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James",
         "LHP", 150000, 3.50, .125, 5, 4, 3.85, 17);
      player.setLosses(0);
      Assert.assertEquals(0, player.getLosses());
   }
   
   /**
    * Tests relief pitcher ERA.
    */
   @Test public void eraTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", 
         "LHP", 150000, 3.50, .125, 5, 4, 3.85, 17);
      player.setEra(1.99);
      Assert.assertEquals(1.99, player.getEra(), .000001);
   }
   
   /**
    * Tests relief pitcher saves.
    */
   @Test public void savesTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", 
         "LHP", 150000, 3.50, .125, 5, 4, 3.85, 17);
      player.setSaves(0);
      Assert.assertEquals(0, player.getSaves());
   }
   
   /**
    * Tests relief pitcher stats override.
    */
   @Test public void statsTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", 
         "LHP", 150000, 3.50, .125, 5, 4, 3.85, 17);
      String stats = "5 wins, 4 losses, 17 saves, 3.85 ERA";
      Assert.assertEquals(stats, player.stats());
   }
   
   /**
    * Tests relief pitcher totalEarnings override.
    */
   @Test public void totalEarningsTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", 
         "LHP", 150000, 3.50, .125, 5, 4, 3.85, 17);
      Assert.assertEquals(214948.45360824742, player.totalEarnings(), .000001);
   }
   
   /**
    * Tests relief pitcher count.
    */
   @Test public void countTest() {
      BallPlayer.resetCount();
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", 
         "LHP", 150000, 3.50, .125, 5, 4, 3.85, 17);
      Assert.assertEquals(1, BallPlayer.getCount());
   }
   
   /**
    * Tests relief pitcher toString.
    */
   @Test public void toStringTest() {
      ReliefPitcher player = new ReliefPitcher("34", "Sammi James", 
         "LHP", 150000, 3.50, .125, 5, 4, 3.85, 17);
      String test = "34 Sammi James (LHP) 5 wins, 4 losses, 17 saves, 3.85 ERA";
      test += "\nBase Salary: $150,000.00 Bonus Adjustment Factor: 3.5";
      test += "\nTotal Earnings: $214,948.45 (class ReliefPitcher)";
      Assert.assertEquals(test, player.toString());
   }
}
