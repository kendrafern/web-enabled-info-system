/**
  * This is a driver class which will instantiate object of Employee
  * class
  */
  
  public class DemoEmployee
  {
  
   public static void main (String[] args)
   {
      //Declare variables of type Employee
      Employee person1, person2, person3;
      
      //Create first employee objects
      person1 = new Employee();
      
      //Initialize name, idNumber, department and position
      person1.setName("Susan Meyers");
      person1.setIdNumber("47899");
      person1.setDepartment("Accounting");
      person1.setPosition("Vice President");
   
      //First Employee
      System.out.println("Employee 1");
      System.out.println("Name: " + person1.getName());
      System.out.println("Id Number: " + person1.getIdNumber());
      System.out.println("Department: " + person1.getDepartment());
      System.out.println("Position: " + person1.getPosition());
      System.out.println("==========================");
      
      //Create second employee objects
      person2 = new Employee();
      
      //Initialize name, idNumber, department and position
      person2.setName("Mark Jones");
      person2.setIdNumber("39119");
      person2.setDepartment("IT");
      person2.setPosition("Programmer");
   
      //Second Employee
      System.out.println("Employee 2");
      System.out.println("Name: " + person2.getName());
      System.out.println("Id Number: " + person2.getIdNumber());
      System.out.println("Department: " + person2.getDepartment());
      System.out.println("Position: " + person2.getPosition());
      System.out.println("==========================");
      
      //Create third employee objects
      person3 = new Employee();
      
      //Initialize name, idNumber, department and position
      person3.setName("Joy Rogers");
      person3.setIdNumber("81774");
      person3.setDepartment("Manufacturing");
      person3.setPosition("Engineer");
   
      //Second Employee
      System.out.println("Employee 3");
      System.out.println("Name: " + person3.getName());
      System.out.println("Id Number: " + person3.getIdNumber());
      System.out.println("Department: " + person3.getDepartment());
      System.out.println("Position: " + person3.getPosition());
      System.out.println("==========================");
      
      
    }
      
 } 