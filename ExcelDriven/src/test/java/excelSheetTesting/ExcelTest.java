package excelSheetTesting;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Iterator;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	public class ExcelTest {
		public static void main(String[] args) throws IOException {
			
			
			FileInputStream fis1=new FileInputStream("C:\\RestAPI Course documents\\EPIC_HDOL_RDL.xlsx");
			FileInputStream fis2=new FileInputStream("C:\\RestAPI Course documents\\HUB_EPI_ID.xlsx");
			XSSFWorkbook workbook1=new XSSFWorkbook(fis1);
			XSSFWorkbook workbook2=new XSSFWorkbook(fis2);
			int sheets1 = workbook1.getNumberOfSheets();
			int sheets2= workbook1.getNumberOfSheets();
			System.out.println(sheets1);
			System.out.println(sheets2);
			
			for(int i=0;i<sheets1;i++)
			{
				if(workbook1.getSheetName(i).equalsIgnoreCase("EPIC_HDOL_RDL"))
				{
				 XSSFSheet sheet1 = workbook1.getSheetAt(i);
				 Iterator<Row> rows1 = sheet1.iterator();
				 Row firstrow1 = rows1.next();
				 Iterator<Cell> ce1 = firstrow1.cellIterator();
				 int k1=0;
				 int column1 = 0;
				 while(ce1.hasNext())
				 {
					 Cell value = ce1.next();
					
					 if(value.getStringCellValue().equalsIgnoreCase("epic_id"))
					 {	 
					 }
				k1++;
				 }
				 System.out.println(column1);
				
				 for(int j=0;j<sheets2;j++)
					{
						if(workbook1.getSheetName(j).equalsIgnoreCase("Sheet1"))
						{
						 XSSFSheet sheet2 = workbook2.getSheetAt(j);
						 Iterator<Row> rows2 = sheet2.iterator();
						 Row firstrow = rows2.next();
						 Iterator<Cell> ce2 = firstrow.cellIterator();
						 int k2=0;
						 int column2= 0;
						 while(ce2.hasNext())
						 {
							 Cell value = ce2.next();
							
							 if(value.getStringCellValue().equalsIgnoreCase("epic_id"))
							 {	 
							 }
						k2++;
						 }
						 System.out.println(column2);
			
						int l=0;
						while(rows1.hasNext())
						{
							while(rows2.hasNext())
							{
								
							Row r1 = rows1.next();
							Row r2=rows2.next();
							if(r1.getCell(column1).getStringCellValue().equalsIgnoreCase(r2.getCell(column2).getStringCellValue()))
							{
								System.out.println("test is pass");
								
							}
							else
							{
								System.out.println("test is fail");
							}
							}
							l++;
						}
						}}}}}}
