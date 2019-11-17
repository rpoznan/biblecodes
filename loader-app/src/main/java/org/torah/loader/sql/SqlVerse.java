package org.torah.loader.sql;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class SqlVerse {
	
	public void writeFile(File outFile, List<String[]> jpsList) {
		PrintWriter out = null;
	    try {
	    	out = new PrintWriter(new FileWriter(outFile, true));
	    	for(String[] data: jpsList ) {
	    		out.println(toSql(data));
	    	}
	    	out.flush();
	    	out.close();
	    } catch(IOException e) {
	    	throw new RuntimeException("write verse sql failed!", e);
	    }
	}
	
	public void print(List<String[]> jpsList) {
		for(String[] data: jpsList ) {
    		System.out.println(toSql(data));
    	}
	}

	public String toSql(String[] data) {
		validateRow(data);
		StringBuffer sb = new StringBuffer();
		sb.append("insert into nanzopco_torah.torah_verse (book_id,verse,eng_verse,num_chapter,num_verse,h_verse,created_by,tran_verse,num_value,h_chapter) values (");
		sb.append("'"+data[0]+"',");
		sb.append("'"+escapeChars(data[1])+"',");
		sb.append("'"+escapeChars(data[2])+"',");
		sb.append("'"+data[3]+"',");
		sb.append("'"+data[4]+"',");
		sb.append("'"+data[5]+"',");
		sb.append("'"+data[6]+"',");
		sb.append("'"+data[7]+"',");
		sb.append("'"+data[8]+"',");
		sb.append("'"+data[9]+"');");
		return sb.toString();
	}
	
	public String escapeChars(String x) {
		return x.replaceAll("'", "''");	
     }
	
	public void validateRow(String[] data) {
		int book = Integer.parseInt(data[0]);
//		if(book < 1 || book > 39)
//			throw new RuntimeException("invalid book id");
		String verse = escapeChars(data[1]);
		if(verse == null || verse.trim().length() == 0) {
			throw new RuntimeException("verse is empty");
		}
		if(verse.length() > 600) {
			throw new RuntimeException("verse is too long. "+verse.length());
		}
		verse = escapeChars(data[2]);
		if(verse == null || verse.trim().length() == 0) {
			throw new RuntimeException("eng verse is empty");
		}
		if(verse.length() > 600) {
			throw new RuntimeException("eng verse is too long. "+verse.length());
		}
		verse = escapeChars(data[7]);
		if(verse == null || verse.trim().length() == 0) {
			throw new RuntimeException("tran verse is empty");
		}
		if(verse.length() > 600) {
			throw new RuntimeException("tran verse is too long. "+verse.length());
		}
	}

}
