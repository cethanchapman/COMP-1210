/**
*Represents an item in a store.
*
* Activity 9
* Ethan Chapman
* 4/5/2022
*/
public class InventoryItem {
   //variables
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
   /**
   * Constructs an inventory item.
   *
   * @param nameIn used.
   * @param priceIn used.
   */
   public InventoryItem(String nameIn, double priceIn) {
      
      name = nameIn;
      price = priceIn;
   }
   
   // Methods

   /**
   * Gets the name.
   *
   * @return name.
   */
   public String getName() {
      
      return name;
   }
   /**
   * Returns the price including tax.
   *
   * @return priceWithTax.
   */
   public double calculateCost() {
      double priceWithTax = price * (1 + taxRate);
      return priceWithTax;
   }
   /**
   * Sets the taxRate.
   *
   * @param taxRateIn used.
   */
   public static void setTaxRate(double taxRateIn) {
   
      taxRate = taxRateIn;
   }
   /**
   * Returns the name of the item and priceWithTax in a string.
   *
   *@return String.
   */
   public String toString() {
      
      return name + ": $" + calculateCost();
      
   }
}
      
