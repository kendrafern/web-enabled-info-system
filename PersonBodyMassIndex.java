//Import Scanner Class
import java.util.Scanner;

public class PersonBodyMassIndex
{
   public static void main (String[] args)
   {
      //Create Scanner Object
      Scanner kb = new Scanner (System.in);
      
      int bodyMassIndex, weight, height;  
         
      //Ask user for weight
      System.out.print ("Enter your weight in pounds: ");
      weight = kb.nextInt ();
      
      //Ask user for height
      System.out.print ("Enter your height in inches: ");
      height = kb.nextInt ();
      
      //Calulcate BMI 
      bodyMassIndex = (weight * 703)/(height * height);
      
      //Display the data
      System.out.println ("Your weight is: " + weight + " lbs");
      System.out.println ("Your height is: " + height + " inches");
      System.out.println ("Your BMI is: " + bodyMassIndex);
      
      //Display message based on BMI
      if (bodyMassIndex < 18.5)
      {
         System.out.println("You are underweight.");
      }
      else if (bodyMassIndex <= 25)
      {
         System.out.println("Your weight is optimal.");
      }
      else
      {
         System.out.println("You are overweight.");
      }   
      
   }

}