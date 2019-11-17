package org.torah.loader.html;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.torah.loader.gem.ChapterVerseNumberMap;
import org.torah.loader.pojo.BibleVerse;

public class DelitzshSplitter {
	
private ChapterVerseNumberMap verseNumMap = new ChapterVerseNumberMap();
	

     public List<BibleVerse> parseHebrewNtFile(File file, int bookId) {
		
		//<div dir=rtl lang=HE>[width=500]
		
		Document html;
		List<BibleVerse> resultList = new ArrayList<BibleVerse>();
		try {
				html = Jsoup.parse(file,"UTF-8");
                Pattern versePattern = Pattern.compile("(\\d+)");
                Elements block1 = html.select("div[dir=rtl]");
		        for(int i=0; i < block1.size(); i++) {
		        	Elements block2 = block1.select("p");
		        	for(int x=0; x < block2.size(); x++) {
		        		Elements strong = block2.get(x).select("strong");
		        		Element chapter = block2.get(x).select("span.g").first();
		        		String chapterX = chapter != null ? chapter.text() : strong.get(0).text();
		        		
		        		String hChapter = chapterX;
		        		int iChapter = verseNumMap.getAlephToNumber().get(chapterX);

		        		StringBuffer sb = new StringBuffer();
		        		for(int h=0; h < strong.size(); h++) {
		        			sb.append(strong.get(h)+"");
		        			if(h < strong.size()-1)
		        				sb.append("|");
		        		}
		        		String htmlX = block2.get(x).toString().replaceAll("<p>|</p>|&nbsp;|</b>", "");
		        		String[] verses = htmlX.split(sb.toString());
		        		for(int u=1; u < verses.length; u++) {
		        			//System.out.println(verseNumMap.getNumberToAleph().get(u) + " " + u + " " +verses[u]);
		        			BibleVerse verse = new BibleVerse();
		        			verse.setLang("hebrew");
		        			verse.setBook(bookId);
		        			verse.setChapter(iChapter);
		        			verse.sethChapter(hChapter);
		        			verse.sethVerse(verseNumMap.getNumberToAleph().get(u));
		        			verse.setVerse(u);
		        			verse.setText(verses[u].trim());
		        			resultList.add(verse);
		        		}
		        		
		        	}
		        }
		        
		} catch(Throwable t) {
			throw new RuntimeException("error in parser", t);
		}
		
		return resultList;
	}


}
