package utils;

public class ExcelDemo {

	public static void main(String[] args) {
		ExcelUtils excel=new ExcelUtils("C:\\Users\\vgunda\\git\\SeleniumFramework\\DataFiles\\data.xlsx", "Sheet1");
		
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
		
	}

}
