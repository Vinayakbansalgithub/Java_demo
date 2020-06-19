package SelFrDemo;




import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumSimple {

    public static void main(String[] args) throws FileNotFoundException {
    	
    	
    	String s="abbbab";
    	
    	s=s.replace('b','x');
    			System.out.println(s);
    	
    	
    	
    	try{
    		throw new IOException();
    	}
catch(Exception e){
	
	throw new RuntimeException();
	
}   } 	
    
}
    	/*
    	
    	int[] x={1,2,3,4};
    	
    	int[] y=x;
    	x=new int[2];
    	
    	for (int i = 0; i < x.length; i++) {
			System.out.println(y[i]);
		}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        // declaration and instantiation of objects/variables
    //    WebDriver driver = new FirefoxDriver();
        
        WebDriver driver = new WebDriver(){

			@Override
			public void get(String arg0) {
				// TODO Auto-generated method stub
				new FirefoxDriver().get(arg0);
			}

			
			public void gg(){
				
				
			}
			
			@Override
			public void close() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public WebElement findElement(By arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public List<WebElement> findElements(By arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getCurrentUrl() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getPageSource() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getTitle() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public String getWindowHandle() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Set<String> getWindowHandles() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Options manage() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Navigation navigate() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void quit() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public TargetLocator switchTo() {
				// TODO Auto-generated method stub
				return null;
			}

		

		
        	
        	
        };
        driver.get("hello");
      
        String baseUrl = "http://newtours.demoaut.com";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
        

        // get the actual value of the title
        actualTitle = driver.getTitle();

        
         * compare the actual title of the page witht the expected one and print
         * the result as "Passed" or "Failed"
         
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Firefox
        driver.close();
        System.out.println("in the end");
       
        // exit the program explicitly
        System.exit(0);
    }

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void get(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}
}
*/