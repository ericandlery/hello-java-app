package apache.poi;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class F1Reader {

	public static void main(String[] args) throws java.lang.Exception {
		
		System.out.println("POI GO");
		
		String fileName="";
		List<F1> f1List=new ArrayList<>();
		
		FileInputStream fis=null;
		Workbook workbook=null;
		
		try {
			
			fis=new FileInputStream(fileName);
			
			if(fileName.toLowerCase().endsWith("xlsx")) {
				workbook=new XSSFWorkbook(fis);
			}else if(fileName.toLowerCase().endsWith("xls")) {
				workbook=new HSSFWorkbook(fis);
			}else {
				throw new RuntimeException();
			}
			
			int num=workbook.getNumberOfSheets();
			System.out.println("number of sheets=>"+num);
			
			for(int i=0;i<num;i++) {
				Sheet sheet=workbook.getSheetAt(i);
				Iterator<Row> rows=sheet.iterator();
				
				while(rows.hasNext()) {
					Row row=rows.next();
					Iterator<Cell> cells=row.iterator();
					
					while(cells.hasNext()) {
						Cell cell=cells.next();
						System.out.println(cell.getAddress()+"++"+cell.getStringCellValue());
					}
				}
			}
			
		}catch(Exception e) {
			throw new Exception();
		}finally {
			fis.close();
			workbook.close();
		}
		
		System.out.println("POI END");

	}

}
