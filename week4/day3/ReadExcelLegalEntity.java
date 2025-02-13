package week4.day3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelLegalEntity {
	
	public static String[][] readLegalEntityData() throws IOException {
		
		XSSFWorkbook wb= new XSSFWorkbook("./Data/CreateEntity.xlsx");
		
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//count no of rows without header
		
		int rowCount = ws.getLastRowNum();
		System.out.println("Row count is " + rowCount);
		
		//count no of rows with header
		int noofrows= ws.getPhysicalNumberOfRows();
		
		//count no of cols
		int colcount= ws.getRow(2).getLastCellNum(); 
		System.out.println(colcount);
		
		//retrieve particular value in a cell 
				
		String stringCellValue = ws.getRow(3).getCell(0).getStringCellValue();
		System.out.println(stringCellValue);
		
		//to retrieve entire data
		
		String [][] data = new String [rowCount][colcount]; 
		
		for(int i=1; i<rowCount;i++) {
			
			XSSFRow row = ws.getRow(i);
			for (int j = 0; j <colcount; j++) {
				String alldata = row.getCell(j).getStringCellValue();
				data[i-1][j]= alldata;
				System.out.println(alldata);
			}
		}
		
		wb.close();
		return data;
		
	}

}
