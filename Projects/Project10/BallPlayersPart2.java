// Imports
import java.io.FileNotFoundException;

/**
 * Applet of BallTeam.
 *
 * Project 10
 * @author Ethan Chapman
 * @version 4/15/2022
 */
public class BallPlayersPart2 {
   /**
    * Allows for pass in of file name in command line arguments.
    *
    * @param args Command line arguments - used
    * @throws FileNotFoundException - used
    */
   public static void main(String[] args) throws FileNotFoundException {
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
      else {
         BallTeam team = new BallTeam();
         team.readBallPlayerFile(args[0]);
         
         System.out.println(team.generateReport() + "\n");
         System.out.println(team.generateReportByName());
         System.out.println(team.generateReportByNumber());
         System.out.println(team.generateReportByEarnings());
         System.out.println(team.generateExcludedRecordsReport() + "\n");
      }
   }
}
