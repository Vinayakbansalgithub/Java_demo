package SelFrDemo;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PageSourceSelenium {

	public static void main(String[] args) throws Exception {
		String tagtype[] = { "a", "div", "img", "li", "ul", "input", "label",
				"p", "span", "i" };

		String sbXpath = new String();
		String parentTagText = null;
		WebDriver driver = new FirefoxDriver();
		System.out.println("opening firefox driver");
		// String url = "http://puresoftware.com/";
		String url = "http://www.magicbricks.com/";

		// driver.get(" https://www.oxigenwallet.com/");

		driver.get(url);

		// driver.get("http://www.magicbricks.com/");

		// driver.manage().window().maximize();
		// read from console
		BufferedReader br = null;

		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the tag name");
		String tagname = br.readLine();

		java.util.List<WebElement> links = driver.findElements(By
				.tagName(tagname));

		System.out.println("total links on th page    " + links.size());

		ArrayList<String> data = new ArrayList<String>();
		ArrayList<String> xpathValue = new ArrayList<String>();
		ArrayList<String> typeOfValue = new ArrayList<String>();

		Map<Integer, Object[]> map = new HashMap<Integer, Object[]>();

		for (int i = 0; i < links.size() - 1; i++)

		{

			sbXpath = "//" + tagname + "[";

			links.get(i).getAttribute("type");
			System.out.println("type: " + links.get(i).getAttribute("type"));
			System.out.println("value: " + links.get(i).getAttribute("value"));
			System.out.println("Text: " + links.get(i).getText());

			// arraylist
			if (!links.get(i).getText().isEmpty()) {
				String outerText = links.get(i).getText();
				System.out.println("outer text value:  " + outerText);

			}

			String type = links.get(i).getAttribute("type"); // !str.isEmpty()
			System.out.println("type  :" + links.get(i).getAttribute("type"));
			// hashmap
			// typeOfValue.put(i,type );

			if (links.get(i).getAttribute("type") != null
					&& !links.get(i).getAttribute("type").isEmpty()) {
				if (sbXpath.length() > tagname.length() + 4)
					sbXpath = sbXpath + " and ";
				sbXpath = sbXpath + " @type='" + type + "'";
				typeOfValue.add(type);
			}

			if (links.get(i).getAttribute("type") == null
					|| links.get(i).getAttribute("type").isEmpty()) {
				if (tagname.equalsIgnoreCase("a"))
					typeOfValue.add("link");
				if (tagname.equalsIgnoreCase("label"))
					typeOfValue.add("label");
				if (tagname.equalsIgnoreCase("div"))
					typeOfValue.add("div");
				if (tagname.equalsIgnoreCase("ul"))
					typeOfValue.add("link");
				if (tagname.equalsIgnoreCase("li"))
					typeOfValue.add("link");

			}

			// arraylist

			String classname = links.get(i).getAttribute("class");
			System.out.println("class  :" + links.get(i).getAttribute("class"));
			if (links.get(i).getAttribute("class") != null
					&& !links.get(i).getAttribute("class").isEmpty()) {
				if (sbXpath.length() > tagname.length() + 4)
					sbXpath = sbXpath + " and ";
				sbXpath = sbXpath + "@class='" + classname + "'";
			}

			String id = links.get(i).getAttribute("id");
			System.out.println("id  :" + links.get(i).getAttribute("id"));
			if (links.get(i).getAttribute("id") != null
					&& !links.get(i).getAttribute("id").isEmpty()) {
				if (sbXpath.length() > tagname.length() + 4)
					sbXpath = sbXpath + " and ";
				sbXpath = sbXpath + " @id='" + id + "'";
			}

			String name = links.get(i).getAttribute("name");
			System.out.println("name  :" + links.get(i).getAttribute("name"));
			if (links.get(i).getAttribute("name") != null
					&& !links.get(i).getAttribute("name").isEmpty()) {
				if (sbXpath.length() > tagname.length() + 4)
					sbXpath = sbXpath + " and ";
				sbXpath = sbXpath + " @name='" + name + "'";
			}

			String ariaLabel = links.get(i).getAttribute("aria-label");
			System.out.println("type  :"
					+ links.get(i).getAttribute("aria-label"));
			if (links.get(i).getAttribute("aria-label") != null
					&& !links.get(i).getAttribute("aria-label").isEmpty()) {
				if (sbXpath.length() > tagname.length() + 4)
					sbXpath = sbXpath + " and ";
				sbXpath = sbXpath + " @aria-label='" + ariaLabel + "'";
			}

			String value = links.get(i).getAttribute("value");
			System.out.println("value  :" + links.get(i).getAttribute("value"));
			if (links.get(i).getAttribute("value") != null
					&& !links.get(i).getAttribute("value").isEmpty()
					&& links.get(i).getAttribute("value").length() < 20
					&& !tagname.equalsIgnoreCase("li")) {
				if (sbXpath.length() > tagname.length() + 4)
					sbXpath = sbXpath + " and ";
				sbXpath = sbXpath + " @value= '" + value + "'";
			}

			// href

			String Completehref = links.get(i).getAttribute("href");
			String lastchar = Completehref.substring(Completehref.length() - 1);
			if (Completehref.length() > 2 && lastchar.equalsIgnoreCase("/")) {
				Completehref = Completehref.replace(
						Completehref.substring(Completehref.length() - 1), "");
			}

			int hreflength = Completehref.length() - 1;
			Completehref.charAt(hreflength);
			System.out.println("href  " + Completehref);
			if (Completehref != null && !Completehref.isEmpty()) {
				if (Completehref.contains(url)) {
					String Splitedhref[] = Completehref.split(url);
					String href = Splitedhref[1];

					System.out.println("value  :"
							+ links.get(i).getAttribute("href"));
					if (links.get(i).getAttribute("href") != null
							&& !links.get(i).getAttribute("href").isEmpty()) {
						if (sbXpath.length() > tagname.length() + 4)
							sbXpath = sbXpath + " and ";
						sbXpath = sbXpath + " @href= '" + href + "'";
					}
				} else {
					System.out.println("href  :"
							+ links.get(i).getAttribute("href"));
					if (links.get(i).getAttribute("href") != null
							&& !links.get(i).getAttribute("href").isEmpty()) {
						if (sbXpath.length() > tagname.length() + 4)
							sbXpath = sbXpath + " and ";
						// sbXpath = sbXpath + " @href= '" +
						// links.get(i).getAttribute("href") + "'";
						// contains(@href
						sbXpath = sbXpath + " contains(@href, '" + Completehref
								+ "'";
					}

				}

				// check for text value

				if (links.get(i).getText() != null
						&& !links.get(i).getText().isEmpty()) {
					parentTagText = links.get(i).getText();
				}

			}
			sbXpath = sbXpath + "]";
			if (tagname.equalsIgnoreCase("ul"))
				sbXpath = sbXpath + "/li";

			/*
			 * if(sbXpath.equalsIgnoreCase(emptyPath)){ String
			 * DividedXpath[]=sbXpath.split("]"); String part1=DividedXpath[0];
			 * //String part2=DividedXpath[1]; int index=i+1;
			 * sbXpath=part1+index+"]"; }
			 */

			String InnerElement = sbXpath + "/*";

			List<WebElement> located_elements = driver.findElements(By
					.xpath(InnerElement));
			if (located_elements.size() == 0) {
				String[] AddText = sbXpath.split("]");
				// if (tagname.equalsIgnoreCase("a")) {
				if (links.get(i).getText() != null
						&& !links.get(i).getText().isEmpty()) {
					sbXpath = AddText[0] + "and contains(text(),'"
							+ links.get(i).getText() + "')]";
				}
				// }
				xpathValue.add(sbXpath);
			}

			else if (located_elements.size() == 1) {
				String Updated;
				for (int j = 0; j < tagtype.length; j++) {
					Updated = sbXpath + "/" + tagtype[j];

					try {
						driver.findElement(By.xpath(Updated));
						sbXpath = Updated;
						xpathValue.add(sbXpath);
						break;

					} catch (NoSuchElementException e) {
						System.out.println("no such element");
					}

				}

			} else if (located_elements.size() > 1) {
				String Updated;
				for (int j = 0; j < tagtype.length; j++) {
					Updated = sbXpath + "/" + tagtype[j];

					try {
						WebElement element = driver.findElement(By
								.xpath(Updated));
						String textvalue = element.getText();
						if (!textvalue.isEmpty()
								&& !textvalue.equalsIgnoreCase("null")) {
							Updated = Updated + "[contains(text(),'"
									+ textvalue + "')]";
							sbXpath = Updated;
						}
						sbXpath = Updated;
						xpathValue.add(sbXpath);
						// if(!parentTagText.isEmpty() &&
						// !parentTagText.equalsIgnoreCase("null"))
						break;

					} catch (NoSuchElementException e) {
						System.out.println("no such element");
					}

				}

			}

			else
				xpathValue.add(sbXpath);
			System.out.println("xpath" + sbXpath);
			// user for data field (name of the objectrep obj)
			WebElement element = driver.findElement(By.xpath(sbXpath));
			String typedata;
			String dataEntry = null;

			if (element.getAttribute("type") != null
					&& !element.getAttribute("type").isEmpty())
				dataEntry = element.getAttribute("type");

			if (element.getText() != null && !element.getText().isEmpty()) {

				dataEntry = dataEntry + element.getText();
				data.add(dataEntry);

			}

			else {
				String valueAttribute = null;
				String typeAttribute = null;
				String nameAttribute = null;
				String idAttribute;
				String finalValue = null;
				String arialAttribuet = null;

				if (element.getAttribute("value") != null
						&& !element.getAttribute("value").isEmpty()
						&& element.getAttribute("value").length() < 20) {
					valueAttribute = element.getAttribute("value");
					finalValue = valueAttribute;
					data.add(finalValue);
				}

				if (element.getAttribute("name") != null
						&& !element.getAttribute("name").isEmpty()) {
					nameAttribute = links.get(i).getAttribute("name");
					if (finalValue != null) {
						finalValue = finalValue + nameAttribute;
						data.add(finalValue);
					}
				}
				if (element.getAttribute("id") != null
						&& !element.getAttribute("id").isEmpty()) {
					idAttribute = element.getAttribute("id");
					if (finalValue != null) {
						finalValue = finalValue + idAttribute;
					}
					finalValue = idAttribute;
					data.add(finalValue);
				}
				if (element.getAttribute("aria-label") != null
						&& !element.getAttribute("aria-label").isEmpty()) {
					arialAttribuet = element.getAttribute("aria-label");
					if (finalValue != null) {
						finalValue = finalValue + arialAttribuet;
					}
					finalValue = arialAttribuet;
					data.add(finalValue);
				} else
					data.add(sbXpath);

			}

			map.put(i, new Object[] { data.get(i), xpathValue.get(i),
					typeOfValue.get(i) });
		}

		File file = new File("D:\\Locator.xlsx");
		System.out.println("Is file exist   " + file.exists());

		XSSFWorkbook workbook = new XSSFWorkbook();
		// Create a blank sheet
		XSSFSheet spreadsheet = workbook.createSheet(" xpathdetails ");

		Row rowq = spreadsheet.createRow(0);
		Cell cellname = rowq.createCell(0);
		Cell cellXpath = rowq.createCell(1);
		Cell cellType = rowq.createCell(2);

		cellname.setCellValue(("name"));
		cellXpath.setCellValue(("Xpath"));
		cellType.setCellValue(("type"));

		Set<Integer> keyset = map.keySet();
		int rownum = 1;
		for (Integer key : keyset) {
			Row row = spreadsheet.createRow(rownum++);
			Object[] objArr = map.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellnum++);
				if (obj instanceof Date)
					cell.setCellValue((Date) obj);
				else if (obj instanceof Boolean)
					cell.setCellValue((Boolean) obj);
				else if (obj instanceof String)
					cell.setCellValue((String) obj);
				else if (obj instanceof Double)
					cell.setCellValue((Double) obj);
				else if (obj instanceof Integer)
					cell.setCellValue((Integer) obj);
			}
		}

		// Write the workbook in file system
		FileOutputStream out = new FileOutputStream(
				new File("D:\\Locator.xlsx"));
		workbook.write(out);

		out.close();

		FileInputStream fileopen = new FileInputStream(new File(
				"D:\\Locator.xlsx"));
		XSSFWorkbook workbookToDelete = new XSSFWorkbook(fileopen);
		XSSFSheet sheet = workbookToDelete.getSheetAt(0);

		int lastRowNumber = sheet.getLastRowNum();
		System.out.println("total row count   " + lastRowNumber);

		System.out.println("Writesheet.xlsx written successfully");
		driver.close();
	}

}
