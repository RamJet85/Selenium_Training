package Dummy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Practice {
	
	
	public static String path = "path";
	
	public static Workbook book;
	
	public static org.apache.poi.ss.usermodel.Sheet sht;
	
	
	
	
	
	public void getData(String sheetName) {
		
		try {
			FileInputStream fs = new FileInputStream(Practice.path);
			
			book = WorkbookFactory.create(fs);
			
			sht = book.getSheet(sheetName);
			
			int rows = sht.getLastRowNum();
			
			short columns = sht.getRow(0).getLastCellNum();
			
			
			
			
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		
		}
		
		
		
		
		
		
	}
	

