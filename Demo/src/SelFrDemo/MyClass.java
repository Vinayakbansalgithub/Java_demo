package SelFrDemo;

import java.util.HashMap;
import java.util.Set;

public class MyClass {

    private final String importantField;
    private final String anotherField;

    public MyClass(final String equalField, final String anotherField) {
        this.importantField = equalField;
        this.anotherField = anotherField;
    }

    public String getEqualField() {
        return importantField;
    }

    public String getAnotherField() {
        return anotherField;
    }

   /* @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((importantField == null) ? 0 : importantField.hashCode());
        return result;
    }
*/

    
    
    public static void main(String args[]) {
    	
    	
    	MyClass first = new MyClass("a","first");
    	MyClass second = new MyClass("a","second");
    	MyClass third = new MyClass("a","second");
    	System.out.println("hash code of first"+first.hashCode());
    	System.out.println("hash code of second"+second.hashCode());
    	System.out.println("hash code of third"+third.hashCode());
    	if( first.equals(second)){
    			
    		System.out.println("  Equal object ");
    		
    	}
    	
    	HashMap<MyClass, String> hm= new HashMap<MyClass, String>();
    	hm.put(first, "he is first");
    	hm.put(second, "he comes second");
    	hm.put(third, "he comes second");
    	Set<MyClass> set=	hm.keySet();
    	for (MyClass obj : set) {
		System.out.println("value is  "+hm.get(obj));
	}
    	
    }

	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((anotherField == null) ? 0 : anotherField.hashCode());
		result = prime * result
				+ ((importantField == null) ? 0 : importantField.hashCode());
		return result;*/
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (anotherField == null) {
			if (other.anotherField != null)
				return false;
		} else if (!anotherField.equals(other.anotherField))
			return false;
		if (importantField == null) {
			if (other.importantField != null)
				return false;
		} else if (!importantField.equals(other.importantField))
			return false;
		return true;
	}
    

}

