package org.torah.loader.html;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.torah.loader.gem.GematriaCalc;
import org.torah.loader.pojo.BibleVerse;
import org.torah.loader.tran.Transliterator;

public class KjvSplitter {

	//file:///C:/Users/randy/biblecodes/data/eng-kjv_html/MAT01.htm
	public List<BibleVerse> parseKjvFile(File[] files, int bookId) {
		Document html;
		List<BibleVerse> resultList = new ArrayList<BibleVerse>();
		try {
			
			for(File file: files) {
				html = Jsoup.parse(file,"UTF-8");
                Pattern versePattern = Pattern.compile("(\\d+)");
                Element chapter = html.select("div.chapterlabel").first();
		        Elements div = html.select("div.p"); //select the first table.
		        //System.out.println(div);
		        String pverse = div.toString();
		        
		        //System.out.print(chapter.text());
		        
		        List<String> verseList = new ArrayList<String>();
		        //Elements verseNum = html.select("span.verse");
		        for(int x=0; x < div.size(); x++) {
		        	Elements verseNum = div.get(x).select("span.verse");
		        	String block = div.get(x).toString();
		        	StringBuffer sb = new StringBuffer();
		        	for(int c=0; c < verseNum.size(); c++) {
		        		sb.append(verseNum.get(c));
		        		if(c < verseNum.size()-1) {
		        			sb.append("|");
		        		}
		        	}
		        	String[] items = block.split(sb.toString());
		        	//System.out.println(Arrays.toString(items));
		        	for(int g =1; g < items.length; g++) {
		        		verseList.add(items[g].replaceAll("</div>|¶|<span class=\"add\">|</span>|<span class=\\\"wj\\\">", "").trim());
		        	}
		        }
		        for(int i=0; i < verseList.size(); i++) {
		        	BibleVerse verse = new BibleVerse();
		        	verse.setBook(bookId);
		        	verse.setChapter(Integer.parseInt(chapter.text().trim()));
		        	verse.setText(verseList.get(i));
		        	verse.setVerse(i+1);
		        	verse.setLang("english");
		        	resultList.add(verse);
		        }
			}
			
			return resultList;

		} catch (Throwable e) {
			throw new RuntimeException("Error in jps parser", e);
		}
	}
	
}
