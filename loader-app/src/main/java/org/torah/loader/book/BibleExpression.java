package org.torah.loader.book;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class BibleExpression {
	
	public List<String> bibleBooks;

	public BibleExpression() {
		super();
		this.bibleBooks = new ArrayList<String>();
		Reader in = null;
		try {
	         in = new InputStreamReader(getClass().getResourceAsStream("/data/biblebooks.csv"));
			 Iterable<CSVRecord> records2 = CSVFormat.DEFAULT
				      .parse(in);
			 for (CSVRecord record : records2) {
			        String book = record.get(0);
			        if(book.equals("eng_book_name"))
			        	continue;
			        bibleBooks.add(book.trim());
			 }
			 in.close();
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
	
	
	public String createExpression() {
		StringBuffer sb = new StringBuffer();
		sb.append("(");
		for(int x=0; x < bibleBooks.size(); x++) {
			String bb = bibleBooks.get(x);
			if(!bb.startsWith("Phil")) {
			int srt = 3;
			int tw = 2;
			if(bb.contains(" ")) {
				srt = 5;
				tw = 4;
			}
			sb.append(bb);
			sb.append("|");
			sb.append(bb.substring(0, srt));
			sb.append("|");
			sb.append(bb.substring(0, tw));
			} else {
			int srt = 5;
			sb.append(bb);
			sb.append("|");
			sb.append(bb.substring(0, srt));
			}
			
			if(x < bibleBooks.size()-1)
				sb.append("|");
		}
		sb.append(")");
		sb.append(" ");
		sb.append("(\\d+\\:?\\d*\\-?\\d*)");
		return sb.toString();
	}
	
	

}
