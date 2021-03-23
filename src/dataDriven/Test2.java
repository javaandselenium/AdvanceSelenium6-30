package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test2 {
	public String readDatafromExcel(int r,int c) throws EncryptedDocumentException, IOException {
		FileInputStream fin = new FileInputStream("./data5.xlsx");
		Workbook wb = WorkbookFactory.create(fin);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(r);
		Cell cell = row.getCell(c);
		System.out.println(sh.getLastRowNum());
		return cell.getStringCellValue();
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		Test2 t=new Test2();
			t.readDatafromExcel(1,5);

	}

}
