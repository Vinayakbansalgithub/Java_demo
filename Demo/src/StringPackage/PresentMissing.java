package StringPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class PresentMissing {
	char[] str;
	char[] chalp;
	
	Set<Character> present= new HashSet<Character>();
	Set<Character> missing= new HashSet<Character>();

	
	public  void print(char[] finalstr, char[] chalp){
		this.str=finalstr;
		this.chalp=chalp;
		boolean flag;
	int	str_length= str.length;
		int alp_length=chalp.length;
		
		
		for(int i=0;i<alp_length;i++){
			flag=true;
			for (int j = 0; j < str.length; j++) {
				if(str[j]==chalp[i])
				{
					present.add(chalp[i]);
					flag=false;
				}
					
			}
			if(flag)
			missing.add(chalp[i]);

		}
		
		ArrayList<Character> list_present= new ArrayList<Character>(present);
		ArrayList<Character> list_missing= new ArrayList<Character>(missing);

		
		Collections.sort(list_present, new Comparator<Character>() {
		    public int compare(Character o1, Character o2) {
		    	Character i1 = o1;
		    	Character i2 =o2;
		        return (i1 < i2 ? -1 : (i1 == i2 ? 0 : 1));
		    }
		});
		Collections.sort(list_missing);

		
		System.out.println(list_present);
		System.out.println(list_missing);
		
		
		
		
		
	}
	
	
public static void main(String[] args) {
	
	int count=0;
	String alp="abcdefghijklmnopqrstuvwxyz";
	//String str="how are you today?";
	String str="vinayak";
	char[] chalp= alp.toCharArray();
	char[] chstr=str.toCharArray();
	char[] finalstr= new char[14];
	for(char c:chstr){
		if(c!=' ' && c!='?'){
			finalstr[count]=c;
			count++;
			
		}
	}

	PresentMissing obj= new PresentMissing();
	obj.print(finalstr, chalp);
	
	
	
	
	
}
}
