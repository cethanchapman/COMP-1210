/**
*Represents an item in a store.
*
* Activity 9
* Ethan Chapman
* 4/5/2022
*/
public class ElectronicsItem extends InventoryItem {
   
   //variables
   protected double weight;
   /**
   *constant variable to represent shipping cost.
   */
   public static final double SHIPPING_COST = 1.5;
   
   /**
   * Constructor for an electronic item.
   *
   * @param nameIn used.
   * @param priceIn used.
   * @param weightIn used.
   */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
   /**
   * Overrides the caculateCost method from InventoryItem to include shipping.
   *
   * @return double.
   */
   public double calculateCost() {
      
      return super.calculateCost() + (SHIPPING_COST * weight);
      
   }
}
