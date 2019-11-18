//Import Scanner Class
import java.util.Scanner;

public class LoopExample
{
   public static void main (String[] args)
   {
      //Create Scanner Object
      Scanner kb = new Scanner(System.in);
      
//       //The While Loop Example
//       int index = 0;
//       while (index <= 30)
//       {
//          System.out.println ("index is: " + index);
//          index++;   //index = index + 1;
//       }     
//       
//       System.out.println ("After exiting Loop");
// 
//       int number; 
//       int sum = 0;
//       int count = 0;
//       
//       while (count < 10)
//       {
//          System.out.print ("Enter a number: ");
//          number = kb.nextInt();
//          sum = sum + number;
//          count++;
//       }
//       
//       System.out.println ("Sum of 10 numbers is: " + sum);

 //      int age=0;
//       
//       while (age <=0)
//       {
//          System.out.print ("Enter your age" );
//          age = kb.nextInt();
//          if (age <= 0)
//         {
//          System.out.Println ("Invalid Input. Age must be positive");
//         } 
//       }
//       System.out.println ("Your age is" + age);

     //  int sum = 0;
//       for (int count = 0; count <= 10; count++)
//       {
//          sum = sum + count;
//       }
//       
//       System.out.println ("Sum is: " + sum);

      int count;
      System.out.print ("How many numbers do you want to add: ");
      count = kb.nextInt();
      int sum = 0;
      int input;
      
      for (int i = 0; i < count; i++)
      {
         System.out.print ("Enter a number: ");
         input = kb.nextInt();
         sum = sum + input;
      }
      
   
      System.out.println ("Sum is " + sum);
   }

}