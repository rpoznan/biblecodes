package org.torah.loader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.torah.loader.dao.VerseDao;
import org.torah.loader.gem.GematriaCalc;
import org.torah.loader.splitter.VerseSplitter;
import org.torah.loader.sql.SqlVerseWord;
import org.torah.loader.tran.Transliterator;

public class VerseSelectTest {

	@Test
	public void testQuery() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(2);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\exodusWords.sql"), wordList);
	}
	
	@Test
	public void testQuery2() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(1);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\genesisWords.sql"), wordList);
	}
	
	@Test
	public void testQuery3() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(3);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\leviticusWords.sql"), wordList);
	}
	
	@Test
	public void testQuery4() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(4);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\numbersWords.sql"), wordList);
	}
	
	@Test
	public void testQuery5() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(5);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\deutWords.sql"), wordList);
	}
	
	@Test
	public void testQuery6() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(6);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\joshuaWords.sql"), wordList);
	}
	
	@Test
	public void testQuery7() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(7);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\judgesWords.sql"), wordList);
	}
	
	@Test
	public void testQuery8() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(8);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\1SamuelWords.sql"), wordList);
	}
	
	@Test
	public void testQuery9() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(9);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\2SamuelWords.sql"), wordList);
	}
	
	@Test
	public void testQuery10() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(10);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\1KingsWords.sql"), wordList);
	}
	
	@Test
	public void testQuery11() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(11);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\2KingsWords.sql"), wordList);
	}
	
	@Test
	public void testQuery12() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(12);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\IsaiahWords.sql"), wordList);
	}
	
	@Test
	public void testQuery13() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(13);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\JerimiahWords.sql"), wordList);
	}
	
	@Test
	public void testQuery14() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(14);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\EzekielWords.sql"), wordList);
	}
	
	@Test
	public void testQuery15() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(15);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\hoseaWords.sql"), wordList);
	}
	
	@Test
	public void testQuery16() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(16);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\joelWords.sql"), wordList);
	}
	
	@Test
	public void testQuery17() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(17);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\amosWords.sql"), wordList);
	}
	@Test
	public void testQuery18() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(18);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\obediahWords.sql"), wordList);
	}
	
	@Test
	public void testQuery19() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(19);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\jonahWords.sql"), wordList);
	}
	
	@Test
	public void testQuery20() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(20);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\micahWords.sql"), wordList);
	}
	
	@Test
	public void testQuery21() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(21);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\nahumWords.sql"), wordList);
	}
	
	@Test
	public void testQuery22() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(22);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\habakkukWords.sql"), wordList);
	}
	
	@Test
	public void testQuery23() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(23);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\hagaiWords.sql"), wordList);
	}
	
	@Test
	public void testQuery24() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(24);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\zepheniahWords.sql"), wordList);
	}
	
	@Test
	public void testQuery25() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(25);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\zechariahWords.sql"), wordList);
	}
	
	@Test
	public void testQuery26() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(26);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\malachiWords.sql"), wordList);
	}
	
	@Test
	public void testQuery27() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(27);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\psalmWords.sql"), wordList);
	}
	
	@Test
	public void testQuery28() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(28);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\proverbsWords.sql"), wordList);
	}
	
	@Test
	public void testQuery29() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(29);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\jobWords.sql"), wordList);
	}
	
	@Test
	public void testQuery30() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(30);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\songsWords.sql"), wordList);
	}
	
	@Test
	public void testQuery31() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(31);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\ruthWords.sql"), wordList);
	}
	
	@Test
	public void testQuery32() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(32);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\lamentationsWords.sql"), wordList);
	}
	
	@Test
	public void testQuery33() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(33);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\ecclesWords.sql"), wordList);
	}
	
	@Test
	public void testQuery34() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(34);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\estherWords.sql"), wordList);
	}
	
	@Test
	public void testQuery35() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(35);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\danielWords.sql"), wordList);
	}
	
	@Test
	public void testQuery36() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(36);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\ezraWords.sql"), wordList);
	}
	
	@Test
	public void testQuery37() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(37);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\nehimiahWords.sql"), wordList);
	}
	
	@Test
	public void testQuery38() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(38);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\1chroniclesWords.sql"), wordList);
	}
	
	@Test
	public void testQuery39() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(39);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\2chroniclesWords.sql"), wordList);
	}
	
	@Test
	public void testQuery40() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(40);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\matthewWords.sql"), wordList);
	}
	
	@Test
	public void testQuery41() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(41);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\markWords.sql"), wordList);
	}
	
	@Test
	public void testQuery42() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(42);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\lukeWords.sql"), wordList);
	}
	
	@Test
	public void testQuery43() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(43);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\johnWords.sql"), wordList);
	}
	
	@Test
	public void testQuery44() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(44);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\actsWords.sql"), wordList);
	}
	
	@Test
	public void testQuery45() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(45);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\romansWords.sql"), wordList);
	}
	
	@Test
	public void testQuery46() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(46);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\1corinthiansWords.sql"), wordList);
	}
	
	@Test
	public void testQuery47() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(47);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\2corinthiansWords.sql"), wordList);
	}
	
	@Test
	public void testQuery48() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(48);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\galationsWords.sql"), wordList);
	}
	
	@Test
	public void testQuery49() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(49);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\ephesiansWords.sql"), wordList);
	}
	
	@Test
	public void testQuery50() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(50);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\phillipiansWords.sql"), wordList);
	}
	
	@Test
	public void testQuery51() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(51);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\colossiansWords.sql"), wordList);
	}
	
	@Test
	public void testQuery52() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(52);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\1ThessWords.sql"), wordList);
	}
	
	@Test
	public void testQuery53() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(53);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\2ThessWords.sql"), wordList);
	}
	
	@Test
	public void testQuery54() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(54);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\1TimothyWords.sql"), wordList);
	}
	
	@Test
	public void testQuery55() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(55);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\2TimothyWords.sql"), wordList);
	}
	
	@Test
	public void testQuery56() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(56);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\titusWords.sql"), wordList);
	}
	
	@Test
	public void testQuery57() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(57);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\philemonWords.sql"), wordList);
	}
	
	@Test
	public void testQuery58() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(58);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\hebrewsWords.sql"), wordList);
	}
	
	@Test
	public void testQuery59() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(59);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\jamesWords.sql"), wordList);
	}
	
	@Test
	public void testQuery60() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(60);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\1peterWords.sql"), wordList);
	}
	
	@Test
	public void testQuery61() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(61);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\2peterWords.sql"), wordList);
	}
	
	@Test
	public void testQuery62() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(62);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\1johnWords.sql"), wordList);
	}
	
	@Test
	public void testQuery63() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(63);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\2johnWords.sql"), wordList);
	}
	
	@Test
	public void testQuery64() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(64);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\3johnWords.sql"), wordList);
	}
	
	@Test
	public void testQuery65() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(65);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\judeWords.sql"), wordList);
	}
	
	@Test
	public void testQuery66() {
		VerseDao d = new VerseDao();
		List<String[]> verseList = d.versesByBook(66);
		List<String[]> wordList = new ArrayList<String[]>();
		for(String[] gg: verseList) {
			System.out.println(gg[0]);
			System.out.println(gg[1]);
			String[] vv = VerseSplitter.splitVerse(gg[1]);
			for(int c=0; c < vv.length; c++) {
				String[] row = new String[6];
				//verse_id,word,tran_word,num_value,num_index,created_by
				row[0] = gg[0];
				row[1] = vv[c];
				row[2] = Transliterator.transliterate(row[1]);
				row[3] = GematriaCalc.calculate(row[1])+"";
				row[4] = c+"";
				row[5] = "rpoznan";
				wordList.add(row);
			}
		}
		new SqlVerseWord().writeFile(new File("C:\\temp\\revelationWords.sql"), wordList);
	}
	
	@Test
	public void makeFile() {
		//FilenameFilter x = new FilenameFilter(".sql");
		File temp = new File("C:\\temp");
		List<File> fileList = new ArrayList<File>();
		int cnt = 0;
		for(File file :temp.listFiles()) {
			if(file.canRead() && file.getName().endsWith(".sql") && file.getName().indexOf("Words") > -1 && file.getName().indexOf("Bible") == -1) {
				System.out.println(file.getAbsolutePath());
				fileList.add(file);
				cnt++;
			}
		}
		
		int sum = 0;
		for(int i=0; i < fileList.size(); i++) {
			sum = sum +i;
		}
		System.out.println(sum);
		assertEquals(cnt,39);
		FileOutputStream out = null;
		FileOutputStream out2 = null;
		FileOutputStream out3 = null;
		FileOutputStream out4 = null;
		try {
			out = new FileOutputStream("C:\\temp\\BibleWords1.sql");
			out2 = new FileOutputStream("C:\\temp\\BibleWords2.sql");
			out3 = new FileOutputStream("C:\\temp\\BibleWords3.sql");
			out4 = new FileOutputStream("C:\\temp\\BibleWords4.sql");
			int check = 0;
			for(int i=0; i < 7; i++) {
				FileInputStream in = new FileInputStream(fileList.get(i));
				IOUtils.copy(in,out);
				in.close();
				System.out.println(i);
				check = check + i;
			}
			for(int i=7; i < 17; i++) {
				FileInputStream in = new FileInputStream(fileList.get(i));
				IOUtils.copy(in,out2);
				in.close();
				System.out.println(i);
				check = check + i;
			}
			for(int i=17; i < 24; i++) {
				FileInputStream in = new FileInputStream(fileList.get(i));
				IOUtils.copy(in,out3);
				in.close();
				System.out.println(i);
				check = check + i;
			}
			for(int i=24; i < fileList.size(); i++) {
				FileInputStream in = new FileInputStream(fileList.get(i));
				IOUtils.copy(in,out4);
				in.close();
				System.out.println(i);
				check = check + i;
			}
			
			assertEquals(sum,check);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("io error");
		} finally {
			
			try {
				out.close();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				out2.close();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				out3.close();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				out4.close();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
