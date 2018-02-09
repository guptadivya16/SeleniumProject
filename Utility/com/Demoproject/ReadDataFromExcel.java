package com.Demoproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadDataFromExcel {

	public static HashMap<String, LinkedHashMap<Integer, List>> loadExcelLines(String fileName) {
		// Used the LinkedHashMap and LikedList to maintain the order
		HashMap<String, LinkedHashMap<Integer, List>> outerMap = new LinkedHashMap<String, LinkedHashMap<Integer, List>>();
		LinkedHashMap<Integer, List> hashMap = new LinkedHashMap<Integer, List>();
		System.out.println("In Method load Excel line");
		String sheetName = null;
		FileInputStream fis = null;
	
		try {
			
		//	File myFile = new File("ReadExcel.xlsx");
			fis = new FileInputStream(fileName);
			System.out.println("Before line");
			
			XSSFWorkbook workBook = new XSSFWorkbook(fis);
			System.out.println("After line");
			
			for (int i = 0; i < workBook.getNumberOfSheets(); i++) {
				XSSFSheet sheet = workBook.getSheetAt(i);
				// XSSFSheet sheet = workBook.getSheetAt(0);
				sheetName = workBook.getSheetName(i);
				System.out.println("sheetname" +sheetName);

				Iterator rows = sheet.rowIterator();
				while (rows.hasNext()) {
					XSSFRow row = (XSSFRow) rows.next();
					Iterator cells = row.cellIterator();

					List data = new LinkedList();
					while (cells.hasNext()) {
						XSSFCell cell = (XSSFCell) cells.next();
						// cell.setCellType(Cell.CELL_TYPE_STRING);
						data.add(cell);
					}
					hashMap.put(row.getRowNum(), data);

					// sheetData.add(data);
				}
				outerMap.put(sheetName, hashMap);
				hashMap = new LinkedHashMap<Integer, List>();
			}
			System.out.println("data in hash map" +hashMap.keySet());
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		return outerMap;

	}
	public static void main(String a[])
	{
	
	ReadDataFromExcel rd =new ReadDataFromExcel();
	HashMap<String, LinkedHashMap<Integer,List>> displaymap = new HashMap<String, LinkedHashMap<Integer,List>>();
	displaymap = rd.loadExcelLines("CityDetails.xlsx");
	System.out.println("Display excel data" +displaymap);
	System.out.println("Display excel data" +displaymap.keySet().contains("Sheet1"));
	System.out.println("Display excel data" +displaymap.get("Sheet1"));
	System.out.println("Display excel data" +displaymap.entrySet());
	System.out.println("Display excel data" +displaymap.values());
	
	}
}
	
	
	

