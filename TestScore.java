//Import Scanner Class
import java.util.Scanner;

public class TestScore
{
   public static void main (String[] args)
   {
      //Create Scanner Object
      Scanner kb = new Scanner (System.in);
      
      int testScore1, testScore2, testScore3, testScoreAverage;  
         
      //Ask user for test score 1
      System.out.print ("Enter your first test score.");
      testScore1 = kb.nextInt ();
      
      //Ask user for test score 2
      System.out.print ("Enter your second test score.");
      testScore2 = kb.nextInt ();
      
      //Ask user for test score 3
      System.out.print ("Enter your third test score.");
      testScore3 = kb.nextInt ();
      
      //Calulcate the avereage of the test scores
      testScoreAverage = (testScore1 + testScore2 + testScore3)/3;
      
      //Display the data
      System.out.println ("Your first test score is: " + testScore1);
      System.out.println ("Your second test score is: " + testScore2);
      System.out.println ("Your third test score is: " + testScore3);
      System.out.println ("Your test score average is: " + testScoreAverage);
      
      //Display letter grade based on test score average
      if (testScoreAverage < 60)
      {
         System.out.println("Your grade is F.");
      }
      else if (testScoreAverage <= 69)
      {
         System.out.println("Your grade is D.");
      }
       else if (testScoreAverage <= 79)
      {
         System.out.println("Your grade is C.");
      }
       else if (testScoreAverage <= 89)
      {
         System.out.println("Your grade is B.");
      }
      else
      {
         System.out.println("Your grade is A.");
      }   
      
   }

}