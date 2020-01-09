
package Logintestcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenusingpoi {
	 int x = 0;
	public void readExcel() throws IOException {
		FileInputStream excel= new FileInputStream("C:\\Users\\amsaleka\\Desktop\\amsaleka testing\\Testdata..xlsx");
		Workbook workbook= new XSSFWorkbook(excel);
		Sheet getSheet= Workbook.getSheetAt(0);
		Iterator rowIterator=(Iterator) Sheet.iterator();
		while(((java.util.Iterator<Row>) rowIterator).hasNext()) {
			Row rowvalue=rowIterator.hasnext();
			java.util.Iterator<Cell> IteratorcolumIterator = rowvalue.iterator();
			Iterator coloumIterator;
			while(coloumIterator.hasNext)
				coloumIterator.next();
		}
		
	}


	public static void main(String[] args) throws IOExFception {
		// TODO Auto-generated method stub
		
		 DataDrivenusingpoi DataDrivenusingpoi = new DataDrivenusingpoi();
		 Logintestcases.DataDrivenusingpoi usingPOI = null;
		usingPOI.readExcel(); 
	}

}
