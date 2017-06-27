package SelFrDemo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Javin Paul
 *
 */

interface JVMLanguage {
	int a=9;
}

class ObjectOriented {
}

class Java extends ObjectOriented implements JVMLanguage {


}

class CPlusPlus extends ObjectOriented {
}



public class InstanceofDemo {

    public static void main(String[] args) {

        ObjectOriented oops = new ObjectOriented();
        Java java = new Java();
        CPlusPlus cpp = new CPlusPlus();

        // true - because oops is direct instance of ObjectOriented class
        System.out.println("oops instanceof ObjectOriented : " 
                 + (oops instanceof ObjectOriented));

        // true - because java is instance of Java class,
                 // which is sub-class or ObjectOriented
        System.out.println("java instanceof ObjectOriented : "
                       + (java instanceof ObjectOriented));

        // true - because java is object of Java class, 
                  //which implements JVMLanguage interface
        System.out.println("java instanceof JVMLanguage : " 
                              + (java instanceof JVMLanguage));

        // true - because cpp is object of CPlusPlus,
                 // which extends ObjectOriented
        System.out.println("cpp instanceof ObjectOriented : "
                             + (cpp instanceof ObjectOriented));

        // true - because cpp is object of type CPlusPlus
        System.out.println("cpp instanceof CPlusPlus: " 
                           + (cpp instanceof CPlusPlus));

        // false - because oops is instance of ObjectOriented,
              //  neither extends Java class, nor implement Java interface
        System.out.println("oops  instanceof Java : " 
                       + (oops instanceof Java));

        //Java fromOops = (Java) oops; // compile ok 
                                       //- classCastException at runtime
     
        // false - because ObjectOriented class does not implement
                  // JVMLanguage interface
        System.out.println("oops  instanceof JVMLanguage : "
                          + (oops instanceof JVMLanguage));

        //JVMLanguage jvm = (JVMLanguage) oops; // compile fine
                                  // - java.lang.ClassCastException at runtime
     
     
        // false - because CPlusPlus class does not implement
                 //    JVMLanguage interface
        System.out.println("cpp instanceof JVMLanguage : "
                        + (cpp instanceof JVMLanguage));

        // instanceof operator returns false if compared to null
        java = null;
        System.out.println("(java =null) instanceof ObjectOriented : "
                               + (java instanceof ObjectOriented));
        System.out.println("(java =null) instanceof Java : " 
                        + (java instanceof Java));
    }
}


