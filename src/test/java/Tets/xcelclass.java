package Tets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xcelclass {
public static void main(String[] args) throws IOException {
	
	File file = new File("LoginTest.xlsx");
	
	
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook xl = new XSSFWorkbook(fis);

        XSSFSheet sheet = xl.getSheet("Login");
    int firstRowNum = sheet.getFirstRowNum();
	//System.out.println(firstRowNum);
	//System.out.println(sheet.getRow(0).getCell(0));
	for(int i=0; i<=sheet.getLastRowNum(); i++) {
		XSSFRow row = sheet.getRow(i);
		System.out.println(row.getCell(0)); 
	}
}
}
