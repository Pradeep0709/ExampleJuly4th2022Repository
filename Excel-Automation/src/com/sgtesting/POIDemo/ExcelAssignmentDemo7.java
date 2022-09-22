package com.sgtesting.POIDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAssignmentDemo7 {

	public static void main(String[] args) {
		ReadWriteContent();
	}
	private static void ReadWriteContent()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb1=null;
		Workbook wb2=null;
		Sheet wb1sh=null;
		Sheet wb2sh=null;
		Row wb1row=null;
		Row wb2row=null;
		Cell wb1cell=null;
		Cell wb2cell=null;
		try
		{
			fin=new FileInputStream("D:\\excel\\Assignment7.xlsx");
			wb1=new XSSFWorkbook(fin);
			wb2=new XSSFWorkbook();
			wb1sh=wb1.getSheet("Sheet1");
			wb2sh=wb2.getSheet("Sheet1");
			if(wb2sh==null)
			{
				wb2sh=wb2.createSheet("Sheet1");
			}
			int rc=wb1sh.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				wb1row=wb1sh.getRow(r);
				wb2row=wb2sh.getRow(r);
				if(wb2row==null)
				{
					wb2row=wb2sh.createRow(r);
				}
				int cc=wb1row.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					wb1cell=wb1row.getCell(c);
					wb2cell=wb2row.getCell(c);
					if(wb2cell==null)
					{
					wb2cell=wb2row.createCell(c);
					}
					String data=wb1cell.getStringCellValue();
					wb2cell.setCellValue(data);
				}
			}
			fout=new FileOutputStream ("D:\\excel\\Assignment71.xlsx");
			wb2.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
				wb1.close();
				wb2.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
