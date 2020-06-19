package SelFrDemo;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



import SelFrDemo.Employee;

public class SerializeDemo {
	
	 public static void main(String [] args)
	   {
	     
	//  Employee emp= new Employee("vinayak","ptp",3);
		 
	Employee e=	Employee.getInstance(); 
	
	
		try
	      {
			File file= new File("D:/Serializable.ser");
	         FileOutputStream fileOut =
	         new FileOutputStream(file);
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	       System.out.println("saved Serializable singleton object to a file");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }
	   }
}
