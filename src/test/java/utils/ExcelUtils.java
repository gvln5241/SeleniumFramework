package utils;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static String projpath = System.getProperty("user.dir");
	static XSSFWorkbook wb;
	static XSSFSheet sheet;

	public static void main(String[] args) {

	}

	public ExcelUtils(String filePath, String sheetName) {
		try {
			wb = new XSSFWorkbook(filePath);
			sheet = wb.getSheet(sheetName);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public static void getRowCount() {
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("Num of rows: " + rowcount);
	}

	public static void getColCount() {
		int rowcount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Num of rows: " + rowcount);
	}

	public static void getCellDataString(int row, int col) {
		XSSFRichTextString cellData = sheet.getRow(row).getCell(col).getRichStringCellValue();
		System.out.println(cellData);
	}

	public static void getCellDataNumber(int row, int col) {
		double cellData = sheet.getRow(row).getCell(col).getNumericCellValue();
		System.out.println(cellData);

	}

}
