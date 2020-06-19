/*package SelFrDemo;

import java.util.PriorityQueue;

import org.apache.log4j.xml.DOMConfigurator;
import org.eclipse.jetty.websocket.common.io.payload.DeMaskProcessor;

import com.relevantcodes.extentreports.model.Log;

import java.io.*;


public  class AfterDemo implements Comparable<AfterDemo>{
    private String studentname;
    private int rollno;
    private int studentage;

    public AfterDemo(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }
    public int getRollno() {
    	return rollno;
        }
       
        public int getStudentage() {
    	return studentage;
        }
        
     public int compareTo(AfterDemo comparestu) {
        int compareage=(comparestu).getStudentage();
         For Ascending order
    	 return this.studentage-compareage;
       
         For Descending order do like this 
        //return compareage-this.studentage;
    }

    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }
	

	
	

}

public class AfterDemo{
	
	int id;
	String countryName;
	public AfterDemo(int id, String countryName) {
		// TODO Auto-generated constructor stub
this.id=id;
this.countryName=countryName;
	
	}
	
   int getId()
   {
	   return id;
	   
   }
   
   String getCountryName()
   {
	   return countryName;
   }
   
	
	
	
}



    

	
	
	 public class AfterDemo{
	
	
	public static void main(String... agrs)
	{
		
	DemoJ refvar=DemoJ.INSTANCE;
	refvar.display();
	DemoJ obj= DemoJ.object;
	obj.display();
	AfterDemo dd=new AfterDemo();
	//DemoJ dj= new DemoJ();
	
	}
	
	}
	 
	 
	
public class AfterDemo {
    private static volatile AfterDemo singleInstance;
    private AfterDemo(){
    	 if(singleInstance!= null){
             throw new Error("you are creating more then one instance");
         }
         
    }
    public static AfterDemo getSingleInstance(){
        if(singleInstance == null){
            synchronized(AfterDemo.class){
                if(singleInstance == null){
                    singleInstance = new AfterDemo();   
                }                   
            }           
        }
        return singleInstance;
    }
    public static void main(String args[]){
        AfterDemo instance1 = AfterDemo.getSingleInstance();
        System.out.println("Instance Id="+instance1.toString());
         
        AfterDemo instance2 = AfterDemo.getSingleInstance();
        System.out.println("Instance Id="+instance2.toString());
        //dynamic class loading  
        Class classSingleton;
        try {
            classSingleton = Class.forName("SelFrDemo.AfterDemo");
            AfterDemo instance3  = (AfterDemo)classSingleton.newInstance();
            System.out.println("Instance Id="+instance3.toString());
            classSingleton = Class.forName("SelFrDemo.AfterDemo");
            AfterDemo instance4  = (AfterDemo)classSingleton.newInstance();
            System.out.println("Instance Id="+instance4.toString());
             
         
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch(InstantiationException ie){
            ie.printStackTrace();
        }
        catch(IllegalAccessException iae){
            iae.printStackTrace();
        }
    }
}*/