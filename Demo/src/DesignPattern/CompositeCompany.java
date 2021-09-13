package DesignPattern;

import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;
import java.util.List;
  

// Stractural
  
// A common interface for all employee
interface Employee
{
    public void showEmployeeDetails();
}
  
class Developer implements Employee
{
    private String name;
    private long empId;
    private String position;
      
    public Developer(long empId, String name, String position)
    {
        // Assign the Employee id,
        // name and the position
        this.empId = empId;
        this.name = name;
        this.position = position;
    }
      
    @Override
    public void showEmployeeDetails() 
    {
        System.out.println(empId+" " +name+ " " + position );
    }
}
  
class Manager implements Employee
{
    private String name;
    private long empId;
    private String position;
   
    public Manager(long empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }
       
    @Override
    public void showEmployeeDetails() 
    {
        System.out.println(empId+" " +name+ " " + position );
    }
}
  
  
// Class used to get Employee List
// and do the opertions like 
// add or remove Employee
  
class CompanyDirectory implements Employee
{
    private List<Employee> employeeList = new ArrayList<Employee>();
        
    @Override
    public void showEmployeeDetails() 
    {
        for(Employee emp:employeeList)
        {
            emp.showEmployeeDetails();
        }
    }
        
    public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }
        
    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }
}
  
// Driver class
public class CompositeCompany
{
    public static void main (String[] args)
    {
        Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer");
        Developer dev2 = new Developer(101, "Vinay Sharma", "Developer");
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);
           
        Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager");
        Manager man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager");
           
        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);
       
        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();
    }
}

//The Composite Pattern is a Structural Pattern that allows us to treat a group of objects the same way
//as a single instance of the object.
//
//This design pattern is a structural pattern and
//uses recursive composition to abstract the complexities involved in managing individual as well as composition of objects.
//After applying the design pattern, the client can treat both types of object uniformly.


//Consequences of this pattern
//
//Since the primitive objects can be composed into more complex objects and so on recursively, wherever client code expects a primitive object, it can also take a composite object
//Clients can treat the Component and Composite classes uniformly and hence the client code becomes simple. Clients should normally not bother if they are dealing with a component or composite. This pattern avoid unnecessary branches in the client code
//New components can be added without disturbing the client code. The client code can work as usual with the new component and makes your design general


//
//When not to use Composite Design Pattern?
//
//	    Composite Design Pattern makes it harder to restrict the type of components of a composite. 
//	    So it should not be used when you don’t want to represent a full or partial hierarchy of objects.
//	    
//	    
//	    Composite Design Pattern can make the design overly general. It makes harder to restrict 
//	    the components of a composite. Sometimes you want a composite to have only certain components. 
//	    With Composite, you can’t rely on the 
//	    type system to enforce those constraints for you. Instead you’ll have to use run-time checks.
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    