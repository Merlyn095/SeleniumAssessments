package baseClassUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CommonData {
	String browser;
	String url;
	String username;
	String password;
	
	public String productPage1;
	public String cart1;
	public String product;
	public String overviewPage;
	public String message;
	public String fn;
	public String ln;
	public String zipCode;
	
	
	public void data() throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/SauseDemo/SauseDemo.properties");
		Properties p = new Properties();
		p.load(fis);
		
		browser = p.getProperty("browser");
		url = p.getProperty("url");
		username = p.getProperty("username");
		password = p.getProperty("password");
		
         FileInputStream fis1 = new FileInputStream("./src/test/resources/SauseDemo/data.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis1);
		
		productPage1 = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		cart1 = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		product = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		fn = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		ln = wb.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
		zipCode = String.valueOf(
			    wb.getSheet("Sheet1").getRow(1).getCell(5).getNumericCellValue()
			);
		overviewPage = wb.getSheet("Sheet1").getRow(1).getCell(6).getStringCellValue();
		message = wb.getSheet("Sheet1").getRow(1).getCell(7).getStringCellValue();
		
		
	}
	

}
