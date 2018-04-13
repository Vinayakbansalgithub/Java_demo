package SDEt;

import bsh.classpath.BshClassPath.AmbiguousName;

class Animal
{
    int i = 10;
   String s="animan variable";
    void eat(){
    	 
    	 System.out.println("in parent eat");
     }
    
}
 
class Dog extends Animal
{
    int i = 20;
    String s="dog variable";
    @Override
    void eat(){
    	
    	System.out.println("in child eat");
    }
    
    
    void eat(String str){
    	
    	System.out.println("in dog arg");
    }
    
    
}
 
public class InheritanceCheck
{
    public static void main(String[] args)
    {
    	
    	Animal a= new  Animal();
    	Dog d= new Dog();
    	Animal ad= new Dog();
    	
    	
      System.out.println(a.i);
      System.out.println(d.i);
      System.out.println(ad.i);
    	
      a.eat();
      d.eat();
      ad.eat();
      
      
      d.eat("food");
      
      
    	
    }
}
