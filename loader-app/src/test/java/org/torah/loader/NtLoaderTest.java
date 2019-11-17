package org.torah.loader;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.torah.loader.gem.GematriaCalc;
import org.torah.loader.html.DelitzshSplitter;
import org.torah.loader.html.KjvSplitter;
import org.torah.loader.html.VerseMerge;
import org.torah.loader.nt.NtMerge;
import org.torah.loader.pojo.BibleVerse;
import org.torah.loader.sql.SqlVerse;
import org.torah.loader.tran.Transliterator;

public class NtLoaderTest {
	
	
	SqlVerse sqlVerse = new SqlVerse();
	
	@Test
	public void loadMatthew() {
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
		List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, 40);
		List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
				new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\1matthew.html")
				, 40);
		assertEquals(englishVerses.size(),hebrewVerses.size());
		
		
     List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, 40);
		
//		for(String[] x: dataList) {
//			System.out.println(Arrays.toString(x));
//		}
		
		
		new File("C:\\temp\\matthew.sql").delete();
		sqlVerse.writeFile(new File("C:\\temp\\matthew.sql"), dataList);
	}
	
	@Test
	public void loadMark() {
		File[] files = new File[] {
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MRK01.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MRK02.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MRK03.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MRK04.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MRK05.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MRK06.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MRK07.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MRK08.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MRK09.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MRK10.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MRK11.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MRK12.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MRK13.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MRK14.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MRK15.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//MRK16.htm")
				};
		List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, 41);
		List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
				new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\2mark.html")
				, 41);
		assertEquals(englishVerses.size(),hebrewVerses.size());
		assertEquals(678,hebrewVerses.size());
		assertEquals(678,englishVerses.size());
		
		
     List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, 41);
		
//		for(String[] x: dataList) {
//			System.out.println(Arrays.toString(x));
//		}
		
		
		new File("C:\\temp\\mark.sql").delete();
		sqlVerse.writeFile(new File("C:\\temp\\mark.sql"), dataList);
	}
	
	@Test
	public void loadLuke() {
		File[] files = new File[] {
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK01.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK02.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK03.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK04.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK05.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK06.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK07.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK08.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK09.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK10.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK11.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK12.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK13.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK14.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK15.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK16.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK17.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK18.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK19.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK20.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK21.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK22.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK23.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//LUK24.htm")
				};
		List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, 42);
		List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
				new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\3luke.html")
				, 42);
		assertEquals(englishVerses.size(),hebrewVerses.size());
		assertEquals(1151,hebrewVerses.size());
		assertEquals(1151,englishVerses.size());
		
		
     List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, 42);
		
//		for(String[] x: dataList) {
//			System.out.println(Arrays.toString(x));
//		}
		
		
		new File("C:\\temp\\luke.sql").delete();
		sqlVerse.writeFile(new File("C:\\temp\\luke.sql"), dataList);
	}
	
	@Test
	public void loadJohn() {
		File[] files = new File[] {
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN01.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN02.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN03.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN04.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN05.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN06.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN07.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN08.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN09.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN10.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN11.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN12.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN13.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN14.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN15.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN16.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN17.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN18.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN19.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN20.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JHN21.htm")
				};
		List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, 43);
		List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
				new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\4john2.html")
				, 43);
		
		int[] johnNums = {
				51, 	25, 	36, 	54, 	47, 	71,
				53, 	59, 	41, 	42, 	57, 	50,
				38, 	31, 	27, 	33, 	26, 	40,
				42, 	31, 	25
		};
		Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
		for(int i=1; i <=28; i++)
			chapterMap.put(i, new ArrayList<BibleVerse>());
		for(int i=0; i < hebrewVerses.size(); i++) {
			BibleVerse bv = hebrewVerses.get(i);
			chapterMap.get(bv.getChapter()).add(bv);
		}
		
		for(int i=1; i <=21; i++) {
			assertEquals("chapter "+i,johnNums[i-1],chapterMap.get(i).size());
		}
		
		//assertEquals(englishVerses.size(),hebrewVerses.size());
		assertEquals(879,hebrewVerses.size());
		assertEquals(879,englishVerses.size());
		
		
     List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, 43);
		
//		for(String[] x: dataList) {
//			System.out.println(Arrays.toString(x));
//		}
		
		
		new File("C:\\temp\\john.sql").delete();
		sqlVerse.writeFile(new File("C:\\temp\\john.sql"), dataList);
	}
	



