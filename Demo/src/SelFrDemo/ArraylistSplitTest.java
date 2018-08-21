package SelFrDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang3.StringUtils;




public class ArraylistSplitTest {
	public static void main(String[] args) {
		
		
		String str[]={"hello","vinayak","bansal"};
		
		List<?> list= new LinkedList<>(Arrays.asList(str));
		List<? extends String> list2= new LinkedList<>(Arrays.asList(str));

		List<?> linkedlist= new LinkedList<>(Arrays.asList(str));
		
		System.out.println(list.get(0));
		System.out.println(list2.get(0));
		
		
		
		
		/*String stssr[]={"vinayahdkf","dsfdada"};
		//for(int i=0;i<stssr.length;i++)
		//{
		//System.out.println("vqalue "+stssr[i]);
		System.out.println(Arrays.toString(stssr));
		//}
	//	StringUtils.replace(text, searchString, replacement)
		List<String> arr= new ArrayList<String>();
		ArrayList<String> arrStr= new ArrayList<String>();
		arrStr.i
		String str= "vinayak/bansal/nitin/kumar";
		String[] tokin= str.split("/");
		
		Collections.addAll(arr, tokin);
		  List<String> srclst = new ArrayList<String>(5);
		   List<String> destlst = new ArrayList<String>(10);
		      
		   // populate two lists
		   srclst.add("Java");
		   srclst.add("is");
		   srclst.add("best");
		      
		   destlst.add("C++");
		   destlst.add("is");
		   destlst.add("older");
		        
		      
		   // copy into dest list
		   Collections.copy(destlst, srclst);            
		      
		   System.out.println("Value of source list: "+srclst);
		   System.out.println("Value of destination list: "+destlst);

		arr.add("vinayak");
		System.out.println("for checking of arraylist");
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("after putting in hashset");
		
		HashSet<String> hs= new HashSet<String>();
		hs.addAll(arr);
		
			System.out.println("hashset  non duplicate  :"+hs);
		
			
			System.out.println("after putting in treeset");
			
			
			TreeSet<String> ts= new TreeSet<String>(new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
				return	o2.compareTo(o1);
					
				}
				
			}); 
			ts.addAll(arr);
			
				System.out.println("value of tree set are sorted  : "+ts);
				
		System.out.println("end check...................");
		
		
		List<String> a = new ArrayList<String>();
		a.add("a");
		a.add("b");
		a.add("c");
		List<String> b = new ArrayList<String>(a);

		Collections.copy(b,a);
		
		System.out.println("a is"+a);
		System.out.println("b is "+b);
		
		
		
	//	Collections.addAll(arrStr, tokin);
		
		//arr=Arrays.asList(tokin);
		//arr.add("mohit");
		//arr.add(tokin);
		//arrStr.add("ajay");
		//System.out.println(arrStr);
		//arr.add(tokin);
		//	System.out.println(tokin);
		//System.out.println(tokin);
		
		//String[] str123 = arr.get(0);
	//System.out.println(((String[])arr.get(0)).[0]);
		
		
		//System.out.println(str123[0]);
		
	String[] a1={"Larry", "Moe", "Curly"};
	String[] a2={"Larry", "Curly", "Moe"};
	System.out.println(a1+"  and  "+a2.toString()+"  are "+Arrays.equals(a1, a2));
	Arrays.sort(a1);
	for(String ele:a1)
	{
	//	System.out.println(ele);
	}
	
	ArrayList<String>  arrhh= new ArrayList<String>();
	arrhh.add("vinayak");
	arrhh.add("vinayasfdak");
	arrhh.add("vinayahasgerk");
	Collections.addAll(arrhh, "bansal","gupta");
	System.out.println(arrhh);*/
	}
	
	
	
	
	

}
