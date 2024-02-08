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

public class OutfielderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests outfielder number.
    */
   @Test public void numberTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF", 150000.00,
         1.25, .375, .950);
      player.setNumber("0");
      Assert.assertEquals("0", player.getNumber());
   }
   
   /**
    * Tests outfielder name.
    */
   @Test public void nameTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF", 150000.00,
         1.25, .375, .950);
      player.setName("empty");
      Assert.assertEquals("empty", player.getName());
   }
   
   /**
    * Tests outfielder position.
    */
   @Test public void positionTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF", 150000.00,
         1.25, .375, .950);
      player.setPosition("none");
      Assert.assertEquals("none", player.getPosition());
   }
   /**
    * Tests outfielder baseSalary.
    */
   @Test public void baseSalaryTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF", 150000.00,
         1.25, .375, .950);
      player.setBaseSalary(150000);
      Assert.assertEquals(150000, player.getBaseSalary(), .01);
   }

   
   /**
    * Tests outfielder bonusAdjustment factor.
    */
   @Test public void bonusAdjustmentTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF", 150000.00,
         1.25, .375, .950);
      player.setBonusAdjustmentFactor(99.9);
      Assert.assertEquals(99.9, player.getBonusAdjustmentFactor(), .000001);
   }
   
   /**
    * Tests outfielder batting avg.
    */
   @Test public void battingAvgTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF", 150000.00,
         1.25, .375, .950);
      player.setBattingAvg(0.999);
      Assert.assertEquals(0.999, player.getBattingAvg(), .000001);
   }
   
   /**
    * Tests outfielder fielding avg.
    */
   @Test public void outfielderFieldingAvgTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF", 150000.00,
         1.25, .375, .950);
      player.setOutfielderFieldingAvg(.999);
      Assert.assertEquals(.999, player.getOutfielderFieldingAvg(), .000001);
   }
   
   /**
    * Tests outfielder stats.
    */
   @Test public void statsTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF", 150000.00,
         1.25, .375, .950);
      Assert.assertEquals(".375", player.stats());
   }
   
   /**
    * Tests outfielder rating override.
    */
   @Test public void totalEarningsTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF", 150000.00,
         1.25, .375, .950);
      Assert.assertEquals(216796.875, player.totalEarnings(), .000001);
   }
   
   /**
    * Tests outfielder count.
    */
   @Test public void countTest() {
      BallPlayer.resetCount();
      Outfielder player = new Outfielder("32", "Pat Jones", "RF", 150000.00,
         1.25, .375, .950);
      Assert.assertEquals(1, BallPlayer.getCount());
   }
   
   /**
    * Tests outfielder toString.
    */
   @Test public void toStringTest() {
      Outfielder player = new Outfielder("32", "Pat Jones", "RF", 150000.00,
         1.25, .375, .950);
      String test = "32 Pat Jones (RF) .375";
      test += "\nBase Salary: $150,000.00" + " Bonus Adjustment Factor: 1.25";  
      test += "\nTotal Earnings: $216,796.88 (class Outfielder)";
      Assert.assertEquals(test, player.toString());
   }
}
