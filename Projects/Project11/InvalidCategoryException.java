/**
 * Applet of BallTeam.
 *
 * Project 10
 * @author Ethan Chapman
 * @version 4/22/2022
 */
public class InvalidCategoryException extends Exception {
   /**
    * Defines exception and String.
    *
    * @param category - used
    */
   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category + "\"");
   }
}
