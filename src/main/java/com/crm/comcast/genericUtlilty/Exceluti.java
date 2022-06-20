package com.crm.comcast.genericUtlilty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceluti {

	public  String exceluti(String sheetname, int rownum, int cellnum) throws Throwable {
		// TODO Auto-generated method stub
		/**
		 * @author:Pooja this method is used to fetch details from excel
		 * 
		 */
		String path = "./common/testdata1.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String sval = cell.toString();
		return sval;
	
	}
}
// DataFormatter dformat = new DataFormatter();
// return
// dformat.formatCellValue(wb.getSheet("sheetname").getRow(0).getCell(1));
