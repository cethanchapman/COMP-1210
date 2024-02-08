import java.text.DecimalFormat;
/**
* Program that prints a trapezohedron listApp.
*
* Project 06
* @author Ethan Chapman - COMP 1210 - 001
* @version 02/25/2022
*/

public class Trapezohedron  {
// instance variabbles
   private String label = "";
   private String color = "";
   private double shortEdge = 0;
  /**
* Constructor for the Trapezohedron.
* Creates the object within user parameters.
*
* @param labelIn - used
* @param colorIn - used
* @param shortEdgeIn - used
*/
   public Trapezohedron(String labelIn, String colorIn,
      double shortEdgeIn) {
      setLabel(labelIn);
      setColor(colorIn);
      setShortEdge(shortEdgeIn);
   }
   /**
   * Creates and returns the string assigned to a created object.
   *
   * @return String created string
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0###");
      String output = "Trapezohedron \"" + label + "\" "
         + "is \"" + color + "\" with 20 "
         + "edges and 12 vertices.";
      output += "\n\tedge length antiprism = " 
         + df.format(edgeLengthAntiprism())
         + " units"; 
      output += "\n\tshort edge = " + df.format(getShortEdge())
         + " units";
      output += "\n\tlong edge = " + df.format(longEdge()) 
         + " units";
      output += "\n\tsurface area = " + df.format(surfaceArea()) 
         + " square units";
      output += "\n\tvolume = " + df.format(volume())
         + " cubic units";
      return output;
   }
   
   /**
   * Returns label variable.
   * @return returns the label variable.
   */
   public String getLabel() {
      return label;
   }
   /**
    * Sets the label to the given String.
    *
    * @param labelIn - used
    * @return boolean if label is set
    */
   public boolean setLabel(String labelIn) {
      if (labelIn == null) {
         return false;
      }
      else {
         label = labelIn.trim();
         return true;
      }
   }
   /**
   * returns color variable.
   * @return returns the color variable.
   */
   public String getColor() {
      return color;
   }
   /**
   * Sets the color to the given String.
   *
   * @param colorIn - used
   * @return boolean if color is set
   */
   public boolean setColor(String colorIn) { 
      if (colorIn == null) {
         return false;
      }
      else {
         color = colorIn.trim();
         return true;
      }
   }
   /**
   * Sets the shortEdge to the given variable.
   *
   * @param shortEdgeIn - used
   * @return boolean if base is set
   */
   public boolean setShortEdge(double shortEdgeIn) {
      boolean isShortEdgeSet = false;
      if (shortEdgeIn > 0) {
         shortEdge = shortEdgeIn;
         isShortEdgeSet = true;
      }
   // returns a booleabn if the given parameter is valid
      return isShortEdgeSet;
   }
   /**
   * Retrieves the short edge of the object.
   *
   * @return double the short edge of the object
   */
   public double getShortEdge() {
      return shortEdge;
   }
   /**
   * Calculates and returns the edge length antiprism of the trapezohedron.
   *
   * @return double calculated edge length antiprism.
   */ 
   public double edgeLengthAntiprism() {
      double edgeLengthAntiprism = (shortEdge / ((Math.sqrt(5) - 1) / 2));
      return edgeLengthAntiprism;
   }
   /**
   * Calculates and returns the long edge length of the trapezohedron.
   *
   * @return double calculated long edge length.
   */ 
   public double longEdge() {
      double longEdge = (((Math.sqrt(5) 
         + 1) / 2) * (shortEdge / ((Math.sqrt(5) - 1) / 2)));
      return longEdge;
   }
   /**
   * Calculates and returns the surface area of the trapezohedron.
   *
   * @return double calculated surface area length.
   */ 
   public double surfaceArea() {
      double surfaceArea = (Math.sqrt(25 / 2.0 * (5 
         + Math.sqrt(5))) * Math.pow((
         +shortEdge / ((Math.sqrt(5) - 1) / 2)), 2));
      return surfaceArea;
   }
   /**
   * Calculates and returns the volume of the trapezohedron.
   *
   * @return double calculated volume area length.
   */
   public double volume() { 
      double volume = ((5.0 / 12) * (3 
         + Math.sqrt(5)) * Math.pow((shortEdge / ((Math.sqrt(5) - 1) / 2)), 3));
      return volume;
   }
}
