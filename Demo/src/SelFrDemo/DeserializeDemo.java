package SelFrDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;

public class DeserializeDemo {
	
	
	
	
	
	public static void main(String... args)
	{
		 Employee e=	Employee.getInstance(); 
		// Employee emd=	Employee.getInstance(); 
		 
	try
	{
	FileInputStream fis= new FileInputStream("D:/Serializable.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	e=(Employee) ois.readObject();
	//emd=(Employee) ois.readObject();
	ois.close();
	fis.close();
	
	
	
	}
	catch(IOException i)
    {
       i.printStackTrace();
       return;
    } catch (ClassNotFoundException ex) {
		// TODO Auto-generated catch block
		ex.printStackTrace();
	}
	System.out.println(e.name+"    "+e.company+"    "+e.SalaryInLac);
	//System.out.println(emd.name+"    "+emd.company+"    "+emd.SalaryInLac);
	}
}
