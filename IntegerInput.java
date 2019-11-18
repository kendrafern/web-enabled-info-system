//Import Scanner class
import java.util.Scanner;

//IntegerInput class to demo use of Scanner class to read integer 
//input
public class IntegerInput
{
   public static void main (String[] args)
   {
      //Create Scanner object
      Scanner kb = new Scanner (System.in);
      int value1, value2, result;
      
      //Ask user for input
      System.out.print ("Enter a number: ");
      value1 = kb.nextInt();
      System.out.print ("Enter a number: ");
      value2 = kb.nextInt();
      
      //Perform calclations
      result = value1 * value2;
      
      //Display the data
      System.out.println ("First number is: " + value1);
      System.out.println ("Second number is: " + value2);
      
      
      //Display Result
      System.out.println ("Result is: " + result);
   }
   
}
