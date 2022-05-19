package Utilities;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils{
	
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	
	public static void getRowCount() {
				
		try {
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No: of rows: "+ rowCount );
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	public static String getCellDataString(int row, int col) {
		XSSFCell cellData = null;
		cellData =sheet.getRow(row).getCell(col);
        
        //returning the cell value as string
        return cellData.getStringCellValue();
	}
	
		public static void getCellDataNumber(int row, int col) {
			
			try {
				double cellData = sheet.getRow(row).getCell(col).getNumericCellValue();
				System.out.println("Cell Data is: "+ cellData );
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		
	}	
	
	
}