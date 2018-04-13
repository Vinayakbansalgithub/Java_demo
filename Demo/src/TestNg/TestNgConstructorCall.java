package TestNg;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

 class Abc {

	 @BeforeSuite
	 void Abc(){System.out.println("hiii");
    }
}

//Child Class

public class TestNgConstructorCall extends Abc{
	
	
	
    @Test
    public void Xyz(){
        System.out.println("hi");
    }
    }