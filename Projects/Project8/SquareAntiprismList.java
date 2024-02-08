import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
* Creates SquareAntiprismList.
* Project 08
* @ author Ethan Chapman
* @version 04/01/2022
*
*/

public class SquareAntiprismList {
   
   //instance variables
   private String listName = "";
   private SquareAntiprism[] antiprismList;
   private int numberOfSquareAntiprisms;
   
   
   
   /**
   *
   * SquareAntiprism constructor.
   *
   *@param listNameIn used.
   *@param listIn used.
   *@param numberOfSquareAntiprismsIn used.
   */
   
   public SquareAntiprismList(String listNameIn,
      SquareAntiprism[] listIn, int numberOfSquareAntiprismsIn) {
      listName = listNameIn;
      antiprismList = listIn;
      numberOfSquareAntiprisms = numberOfSquareAntiprismsIn;
   }
   
   //Methods
   /**
   * Gets the list name.
   * @return String.
   */
   public String getName() {
      return listName;
   }
   /**
   * Counts number of SquareAntiprisms.
   * @return int.
   */
   public int numberOfSquareAntiprisms() {
      if (numberOfSquareAntiprisms > 0) {
         return numberOfSquareAntiprisms;
      }
      else {
         return 0;
      }
   }
   /**
   * Calculates totalSurfaceArea.
   *
   * @return double.
   */
   public double totalSurfaceArea() {
      int index = 0;
      double totalSurfaceArea = 0;
      if (numberOfSquareAntiprisms > 0) {
         while (index < numberOfSquareAntiprisms) {
            totalSurfaceArea
               += antiprismList[index].surfaceArea();
            index++;
         }
         return totalSurfaceArea;
      }
      else {
         return 0.0;
      }
   }
   
   /**
   * Calculates total volume.
   * @return double.
   */
   public double totalVolume() {
      int index = 0;
      double totalVolume = 0;
      if (numberOfSquareAntiprisms > 0) {
         while (index < numberOfSquareAntiprisms) {
            totalVolume += antiprismList[index].volume();
            index++;
         }
         return totalVolume;
      }
      else {
         return 0.0;
      }
      
   }
   /**
   * Calculates averageSurfaceArea.
   *
   * @return double.
   */
   public double averageSurfaceArea() {
      if (numberOfSquareAntiprisms > 0) {
         double averageSurfaceArea = 0;
         averageSurfaceArea = totalSurfaceArea()
            / (numberOfSquareAntiprisms);
         return averageSurfaceArea;
      }
      else {
         return 0.0;
      }
   }
   /**
   * Calculates averageVolume.
   *
   * @return double.
   */
   
   
   public double averageVolume() {
      if (numberOfSquareAntiprisms > 0) {
         double averageVolume = 0;
         averageVolume = totalVolume() 
            / (numberOfSquareAntiprisms);
         return averageVolume;
      }
      else {
         return 0.0;
      }
   }
   /**
   * Creates String of SquareAntiprisms.
   *
   * @return String.
   */
   public String toString() {
      int index = 0;
      String output = listName + "\n";
      while (index < numberOfSquareAntiprisms) {
         output += "\n" + antiprismList[index].toString()
            + "\n";
         index++;
      }
      return output;
   }
   
   /**
   * Creates a String of all information.
   *
   * @return String
   */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + listName + "-----\n";
      output += "Number of SquareAntiprisms: " + numberOfSquareAntiprisms()
         + "\n";
      output += "Total Surface Area: " + df.format(totalSurfaceArea()) + "\n";
      output += "Total Volume: " + df.format(totalSurfaceArea()) + "\n";
      output += "Average Surface Area: " + df.format(averageSurfaceArea())
         + "\n";
      output += "Average Volume: " + df.format(averageVolume()) + "\n";
      return output;
   }
   /**
   * Return list. 
   *
   * @return antiprismList returns antiprism.
   */
   public SquareAntiprism[] getList() {
      return antiprismList;
   }
   /**
   * Reads file and creates list.
   *
   * @return Array.
   * @param fileNameIn used.
   * @throws FileNotFoundException required by Scanner for file.
   */
   public SquareAntiprismList readFile(String fileNameIn)
      throws FileNotFoundException {
      
      String label = "";
      double edge = 0;
      //double height = 0;
      Scanner scanFile = new Scanner(new File(fileNameIn));
      SquareAntiprism[] myList = new SquareAntiprism[100];
      String dListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         edge = Double.parseDouble(scanFile.nextLine());
         //height = Double.parseDouble(scanFile.nextLine());
         SquareAntiprism d = new SquareAntiprism(label, edge);
         myList[numberOfSquareAntiprisms] = d;
         numberOfSquareAntiprisms++;
      }
      
      SquareAntiprismList mySquareAntiprismList
         = new SquareAntiprismList(dListName, myList, numberOfSquareAntiprisms);
      
      return mySquareAntiprismList;
   }
      
   /**
   * Adds to list.
   *
   * @param labelIn used.
   * @param edgeIn used.
   */
   public void addSquareAntiprism(String labelIn, double edgeIn) {
      
      SquareAntiprism d = new SquareAntiprism(labelIn, edgeIn);
      
      antiprismList[numberOfSquareAntiprisms] = d;
      numberOfSquareAntiprisms++;
   }
   /**
   * Finds SquareAntiprism in List.
   *
   * @param labelIn used.
   * @return SquareAntiprism.
   */
   public SquareAntiprism findSquareAntiprism(String labelIn) {
      
      for (int i = 0; i < numberOfSquareAntiprisms; i++) {
         if (labelIn.equalsIgnoreCase(antiprismList[i].getLabel())) {
            return antiprismList[i];
         }
      }
      return null;
   }
   /**
   * Finds and deletes from List.
   *
   * @param labelIn used.
   * @return SquareAntiprism
   */
   public SquareAntiprism deleteSquareAntiprism(String labelIn) {
      
      for (int i = 0; i < numberOfSquareAntiprisms; i++) {
      
         if (antiprismList[i].getLabel().equalsIgnoreCase(labelIn)) {
            
            SquareAntiprism d = antiprismList[i];
            
            for (int j = i; j < numberOfSquareAntiprisms - 1; j++) {
            
               antiprismList[j] = antiprismList[j + 1];
            }
            
            antiprismList[numberOfSquareAntiprisms - 1] = null;
            numberOfSquareAntiprisms--;
            return d;
         }
      }
      
      return null;
      
      
   }
   /**
   * Finds and edits in List.
   *
   *@param labelIn used.
   *@param edgeIn used.
   *@return boolean.
   */
   public boolean editSquareAntiprism(String labelIn,
      double edgeIn) {
      
      boolean result =  false;
      
      for (int i = 0; i < numberOfSquareAntiprisms; i++) {
         if (antiprismList[i].getLabel().equalsIgnoreCase(labelIn)) {
            antiprismList[i].setEdge(edgeIn);
            result = true;
         }
      }
      
      return result;
   }
   /**
   * Finds the largest volume.
   *
   * @return SquareAntiprism.
   */
   public SquareAntiprism findSquareAntiprismWithLargestVolume() {
      
      if (numberOfSquareAntiprisms <= 0) {
         return null;
      }
      
      SquareAntiprism largestVolume = antiprismList[0];
      int index = 0;
      while (index < numberOfSquareAntiprisms) {
         if (largestVolume.volume() < antiprismList[index].volume()) {
            largestVolume = antiprismList[index];
         }
         index++;
      }
      
      return largestVolume;
   }
      
         
      
    
}
