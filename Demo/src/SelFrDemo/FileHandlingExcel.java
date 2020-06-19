package SelFrDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandlingExcel {
	
	
	
	
public static void main(String[] args) throws Exception {
	File file =    new File("D:\\Writesheet.xlsx");

    //Create an object of FileInputStream class to read excel file

    FileInputStream inputStream = new FileInputStream(file);

    Workbook wb = new XSSFWorkbook(inputStream);
    
    Sheet sheet = wb.getSheet("time");
    
    
   String s=sheet.getRow(0).getCell(1).toString();
   
   int last= sheet.getLastRowNum();
   System.out.println(last);
   
   System.out.println(s);
   
   while(true){
	   System.out.println("ddd");
   }
   
   
    
    
    
}
}
