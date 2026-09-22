package FinalAssessment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

   public class CommonDataOHRM {
	String browser;
	public String url;
	public String username;
	public String password;
	
   public void data() throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/FinalAssessment/OHRMassessment.properties");
		Properties p = new Properties();
		p.load(fis);
		
		browser = p.getProperty("browser");
		url = p.getProperty("url");
		username = p.getProperty("username");
		password = p.getProperty("password");
		
		
    }
  @DataProvider
  public Object[][] buzzField()throws EncryptedDocumentException, IOException {

     FileInputStream fis =new FileInputStream("./src/test/resources/FinalAssessment/Liverpool Table.xlsx");
     Workbook wb = WorkbookFactory.create(fis);
     Sheet sh = wb.getSheet("Sheet1");
     int rowCount = sh.getLastRowNum();
     Object[][] obj = new Object[rowCount][1];
     for (int row = 1; row <= rowCount; row++) {
        obj[row - 1][0]=sh.getRow(row).getCell(0).getStringCellValue();
        
    }

    wb.close();
    fis.close();

    return obj;
}
  

     

  

}

