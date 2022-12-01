package poc.java.main;


//Module Imported
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import poc.java.pojo.HeaderPOJO;
import poc.java.pojo.LinePOJO;
//import java.io.IOException; 

public class ReadCSV {
	

	   //Delimiter code 
	   public static final String delimiter = ";";
	   public static void read(String csvFile) {
		   
		   try {
	         File file = new File(csvFile);
	         FileReader fr = new FileReader(file);
	         BufferedReader br = new BufferedReader(fr);
	         String line = "";
	         String[] tempArr;
	         
	         while((line = br.readLine()) != null) {
	        	
	        	 
	        	 //Condition For Header POJO 
	        	if (line.startsWith("HAUDIT")) {
	        		HeaderPOJO headerLineItem = new HeaderPOJO();
	        		headerLineItem.setRecordType(line.split(";")[0]);
	        		headerLineItem.setTotalLines(Integer.parseInt(line.split(";")[1]));
	        		headerLineItem.setTotalAmt(Float.parseFloat(line.split(";")[2]));
	        		headerLineItem.setMinAmt(Float.parseFloat(line.split(";")[3]));
	        		headerLineItem.setCurrentDate(line.split(";")[4]);
	         		System.out.println(headerLineItem);
					
				}
	        	
	        	//Condition For Line POJO
	        	else {
					List<String> lineItemList = new ArrayList<String>();
					LinePOJO lineItem = new LinePOJO();
					lineItem.setRecordtype(line.split(";")[0]);
					lineItem.setLineNumber(Integer.parseInt(line.split(";")[1]));
					lineItem.setRefDocNum(line.split(";")[2]);
					lineItem.setCity(line.split(";")[3]);
					lineItem.setAmount(Double.parseDouble(line.split(";")[4]));
				}
	         }
	         
	         
	         
	         br.close();
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }
	   }
	   
	   
	   //main method
	   public static void main(String[] args) {
		      // csv file to read
		      String csvFile = "D:\\javapoc.csv";
		       ReadCSV.read(csvFile);
		   }
}