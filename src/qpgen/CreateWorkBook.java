/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qpgen;

/**
 *
 * @author tinker
 */
import java.io.*;
import org.apache.poi.xssf.usermodel.*;
public class CreateWorkBook 
{
   public static void main(String[] args)throws Exception 
   {
      //Create Blank workbook
       try{
      XSSFWorkbook workbook = new XSSFWorkbook(); 
      //Create file system using specific name
      FileOutputStream out = new FileOutputStream(
      new File("createworkbook.xlsx"));
      //write operation workbook using file out object 
      workbook.write(out);
      out.close();
      System.out.println("createworkbook.xlsx written successfully");
   }
       catch(Exception e) {System.out.println("e");}
   }
}

