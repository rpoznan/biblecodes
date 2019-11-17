package org.torah.loader.nt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.torah.loader.gem.GematriaCalc;
import org.torah.loader.pojo.BibleVerse;
import org.torah.loader.tran.Transliterator;

public class NtMerge {
	
	public List<String[]> mergeBibles(List<BibleVerse> englishVerses, 
	List<BibleVerse> hebrewList, int bookId) {
		
		List<String[]> resultList = new ArrayList<String[]>();
		Map<Integer,Map<Integer,BibleVerse>> chapterMap = new LinkedHashMap<Integer,Map<Integer,BibleVerse>>();
		for(int i=0; i < englishVerses.size(); i++) {
			BibleVerse bv = englishVerses.get(i);
			if(!chapterMap.containsKey(bv.getChapter()))
				chapterMap.put(bv.getChapter(), new LinkedHashMap<Integer,BibleVerse>());
		}
		for(int i=0; i < englishVerses.size(); i++) {
			BibleVerse bv = englishVerses.get(i);
			chapterMap.get(bv.getChapter()).put(bv.getVerse(), bv);
		}
		
		for(BibleVerse bv : hebrewList) {
			//book_id,verse,eng_verse,num_chapter,num_verse,h_verse,created_by,tran_verse,num_value
		String[] data = new String[10];
		data[0] = bookId+"";
        data[1] = bv.getText();
        data[2] = chapterMap.get(bv.getChapter()).get(bv.getVerse()).getText();
        data[3] = bv.getChapter()+"";
        data[4] = bv.getVerse()+"";
        data[5] = bv.gethVerse();
        data[6] = "rpoznan";
        data[7] = Transliterator.transliterate(data[1]);
        data[8] = GematriaCalc.calculate(data[1])+"";
        data[9] = bv.gethChapter();
        resultList.add(data);
		}
		
		return resultList;
	}

}
