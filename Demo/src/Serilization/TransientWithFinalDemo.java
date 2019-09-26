package Serilization;

 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
 class Customer implements Serializable {
	 
    // member variables
    final int customerId;
    transient final String customerName;
    transient final int customerAge = 10;
    transient int customerSSN;
 
    // 3-arg parameterized constructor 
    public Customer(int customerId, String customerName,
            int customerSSN) {
        this.customerId = customerId;
        this.customerName = customerName; // final transient
        this.customerSSN = customerSSN;
    }
 
    // overriding toString() method
    @Override
    public String toString() {
        return "Customer ["
                + "customerId=" + customerId 
                + ", customerName=" + customerName 
                + ", customerAge=" + customerAge
                + ", customerSSN=" + customerSSN
                + "]";
    }
}


 

// final customerId variable will be serialized
// final transient customerName variable won’t be serialized
// explicitly initialized final transient customerAge variable will be serialized directly as value
// regular transient customerSSN instance variable won’t be serialized
//
//During De-Serialization process,
//
// final customerId variable will be de-serialized and restored
// final transient customerName variable will be restored to default value, as it doesn’t get serialized (null for this case)
// explicitly initialized final transient customerAge variable will be restored correctly as it’s saved as value directly
// regular transient customerSSN instance variable will be restored to default value (0 for this case)

public class TransientWithFinalDemo {
 
    public static void main(String[] args) {
 
        // create an customer instance using 3-arg constructor
        Customer serializeCustomer = 
                new Customer(107, "Mike", 117896);
 
        // creating output stream variables
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
 
        // creating input stream variables
        FileInputStream fis = null;
        ObjectInputStream ois = null;
 
        // creating customer object reference 
        // to hold values after de-serialization 
        Customer deSerializeCustomer = null;
 
        try {
            // for writing or saving binary data
            fos = new FileOutputStream("Customer.ser");
 
            // converting java-object to binary-format 
            oos = new ObjectOutputStream(fos);
 
            // writing or saving customer object's value to stream
            oos.writeObject(serializeCustomer);
            oos.flush();
            oos.close();
 
            System.out.println("Serialization success: Customer"
                    + " object saved to Customer.ser file\n");
 
            // reading binary data
            fis = new FileInputStream("Customer.ser");
 
            // converting binary-data to java-object
            ois = new ObjectInputStream(fis);
 
            // reading object's value and casting to Customer class
            deSerializeCustomer = (Customer) ois.readObject();
            ois.close();
 
            System.out.println("De-Serialization success: Customer"
                    + " object de-serialized from Customer.ser file\n");
        } 
        catch (FileNotFoundException fnfex) {
            fnfex.printStackTrace();
        }
        catch (IOException ioex) {
            ioex.printStackTrace();
        }
        catch (ClassNotFoundException ccex) {
            ccex.printStackTrace();
        }
 
        // printing customer object to console using toString() method
        System.out.println("Printing customer values from "
                + "de-serialized object... \n" + deSerializeCustomer);
    }
}