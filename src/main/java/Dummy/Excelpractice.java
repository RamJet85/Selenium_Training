package Dummy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelpractice {
	
	
	public static String test_data = "path";
	public Workbook book;
	public org.apache.poi.ss.usermodel.Sheet sheet;
	
	
	public Object[][] getTestData(String getSheetName) {
		
		
		Object data[][] = null;
		
		try {
			FileInputStream fs = new FileInputStream(Excelpractice.test_data);
			book = WorkbookFactory.create(fs);
			sheet = book.getSheet(getSheetName);
			int rows = sheet.getLastRowNum();
			short columns = sheet.getRow(0).getLastCellNum();		
			
			
			data = new Object[rows][columns];
			
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {
					
					data[i][j] = sheet.getRow(i+1).getCell(j).toString();
					
				}
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
		
	}
	
	

}
