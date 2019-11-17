package org.torah.html;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.torah.loader.html.KjvSplitter;
import org.torah.loader.pojo.BibleVerse;

public class KjvSplitterTest {
	
//	@Test
//	public void testMatt() {
//
//		
//		//file:///C:/Users/randy/biblecodes/data/eng-kjv_html/MAT01.htm
//		File htmlFile = new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT02.htm");
//			Document html;
//			
//			try {
//				
//				
//				html = Jsoup.parse(htmlFile,"UTF-8");
//                Pattern versePattern = Pattern.compile("(\\d+)");
//                Element chapter = html.select("div.chapterlabel").first();
//		        Elements div = html.select("div.p"); //select the first table.
//		        //System.out.println(div);
//		        String pverse = div.toString();
//		        
//		        System.out.print(chapter.text());
//		        
//		        List<String> verseList = new ArrayList<String>();
//		        //Elements verseNum = html.select("span.verse");
//		        for(int x=0; x < div.size(); x++) {
//		        	Elements verseNum = div.get(x).select("span.verse");
//		        	String block = div.get(x).toString();
//		        	StringBuffer sb = new StringBuffer();
//		        	for(int c=0; c < verseNum.size(); c++) {
//		        		sb.append(verseNum.get(c));
//		        		if(c < verseNum.size()-1) {
//		        			sb.append("|");
//		        		}
//		        	}
//		        	String[] items = block.split(sb.toString());
//		        	//System.out.println(Arrays.toString(items));
//		        	for(int g =1; g < items.length; g++) {
//		        		verseList.add(items[g].replaceAll("</div>|¶|<span class=\"add\">|</span>", ""));
//		        	}
//		        }
//		        System.out.println(verseList);
//		        assertEquals(25,verseList.size());
//
//			} catch (IOException e) {
//				throw new RuntimeException("Error in jps parser", e);
//			}
//	 	   
//		
//	}
	
	@Test
	public void testMatthew() {
		File[] files = new File[] {
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT01.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT02.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT03.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT04.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT05.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT06.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT07.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT08.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT09.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT10.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT11.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT12.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT13.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT14.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT15.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT16.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT17.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT18.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT19.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT20.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT21.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT22.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT23.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT24.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT25.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT26.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT27.htm"),
		   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MAT28.htm"),
		};
		List<BibleVerse> verseList = new KjvSplitter().parseKjvFile(files, 40);
		Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
		for(int i=1; i <=28; i++)
			chapterMap.put(i, new ArrayList<BibleVerse>());
		for(int i=0; i < verseList.size(); i++) {
			BibleVerse bv = verseList.get(i);
			chapterMap.get(bv.getChapter()).add(bv);
		}
		int[] qaMatt = { 	25, 	
				23, 	
				17, 	
				25, 	
				48, 	
				34, 	
				29, 	
				34, 	
				38, 42, 	30, 	50, 	58, 	36, 	39,
				28, 	27, 	35, 	30, 	34, 	46, 	46, 	39,
				51, 	46, 	75, 	66, 	20};
		for(int i=1; i <=28; i++) {
			assertEquals("chapter "+i,qaMatt[i-1],chapterMap.get(i).size());
		}
		
		assertEquals(1071,verseList.size());
	}

}
