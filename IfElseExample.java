//Import Scanner Class
import java.util.Scanner;

public class IfElseExample
{
   public static void main (String[] args)
   {
      //Create Scanner Object
      Scanner kb = new Scanner (System.in);
      
      int value, age, income;
      String state; 
      
      //Ask user for state
      System.out.print ("Enter your state: ");
      state = kb.nextLine();
      
      if (state.equalsIgnoreCase("CO"))
      {
         System.out.println ("Welcome to Colorado!");
      }
      else
      {
         System.out.println ("Come back to Colorado soon.");
      }
      
      
      //Ask user for a number. If number is 5 then print message.
      System.out.print ("Enter a number: ");
      value = kb.nextInt ();
      
      if (value == 5)
      {
         System.out.println ("you enter the number five.");
      }
      
      //Ask user for income
      System.out.print ("Enter your income: ");
      income = kb.nextInt ();
      
      //If income < 0 then print messages that it is invalid
      if (income < 0)
      {
         System.out.println ("Your input is invalid.");
      }
      else
      {
         System.out.println ("Your income is: " + income);
      }
      
      //Ask user for age 
      System.out.print ("Enter your age.");
      age = kb.nextInt();
      
      //Display message based on age
      if ( age < 16)
      {
         System.out.println("You are too young to drive.");
      }
      else if (age <= 18)
      {
         System.out.println("You can drive with some restrictions.");
      }
      else
      {
         System.out.println("You can drive without any restrictions.");
      }
   }

}