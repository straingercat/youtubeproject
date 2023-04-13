package Generic_utility;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile_utility {
	
	public String getExcelData(String sheetName, int rownum, int cellnum) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IpathConstants.ExcelPath);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		DataFormatter format=new DataFormatter();
		Row row = sheet.getRow(rownum);
		Cell cellnumb = row.getCell(cellnum);
		String value = format.formatCellValue(cellnumb);
		return value;
		
		
		
		
		
		
		
		
	}

	

}
