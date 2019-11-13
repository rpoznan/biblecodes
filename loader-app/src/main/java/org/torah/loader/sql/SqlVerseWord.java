package org.torah.loader.sql;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class SqlVerseWord {


	public void writeFile(File outFile, List<String[]> wordList) {
		PrintWriter out = null;
	    try {
	    	out = new PrintWriter(new FileWriter(outFile));
	    	for(String[] data: wordList ) {
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
	
	public void writeUpdateFile(File outFile, List<String[]> wordList) {
		PrintWriter out = null;
	    try {
	    	out = new PrintWriter(new FileWriter(outFile, true));
	    	for(String[] data: wordList ) {
	    		out.println(updateEnglishTranslation(data));
	    	}
	    	out.flush();
	    	out.close();
	    } catch(IOException e) {
	    	throw new RuntimeException("write verse sql failed!", e);
	    }
	}
	
	//select * from nanzopco_torah.torah_verse_word
	//verse_id,word,tran_word,num_value,created_by

	public String toSql(String[] data) {
		StringBuffer sb = new StringBuffer();
		sb.append("insert into nanzopco_torah.torah_verse_word (verse_id,word,tran_word,num_value,num_index,created_by) values (");
		sb.append("'"+data[0]+"',");
		sb.append("'"+data[1]+"',");
		sb.append("'"+data[2]+"',");
		sb.append("'"+data[3]+"',");
		sb.append("'"+data[4]+"',");
		sb.append("'"+data[5]+"');");
		return sb.toString();
	}
	
	public String updateEnglishTranslation(String[] data) {
		StringBuffer sb = new StringBuffer();
		sb.append("update torah_verse_word set eng_translation = '");
		sb.append(escapeChars(data[1]));
		sb.append("' where word ='");
		sb.append(data[0]);
		sb.append("';");
		return sb.toString();
	}
	
	public String escapeChars(String x) {
		return x.replaceAll("'", "''");	
     }
}
