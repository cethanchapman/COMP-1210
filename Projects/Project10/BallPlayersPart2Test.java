import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
 * Tests BallPlayersPart2.
 *
 * Project 10
 * @author Ethan Chapman
 * @version 4/15/2022
 */
public class BallPlayersPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests main method 0.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void mainTest0() throws FileNotFoundException {
      
      
      String[] args2 = {};
      BallPlayersPart2.main(args2);
      
      //Assert.assertEquals(0, BallTeam.getPlayerCount());
   }
   
   /**
    * Tests main method 1.
    *
    * @throws FileNotFoundException - used
    */
   @Test public void mainTest1() throws FileNotFoundException {
     // BallTeam.resetPlayerCount();
      
      String[] args = {"ball_player_data.csv"};
      BallPlayersPart2.main(args);
      
     // Assert.assertEquals(1, BallTeam.getPlayerCount());
   }
   
   /**
    * Tests default constructor.
    */
   @Test public void spp2Test() {
      BallPlayersPart2 app = new BallPlayersPart2();
   }
}
