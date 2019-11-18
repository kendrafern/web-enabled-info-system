//Java Lab #4 Question #3
//Import Scanner Class
import java.util.Scanner;

public class Salary
{
   public static void main (String[] args)
   {
      //Create Scanner Object
      Scanner kb = new Scanner(System.in);
      
      //Declare var to store number of days worked
      int numDays=0;
      int day;
      
      //User Salary
      double currentPay= 0.01;
      double finalSalary= 0.00; 
      
      //Prompt user for input
      while (numDays <=0)
      {
         System.out.print ("Enter the number of days worked: ");
         numDays = kb.nextInt();
         
         // Input validation
         if (numDays <= 0)
         {
            System.out.println ("Invalid Input. Number must be positive.");
         }
       }
      
      //Display number of days
      
      //Construct while loop to display days, daily salary, and total salary
      
      for (day = 1; day <= numDays; day++)
      {
         System.out.println("Day " +  day + " - Pay " + currentPay);
         finalSalary += currentPay;
         currentPay = currentPay * 2.00;
         
         
      }     
      
     System.out.println ("================");
     
     System.out.println ("Total Pay $" + finalSalary);
     
     System.out.println ("================");
   }   
}

