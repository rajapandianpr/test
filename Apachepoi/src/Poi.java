import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



	    
	    public class Poi {

	    	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
	    		// TODO Auto-generated method stub
	  //  	File src=new File ("C:\\Users\\amsaleka\\Desktop\\isuzu daily reports\\testproject_03072019.xlsx");
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\amsaleka\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    	WebDriver driver = new ChromeDriver();
	    	
	    	driver.get("https://isuzu.tti-global.com/services/support.php?funname=getuserlog");
	    	Thread.sleep(5000);
	        
	        StringSelection selection= new StringSelection("C:\\Users\\amsaleka\\Desktop\\\\isuzu daily reports\\\\testproject_03072019.xlsx");
	        
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);    
	        Thread.sleep(5000);
	     // 	FileInputStream fis =new FileInputStream("https://isuzu.tti-global.com/services/support.php?funname=getuserlog");
	    	
	        Robot robot = new Robot(); 
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_A);
	       robot.keyRelease(KeyEvent.VK_A);
	        robot.keyRelease(KeyEvent.VK_CONTROL);
	        //robot.keyPress(KeyEvent.VK_CONTROL);
	        //robot.keyRelease(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_C);
	       robot.keyRelease(KeyEvent.VK_C);
	       robot.keyRelease(KeyEvent.VK_CONTROL);
	       
	       
	        Thread.sleep(5000); 
	        FileOutputStream fout=new FileOutputStream("C:\\\\Users\\\\amsaleka\\\\Desktop\\\\\\\\isuzu daily reports\\\\\\\\testproject_03072019.xlsx");
	    //	XSSFWorkbook	wb=new XSSFWorkbook(fis);
	    //	XSSFSheet sheet1=wb.getSheetAt(0);
	    
	    	
	     	//XSSFWorkbook	wb=new XSSFWorkbook(fout);
	    	//Robot robot1 = new Robot(); 
	    	
	    	sheet1.getRow(1).createCell(2);
	          robot.keyPress(KeyEvent.VK_CONTROL);
	          robot.keyPress(KeyEvent.VK_V);	          Thread.sleep(5000); 
	          robot.keyRelease(KeyEvent.VK_V);
	          robot.keyRelease(KeyEvent.VK_CONTROL);
	          Thread.sleep(5000);
	          
	          //robot.keyPress(KeyEvent.VK_ENTER);
	          //robot.keyRelease(KeyEvent.VK_ENTER);
	          //Thread.sleep(5000); 
	    	  // sheet1.getRow(1).createCell(1);
	    	   
	    	    
	    	
	    	
	    	wb.write(fout);
	    	wb.close();
	    	}

	   
	
	}


