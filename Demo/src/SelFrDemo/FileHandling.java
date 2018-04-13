package SelFrDemo;

import java.io.BufferedInputStream;



import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.io.filefilter.FileFileFilter;

import com.googlecode.javacv.BufferRing;




class Animalll{
	public Animalll() {
		// TODO Auto-generated constructor stub
	}
	void go(){
		
		
	}
	
}


class mydog extends Animalll{
	
	void go(){
		}
	
}
public class FileHandling {
	public static void main(String[] args) throws IOException {
		
		
		Object obj= new int[]{2,3,4};
		int arr[]=(int[])obj;
		
		ArrayList<Integer> i;
		

		
		System.out.println(arr[0]);
		
		File file= new File("D:\\workspace\\Puresoftware_Automation\\Automation");
		
		
		FileFilter fl= new FileFilter() {
			
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.getName().endsWith("rar");
			}
		};
		
		
		File[] fi= file.listFiles(fl);
		
		Arrays.sort(fi);
		
		for (File file2 : fi) {
			System.out.println(file2.getName());
			System.out.println(file2.isFile());

		}
		
		
		
		
		
		
	
		
		
	}
}






/*



 public class FileHandling {
	public static void main(String[] args) throws IOException {
		
		 String content = "This is the content to write into file";

	        File file = new File("D:\\hello.txt");
	        
	        InputStreamReader isr= new InputStreamReader(System.in);
	        
	        BufferedReader bis= new BufferedReader(isr);
	        
	        
	        
	       
	      
	        
System.out.println("end");
	        // if file doesnt exists, then create it
	        if (!file.exists()) {
	       
	        	file.createNewFile();
	        }

	        FileWriter fw = new FileWriter(file.getAbsoluteFile());
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.write(content);
	        bw.close();

	        System.out.println("------------");
	        
	        FileReader fr= new FileReader(file.getAbsolutePath());
	        BufferedReader br= new BufferedReader(fr);
	        
	        int contentF;
	        while ((contentF = br.read()) != -1) {
				// convert to char and display it
				System.out.print((char) contentF);
			}
			
	}
}

*/














/*
int content;





FileReader r= new FileReader(file);
while ((content = r.read()) != -1) {
	// convert to char and display it
	System.out.print((char) content);
//	System.out.println("++++++++++++++");
}


r.close();


FileInputStream in= new FileInputStream(file);

BufferedInputStream  buffer= new BufferedInputStream (in);




while ((content = buffer.read()) != -1) {
	// convert to char and display it
	System.out.print((char) content);
}
in.close();
System.out.println("-------");

FileOutputStream out= new FileOutputStream(file);

BufferedOutputStream  bufferOut= new BufferedOutputStream (out);

String data="orange is our fruit";

byte b[]=data.getBytes();    

bufferOut.write(b);
bufferOut.flush();  
bufferOut.close();

FileInputStream inn= new FileInputStream(file);

BufferedInputStream  bufferr= new BufferedInputStream (inn);




while ((content = bufferr.read()) != -1) {
	// convert to char and display it
	System.out.print((char) content);
}*/
