//import Scanner class
import java.util.Scanner;

//DoubleInput class to demo use of Scanner
//to read real data 
public class DoubleInput
{
   public static void main (String[] args)
   {
      Scanner kb = new Scanner (System.in);
      double value1, value2, result;
      
      //Ask user for input
      System.out.print ("Enter a number: ");
      value1 = kb.nextDouble();
      
      System.out.print ("Enter a number: ");
      value2 = kb.nextDouble();
      
      //Calculcation
      result = value1 - value2;
      
      //Display output
      System.out.println();
      System.out.println("First number is: " + value1);
      System.out.println("Second number is: " + value2);
      System.out.println ("=========================");
      System.out.println("Result is: " + result);
   }
}