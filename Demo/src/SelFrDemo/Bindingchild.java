package SelFrDemo;


class Binding{  
    void eat(){System.out.println("animal is eating...");}  
   
}
   class Bindingchild extends Binding{  
    void eat(){System.out.println("dog is eating...");}  
    void print()
    {
    	System.out.println("print parent");
    }
    public static void main(String args[]){  
    	Binding a=new Bindingchild();  
    	Binding b=new Bindingchild();  

     a.eat();  
     ((Bindingchild) a).print();
     ((Bindingchild) b).print();
    }  
   }  