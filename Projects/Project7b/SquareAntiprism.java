import java.text.DecimalFormat;
  	
 /** 	
 * Square Antiprism.	  	
 *	  	
 * Project 7b.	  	
 * @author - Ethan Chapman	  	
 * @version - 3/25/2022	  	
 */	  	
public class SquareAntiprism implements Comparable<SquareAntiprism> {	  	
 // instance variables	  	
   private String label = "";	  	
   private double edge = 0;	  	
   private static int count = 0;  	  	
    	  	
 /**	  	
 * Square Antiprism constuctor.	  	
 * 	  	
 * 	  	
 * @param labelIn - used  	
 * @param edgeIn - used	  	
 */  		  	
   public SquareAntiprism(String labelIn,  	
       double edgeIn) {	  	
      setLabel(labelIn);	  	
      setEdge(edgeIn);	  	
      count++;	  	
   }	  	
 //methods	  	
 /**	  	
 * gets label string.	  	
 *	  	
 * @return String.	  	
 */	  	
 	  	
   public String getLabel() {	  	
      return label;	  	
   }	  	
 /**	  	
 * Checks for label and sets.	  	
 *	  	
 * @param labelIn used.	  	
 * @return boolean.	  	
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
    * Gets the edge.	  	
    *	  	
    * @return double.	  	
    */      	  	
   public double getEdge() {	  	
      return edge;	  	
   }	  	
    /**	  	
    * Checks for negative edge and sets.	  	
    *	  	
    * @param edgeIn used.	  	
    * @return boolean.	  	
    */   	  	
   public boolean setEdge(double edgeIn) {	  	
      if (edgeIn >= 0) {	  	
         edge = edgeIn;	  	
         return true;
      
      }  	
      else {	  	
         return false;	  	
      }	  	
   }	  	
    /**	  	
    * Calculates antiprism height.	  	
    *	  	
    * @return double.	  	
    */	  	
   public double height() {	  	
      double height = Math.sqrt(1	  	
          - (Math.pow(1 / (Math.cos(Math.PI / 16)), 2)	  	
          / 4)) * edge;	  	
      return height;	  	
   } 	  	
         	  	
    	  	
    /**	  	
    * Calculates surface  area.	  	
    *	  	
    * @return double.	  	
    */  	  	
   public double surfaceArea() {	  	
      double surfaceArea = 4 	  	
          * ((Math.cos(Math.PI / 8) / Math.sin(Math.PI / 8)) 	  	
          + Math.sqrt(3)) * Math.pow(edge, 2);	  	
      return surfaceArea;	  	
   }	  	
    /**	  	
    * Calculates volume.	  	
    *	  	
    * @return double.	  	
    */	  	
   public double volume() {	  	
      double volume = 8 * (Math.sqrt(4	  	
          * Math.pow(Math.cos(Math.PI / 16), 2) - 1)) 	  	
          * Math.sin((3 * Math.PI) / 16) 	  	
          * Math.pow(edge, 3) / (12 	  	
          * Math.pow(Math.sin(Math.PI / 8), 2));  	
      return volume;	  	
   }  	
    /**	  	
    * Gets number of triangular prisms created.	  	
    *	  	
    * @return int.	  	
    */	  	
   public static int getCount() {  	
      return count;  	
   }	  	
    /**	  	
    * resets the number of square antiprisms.	  	
    */	  	
   public static void resetCount() {	  	
      count = 0;	  	
   }	  	
    	  	
    /**	  	
    *checks to see if object is a triangular prism.	  	
    *	  	
    *@return boolean.	  	
    @param obj used.	  	
    */	  	
   public boolean equals(Object obj) {	  	
      
      if (!(obj instanceof SquareAntiprism)) {	  	
         
         return false;	  	
      }	  	
      else {	  	
         SquareAntiprism d = (SquareAntiprism) obj;	  	
         return (label.equalsIgnoreCase(d.getLabel())  	
                   && Math.abs(edge - d.getEdge()) < .000001);	  	
      }	  	
   }	  	
    	  	
    /**	  	
    * Required by checkstyle for equals method.	  	
    *  	
    * @return int.	  	
    */	  	
   public int hashCode() {	  	
      return 0;
     	  	
   }
	  	
    /**
	  	
    * Creates string from all info.
	  	
    *
	  	
    * @return String.	  	
    */	  	
   public String toString() {	  	
      DecimalFormat df = new DecimalFormat("#,##0.0##");	  	
      String output = "SquareAntiprism \"" + label	  	
          + "\" with edge of " + edge + " units has:" + "\n";	  	
      output += "\theight = " 	  	
          + df.format(height()) + " units" + "\n";	  	
      output += "\tsurface area = " + df.format(surfaceArea())  	
          + " square units" + "\n";	  	
      output += "\tvolume = " + df.format(volume())	  	
          + " cubic units";	  	
      return output;	  	
    	  	
   }	  	
   /**
   * Compares antiprisms by volume.
   *
   * @param obj used.
   * @return double.
   */
   public int compareTo(SquareAntiprism obj) {
   
      if (this.volume() < obj.volume()) {
         return -1;
      }
      
      
      if (Math.abs(this.volume() - obj.volume()) < 0.00001) {
         return 0;
      }
      
      else {
         return 1;
      }
   }
}
