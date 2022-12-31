package tests;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Day11_ReadExcel extends TestBase {

    @Test
    public void readExcelTest() throws IOException {

       // Store the path of the  file in a string
        String path="./src/test/java/recources/Capitals.xlsx";
      //  Open the file
        FileInputStream fileInputStream=new FileInputStream(path);
       // Open the workbook using fileinputstream
        Workbook workbook= WorkbookFactory.create(fileInputStream);
      //  Open the first worksheet
        Sheet sheet1=workbook.getSheet("Sheet1");
       // workbook.getSheetAt(0); alternatively
       // Go to first row
       Row row1= sheet1.getRow(0);//index starts at 0. going to the first row
       // Go to first cell on that first row and print
       Cell cell1= row1.getCell(0);//ondex starts at 0. reading the first celll data that is on the first row
        System.out.println(cell1);
        //we can convert the cell data to string
        String cell1Data=cell1.toString();
        System.out.println(cell1Data);
      //  Go to second cell on that first row and print
        Cell r1c2=row1.getCell(1);
        System.out.println("R1C2 :"+r1c2.toString());
      //  Go to 2nd row first cell  and assert if the data equal to USA
     String r2c1= sheet1.getRow(1).getCell(0).toString();//method chain
        Assert.assertEquals("USA",r2c1);
      //  Go to 3rd row 2nd cell-chain the row and cell
       String r3c2= sheet1.getRow(2).getCell(1).toString();
        System.out.println(r3c2);
      //  Find the number of row
       int numOfRow= sheet1.getLastRowNum()+1;// index start at 0, so add 1 to find total number of row
        System.out.println("Row Count : " +numOfRow);
      //  Find the number of used row
       int numberOfData= sheet1.getPhysicalNumberOfRows();//index starts at 1. returns the number of row that has
        System.out.println("Number of Data :"+ numberOfData);
      //  Print country, capitol key value pairs as map object
        //1- create a map that will store the country,capitals pairs
        Map<String,String> countryCapitals=new HashMap<>();
        for(int rowNum=1 ; rowNum<numOfRow ; rowNum++){
            String country=sheet1.getRow(rowNum).getCell(0).toString();
            String capitals=sheet1.getRow(rowNum).getCell(1).toString();
            countryCapitals.put(country,capitals);
        }
        System.out.println(countryCapitals);
    }
}
