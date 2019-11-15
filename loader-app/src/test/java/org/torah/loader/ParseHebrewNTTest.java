package org.torah.loader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.junit.Test;
import org.torah.loader.dao.VerseDao;

public class ParseHebrewNTTest {
	
	
	@Test
	public void testReadCsv() {
		Reader in = null;
		Reader in2 = null;
		Pattern p  = Pattern.compile("(\\d+:\\d+\\-\\d+:\\d+)");
		//List<String[]> dataList = new ArrayList<String[]>();
		Map<String,String> hebrewMap = new LinkedHashMap<String,String>();
		List<String> chapter = new ArrayList<String>();
		try {
			in2 = new FileReader("C:\\Users\\r.poznan\\biblecodes\\data\\ntbookshbr2.csv");
			 Iterable<CSVRecord> records2 = CSVFormat.DEFAULT
				      .parse(in2);
			 for (CSVRecord record : records2) {
			        String book = record.get(0);
			        System.out.println( book.replaceAll("[\\u0591-\\u05BD\\u05BF-\\u05C7]", ""));
			        		//replace(/[\u0591-\u05BD\u05BF-\u05C7]/g,""););
			 }
			
			
			
//			in = new FileReader("C:\\Users\\r.poznan\\biblecodes\\data\\he_newTestament-A5.ocr.csv");
//			 Iterable<CSVRecord> records = CSVFormat.DEFAULT
//				      .parse(in);
//				    for (CSVRecord record : records) {
//				        String row = record.get(0);
//				        System.out.println(row);
//				        Matcher m = p.matcher(row);
//				        if(m.find()) {
//				        	//System.out.println(m.group());
//				        	chapter.add(m.group());
//				        }
//				        
//				    }
//				    
//				    for(String x: chapter) {
//				    	System.out.println(x);
//				    }
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				in2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
