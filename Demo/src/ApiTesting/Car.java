<<<<<<< HEAD
package ApiTesting;

import java.io.Serializable;

public class Car
//implements Serializable 
{
	//private static final long serialVersionUID = 5532986058120048988L;

    String make;
    String model;
    int year;
     
   public  Car() {      
    }
     
    public Car(String make, String model, int year) {
         
        this.make = make;
        this.model = model;
        this.year = year;
    }
     
    public String getMake() {
        return this.make;
    }
 
    public void setMake(String make) {
        this.make = make;
    }
     
    public String toString() {
        return "My car is a " + this.year + " " + this.make + " " + this.model;
    }
    public static void main(String[] args) {
		
    	
    	
      boolean  VisualComparisonMatch = "1" == "1";

        
        String vv="ve|FUNCSTEP|1568720038108_UDGHNKB0DXQZLT7|FUNCSTEP|1";
        
        String[] arr2 = vv.split("\\|FUNCSTEP\\|");
        
        System.out.println(arr2.length);
        
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        

        
        
	}
}
=======
package ApiTesting;

import java.io.Serializable;

public class Car
//implements Serializable 
{
	//private static final long serialVersionUID = 5532986058120048988L;

    String make;
    String model;
    int year;
     
   public  Car() {      
    }
     
    public Car(String make, String model, int year) {
         
        this.make = make;
        this.model = model;
        this.year = year;
    }
     
    public String getMake() {
        return this.make;
    }
 
    public void setMake(String make) {
        this.make = make;
    }
     
    public String toString() {
        return "My car is a " + this.year + " " + this.make + " " + this.model;
    }
    public static void main(String[] args) {
		
    	
    	
      boolean  VisualComparisonMatch = "1" == "1";

        
        String vv="ve|FUNCSTEP|1568720038108_UDGHNKB0DXQZLT7|FUNCSTEP|1";
        
        String[] arr2 = vv.split("\\|FUNCSTEP\\|");
        
        System.out.println(arr2.length);
        
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        

        
        
	}
}
>>>>>>> branch 'master' of https://github.com/Vinayakbansalgithub/Java_demo.git
