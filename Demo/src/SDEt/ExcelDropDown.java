package SDEt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class ExcelDropDown {
	
/*
	static String country;
	static String state;
	static String town;
	
	
public static void DropDownSelect() throws Exception, Throwable {
		

	WebDriver driver = new FirefoxDriver();
	
      //Launch website
      driver.navigate().to("url");
	
	WebElement element=   driver.findElement(By.xpath(""));
		if (element == null) {
		System.out.println("exception");
		}
		new Select(element).selectByVisibleText(country);

	}











public static void VerifyRatesInExcel() throws Exception {
	SupportLib.waitForAjax();

	boolean Result=false;

	String Filelocation = Constant.ExcelfileName;

	FileInputStream ExcelFile = new FileInputStream(Filelocation);
	XSSFWorkbook ExcelWBook = new XSSFWorkbook(ExcelFile);
	XSSFSheet ExcelWSheet = ExcelWBook.getSheet(Constant.TestCaseRow.get("Data"));

	int rowNumber ;
	int columnnumber;
	String[] strArr= Constant.TestCaseRow.get("ActionSupportValue").split(",");
	rowNumber=Integer.parseInt(strArr[0]);
	columnnumber=Integer.parseInt(strArr[1]);
	
	int count=0;
	 XSSFCell Cell;
	 System.out.println("condition  "+ExcelWSheet.getRow(rowNumber).getCell(columnnumber-1));
	 System.out.println("condition  "+ExcelWSheet.getRow(rowNumber).getCell(columnnumber-2));
	 System.out.println("condition  "+ExcelWSheet.getRow(rowNumber).getCell(columnnumber-3));
	 
	 System.out.println("condition  "+ExcelWSheet.getRow(rowNumber+1).getCell(columnnumber-1));
	 System.out.println("condition  "+ExcelWSheet.getRow(rowNumber+1).getCell(columnnumber-2));
	 System.out.println("condition  "+ExcelWSheet.getRow(rowNumber+1).getCell(columnnumber-3));
	 
	 System.out.println("condition  "+ExcelWSheet.getRow(rowNumber+2).getCell(columnnumber-1));
	 System.out.println("condition  "+ExcelWSheet.getRow(rowNumber+2).getCell(columnnumber-2));
	 System.out.println("condition  "+ExcelWSheet.getRow(rowNumber+2).getCell(columnnumber-3));

	 
	 
	 for (int i = 0; i < strArr.length; i++) {
		
	}
	 
	 
	while(ExcelWSheet.getRow(rowNumber).getCell(columnnumber-1)!=null){
		
		System.out.println("rate   "+ExcelWSheet.getRow(rowNumber).getCell(columnnumber-1).getStringCellValue());
		
		 if(ExcelWSheet.getRow(rowNumber).getCell(columnnumber-1).getStringCellValue().equalsIgnoreCase("Rates")){
			 System.out.println("  "+ExcelWSheet.getRow(rowNumber).getCell(columnnumber));
			XSSFCell cell= ExcelWSheet.getRow(rowNumber).getCell(columnnumber);
			
			 // checking if its an number
			 if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC)
			 {
				 
				 // by default numbers are stored in double 
				double doublevalue= ExcelWSheet.getRow(rowNumber).getCell(columnnumber).getNumericCellValue();
			
				// convert from double to int
				int intvalue=(int) doublevalue;
				
				// now storing value in arraylist
						ExcelValuesCaptured.add(intvalue);
			 }
			 
				
					
		 else
			 ExcelValuesCaptured.add(ExcelWSheet.getRow(rowNumber).getCell(columnnumber));
		 }
	
		 rowNumber++;
		 
	 }
	 
	
	
	for (int i = 0; i < ExcelValuesCaptured.size(); i++) {
		
		
		System.out.println("from sheet "+ExcelValuesCaptured.get(i)+"    from ui "+ValuesCaptured.get(i));
		if(ValuesCaptured.get(i).equalsIgnoreCase("NA") ){
			try{
				
				Object obj="--";

				 if(ExcelValuesCaptured.get(i).equals(obj)){
				 Result=true;
				 System.out.println("pass na");
				 }
			}
			catch(Exception e){
				Result=false;
				System.out.println("-----------------------------");
				break;
			}
			
		}
		else if(ValuesCaptured.get(i).equalsIgnoreCase(ExcelValuesCaptured.get(i).toString())){
			Result=true;
		}
		else{
			
			System.out.println("fail=================");
			Result=false;
		}
	}*/
	
	
public static void main(String[] args) throws ParseException {
	
	ExcelDropDown obj= new ExcelDropDown();
    Calendar cal1 = new GregorianCalendar();
   
    
    String sDate1="07/28/2017";  
    Date date1=new SimpleDateFormat("MM/dd/yyyy").parse(sDate1);  
    String sDate2= "09/20/2017";  
    Date date2=new SimpleDateFormat("MM/dd/yyyy").parse(sDate2);  
   int value= (int)( (date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24));
    		System.out.println(value);
}
}
