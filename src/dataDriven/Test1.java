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
import org.testng.annotations.Test;

public class Test1 {
	public static FileInputStream fin;
	public static WebDriver driver;
    public static  Sheet sh;
	public Row row;
	public Cell cell;
	public 	FileOutputStream fout;
	public static Workbook wb ;
	
	public String readDatafromExcel(int r,int c) throws EncryptedDocumentException, IOException {
//		fin=new FileInputStream("./data5.xlsx");
//		wb=WorkbookFactory.create(fin);
		Sheet sh = wb.getSheet("Sheet1");
		row=sh.getRow(r);
		cell=row.getCell(c);
		System.out.println(sh.getLastRowNum());
		return cell.getStringCellValue();
	}
	
	public  String getDatafromApplication(String url) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver.getTitle();
	}
	
	public void writeDataToExcel(int rownum,int cellnum,String data) throws IOException {
		row=sh.getRow(rownum);
		cell=row.getCell(cellnum);
		cell.setCellValue(data);
		 fout=new FileOutputStream("./data5.xlsx");
		 wb.write(fout);
	}
	

	//public static void main(String[] args) throws EncryptedDocumentException, IOException {
	@Test
	public void demo() throws EncryptedDocumentException, IOException {
	Test1 t=new Test1();
		fin=new FileInputStream("./data5.xlsx");
		wb=WorkbookFactory.create(fin);
		
		int rownumb = sh.getLastRowNum();
		System.out.println(rownumb);
	
		for(int i=1;i<=rownumb;i++) {
			String url = t.readDatafromExcel(i,3);
			System.out.println(url);
			String expectedData = t.readDatafromExcel(i,5);
			System.out.println(expectedData);
			String actTitle = t.getDatafromApplication(url);
			System.out.println(actTitle);
			
			t.writeDataToExcel(i,6,actTitle);
			if(expectedData.equals(actTitle)) {
				t.writeDataToExcel(i,7,"PASS");
			}
			else
			{
				t.writeDataToExcel(i,7,"FAIL");
			}
			driver.quit();
		}
	
		

	}

}
