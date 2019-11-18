/**
 * This is Employee class. It has four fields
 *name, idNumber, department and position
 *Methods: getName, getIDNumber, getDepartmen, getPosition, 
           setName, setIdNumber,setDepartment, and SetPosition. 
 */
 
 public class Employee
 {
   //Declare fields
   //Syntax: private type name
   private String name;
   private String idNumber;
   private String department;
   private String position;
   
   //setName method
   public void setName (String newName)
   {
      name = newName;
   }  
   
   //getName method
   public String getName()
   {
      return name;
   }

   //setIdNumber method
   public void setIdNumber (String newIdNumber)
   {
      idNumber = newIdNumber;
   }  
   
   //getIdNumber method
   public String getIdNumber()
   {
      return idNumber;
   }
   
  //setDepartment method
   public void setDepartment (String newDepartment)
   {
      department = newDepartment;
   }  
   
   //getDepartment method
   public String getDepartment()
   {
      return department;
   }

  //setPosition method
   public void setPosition (String newPosition)
   {
       position = newPosition;
   }  
   
   //getPosition method
   public String getPosition()
   {
      return position;
   }

 }
 