@Test
	public void loadActs() {
		File[] files = new File[] {
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT01.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT02.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT03.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT04.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT05.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT06.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT07.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT08.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT09.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT10.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT11.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT12.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT13.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT14.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT15.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT16.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT17.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT18.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT19.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT20.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT21.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT22.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT23.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT24.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT25.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT26.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT27.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ACT28.htm"),
				};
		List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, 44);
		List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
				new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\5acts.html")
				, 44);
		//hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 19, 40, 41);
		
		int[] verseqa = { 26,47,26,37,42,15,60,40,43,48,30,25,52,28,41,40,34,28,41,38,40,30,35,27,27,32,44,31 };
		Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
		for(int i=1; i <=28; i++)
			chapterMap.put(i, new ArrayList<BibleVerse>());
		for(int i=0; i < hebrewVerses.size(); i++) {
			BibleVerse bv = hebrewVerses.get(i);
			chapterMap.get(bv.getChapter()).add(bv);
		}
		
		chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
		for(int i=1; i <=28; i++)
			chapterMap.put(i, new ArrayList<BibleVerse>());
		for(int i=0; i < englishVerses.size(); i++) {
			BibleVerse bv = englishVerses.get(i);
			chapterMap.get(bv.getChapter()).add(bv);
		}
		
		for(int i=1; i <=28; i++) {
			assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
		}
		assertEquals(englishVerses.size(),hebrewVerses.size());
				assertEquals(1007,hebrewVerses.size());
		assertEquals(1007,englishVerses.size());
		
		
     List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, 44);
		
//		for(String[] x: dataList) {
//			System.out.println(Arrays.toString(x));
//		}
		
		
		new File("C:\\temp\\acts.sql").delete();
		sqlVerse.writeFile(new File("C:\\temp\\acts.sql"), dataList);
	}
	





@Test
public void loadRomans() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ROM01.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ROM02.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ROM03.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ROM04.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ROM05.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ROM06.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ROM07.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ROM08.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ROM09.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ROM10.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ROM11.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ROM12.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ROM13.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ROM14.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ROM15.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//ROM16.htm")
			};
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, 45);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\6romans.html")
			, 45);
	hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 7, 25, 26);
	
	int[] verseqa = { 32,29,31,25,21,23,25,39,33,21,36,21,14,23,33,27 };
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=16; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=16; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=16; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=16; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(433,hebrewVerses.size());
	assertEquals(433,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, 45);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\romans.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\romans.sql"), dataList);
}

@Test
public void load1Corinth() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1CO01.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1CO02.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1CO03.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1CO04.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1CO05.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1CO06.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1CO07.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1CO08.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1CO09.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1CO10.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1CO11.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1CO12.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1CO13.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1CO14.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1CO15.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1CO16.htm")
			};
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, 46);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\7acorinthians.html")
			, 46);
	hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 13, 13, 14);
	
	int[] verseqa = {31,16,23,21,13,20,40,13,27,33,34,31,13,40,58,24};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=16; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=16; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=16; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=16; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(437,hebrewVerses.size());
	assertEquals(437,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, 46);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\1corinthians.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\1corinthians.sql"), dataList);
}

@Test
public void load2Corinthians() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2CO01.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2CO02.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2CO03.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2CO04.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2CO05.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2CO06.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2CO07.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2CO08.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2CO09.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2CO10.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2CO11.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2CO12.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2CO13.htm")
			};
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, 47);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\8bcorinthians.html")
			, 47);
	englishVerses = VerseMerge.mergeVerse(englishVerses, 13, 13, 14);
	
	int[] verseqa = {24,17,18,18,21,18,16,24,15,18,33,21,13};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=16; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=13; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=13; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=13; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(256,hebrewVerses.size());
	assertEquals(256,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, 47);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\2corinthians.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\2corinthians.sql"), dataList);
}

@Test
public void loadGalations() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//GAL01.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//GAL02.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//GAL03.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//GAL04.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//GAL05.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//GAL06.htm")
			};
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, 48);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\9galatians.html")
			, 48);
	//hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 7, 25, 26);
	
	int[] verseqa = {24,21,29,31,26,18};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=16; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=6; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=6; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=6; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(149,hebrewVerses.size());
	assertEquals(149,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, 48);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\galations.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\galations.sql"), dataList);
}


@Test
public void loadEphesians() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//EPH01.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//EPH02.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//EPH03.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//EPH04.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//EPH05.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//EPH06.htm")
			};
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, 49);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\10ephesians.html")
			, 49);
	//hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 7, 25, 26);
	
	int[] verseqa = {23, 	22, 	21, 	32, 	33, 	24};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=16; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=6; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=6; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=6; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(155,hebrewVerses.size());
	assertEquals(155,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, 49);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\ephesians.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\ephesians.sql"), dataList);
}

