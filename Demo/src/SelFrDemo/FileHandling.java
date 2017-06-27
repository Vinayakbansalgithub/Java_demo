package SelFrDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.googlecode.javacv.BufferRing;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		FileReader file= new FileReader("D:\\hello.txt");
	
		
		BufferedReader buffer= new BufferedReader(file);
		while(buffer.readLine()!=null)
			{
			System.out.println(buffer.readLine());
			}
		
	}
}
