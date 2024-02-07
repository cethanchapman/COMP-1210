/**
* Represents an item in a store.
*
* Activity 9
* Ethan Chapman
* 4/5/2022
*/
public class OnlineArticle extends OnlineTextItem {

// variables
   private int wordCount;
   
   /**
   * Constructs an online article.
   *
   * @param nameIn used.
   * @param priceIn used.
   */
   public OnlineArticle(String nameIn, double priceIn) {
      
      super(nameIn, priceIn);
      wordCount = 0;
      
   }
   //methods

   /**
   * Sets the word count.
   *
   * @param wordCountIn used.
   */
   public void setWordCount(int wordCountIn) {
      
      wordCount = wordCountIn;
   }
}
