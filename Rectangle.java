/**
 * This is Rectangle class. It has two fields
 *length and width.
 *Methods: setWidth, setLength, getWidth, getLength, and getArea
 */
 
 public class Rectangle 
 {
   //Declare fields
   //Syntax: private type name
   private double length;
   private double width;
   private String color;
   
   //setWidth method
   public void setWidth (double newWidth)
   {
      width = newWidth;  
   }
   
   //setLength method
   public void setLength (double newLength)
   {
      length = newLength;
   }
   
   //getWidth
   public double getWidth ()
   {
      return width;
   }
   
   //getLength
   public double getLength ()
   {
      return length;
   }
   
   //getArea
   public double getArea()
   {
      return (width * length);
   }   
   
   //setColor method
   public void setColor (String newColor)
   {
      color = newColor;
   }  
   
   //getColor
   public String getColor()
   {
      return color;
   }
 }
 