/**
* Program that contains two classes which contain methods.
* Assignment 04
* @author - Ethan Chapman - Comp 1210 - 001
* @version 02/08/2022
*/

public class UserInfo  {
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   // constructor
   /**
   * set default value.
   * @param firstNameIn Command line arguments (not used).
   * @param lastNameIn Command line arguments (not used).
   */
   // methods
   public UserInfo(String firstNameIn, String lastNameIn)
   {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   /** set default value.
   * @return ageIn Commmand line arguments (not used).
   */
   
   //methods
   public String toString() {
      String output = "Name: " + firstName + " "
            + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
   /**
   * Sets location.
   * @param locationIn takes user input for the location
   */
   public void setLocation(String locationIn)  {
      location = locationIn;
   }
   /**
   * Sets age.
   * @return returns the variable age and isSet.
   * @param ageIn takes user input for the age
   */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /** 
   *Gets the age.
   * @return returns the age.
   */
   public int getAge() {
      return age;
   }
   /**
   * Gets the location.
   * @return returns the location
   */
   public String getLocation() {
      return location;
   }
   /**
   * Logs user off.
   */
   public void logOff() {
      status = OFFLINE;
   }
   /** 
   * Logs user on.
   */
   public void logOn() {
      status = ONLINE;
   }       
}     

