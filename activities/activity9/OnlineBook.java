/**
* Represents an item in a store.
*
* Activity 9
* Ethan Chapman
* 4/5/2022
*/
public class OnlineBook extends OnlineTextItem {
   //variables
   protected String author;
   
   /**
   * Constructor for OnlineBook.
   *
   * @param nameIn used.
   * @param priceIn used.
   */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
      
   }
   /**
   * Overrides the toString method in InventoryItem to include author's name.
   *
   * @return String.
   */
   public String toString() {
   
      return name + "-" + author + ": $" + price;
     
   }
   /**
   * Sets the author's name.
   *
   * @param authorIn used.
   */
   public void setAuthor(String authorIn) {
      
      author = authorIn;
   }
}
