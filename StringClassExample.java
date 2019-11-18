//Import Scanner class
import java.util.Scanner;

public class StringClassExample

{
   public static void main (String[] args)
   {
   //Create Scanner object
      Scanner kb = new Scanner (System.in);
      
      //Declare String variables;
      String type, address, city, state, zipCode;
      
      type = "Address";
      
      
      //Ask user for input and store them in variables
      System.out.print ("Enter your street address: ");
      address = kb.nextLine();
      
      System.out.print ("Enter name of your city: ");
      city = kb.nextLine();
      
      System.out.print ("Enter your state name: ");
      state = kb.nextLine();
      
      System.out.print ("Enter your zip code: ");
      zipCode = kb.nextLine();
      
      //Display data as entered
      System.out.println (address);
      System.out.println (city + ", " + state + " " + zipCode);
      
      //Combine multiple string into one string
      //String secondLine = city + ", " + state + " " + zipCode;
      //System.out.println (secondLine);
      
      //Covert all string into upper case
      address = address.toUpperCase();
      city = city.toUpperCase();
      state = state.toUpperCase();
      
      System.out.println ("Address in uppercase");
      System.out.println (address);
      System.out.println (city + ", " + state + " " + zipCode);
      
      //Length of street address
      int addressLength = address.length ();
      System.out.println ("There are " + addressLength + " characters in your address");
      
      //Extract characters from city name
      char firstChar = city.charAt(0);
      char secondChar = city.charAt(1);
      char lastChar = city.charAt(city.length () - 1);
      
      System.out.println ("First character: " + firstChar);
      System.out.println ("Second character: " + secondChar);
      System.out.println ("Last character: " + lastChar);
   }

}

