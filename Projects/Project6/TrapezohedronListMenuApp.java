import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
* Program that prints a trapezohedron listApp.
*
* Project 06
* @author Ethan Chapman - COMP 1210 - 001
* @version 02/25/2022
*/
public class TrapezohedronList {
// Instance variables
   private String listName = "";
   private ArrayList<Trapezohedron> prismList
      = new ArrayList<Trapezohedron>();
   /**
   *constructor.
   *
   * @param listNameIn used.
   * @param listIn used.
   */
   public TrapezohedronList(String listNameIn,
      ArrayList<Trapezohedron> listIn) {
      listName = listNameIn;
      prismList = listIn;
   }
   /** methods
   *
   * Gets the name of the list.
   *
   * @return String.
   */
   public String getName() {
      return listName;
   }
   /**
   *Counts Trapezohedrons in list.
   *
   *@return returns the int.
   */
   public int numberOfTrapezohedrons() {
      if (prismList.size() > 0) {
         return prismList.size();
      }
      else {
         return 0;
      }
   }
   /**
   *Calculates total surface area of trapezohedrons.
   *
   *@return returns the double.
   */
   public double totalSurfaceArea() {
      int index = 0;
      double totalSurfaceArea = 0;
      if (prismList.size() > 0) {
         while (index < prismList.size()) {
            totalSurfaceArea
               += prismList.get(index).surfaceArea();
            index++;
         }
         return totalSurfaceArea;
      }
      else {
         return 0.0;
      }
   }
   /**
   *Calculates total volume of trapezohedrons.
   *
   *@return returns the double.
   */
   public double totalVolume() {
      int index = 0;
      double totalVolume = 0;
      if (prismList.size() > 0) { 
         while (index < prismList.size()) {
            totalVolume += prismList.get(index).volume();
            index++;
         }
         return totalVolume;
      }
      else {
         return 0.0;
      }
   }
   /**
   *Calculates average surface area of trapezohedrons.
   *
   *@return returns the double.
   */
   public double averageSurfaceArea() {
      if (prismList.size() > 0) {
         double averageSurfaceArea = 0;
         averageSurfaceArea = totalSurfaceArea() 
            / (prismList.size());
         return averageSurfaceArea;
      }
      else {
         return 0.0;
      }
   }
   /**
   *Calculates average volume of trapezohedrons.
   *
   *@return returns the double.
   */
   public double averageVolume() {
      if (prismList.size() > 0) {
         double averageVolume = 0;
         averageVolume = totalVolume() 
            / (prismList.size());
         return averageVolume;
      }
      else {
         return 0.0;
      }
   }
   /**
   * Creates a string of trapezohedrons.
   *
   * @return returns the String.
   */
   public String toString() {
      int index = 0;
      String output = listName + "\n"; 
      while (index < prismList.size()) {
         output += "\n" + prismList.get(index).toString() + "\n";
         index++;
      }
      return output;
   }
   /**
   * Creates a string of calculated information.
   *
   * @return returns the String.
   */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + listName + " -----\n";
      output += "Number of Trapezohedrons: " + numberOfTrapezohedrons() 
         + "\n";
      output += "Total Surface Area: " + df.format(totalSurfaceArea()) 
         + " square units\n";
      output += "Total Volume: " + df.format(totalVolume()) 
         + " cubic units\n";
      output += "Average Surface Area: " + df.format(averageSurfaceArea()) 
         + " square units\n";
      output += "Average Volume: " + df.format(averageVolume()) 
         + " cubic units\n"; 
      return output;
   }
   /**
   * Returns list of Trapezohedrons.
   *
   * @return ArrayList.
   */
   public ArrayList<Trapezohedron> getList() {
      return prismList;
   }
   /**
   * Reads file and creates a list of Trapezohedrons.
   *
   * @return ArrayList.
   * @param fileNameIn used.
   * @throws FileNotFoundException required by Scanner for file.
   */
   public TrapezohedronList readFile(String fileNameIn) 
      throws FileNotFoundException {
      
      String label = "";
      String color = "";
      double shortEdge = 0;
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<Trapezohedron> myList = new ArrayList<Trapezohedron>();
      String tListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         color = scanFile.nextLine();
         shortEdge = Double.parseDouble(scanFile.nextLine());
         Trapezohedron t = new Trapezohedron(label, color, shortEdge);
         myList.add(t);
      }
      
      TrapezohedronList myTrapezohedronList
         = new TrapezohedronList(tListName, myList);
         
      return myTrapezohedronList;
   }
   /**
   * adds Trapezohedron to the prismList.
   *
   * @param labelIn used.
   * @param shortEdgeIn used.
   * @param colorIn used.
   */
   public void addTrapezohedron(String labelIn,
      String colorIn, double shortEdgeIn) {
      
      Trapezohedron t = new Trapezohedron(labelIn,
         colorIn, shortEdgeIn);
      
      prismList.add(t);
   }
   /**
   * Finds Trapezohedron in prismList.
   *
   * @param labelIn used.
   * @return Trapezohedron.
   */
   public Trapezohedron findTrapezohedron(String labelIn) {
      for (int i = 0; i < prismList.size(); i++) {
         if (labelIn.equalsIgnoreCase(prismList.get(i).getLabel())) {
            return prismList.get(i);
         }
      }
      
      return null;
   }
   /**
   * Finds and deletes a Trapezohedron.
   *
   * @param labelIn used.
   * @return Trapezohedron.
   */
   public Trapezohedron deleteTrapezohedron(String labelIn) {
      
      int index = 0; 
      for (Trapezohedron t : prismList) {
         if (labelIn.equalsIgnoreCase(t.getLabel())) {
            index = prismList.indexOf(t);
            prismList.remove(index);
            return t;
         }
      }
      
      return null;
   }
   /**
   * Finds and edits a Trapezohedron.
   *
   * @param labelIn used.
   * @param shortEdgeIn used.
   * @param colorIn used.
   * @return boolean.
   */
   public boolean editTrapezohedron(String labelIn,
      String colorIn, double shortEdgeIn) {
      
      boolean result = false;
      
      for (Trapezohedron t : prismList) {
         if (labelIn.equalsIgnoreCase(t.getLabel())) {
            t.setColor(colorIn);
            t.setShortEdge(shortEdgeIn);
            result = true;
         }
      }
      return result;
   }
}