@Test
public void loadPhillipians() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//PHP01.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//PHP02.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//PHP03.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//PHP04.htm")
			};
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, 50);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\11philippians.html")
			, 50);
	//hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 7, 25, 26);
	
	int[] verseqa = {30, 	30, 	21, 	23};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(104,hebrewVerses.size());
	assertEquals(104,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, 50);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\phillipians.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\phillipians.sql"), dataList);
}

@Test
public void loadColosians() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//COL01.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//COL02.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//COL03.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//COL04.htm")
			};
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, 51);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\12colossians.html")
			, 51);
	//hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 7, 25, 26);
	
	int[] verseqa = {29, 	23, 	25, 	18};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(95,hebrewVerses.size());
	assertEquals(95,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, 51);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\colossians.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\colossians.sql"), dataList);
}

@Test
public void load1Thessalonians() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1TH01.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1TH02.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1TH03.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1TH04.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1TH05.htm")
			};
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, 52);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\13athessalonians.html")
			, 52);
	//hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 7, 25, 26);
	
	int[] verseqa = {10, 	20, 	13, 	18, 	28};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(89,hebrewVerses.size());
	assertEquals(89,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, 52);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\1Thessalonians.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\1Thessalonians.sql"), dataList);
}

@Test
public void load2Thessalonians() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2TH01.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2TH02.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2TH03.htm")
			};
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, 53);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\14bthessalonians.html")
			, 53);
	hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 3, 18, 19);
	
	int[] verseqa = {12, 	17, 	18};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(47,hebrewVerses.size());
	assertEquals(47,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, 53);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\2Thessalonians.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\2Thessalonians.sql"), dataList);
}

@Test
public void load1Timothy() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1TI01.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1TI02.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1TI03.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1TI04.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1TI05.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1TI06.htm")
			};
	int bookId = 54;
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, bookId);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\15atimothy.html")
			, bookId);
	//hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 7, 25, 26);
	
	int[] verseqa = {20, 	15, 	16, 	16, 	25, 	21};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(113,hebrewVerses.size());
	assertEquals(113,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, bookId);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\1timothy.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\1timothy.sql"), dataList);
}

@Test
public void load2Timothy() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2TI01.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2TI02.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2TI03.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2TI04.htm")
			};
	int bookId = 55;
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, bookId);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\16btimothy.html")
			, bookId);
	//hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 7, 25, 26);
	
	int[] verseqa = {18, 	26, 	17, 	22};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(83,hebrewVerses.size());
	assertEquals(83,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, bookId);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\2timothy.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\2timothy.sql"), dataList);
}

@Test
public void loadTitus() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//TIT01.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//TIT02.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//TIT03.htm")
			};
	int bookId = 56;
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, bookId);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\17titus.html")
			, bookId);
	//hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 7, 25, 26);
	
	int[] verseqa = {16, 	15, 	15};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(46,hebrewVerses.size());
	assertEquals(46,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, bookId);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\titus.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\titus.sql"), dataList);
}

@Test
public void loadPhilemon() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//PHM01.htm")
			};
	int bookId = 57;
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, bookId);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\18philemon.html")
			, bookId);
	//hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 7, 25, 26);
	
	int[] verseqa = {25};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(25,hebrewVerses.size());
	assertEquals(25,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, bookId);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\philemon.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\philemon.sql"), dataList);
}

@Test
public void loadHebrews() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//HEB01.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//HEB02.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//HEB03.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//HEB04.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//HEB05.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//HEB06.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//HEB07.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//HEB08.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//HEB09.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//HEB10.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//HEB11.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//HEB12.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//HEB13.htm")
			};
	int bookId = 58;
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, bookId);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\19hebrews.html")
			, bookId);
	//hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 7, 25, 26);
	
	int[] verseqa = {14,18,19,16,14,20,28,13,28,39,40,29,25};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(303,hebrewVerses.size());
	assertEquals(303,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, bookId);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\hebrews.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\hebrews.sql"), dataList);
}

@Test
public void loadJames() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JAS01.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JAS02.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JAS03.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JAS04.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JAS05.htm")
			};
	int bookId = 59;
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, bookId);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\20james.html")
			, bookId);
	//hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 7, 25, 26);
	
	int[] verseqa = {27, 	26, 	18, 	17, 	20};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(108,hebrewVerses.size());
	assertEquals(108,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, bookId);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\james.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\james.sql"), dataList);
}

