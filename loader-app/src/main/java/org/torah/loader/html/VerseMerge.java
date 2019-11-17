package org.torah.loader.html;

import java.util.ArrayList;
import java.util.List;

import org.torah.loader.pojo.BibleVerse;

public class VerseMerge {
	
	public static List<BibleVerse> mergeVerse(List<BibleVerse> inList, int chapter, int verseX, int verseY) {
		BibleVerse bvX = inList.stream()
                .filter(x -> x.getChapter() == chapter && x.getVerse() == verseX)
                .findAny()
                .orElse(null);
		BibleVerse bvY = inList.stream()
                .filter(x -> x.getChapter() == chapter && x.getVerse() == verseY)
                .findAny()
                .orElse(null);
		
		if(bvX == null || bvY == null) {
			return inList;
		}
		
		String merged = bvX.getText() + " " + bvY.getText();
		
		List<BibleVerse> resultList = new ArrayList<BibleVerse>();
		for(BibleVerse verse : inList) {
			if(verse.equals(bvX)) {
				verse.setText(merged);
			}
			if(!verse.equals(bvY))
				resultList.add(verse);
		}
		
		return resultList;
	}

}
