//Java Lab # 4 Question #2
//Import Scanner Class
import java.util.Scanner;

public class PositiveNonzeroInteger
{
   public static void main (String[] args)
   {
      //Create Scanner Object
      Scanner kb = new Scanner(System.in);
      
      int count = 1;
      int sum = 0;
      int number=0;
      
      while (number <=0)
      {
         System.out.print ("Enter a number: ");
         number = kb.nextInt();
         if (number <= 0)
         {
            System.out.println ("Invalid Input. Number must be positive.");
         }
       }
             
      while (count <= number)
      {
         sum = sum + count;
         count++;
      }  
      
      System.out.println ("Sum of all the integers from 1 up to the number entered: " + sum);
      
   }   
}

