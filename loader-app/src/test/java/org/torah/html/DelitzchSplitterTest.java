package org.torah.html;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.torah.loader.gem.ChapterVerseNumberMap;
import org.torah.loader.html.DelitzshSplitter;
import org.torah.loader.pojo.BibleVerse;

public class DelitzchSplitterTest {
	
//	private ChapterVerseNumberMap verseNumMap = new ChapterVerseNumberMap();
//	
//	@Test
//	public void testMatthew() {
//		
//		//<div dir=rtl lang=HE>[width=500]
//		
//		Document html;
//		List<BibleVerse> resultList = new ArrayList<BibleVerse>();
//		try {
//			File file = new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\1matthew.html");
//			
//				html = Jsoup.parse(file,"UTF-8");
//                Pattern versePattern = Pattern.compile("(\\d+)");
//                Elements block1 = html.select("div[dir=rtl]");
//		        for(int i=0; i < block1.size(); i++) {
//		        	Elements block2 = block1.select("p");
//		        	for(int x=0; x < block2.size(); x++) {
//		        		Element chapter = block2.get(x).select("span.g").first();
//		        		System.out.println(chapter.text());
//		        		
//		        		System.out.println(verseNumMap.getAlephToNumber().get(chapter.text()));
//		        		
//		        		Elements strong = block2.get(x).select("strong");
//		        		StringBuffer sb = new StringBuffer();
//		        		for(int h=0; h < strong.size(); h++) {
//		        			sb.append(strong.get(h)+"");
//		        			if(h < strong.size()-1)
//		        				sb.append("|");
//		        		}
//		        		String htmlX = block2.get(x).toString().replaceAll("<p>|</p>|&nbsp;", "");
//		        		String[] verses = htmlX.split(sb.toString());
//		        		for(int u=1; u < verses.length; u++) {
//		        			System.out.println(verseNumMap.getNumberToAleph().get(u) + " " + u + " " +verses[u]);
//		        			
//		        		}
//		        		
//		        	}
//		        }
//		        
//		} catch(Throwable t) {
//			t.printStackTrace();
//		}
//	}

	@Test
	public void testMatthew() {
		List result = new DelitzshSplitter().parseHebrewNtFile(
				new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\1matthew.html")
				, 40);
		System.out.println(result);
	}
}
