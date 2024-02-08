import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.text.DecimalFormat;

/** 	
 * Square Antiprism.	  	
 *	  	
 * Project 7b.	  	
 * @author - Ethan Chapman	  	
 * @version - 3/25/2022	  	
 */	 
public class SquareAntiprismTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   //@Test public void defaultTest() {
     // Assert.assertEquals("Default test added by jGRASP. Delete "
      //      + "this test once you have added your own.", 0, 1);
   //}
   @Test public void getLabelTest() {
      SquareAntiprism d = new SquareAntiprism("Small Example", 1.25);	  	
      d.getLabel();	  	
      Assert.assertEquals("Failed to getLabel",
         "Small Example", d.getLabel());	  	
    	  	
   }
    /**	  	
    *Tests setLabel method with non-null. 	
    */	  	
   @Test public void setLabelNonNullTest() {	  	
      	
      SquareAntiprism d = new SquareAntiprism("Small Example", 1.25);  	
      d.setLabel("Small Example");	  	
      Assert.assertEquals("Failed to setLabel - non-null", true, 	  	
          d.setLabel("Small Example"));	  	
    	  	
   }	  	
    	  	
    /**	  	
    *Tests setLabel method with null.	  	
    */	  	
   @Test public void setLabelNullTest() {	  	
    	  	
      SquareAntiprism d = new SquareAntiprism("Small Example", 1.25);
     	
      d.setLabel(null);	  	
      Assert.assertEquals("Failed to setLabel - null",
         false, d.setLabel(null));	  	
    	  	
   }	  	
    /**	  	
    * Tests getEdge method.	  	
    */	  	
   @Test public void getEdgeTest() {	  	
      
      SquareAntiprism d = new SquareAntiprism("Small Example", 1.25);	  	
      d.getEdge();  	
      Assert.assertEquals("Failed to getEdge", 1.25, d.getEdge(), 0.001);    
     	
   }  	
      	
    /**	  	
    * Tests the setEdge method with non-negative.	  	
    */	  	
   @Test public void setEdgeNonNegativeTest() {	  	
    	  	
      SquareAntiprism d = new SquareAntiprism("Small Example", 1.25);	  	
      d.setEdge(1.25);	  	
      Assert.assertEquals("Failed to setEdge - non-negative", 	  	
          true, d.setEdge(1.25));	  	
    	  	
   }	  	
    	  	
    /**	  	
    * Tests setRadius method with negative.	  	
    */	  	
   @Test public void setEdgeNegativeTest() {	  	
    	  	
      SquareAntiprism d = new SquareAntiprism("Small Example", 1.25);	  	
      d.setEdge(-1.25);	  	
      Assert.assertEquals("Failed to setEdge - negative",   	
          false, d.setEdge(-1.25));
     	
   }	  	
    /**	  	
    * Tests the height method.  	
    */	  	
   @Test public void heightTest() {      	
      SquareAntiprism d = new SquareAntiprism("Small Example", 1.25);	  	
      d.height();  	
      Assert.assertEquals("Failed height test", 	  	
          1.075, d.height(), 0.001);	  	  	
   }   	  	
    /**	  	
    * Tests the surfaceArea method.  	
    */	  	
   @Test public void surfaceAreaTest() {  	
    	  	
      SquareAntiprism d = new SquareAntiprism("Small Example", 1.25);
      d.surfaceArea();	  	
      Assert.assertEquals("Failed surface area test", 	  	
          25.914, d.surfaceArea(), 0.001);	  	
      	
   }	  	
    /**	  	
    * Tests the volume method.	  	
    */	  	
   @Test public void volumeTest() {	  	
    	  	
      SquareAntiprism d = new SquareAntiprism("Small Example", 1.25);  	
      d.volume();  	
      Assert.assertEquals("Failed volume test", 	  	
          8.336, d.volume(), 0.001);  	
     	
   }  	
    /**	  	
    * Tests getCount method.  	
    */  	
   @Test public void getCountTest() {	  	
    	  	
      SquareAntiprism.resetCount();	  	
      SquareAntiprism d = new SquareAntiprism("Small Example", 1.25);  	
      SquareAntiprism.getCount();  	
      Assert.assertEquals("Failed getCountTest",
         1, SquareAntiprism.getCount());	  	
      	
   }	  	
    	  	
    /**  	
    * Tests resetCount method.	  	
    */	  	
   @Test public void resetCountTest() {	  	
    	  	
      SquareAntiprism.resetCount();	  	
      Assert.assertEquals("Failed resetCountTest",   	
          0, SquareAntiprism.getCount());  	
    	  	
   }	  	
    /**	  	
    *Tests the equals - false method.	  	
    */	  	
   @Test public void equalsFalseTest() {
     	
      SquareAntiprism d = new SquareAntiprism("Small Example", 1.25);	  	
      Object obj = new Object();	  	
      Assert.assertEquals("Failed equalsFalseTest",
         false, d.equals(obj));	  	
   	  	
   }	  	
    	  	
    /**	  	
    * Tests equals - true method.	  	
    */	  	
   @Test public void equalsTrueTest() {
     	
      SquareAntiprism d = new SquareAntiprism("Example", 1.25);	  	
      SquareAntiprism p = new SquareAntiprism("Example", 1.25);	  	
      Assert.assertEquals("Failed equalsTrueTest", true, d.equals(p));	  	
    	  	
   }	  	
      	
    /**  	
    * Tests equals - false method.	  	
    */	  	
   @Test public void equalsFalseDifferentLabelsTest() {	  	
    	  	
      SquareAntiprism d = new SquareAntiprism("Small Example", 1.25);	  	
      SquareAntiprism p = new SquareAntiprism("Tiny Example ", 1.25);	  	
      Assert.assertEquals("Failed equalsFalseDifferentLabelsTest", 	  	
          false, d.equals(p));	  		  	
   }	  	
 	  	
    /**	  	
    * Tests equals - false(different edge) method.	  	
    */	  	
   @Test public void equalsFalseDifferentEdgeTest() {	  	
    	  	
      SquareAntiprism d = new SquareAntiprism("Small Example", 1.25);	  	
      SquareAntiprism p = new SquareAntiprism("Small Example", 1.26);	  	
      Assert.assertEquals("Failed equalsFalseDifferentEdgeTest", 	  	
          false, d.equals(p));	  	
    	  	
   }	  	
    
 	  	
    /**	  	
    * Tests hashCode method.	  	
    */	  	
   @Test public void hashCodeTest() {	  	
    	  	
      SquareAntiprism d = new SquareAntiprism("Small Example", 1.25);	  	
      d.hashCode();  	
      Assert.assertEquals("Failed hasCodeTest", 0, d.hashCode());	  	
    	  	
   }	  	
    /**	  	
    *Tests toString method.	  	
    */	  	
   @Test public void toStringTest() {	  	
    	  	
      SquareAntiprism d = new SquareAntiprism("Small Example", 1.25);	  	
      DecimalFormat df = new DecimalFormat("#,##0.0##");	  	
      String output = "";	  	
      output = "SquareAntiprism \"Small Example\""	  	
          + " with edge of 1.25 units has:" + "\n";	  	
      output += "\theight = 1.075 units" + "\n";	  	
      output += "\tsurface area = 25.914 square units" + "\n";	  	
      output += "\tvolume = 8.336 cubic units";	  	
      Assert.assertEquals(output, d.toString());  	
   } 	  	
   
   /**
   * First test for the compareTo method.
   */
   @Test public void compareToTest1() {
      
      SquareAntiprism d = new SquareAntiprism("Small Example", 1.25);
      SquareAntiprism p = new SquareAntiprism("Small Example", 1.25);
      Assert.assertTrue(d.compareTo(p) == 0);
   }
   /**
   * Second test for the compareTo method.
   */
   @Test public void compareToTest2() {
      
      SquareAntiprism d = new SquareAntiprism("Small Example", 1.25);
      SquareAntiprism p = new SquareAntiprism("Medium Example", 10.4);
      Assert.assertTrue(d.compareTo(p) < 0);
   }
   /**
   * Third test for the compareTo method.
   */
   @Test public void compareToTest3() {
      
      SquareAntiprism d = new SquareAntiprism("Small Example", 1.25);
      SquareAntiprism p = new SquareAntiprism("Micro Example", 0.32);
      Assert.assertTrue(d.compareTo(p) > 0);
   }
   
   
}
