package utilities;

import org.testng.annotations.DataProvider;

public class TestUtil {

	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\data.xlsx");

	@DataProvider
	public static Object[][] getData(String sheetName) {
		int rowNum = excel.getRowCount(sheetName);
		int colNum = excel.getColumnCount(sheetName);
		System.out.println("Total rows are : " + rowNum + "  total cols are : " + colNum);
		System.out.println(excel.getCellData(sheetName, 0, 2));
		Object[][] data = new Object[rowNum - 1][colNum];
		for (int rows = 2; rows <= rowNum; rows++) {
			for (int cols = 0; cols < colNum; cols++) {
				data[rows - 2][cols] = excel.getCellData(sheetName, cols, rows);
			}
		}
		return data;
	}
}
