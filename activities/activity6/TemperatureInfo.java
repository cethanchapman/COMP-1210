import java.util.Scanner;
import java.util.ArrayList;
/**
* Temperatures program.
*
* Activity 6.
* @author-Ethan Chapman
* @version-02/22/22
*/
public class TemperatureInfo {
/**
* Creates list of temperatures.
*
* @param args not used.
*/
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = scan.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      }
      while (!tempInput.equals(""));
      Temperatures temps = new Temperatures(tempsList);
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, "
            + "[H]igh temp, [P]rint, [E]nd: ");
         choice = scan.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
            case 'P':
               System.out.println(temps);
               break;
            case 'E':
               System.out.println("\tDone");
               break;
            default:
               System.out.println("\tInvalid choice!");
         }
      }
      while (choice != 'E');
   }
}
