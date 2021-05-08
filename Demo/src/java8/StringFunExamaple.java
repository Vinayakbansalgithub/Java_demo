package java8;

interface StringMakeOver {
	public String StringManupulationfunction(String s);
}

public class StringFunExamaple {

	String fun(StringMakeOver make, String initialData) {
		return make.StringManupulationfunction(initialData);
	}

	public static void main(String[] args) {

		String str = "vinayak";

		StringFunExamaple obj = new StringFunExamaple();

		String result = obj.fun(s -> s.toUpperCase(), str);

		System.out.println(result);

	}

}



/*	
 * 
 * 
 some info:
 
	lamda experession is an unknown method which doesn't work on its own but provide a implementation to an functional interface
	
	if we want to add a lamda experession to a method argument then reciver parameter must be of functional interface type and the kind of expression
	we are passing must satisfy the needs of the abstract method like in the above case, StringManupulationfunction method it takes
	one string and return a string
	
	*
	*/