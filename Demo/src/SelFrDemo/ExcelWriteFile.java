/*package SelFrDemo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
public class ExcelWriteFile {
	static Workbook wbook;
    static WritableWorkbook wwbCopy;
    static String ExecutedTestCasesSheet;
    static WritableSheet shSheet;
    
    public void readExcel()
    {
    try{
    wbook = Workbook.getWorkbook(new File("C://Users//sameer.arora//Desktop//Sameer//TestExcel.xls"));
    wwbCopy = Workbook.createWorkbook(new File("C://Users//sameer.arora//Desktop//Sameer//TestExcel-New.xls"), wbook);
    shSheet = wwbCopy.getSheet(0);
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }
    
    public void setValueIntoCell(String strSheetName,int iColumnNumber, int iRowNumber,String strData) throws WriteException
    {
        WritableSheet wshTemp = wwbCopy.getSheet(strSheetName);
        Label labTemp = new Label(iColumnNumber, iRowNumber, strData);
                
        try {
            wshTemp.addCell(labTemp);
             } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
    }
    
    public void closeFile()
    {
        try {
            // Closing the writable work book
            wwbCopy.write();
            wwbCopy.close();

            // Closing the original work book
            wbook.close();
        } catch (Exception e)

        {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws WriteException
    {
    	TextExcelWrite ds = new TextExcelWrite();
        ds.readExcel();
        ds.setValueIntoCell("Sheet1", 5, 1, "PASS");
        ds.setValueIntoCell("Sheet1", 5, 2, "FAIL");
        ds.setValueIntoCell("Sheet1", 5, 3, "PASS");
        ds.closeFile();
    }
}
*/