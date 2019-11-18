//Import Scanner class
import java.util.Scanner;

public class UserName

{
   public static void main (String[] args)
   {
      //Create Scanner object
      Scanner kb = new Scanner (System.in);
      
      //Declare String variables;
      String type, firstName, lastName;
      
      type = "name";
      
      //Ask user for input and store them in variables
      System.out.print ("Enter your first name: ");
      firstName = kb.nextLine();
      
      System.out.print ("Enter your last name: ");
      lastName= kb.nextLine();
      
      //Display data as entered
      //Combine multiple string into one string
      String fullName = firstName + " " + lastName;
      System.out.println ("Your full name is: "+ fullName);

      //Extract characters from first name
      char firstInitial = firstName.charAt(0);
      System.out.println ("Your first initial is: " + firstInitial);
      
      //Covert all string into upper case
      fullName = fullName.toUpperCase();
      System.out.println ("Your full name in all capitals is: " + fullName);
      
      //Length of full name
      int nameLength = fullName.length ();
      System.out.println ("There are " + nameLength + " characters in your full name.");
      
   }

}

