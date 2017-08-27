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
}
