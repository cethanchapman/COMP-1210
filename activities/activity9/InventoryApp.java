/**
* Represents an item in a store.
*
* Activity 9
* Ethan Chapman
* 4/5/2022
*/
public abstract class OnlineTextItem extends InventoryItem {
   
/**
* constructs an onlineTextItem.
*
* @param nameIn used.
* @param priceIn used.
*/
   public OnlineTextItem(String nameIn, double priceIn) {
      
      super(nameIn, priceIn);
   }

/**
* Overrides the calculateCost method from InventoryItem to not include tax.
*
* @return double.
*/
   public double calculateCost() {
      
      return price;
      
   }
}
   
