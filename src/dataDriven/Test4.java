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

public class Test4 {
	public static FileInputStream fin;
	public static WebDriver driver;
	public static Sheet sh;
	public static Row row;
	public Cell cell;
	public static Workbook wb ;
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		fin=new FileInputStream("./data5.xlsx");
		wb=WorkbookFactory.create(fin);
		sh=wb.getSheet("Sheet1");
		int rownumb = sh.getLastRowNum();
		for(int i=1;i<rownumb;i++) {
			row=sh.getRow(i);
			String rowdata = row.getCell(0).getStringCellValue();
			if(rowdata.equals("3")) {
				short cellnumb = row.getLastCellNum();
				for(int j=0;j<cellnumb;j++) {
					String data = row.getCell(j).getStringCellValue();
				System.out.println(data);
				
				}
				break;}	
else
				{
					System.out.println("invalid datta");
				}
			}
		}

	}


