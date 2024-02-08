/**
* Creates itemList.
* 
* Assignment 10
* @author - Ethan Chapman
* @version -  04/12/2022
*/

public class ItemsList {
   private InventoryItem[] inventory;
   private int count;
   
   
   /**
   * ItemsList method.
   *
   */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
/**
*  adds objects to list.
*  @param itemIn takes in an object to add to the list
*/
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
/**
* returns cost.
* @return returns the cost after it has been calculated
* @param electronicsSurcharge takes in a double to multiple
*/
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      
      
      return total;
   }
/**
* Returns toString.
* @return returns the toString of the inventory
*/
   public String toString() {
      String result = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         result += inventory[i] + "\n";
      }
      
      return result;
   }   
      
}
