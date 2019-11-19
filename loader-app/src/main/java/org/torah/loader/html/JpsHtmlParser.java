package org.torah.loader.html;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.torah.loader.gem.ChapterVerseNumberMap;
import org.torah.loader.gem.GematriaCalc;
import org.torah.loader.tran.Transliterator;

public class JpsHtmlParser {
	
	private ChapterVerseNumberMap hebrewNumberMap = new ChapterVerseNumberMap();
	/**
	 * Convert File to UTF-8 first
	 * @param jpsFile
	 * @param bookId
	 * @param chapter
	 * @return
	 */
	public List<String[]> parseJpsFile(File jpsFile,int bookId, int chapter) {
		Document html;
		List<String[]> verseList = null;
		try {
			
			
			html = Jsoup.parse(jpsFile,"UTF-8");
			String title = html.title();
	        String h1 = html.body().getElementsByTag("h1").text();
	        //<TABLE CELLPADDING="4" CELLSPACING="4" WIDTH="100%">
	        //System.out.println(h1);
	        //System.out.println(title);

	        Element table = html.select("table").get(1); //select the first table.
	        Elements rows = table.select("tr");
            verseList = new ArrayList<String[]>();
 	        for (int i = 0; i < rows.size(); i++) { //first row is the col names so skip it.
	            
 	        	
 	        	Element row = rows.get(i);
	            Elements cols = row.select("td");
	            String[] data = new String[10];
	            String hebrewNum = cols.get(0).select("b").get(0).text();	            
	            String hebrew = cols.get(0).text();
	            //System.out.println(hebrewNum);
	            //System.out.println(hebrew);
	            char[] buf2 = hebrewNum.toCharArray();
	            char[] buf = hebrew.toCharArray();
	            StringBuffer sb = new StringBuffer();
	            for(int v=0; v < buf.length; v++) {
	            	if((v == 0 && buf[v] == buf2[0]) || ( v == 1 && buf2.length > 1 && buf[v] == buf2[1])) {
	            		continue;
	            	}
	            	if(((byte)buf[v]) == 0x2E) {
	            		continue;
	            	}
	            	if((v+2 < buf.length && buf[v] == '{' && buf[v+1] == 'פ' && buf[v+2] == '}')) {
	            		v = v+2;
	            		continue;
	            	}
	            	if((v+1 < buf.length && buf[v] == '{' && buf[v+1] == 'פ' )) {
	            		v = v+1;
	            		continue;
	            	}
	            	if(((int)buf[v]) != 160) {
	            		sb.append(buf[v]);
//		            	sb.append("=");
//		            	sb.append(String.format("%02x", (byte)buf[v] ));
//		            	sb.append(","+v);
	            	}

	            }
	            data[0] = bookId+"";
	            data[1] = sb.toString().replaceAll("[סשר]+\\}|\\{", "").trim();
	            data[2] = cols.get(1).text();
	            data[3] = chapter+"";
	            data[4] = cols.get(1).select("b").get(0).text();
	            data[5] = hebrewNum;
	            data[6] = "rpoznan";
	            data[7] = Transliterator.transliterate(data[1]);
	            data[8] = GematriaCalc.calculate(data[1])+"";
	            data[9] = hebrewNumberMap.getNumberToAleph().get(chapter);
	            
	            verseList.add(data);
	           
	        }
		} catch (IOException e) {
			throw new RuntimeException("Error in jps parser", e);
		}
 	    return  verseList;
	}

}
