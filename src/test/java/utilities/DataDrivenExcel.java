package utilities;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExcel {
		XSSFWorkbook work_book;
		XSSFSheet sheet;
		public DataDrivenExcel(String excelfilePath) {
			try {
				File excelFile = new File(excelfilePath);
				FileInputStream stream = new FileInputStream(excelFile);
				work_book = new XSSFWorkbook(stream);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		public String getData(int sheetnumber, int row, int column){
			sheet = work_book.getSheetAt(sheetnumber);
			String data = sheet.getRow(row).getCell(column).getStringCellValue();
			return data;
		} 
		
		public int getRowCount(int sheetIndex){
			int row = work_book.getSheetAt(sheetIndex).getLastRowNum();
			row = row + 1;
			return row;
		}
}
