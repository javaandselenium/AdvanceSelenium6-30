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

public class Test3 {
	public static FileInputStream fin;
	public static WebDriver driver;
	public static Sheet sh;
	public static Row row;
	public Cell cell;
	public 	FileOutputStream fout;
	public static Workbook wb ;

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	fin=new FileInputStream("./data5.xlsx");
	wb=WorkbookFactory.create(fin);
	sh=wb.getSheet("Sheet1");
	row=sh.getRow(2);
	short cellnum = row.getLastCellNum();
	System.out.println(cellnum);
	
	for(int i=0;i<cellnum;i++) {
		String data = row.getCell(i).getStringCellValue();
		System.out.println(data);
	}
	
	
	

	}

}
