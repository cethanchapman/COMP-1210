import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
* Tests SquareAntiprismList.
* Project 08
* @author Ethan Chapman
* @version 04/01/2022
*
*/
public class SquareAntiprismListTest {
/**
* Tests getName method.
*/

   @Test public void getNameTest() {
      
      SquareAntiprism[] dArray = new SquareAntiprism[10];
      dArray[0] = new SquareAntiprism("Example 1", 1);
      dArray[1] = new SquareAntiprism("Example 2", 2);
      dArray[2] = new SquareAntiprism("Example 3", 3);
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 3);
      Assert.assertEquals("getNameTest failed", "Test List", dList.getName());
   }
   
   /**
   * Tests numberOfSquareAntiprisms - non-zero.
   */
   @Test public void numberOfSquareAntiprismNonZeroTest() {
      SquareAntiprism[] dArray = new SquareAntiprism[10];
      dArray[0] = new SquareAntiprism("Example 1", 1);
      dArray[1] = new SquareAntiprism("Example 2", 2);
      dArray[2] = new SquareAntiprism("Example 3", 3);
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 3);
      Assert.assertEquals("NumberOfSquareAntiprismsNonZeroTest failed",
         3, dList.numberOfSquareAntiprisms());
   }
   /**
   * Tests numberOfSquareAntiprisms - zero.
   */
   @Test public void numberOfSquareAntiprismsZeroTest() {
   
   
      SquareAntiprism[] dArray = new SquareAntiprism[10];
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 0);
   
      Assert.assertEquals("numberOfSquareAntiprismsZeroTest failed", 0,
         dList.numberOfSquareAntiprisms());
   }
   
   /**
   * Tests totalSurfaceArea - non-zero.
   */
   
   @Test public void totalSurfaceAreaNonZeroTest() {
   
      SquareAntiprism[] dArray = new SquareAntiprism[10];
      dArray[0] = new SquareAntiprism("Example 1", 1);
      dArray[1] = new SquareAntiprism("Example 2", 2);
      dArray[2] = new SquareAntiprism("Example 3", 3);
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 3);
      Assert.assertEquals("totalSurfaceAreaNonZeroTest failed",
         232.19080471675048, dList.totalSurfaceArea(), 0.000001);
      
   }
   /**
   * Tests totalSurfaceArea - zero.
   */
   @Test public void totalSurfaceAreaZeroTest() {
      
      SquareAntiprism[] dArray = new SquareAntiprism[10];
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 0);
      
      Assert.assertEquals("totalSurfaceAreaZeroTest failed", 0.0,
         dList.totalSurfaceArea(), 0.000001);
   }
   
   /**
   *  Tests totalVolume - non-zero.
   */
   
   @Test public void totalVolumeNonZeroTest() {
   
      SquareAntiprism[] dArray = new SquareAntiprism[10];
      dArray[0] = new SquareAntiprism("Example 1", 1);
      dArray[1] = new SquareAntiprism("Example 2", 2);
      dArray[2] = new SquareAntiprism("Example 3", 3);
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 3);
      Assert.assertEquals("totalVolumeNonZeroTest failed", 153.6464430164569,
         dList.totalVolume(), 0.000001);
   }
   
   /**
   *Sets totalVolume - zero.
   */
   @Test public void totalVolumeZeroTest() {
   
      SquareAntiprism[] dArray = new SquareAntiprism[10];
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 0);
   
      Assert.assertEquals("totalVolumeZeroTest failed", 0.0,
         dList.totalVolume(), 0.000001);   
   }
   /**
   * Tests averageSurfaceArea - non-zero.
   */
   
   @Test public void averageSurfaceAreaNonZero() {
      
      SquareAntiprism[] dArray = new SquareAntiprism[10];
      dArray[0] = new SquareAntiprism("Example 1", 1);
      dArray[1] = new SquareAntiprism("Example 2", 2);
      dArray[2] = new SquareAntiprism("Example 3", 3);
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 3);
      Assert.assertEquals("averageSurfaceAreaNonZeroTest failed",
         77.39693490558349, dList.averageSurfaceArea(), 0.000001);
   }
   /**
   * Tests averageSurfaceArea - zero.
   */
   @Test public void averageSurfaceAreaZeroTest() {
   
      SquareAntiprism[] dArray = new SquareAntiprism[10];
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 0);
   
      Assert.assertEquals("averageSurfaceAreaZeroTest failed", 0.0,
         dList.averageSurfaceArea(), 0.000001);
   
   }
   /**
   * Tests averageVolume - non-zero.
   */
   @Test public void averageVolumeNonZeroTest() {
      
      SquareAntiprism[] dArray = new SquareAntiprism[10];
      dArray[0] = new SquareAntiprism("Example 1", 1);
      dArray[1] = new SquareAntiprism("Example 2", 2);
      dArray[2] = new SquareAntiprism("Example 3", 3);
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 3);
      Assert.assertEquals("averageVolumeNonZeroTest failed",
         51.215481005485636, dList.averageVolume(), 0.000001);
   }
   /**
   *tests averageVolume - zero.
   */
   @Test public void averageVolumeZeroTest() {
   
      SquareAntiprism[] dArray = new SquareAntiprism[10];
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 0);
   
      Assert.assertEquals("averageVolumeZeroTest failed", 0.0,
         dList.averageVolume(), 0.000001);
   }
   /**
   * Tests toString.
   */
   @Test public void toStringTest() {
   
      SquareAntiprism[] dArray = new SquareAntiprism[10];
      dArray[0] = new SquareAntiprism("Example1", 1);
      dArray[1] = new SquareAntiprism("Example2", 1);
      dArray[2] = new SquareAntiprism("Example3", 1);
      
      SquareAntiprismList dList = 
         new SquareAntiprismList("Test List", dArray, 3);
   
      Assert.assertEquals("toStringTest", true, 
         dList.toString().contains("with edge of "
         + "1.0 units"));
   
   } 
   
   /**
   * Tests summaryInfo.
   */
   
   @Test public void summaryInfoTest() {
   
      SquareAntiprism[] dArray = new SquareAntiprism[10];
      dArray[0] = new SquareAntiprism("Example 1", 1);
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 1);
   
      boolean has = dList.summaryInfo().contains("----- Summary for SquareAntiprism "
         + "Test List-----\nNumber of SquareAntiprisms: 3\nTotal Surface Area: "
         + "19,294.626 square units"
         + "\nTotal Volume: 150,779.862 cubic units\nAverage Surface Area: "
         + "6,431.542 square units\nAverage Volume : 50,259.954 cubic units\n");
      Assert.assertTrue(has);
      Assert.assertFalse(!has);
   
   }
   /**
   * Tests getList.
   */
   @Test public void getListTest() {
   
      SquareAntiprism[] dArray = new SquareAntiprism[10];
      dArray[0] = new SquareAntiprism("Example 1", 1);
      dArray[1] = new SquareAntiprism("Example 2", 2);
      dArray[2] = new SquareAntiprism("Example 3", 3);
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 3);
   
      Assert.assertArrayEquals("getListTest failed", dArray, dList.getList());
   
   }
   /**
   * Tests the addSquareAntiprism method.
   */
   @Test public void addSquareAntiprismTest() {
   
      SquareAntiprism[] dArray = new SquareAntiprism[10];
      dArray[0] = new SquareAntiprism("Example 1", 1);
      dArray[1] = new SquareAntiprism("Example 2", 2);
      dArray[2] = new SquareAntiprism("Example 3", 3);
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 3);
         
      SquareAntiprism d = new SquareAntiprism("Example 4", 4);
      dList.addSquareAntiprism("Example 4", 4);
      SquareAntiprism[] dA = dList.getList();
   
      Assert.assertEquals("addSquareAntiprismTest failed", d, dA[3]);
      
   }
   /**
   * Tests findSquareAntiprism - valid entry.
   */
   @Test public void findSquareAntiprismValidEntryTest() {
   
      SquareAntiprism[] dArray = new SquareAntiprism[10];
      dArray[0] = new SquareAntiprism("Example 1", 1);
      dArray[1] = new SquareAntiprism("Example 2", 2);
      dArray[2] = new SquareAntiprism("Example 3", 3);
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 3);
   
      Assert.assertEquals("findTriangularPrismTestValidEntry failed",
          dArray[1], dList.findSquareAntiprism("EXAMPLE 2"));
   
   }
   /**
   *tests findSquareAntiprism - non-valid entry.
   */
   @Test public void findSquareAntiprismNonValidEntryTest() {
   
      SquareAntiprism[] dArray = new SquareAntiprism[10];
      dArray[0] = new SquareAntiprism("Example 1", 1);
      dArray[1] = new SquareAntiprism("Example 2", 2);
      dArray[2] = new SquareAntiprism("Example 3", 3);
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 3);
   
      Assert.assertEquals("findTriangularPrismTestNonValidEntry failed", null, 
         dList.findSquareAntiprism("EXAMPLE 5"));
   
   }
   /**
   * Tests deleteSquareAntiprism - valid entry.
   */
   @Test public void deleteSquareAntiprismValidEntryTest() {
   
      SquareAntiprism[] dArray = new SquareAntiprism[10];
      dArray[0] = new SquareAntiprism("Example 1", 1);
      dArray[1] = new SquareAntiprism("Example 2", 2);
      dArray[2] = new SquareAntiprism("Example 3", 3);
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 3);
   
      Assert.assertEquals("deleteSquareAntiprismValidEntryTest failed",
         dArray[1], dList.deleteSquareAntiprism("Example 2"));
   }
   /**
   * Tests deleteSquareAntiprism - non-valid entry.
   */
   @Test public void deleteSquareAntiprismNonValidEntryTest() {
   
      SquareAntiprism[]dArray = new SquareAntiprism[10];
      dArray[0] = new SquareAntiprism("Example 1", 1);
      dArray[1] = new SquareAntiprism("Example 2", 2);
      dArray[2] = new SquareAntiprism("Example 3", 3);
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 3);
   
      Assert.assertEquals("deleteSquareAntiprismNonValidEntryTest failed",
         null, dList.deleteSquareAntiprism("Example 5"));
   }
   /**
   * Tests editTriangularPrism - valid entry.
   */
   @Test public void editSquareAntiprismValidEntryTest() {
   
      SquareAntiprism[] dArray = new SquareAntiprism[10];
      dArray[0] = new SquareAntiprism("Example 1", 1);
      dArray[1] = new SquareAntiprism("Example 2", 2);
      dArray[2] = new SquareAntiprism("Example 3", 3);
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 3);
   
      Assert.assertEquals("editSquareAntiprismValidEntryTest failed",
         true, dList.editSquareAntiprism("Example 2", 4));
   }
   /**
   * Tests editSquareAntiprism - non-valid entry.
   */
   @Test public void editSquareAntiprismNonValidEntryTest() {
   
      SquareAntiprism[] dArray = new SquareAntiprism[10];
      dArray[0] = new SquareAntiprism("Example 1", 1);
      dArray[1] = new SquareAntiprism("Example 2", 2);
      dArray[2] = new SquareAntiprism("Example 3", 3);
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 3);
   
      Assert.assertEquals("editSquareAntiprismNonValidEntryTest failed",
         false, dList.editSquareAntiprism("Example 5", 5));
   }
   /**
   * Tests the findSquareAntiprismWithLargestVolume.
   * - Number of SquareAntiprism > 0 method.
   */
   @Test public void findSquareAntiprismWithLargestVolumeValidTest() {
   
      SquareAntiprism[] dArray = new SquareAntiprism[10];
      dArray[0] = new SquareAntiprism("Example 1", 1);
      dArray[1] = new SquareAntiprism("Example 2", 2);
      dArray[2] = new SquareAntiprism("Example 3", 3);
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 3);
   
      Assert.assertEquals("findSquareAntiprismWithLargestVolumeValidTest"
         + " failed", dArray[2], dList.findSquareAntiprismWithLargestVolume());
   
   }
   
   /**
   * Tests the findSquareAntiprismWithLargestVolume.
   * - Number of SquareAntiprism = 0 method.
   */
   @Test public void findSquareAntiprismWithLargestVolumeNonValidTest() {
   
      SquareAntiprism[] dArray = new SquareAntiprism[10];
   
      SquareAntiprismList dList = new SquareAntiprismList("Test List",
         dArray, 0);
   
      Assert.assertEquals("findSquareAntiprismWithLargestVolumeNonValidTest"
         + " failed", null, dList.findSquareAntiprismWithLargestVolume());
   
   }
   

      
}
