//Java Lab #4 Question #1
//Import Scanner Class
import java.util.Scanner;

public class AddNumbersLoop
{
   public static void main (String[] args)
   {
      //Create Scanner Object
      Scanner kb = new Scanner(System.in);
      
      int number = 1;
      int sum = 0;
      while (number <= 100)
      {
         sum = sum + number;
         number++;
      }     
      System.out.println("Sum of the numbers from 1 to 100 is: " + sum);   
   }   
}

