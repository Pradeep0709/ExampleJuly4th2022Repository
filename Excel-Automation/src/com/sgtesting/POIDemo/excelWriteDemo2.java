package com.sgtesting.POIDemo;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelWriteDemo2 {

	public static void main(String[] args) {
		writeContent();
	}
	private static void writeContent()
	{
			FileOutputStream fout=null;
			Workbook wb=null;
			Sheet sh=null;
			Row row=null;
			Cell cell=null;
			try
			{
				wb=new XSSFWorkbook();
				sh=wb.createSheet("Expenses");
				row=sh.createRow(0);
				cell=row.createCell(0);
				cell.setCellValue("Groceries");
				cell=row.createCell(1);
				cell.setCellValue("two Thousand");
				row=sh.createRow(1);
				cell=row.createCell(5);
				cell.setCellValue("Food and Drinks");
				cell=row.createCell(6);
				cell.setCellValue("three Thousand");
				
				fout=new FileOutputStream("D:\\excel\\Domestic.xlsx");
				wb.write(fout);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					wb.close();
					fout.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
	}
}
