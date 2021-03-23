package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	public FileInputStream fin;
	public static WebDriver driver;
	public Sheet sh;
	public Row row;
	public Cell cell;
	public 	FileOutputStream fout;
	public Workbook wb ;
	
	public String readDatafromExcel() throws EncryptedDocumentException, IOException  {
		fin=new FileInputStream("./data5.xlsx");
		 wb = WorkbookFactory.create(fin);
		sh=wb.getSheet("Sheet1");
		row=sh.getRow(1);
		cell=row.getCell(5);
		return cell.getStringCellValue();
		
	}
	
	public  String getDatafromApplication() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		return driver.getTitle();
	}
	
	public void writeDataToExcel(int rownum,int cellnum,String data) throws IOException {
		row=sh.getRow(rownum);
		cell=row.getCell(cellnum);
		cell.setCellValue(data);
		 fout=new FileOutputStream("./data5.xlsx");
		 wb.write(fout);
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		Test0 t=new Test0();
		String exceldata = t.readDatafromExcel();
		System.out.println(exceldata);
		String appData = t.getDatafromApplication();
          System.out.println(appData);
          
          t.writeDataToExcel(1,6,appData);
          if(exceldata.equals(appData)) {
        	t.writeDataToExcel(1,7,"Pass");  
          }
          else
          {
        	  t.writeDataToExcel(1,7,"Fail");
          }
	
	driver.close();

}}
