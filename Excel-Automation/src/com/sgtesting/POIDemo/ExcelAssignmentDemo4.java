package com.sgtesting.POIDemo;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAssignmentDemo4 {
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
			sh=wb.createSheet("Sheet1");
			for(int i=0;i<20;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(9);
				cell.setCellValue("Cityname"+(i+1));
			}
			fout=new FileOutputStream("D:\\excel\\assignment4.xlsx");
			wb.write(fout);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				wb.close();
				fout.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}