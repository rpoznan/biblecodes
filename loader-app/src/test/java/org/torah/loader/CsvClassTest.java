package org.torah.loader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.junit.Test;
import org.torah.loader.dao.VerseDao;
import org.torah.loader.sql.SqlVerseWord;

public class CsvClassTest {
	
	@Test
	public void testReadCsv() {
		Reader in;
		//List<String[]> dataList = new ArrayList<String[]>();
		Map<String,String> hebrewMap = new LinkedHashMap<String,String>();
		VerseDao dao = new VerseDao();
		try {
			in = new FileReader("C:\\temp\\hebr-500-engl.ocr.csv");
			 Iterable<CSVRecord> records = CSVFormat.DEFAULT
				      .withHeader(new String[] { "hebrew", "tran", "english"})
				      .parse(in);
				    for (CSVRecord record : records) {
				        //System.out.println(record.get("hebrew"));
				        //System.out.println(record.get("english"));
				        hebrewMap.put(record.get("hebrew"), record.get("english"));
				        //dataList.add(new String[] {record.get("hebrew"), record.get("english")});
				    }
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//new SqlVerseWord().writeUpdateFile(new File("C:\\temp\\lang.sql"), dataList);
	   for(String[] x : dao.lookVerseWords(11286)) {
		   System.out.println(x[0]);
	       System.out.println(x[1]+hebrewMap.containsKey(x[1]));   
	   }
	}

}
