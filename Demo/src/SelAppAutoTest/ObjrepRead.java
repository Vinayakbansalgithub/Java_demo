package SelAppAutoTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ObjrepRead {
	
	private static XSSFRow Row = null;
	private static XSSFSheet ExcelWSheet=null;
	 static XSSFWorkbook ExcelWBook=null;
	 static File file=null;
	private static XSSFCell Cell;
	
	static FormulaEvaluator evaluator;
	static FileInputStream ExcelFile;
	static FileOutputStream fileOut;
public static void main(String[] args) throws IOException {
	
	String path="D:\\workspace\\Puresoftware_Automation\\Automation\\Automation_Framework_Puresoftware\\src\\DataEngine\\ObjRep.xlsx";

	file	 = new File(path);

	System.out.println("object rep exist:" + file.exists());
	ExcelFile = new FileInputStream(file);
	
	ExcelWBook = new XSSFWorkbook(ExcelFile);
	
	
System.out.println("hello");
}
}