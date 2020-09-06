package DataDriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {

	public static void main(String[] args) throws IOException {
		//FIS class obtains input bytes from a file. It is used for reading byte-oriented data (streams of raw bytes) 
		//such as image data, audio, video etc. You can also read character-stream data.
        
		FileInputStream fs = new FileInputStream("C:\\Users\\ramakrishna.p\\Desktop\\HubSpot_TestData.xlsx");
		// To open the specific excel file use workbook class
		// Every excel file we call it as workbook 
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowsCount = sheet.getLastRowNum();
		System.out.println(rowsCount);
		short columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);

		for(int i=0;i<=rowsCount; i++) {
			XSSFRow rows = sheet.getRow(i);
			
			for(int j =0; j<columnCount; j++) {
				XSSFCell cells = rows.getCell(j);
				String data = cells.toString();
				
				System.out.print(data+"   ");
				
			}
			System.out.println();
		}

	}
}

















