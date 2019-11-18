// Unit 2 - HW assignment
//Java Lab problem #3

import java.util.Scanner;

public class Price
{
   public static void main( String[] args)
   {
      Scanner kb = new Scanner (System.in);
      double price, quantity, subtotal, salesTaxRate, salesTaxAmount, totalAmount;
      
      System.out.print ("Enter a price: ");
      price = kb.nextInt();
      System.out.print ("Enter a quantity: ");
      quantity = kb.nextInt();
      
      subtotal = price * quantity;
      
      System.out.println ("The price of the item is $" + price);
      System.out.println ("The quantity of the item is: " + quantity);
      System.out.println ("The subtotal is: $" + subtotal);
      
      salesTaxRate = 7.5;
      salesTaxAmount = subtotal * salesTaxRate / 100;
      
      System.out.println ("The sales tax amount is: $" + salesTaxAmount);
      
      totalAmount = subtotal + salesTaxAmount;
      
      System.out.println ("The total amount is: $" + totalAmount);
      
      
      }
      
}