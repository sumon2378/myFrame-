package com.util;

import java.io.FileInputStream;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	
	FileInputStream fis= new FileInputStream("./Excelfile/Book1.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	Sheet s=wb.getSheet("sheet1");
	String ss=s.getRow(3).getCell(2).getStringCellValue();
	System.out.println(ss);
	
	
	
	
	
}

}
