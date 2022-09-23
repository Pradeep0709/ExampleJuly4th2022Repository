package com.sgtesting.POIDemo;
	import java.io.FileOutputStream;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelAssignmentDemo6 {
		
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
					row=sh.createRow(3);
					for(int i=0;i<20;i++)
					{
						cell=row.createCell(i);
						cell.setCellValue("Countryname"+(i+1));
					}
					row=sh.createRow(4);
					for(int i=0;i<20;i++)
					{
						cell=row.createCell(i);
						cell.setCellValue("Capitalname"+(i+1));
					}
					fout=new FileOutputStream("D:\\excel\\Assignment6.xlsx");
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
