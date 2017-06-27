package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void main(String[] args) throws Exception {
	String pathsuit = System.getProperty("user.dir");
	System.out.println(pathsuit);
	String completepathsuit = pathsuit + "\\scripts\\Testsuit.xlsx";
	File filesuit = new File(completepathsuit);

	FileInputStream ExcelFileToReadTestsuit = new FileInputStream(filesuit);

	// Read the spreadsheet that needs to be updated

	XSSFWorkbook wbTestsuit = new XSSFWorkbook(ExcelFileToReadTestsuit);

	XSSFSheet worksheetTestsuit = wbTestsuit.getSheet("MyTestsuit");
}
}
