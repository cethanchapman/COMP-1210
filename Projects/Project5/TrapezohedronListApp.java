import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
* Program that prints a trapezohedron listApp.
*
* Project 05
* @author Ethan Chapman - COMP 1210 - 001
* @version 02/18/2022
*/
public class TrapezohedronListApp {
/**
* Reads the file information.
*
* @param args - not used.
* @throws FileNotFoundException needed for file.
*/
   public static void main(String[] args) throws FileNotFoundException {
      String label = "";
      String color  = "";
      double shortEdge = 0;
      
      ArrayList<Trapezohedron> myList
         = new ArrayList<Trapezohedron>();
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      Scanner scanFile = new Scanner(new File(fileName));
      String listName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         color = scanFile.nextLine();
         shortEdge = Double.parseDouble(scanFile.nextLine());
         
         Trapezohedron t = new Trapezohedron(label, color, shortEdge);
         myList.add(t);
      }
      scanFile.close();
      TrapezohedronList myTrapezohedronList
         = new TrapezohedronList(listName, myList);
      
      System.out.println("\n" + myTrapezohedronList);
      System.out.println("\n" + myTrapezohedronList.summaryInfo());
   }
}
