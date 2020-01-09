package webtestcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtestusingPOI {
	static List<String> UserNamesList=new ArrayList<String>();
	static List<String> passwordsList=new ArrayList<String>();
	public void readExcel() throws IOException {
		FileInputStream excel=new FileInputStream("C:\\Users\\amsaleka\\Desktop\\Testdata1.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(excel);
		
		XSSFSheet Sheet= workbook.getSheetAt(0); 
	Iterator<Row> rowIterator=Sheet.iterator(); 
	
		while(rowIterator.hasNext()) {
			Row rowValue=rowIterator.next();
			Iterator<Cell> coloumIterator=rowValue.iterator();
			int i=2;
			while(coloumIterator.hasNext()) {
				if(i%2==0) ;
				
					UserNamesList.add(coloumIterator.next().getStringCellValue());
				}
			 
			{
					
				passwordsList.add(coloumIterator.next().getStringCellValue());
			}
				i++;
			}}

		
		
		public void login(String uName,String pword ) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\amsaleka\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			WebElement username=driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
			username.sendKeys(uName);
			
			WebElement password=driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
			password.sendKeys(pword);
			
			driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
			//loginButton.click();
			driver.quit();
			
			
		}
		
		public void executeTest() {
			for(int i=0; i< UserNamesList.size();i++) {
				login(UserNamesList.get(i),passwordsList.get(i));
			}
		}
	
	
	
	
	
	
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
          WebtestusingPOI usingPOI= new     WebtestusingPOI();
          usingPOI.readExcel();
          System.out.println("UserName List"+ UserNamesList);
          System.out.println("Password List"+ passwordsList);
          usingPOI.executeTest();
	}

}	
