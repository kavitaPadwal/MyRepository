package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;

	public ExcelDataProvider() {
		File src = new File("./TestData/Testdata.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		}  catch (Exception e) {
			System.out.println("unable to load excelfile"+e.getMessage());
		}

	}
	
	public String getStringData(String SheetName,int row, int column) {
		return wb.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getStringData(int SheetIndex,int row, int column) {
		return wb.getSheetAt(SheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
    public double getNumericData(String SheetName,int row, int column) {
    	return wb.getSheet(SheetName).getRow(row).getCell(column).getNumericCellValue();
	}

}
