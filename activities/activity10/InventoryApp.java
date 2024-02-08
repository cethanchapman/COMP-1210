/**
* Represents an item in a store.
*
* Activity 9
* Ethan Chapman
* 4/5/2022
*/
public class InventoryApp {
   
   /**
   * Instatiates and prints 4 objects.
   *
   *@param args not used.
   */
   public static void main(String[] args) {
      
      InventoryItem.setTaxRate(0.05);
      
      InventoryItem item1 = new InventoryItem("Oil change kit", 39);
      ElectronicsItem item2 = new ElectronicsItem("Cordless Phone", 80.0, 1.8);
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50); 
      item3.setWordCount(700);
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
      
      System.out.println(item1 + "\n" + item2 + "\n" + item3 + "\n" + item4);
   }
}------------
