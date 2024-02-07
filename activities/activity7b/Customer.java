/**
* Creates a customer with a name, location, and balance.
* Also provides the ability to compare two customers based
* on balance.
*
* Activity 7b
* @author Ethan Chapman
* @version 03/22/2022
*/
public class Customer implements Comparable<Customer> {

// instance variables
   private String name;
   private String town;
   private double balance;
   
   /**
   * Constructor for customer.
   *
   * @param nameIn used.
   */
   public Customer(String nameIn) {
   
      name = nameIn;
      town = "";
      balance = 0;
   
   }
   
   // methods
   
   /**
   * Sets the customers location.
   *
   * @param locationIn used.
   */
   public void setLocation(String locationIn) {
   
      town = locationIn;
   
   }
   
   /**
   * Sets the customer's location.
   *
   * @param city used.
   * @param state used.
   */
   public void setLocation(String city, String state) {
   
      town = city + ", " + state;
   
   }
   /**
   * Changes the customer's balance.
   *
   * @param amount used.
   */
   public void changeBalance(double amount) {
   
      balance = balance + amount;
   
   }
   
   /**
   * Gets the location of the customer.
   *
   * @return String.
   */
   public String getLocation() {
   
      return town;
   
   }
   
   /**
   * Gets the balance of the customer.
   *
   * @return balance.
   */
   public double getBalance() {
   
      return balance;
   }
   /**
   * Puts the customer information into a string.
   *
   * @return output.
   */
   public String toString() {
   
      String output = name + "\n" + town + "\n$" + balance;
      return output;
   
   }
   
   /**
   * Compares customers by balance.
   *
   * @param obj used.
   * @return double.
   */
   public int compareTo(Customer obj) {
   
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      
      else {
         return 1;
      } 
   }



}   
