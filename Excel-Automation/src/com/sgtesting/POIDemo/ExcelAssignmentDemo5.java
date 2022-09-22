package com.sgtesting.POIDemo;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAssignmentDemo5 {
	
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
					cell=row.createCell(0);
					cell.setCellValue("Fowername"+(i+1));
					cell=row.createCell(1);
					cell.setCellValue("Colourname"+(i+1));
				}
				fout=new FileOutputStream("D:\\excel\\Assignment5.xlsx");
				wb.write(fout);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					fout.close();
					wb.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
			
		}
}
