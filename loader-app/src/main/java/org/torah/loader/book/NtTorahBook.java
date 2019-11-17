package org.torah.loader.book;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class NtTorahBook {
	
	private List<String> hebrewBooks;
	private List<String> englishBooks;
	
	public NtTorahBook() {
		super();
		this.hebrewBooks = new ArrayList<String>();
		this.englishBooks = new ArrayList<String>();
		Reader in = null;
		try {
	         in = new InputStreamReader(getClass().getResourceAsStream("/data/ntbookshbr2.csv"));
			 Iterable<CSVRecord> records2 = CSVFormat.DEFAULT
				      .parse(in);
			 for (CSVRecord record : records2) {
			        String book = record.get(0);
			        hebrewBooks.add(book.replaceAll("[\\u0591-\\u05BD\\u05BF-\\u05C7]", ""));
			 }
			 in.close();
			 in = new InputStreamReader(getClass().getResourceAsStream("/data/ntbooks.csv"));
			 records2 = CSVFormat.DEFAULT
				      .parse(in);
			 for (CSVRecord record : records2) {
			        String book = record.get(0);
			        englishBooks.add(book);
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
	
	public String getSql() {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i < hebrewBooks.size(); i++) {
		//sb.append("--"+englishBooks.get(i)+"\n");
		sb.append("insert into nanzopco_torah.torah_book (book_name,eng_book_name) values ('");
		sb.append(hebrewBooks.get(i).trim());
		sb.append("','");
		//sb.append(englishBooks.get(i).replaceAll("\\s", ""));
		
		sb.append("');\n");
		sb.append("update nanzopco_torah.torah_book set eng_book_name='"+englishBooks.get(i)+"' where book_name = '"+hebrewBooks.get(i).trim()+"';\n");
		}
		return sb.toString();
	}
	

}
