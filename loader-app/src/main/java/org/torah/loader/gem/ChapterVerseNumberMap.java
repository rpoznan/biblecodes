package org.torah.loader.gem;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class ChapterVerseNumberMap {
	
	
	private Map<Integer,String> numberToAleph;
	private Map<String,Integer> alephToNumber;
	
	public ChapterVerseNumberMap() {
		super();
		this.numberToAleph = new LinkedHashMap<Integer,String>();
		this.alephToNumber = new LinkedHashMap<String,Integer>();
		new LinkedHashMap<Integer,String>();
		
	
		List<String> chapter = new ArrayList<String>();
		Reader in = null;
		try {
	         in = new InputStreamReader(getClass().getResourceAsStream("/data/hebrew_verse_codes.csv"));
			 Iterable<CSVRecord> records2 = CSVFormat.DEFAULT
				      .parse(in);
			 for (CSVRecord record : records2) {
			        String num = record.get(0);
			        String aleph = record.get(1);
			        try {
			        	int x = Integer.parseInt(num);
			        	numberToAleph.put(x, aleph);
			        	alephToNumber.put(aleph, x);
			        } catch(Throwable t) {
			        	
			        }
			 }
			        
			        //System.out.println( book.replaceAll("[\\u0591-\\u05BD\\u05BF-\\u05C7]", ""));
			        		//replace(/[\u0591-\u05BD\u05BF-\u05C7]/g,""););
			 } catch(Throwable t) {
				 throw new RuntimeException(t.getMessage(), t);
			 } finally {
				 try {
					in.close();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
	}

	public Map<Integer, String> getNumberToAleph() {
		return numberToAleph;
	}

	public Map<String, Integer> getAlephToNumber() {
		return alephToNumber;
	}


}