@Test
public void load1Peter() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1PE01.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1PE02.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1PE03.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1PE04.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1PE05.htm")
			};
	int bookId = 60;
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, bookId);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\21apeter.html")
			, bookId);
	//hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 7, 25, 26);
	
	int[] verseqa = {25, 	25, 	22, 	19, 	14};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(105,hebrewVerses.size());
	assertEquals(105,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, bookId);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\1peter.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\1peter.sql"), dataList);
}

@Test
public void load2Peter() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2PE01.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2PE02.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2PE03.htm")
			};
	int bookId = 61;
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, bookId);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\22bpeter.html")
			, bookId);
	//hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 7, 25, 26);
	
	int[] verseqa = {21, 	22, 	18};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(61,hebrewVerses.size());
	assertEquals(61,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, bookId);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\2peter.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\2peter.sql"), dataList);
}

@Test
public void load1John() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1JN01.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1JN02.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1JN03.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1JN04.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//1JN05.htm")
			};
	int bookId = 62;
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, bookId);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\23ajohn.html")
			, bookId);
	//hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 7, 25, 26);
	
	int[] verseqa = {10, 	29, 	24, 	21, 	21};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(105,hebrewVerses.size());
	assertEquals(105,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, bookId);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\1john.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\1john.sql"), dataList);
}


@Test
public void load2John() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//2JN01.htm")
			};
	int bookId = 63;
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, bookId);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\24bjohn.html")
			, bookId);
	//hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 7, 25, 26);
	
	int[] verseqa = {13};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(13,hebrewVerses.size());
	assertEquals(13,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, bookId);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\2john.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\2john.sql"), dataList);
}

@Test
public void load3John() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//3JN01.htm")
			};
	int bookId = 64;
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, bookId);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\25cjohn.html")
			, bookId);
    hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 1, 14, 15);
	
	int[] verseqa = {14};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(14,hebrewVerses.size());
	assertEquals(14,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, bookId);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\3john.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\3john.sql"), dataList);
}

@Test
public void loadJude() {
	File[] files = new File[] {
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//JUD01.htm")
			};
	int bookId = 65;
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, bookId);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\26jude.html")
			, bookId);
	//hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 7, 25, 26);
	
	int[] verseqa = {25};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(25,hebrewVerses.size());
	assertEquals(25,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, bookId);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\jude.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\jude.sql"), dataList);
}

@Test
public void loadRevelation() {
	File[] files = new File[] {
	new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV01.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV02.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV03.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV04.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV05.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV06.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV07.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV08.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV09.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV10.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV11.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV12.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV13.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV14.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV15.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV16.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV17.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV18.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV19.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV20.htm"),
				   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV21.htm"),
			   new File("C://Users//randy//biblecodes//data//eng-kjv_html//REV22.htm")
			};
	int bookId = 66;
	List<BibleVerse> englishVerses = new KjvSplitter().parseKjvFile(files, bookId);
	List<BibleVerse> hebrewVerses = new DelitzshSplitter().parseHebrewNtFile(
			new File("C:\\Users\\randy\\biblecodes\\data\\hebrewnt\\27revelation.html")
			, bookId);
	//hebrewVerses = VerseMerge.mergeVerse(hebrewVerses, 7, 25, 26);
	
	int[] verseqa = {20,29,22,11,14,17,17,13,21,11,19,17,18,20,8,21,18,24,21,15,27,21};
	Map<Integer,List<BibleVerse>> chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < hebrewVerses.size(); i++) {
		BibleVerse bv = hebrewVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	
	chapterMap = new LinkedHashMap<Integer,List<BibleVerse>>();
	for(int i=1; i <=verseqa.length; i++)
		chapterMap.put(i, new ArrayList<BibleVerse>());
	for(int i=0; i < englishVerses.size(); i++) {
		BibleVerse bv = englishVerses.get(i);
		chapterMap.get(bv.getChapter()).add(bv);
	}
	
	for(int i=1; i <=verseqa.length; i++) {
		assertEquals("chapter "+i,verseqa[i-1],chapterMap.get(i).size());
	}
	assertEquals(englishVerses.size(),hebrewVerses.size());
			assertEquals(404,hebrewVerses.size());
	assertEquals(404,englishVerses.size());
	
	
 List<String[]> dataList = new NtMerge().mergeBibles(englishVerses, hebrewVerses, bookId);
	
//	for(String[] x: dataList) {
//		System.out.println(Arrays.toString(x));
//	}
	
	
	new File("C:\\temp\\Revelation.sql").delete();
	sqlVerse.writeFile(new File("C:\\temp\\Revelation.sql"), dataList);
}

}


