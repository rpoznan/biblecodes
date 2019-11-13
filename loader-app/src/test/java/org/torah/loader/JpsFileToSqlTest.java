package org.torah.loader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.torah.loader.jps.JpsHtmlParser;
import org.torah.loader.sql.SqlVerse;

public class JpsFileToSqlTest {
	
	SqlVerse sqlVerse = new SqlVerse();
	JpsHtmlParser parser = new JpsHtmlParser();
	
	@Test
	public void runJob() {
		new File("C:\\temp\\genesis.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0101.htm"), 1, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0102.htm"), 1, 2);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0103.htm"), 1, 3);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0104.htm"), 1, 4);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0105.htm"), 1, 5);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0106.htm"), 1, 6);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0107.htm"), 1, 7);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0108.htm"), 1, 8);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0109.htm"), 1, 9);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0110.htm"), 1, 10);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0111.htm"), 1, 11);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0112.htm"), 1, 12);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0113.htm"), 1, 13);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0114.htm"), 1, 14);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0115.htm"), 1, 15);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0116.htm"), 1, 16);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0117.htm"), 1, 17);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0118.htm"), 1, 18);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0119.htm"), 1, 19);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0120.htm"), 1, 20);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0121.htm"), 1, 21);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0122.htm"), 1, 22);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0123.htm"), 1, 23);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0124.htm"), 1, 24);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0125.htm"), 1, 25);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0126.htm"), 1, 26);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0127.htm"), 1, 27);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0128.htm"), 1, 28);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0129.htm"), 1, 29);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0130.htm"), 1, 30);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0131.htm"), 1, 31);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0132.htm"), 1, 32);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0133.htm"), 1, 33);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0134.htm"), 1, 34);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0135.htm"), 1, 35);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0136.htm"), 1, 36);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0137.htm"), 1, 37);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0138.htm"), 1, 38);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0139.htm"), 1, 39);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0140.htm"), 1, 40);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0141.htm"), 1, 41);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0142.htm"), 1, 42);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0143.htm"), 1, 43);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0144.htm"), 1, 44);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0145.htm"), 1, 45);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0146.htm"), 1, 46);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0147.htm"), 1, 47);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0148.htm"), 1, 48);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0149.htm"), 1, 49);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0150.htm"), 1, 50);
		sqlVerse.writeFile(new File("C:\\temp\\genesis.sql"), dataList);
	}
	
	@Test
	public void runJobExodus() {
		new File("C:\\temp\\exodus.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0201.htm"), 2, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0202.htm"), 2, 2);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0203.htm"), 2, 3);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0204.htm"), 2, 4);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0205.htm"), 2, 5);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0206.htm"), 2, 6);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0207.htm"), 2, 7);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0208.htm"), 2, 8);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0209.htm"), 2, 9);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0210.htm"), 2, 10);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0211.htm"), 2, 11);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0212.htm"), 2, 12);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0213.htm"), 2, 13);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0214.htm"), 2, 14);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0215.htm"), 2, 15);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0216.htm"), 2, 16);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0217.htm"), 2, 17);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0218.htm"), 2, 18);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0219.htm"), 2, 19);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0220.htm"), 2, 20);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0221.htm"), 2, 21);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0222.htm"), 2, 22);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0223.htm"), 2, 23);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0224.htm"), 2, 24);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0225.htm"), 2, 25);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0226.htm"), 2, 26);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0227.htm"), 2, 27);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0228.htm"), 2, 28);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0229.htm"), 2, 29);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0230.htm"), 2, 30);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0231.htm"), 2, 31);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0232.htm"), 2, 32);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0233.htm"), 2, 33);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0234.htm"), 2, 34);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0235.htm"), 2, 35);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0236.htm"), 2, 36);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0237.htm"), 2, 37);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0238.htm"), 2, 38);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0239.htm"), 2, 39);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0240.htm"), 2, 40);
		sqlVerse.writeFile(new File("C:\\temp\\exodus.sql"), dataList);
	}
	
	@Test
	public void runJobLev() {
		new File("C:\\temp\\leviticus.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0301.htm"), 3, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0302.htm"), 3, 2);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0303.htm"), 3, 3);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0304.htm"), 3, 4);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0305.htm"), 3, 5);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0306.htm"), 3, 6);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0307.htm"), 3, 7);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0308.htm"), 3, 8);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0309.htm"), 3, 9);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0310.htm"), 3, 10);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0311.htm"), 3, 11);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0312.htm"), 3, 12);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0313.htm"), 3, 13);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0314.htm"), 3, 14);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0315.htm"), 3, 15);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0316.htm"), 3, 16);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0317.htm"), 3, 17);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0318.htm"), 3, 18);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0319.htm"), 3, 19);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0320.htm"), 3, 20);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0321.htm"), 3, 21);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0322.htm"), 3, 22);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0323.htm"), 3, 23);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0324.htm"), 3, 24);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0325.htm"), 3, 25);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0326.htm"), 3, 26);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0327.htm"), 3, 27);
		sqlVerse.writeFile(new File("C:\\temp\\leviticus.sql"), dataList);
	}
	
	@Test
	public void runJobNumbers() {
		new File("C:\\temp\\numbers.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0401.htm"), 4, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0402.htm"), 4, 2);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0403.htm"), 4, 3);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0404.htm"), 4, 4);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0405.htm"), 4, 5);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0406.htm"), 4, 6);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0407.htm"), 4, 7);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0408.htm"), 4, 8);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0409.htm"), 4, 9);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0410.htm"), 4, 10);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0411.htm"), 4, 11);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0412.htm"), 4, 12);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0413.htm"), 4, 13);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0414.htm"), 4, 14);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0415.htm"), 4, 15);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0416.htm"), 4, 16);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0417.htm"), 4, 17);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0418.htm"), 4, 18);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0419.htm"), 4, 19);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0420.htm"), 4, 20);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0421.htm"), 4, 21);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0422.htm"), 4, 22);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0423.htm"), 4, 23);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0424.htm"), 4, 24);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0425.htm"), 4, 25);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0426.htm"), 4, 26);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0427.htm"), 4, 27);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0428.htm"), 4, 28);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0429.htm"), 4, 29);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0430.htm"), 4, 30);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0431.htm"), 4, 31);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0432.htm"), 4, 32);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0433.htm"), 4, 33);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0434.htm"), 4, 34);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0435.htm"), 4, 35);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0436.htm"), 4, 36);
		sqlVerse.writeFile(new File("C:\\temp\\numbers.sql"), dataList);
	}
	
	@Test
	public void runJobDeut() {
		new File("C:\\temp\\deut.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0501.htm"), 5, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0502.htm"), 5, 2);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0503.htm"), 5, 3);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0504.htm"), 5, 4);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0505.htm"), 5, 5);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0506.htm"), 5, 6);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0507.htm"), 5, 7);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0508.htm"), 5, 8);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0509.htm"), 5, 9);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0510.htm"), 5, 10);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0511.htm"), 5, 11);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0512.htm"), 5, 12);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0513.htm"), 5, 13);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0514.htm"), 5, 14);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0515.htm"), 5, 15);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0516.htm"), 5, 16);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0517.htm"), 5, 17);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0518.htm"), 5, 18);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0519.htm"), 5, 19);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0520.htm"), 5, 20);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0521.htm"), 5, 21);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0522.htm"), 5, 22);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0523.htm"), 5, 23);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0524.htm"), 5, 24);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0525.htm"), 5, 25);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0526.htm"), 5, 26);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0527.htm"), 5, 27);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0528.htm"), 5, 28);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0529.htm"), 5, 29);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0530.htm"), 5, 30);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0531.htm"), 5, 31);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0532.htm"), 5, 32);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0533.htm"), 5, 33);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0534.htm"), 5, 34);
		sqlVerse.writeFile(new File("C:\\temp\\deut.sql"), dataList);
	}
	
	@Test
	public void runJobJoshua() {
		new File("C:\\temp\\joshua.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0601.htm"), 6, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0602.htm"), 6, 2);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0603.htm"), 6, 3);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0604.htm"), 6, 4);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0605.htm"), 6, 5);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0606.htm"), 6, 6);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0607.htm"), 6, 7);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0608.htm"), 6, 8);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0609.htm"), 6, 9);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0610.htm"), 6, 10);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0611.htm"), 6, 11);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0612.htm"), 6, 12);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0613.htm"), 6, 13);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0614.htm"), 6, 14);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0615.htm"), 6, 15);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0616.htm"), 6, 16);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0617.htm"), 6, 17);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0618.htm"), 6, 18);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0619.htm"), 6, 19);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0620.htm"), 6, 20);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0621.htm"), 6, 21);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0622.htm"), 6, 22);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0623.htm"), 6, 23);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0624.htm"), 6, 24);
		sqlVerse.writeFile(new File("C:\\temp\\joshua.sql"), dataList);
	}

	@Test
	public void runJobJudges() {
		new File("C:\\temp\\judges.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0701.htm"), 7, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0702.htm"), 7, 2);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0703.htm"), 7, 3);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0704.htm"), 7, 4);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0705.htm"), 7, 5);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0706.htm"), 7, 6);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0707.htm"), 7, 7);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0708.htm"), 7, 8);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0709.htm"), 7, 9);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0710.htm"), 7, 10);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0711.htm"), 7, 11);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0712.htm"), 7, 12);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0713.htm"), 7, 13);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0714.htm"), 7, 14);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0715.htm"), 7, 15);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0716.htm"), 7, 16);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0717.htm"), 7, 17);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0718.htm"), 7, 18);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0719.htm"), 7, 19);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0720.htm"), 7, 20);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0721.htm"), 7, 21);
		sqlVerse.writeFile(new File("C:\\temp\\judges.sql"), dataList);
	}
	
	@Test
	public void runJob1Sam() {
		new File("C:\\temp\\1samuel.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a01.htm"), 8, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a02.htm"), 8, 2);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a03.htm"), 8, 3);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a04.htm"), 8, 4);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a05.htm"), 8, 5);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a06.htm"), 8, 6);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a07.htm"), 8, 7);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a08.htm"), 8, 8);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a09.htm"), 8, 9);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a10.htm"), 8, 10);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a11.htm"), 8, 11);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a12.htm"), 8, 12);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a13.htm"), 8, 13);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a14.htm"), 8, 14);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a15.htm"), 8, 15);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a16.htm"), 8, 16);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a17.htm"), 8, 17);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a18.htm"), 8, 18);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a19.htm"), 8, 19);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a20.htm"), 8, 20);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a21.htm"), 8, 21);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a22.htm"), 8, 22);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a23.htm"), 8, 23);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a24.htm"), 8, 24);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a25.htm"), 8, 25);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a26.htm"), 8, 26);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a27.htm"), 8, 27);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a28.htm"), 8, 28);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a29.htm"), 8, 29);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a30.htm"), 8, 30);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08a31.htm"), 8, 31);
		sqlVerse.writeFile(new File("C:\\temp\\1samuel.sql"), dataList);
	}
	
	@Test
	public void runJob2Sam() {
		new File("C:\\temp\\2samuel.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b01.htm"), 9, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b02.htm"), 9, 2);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b03.htm"), 9, 3);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b04.htm"), 9, 4);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b05.htm"), 9, 5);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b06.htm"), 9, 6);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b07.htm"), 9, 7);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b08.htm"), 9, 8);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b09.htm"), 9, 9);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b10.htm"), 9, 10);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b11.htm"), 9, 11);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b12.htm"), 9, 12);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b13.htm"), 9, 13);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b14.htm"), 9, 14);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b15.htm"), 9, 15);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b16.htm"), 9, 16);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b17.htm"), 9, 17);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b18.htm"), 9, 18);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b19.htm"), 9, 19);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b20.htm"), 9, 20);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b21.htm"), 9, 21);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b22.htm"), 9, 22);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b23.htm"), 9, 23);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt08b24.htm"), 9, 24);
		sqlVerse.writeFile(new File("C:\\temp\\2samuel.sql"), dataList);
	}
	


	@Test
		public void runJob1Kings() {
			new File("C:\\temp\\1kings.sql").delete();
			List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a01.htm"), 10, 1);
			//sqlVerse.print(chap1);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a02.htm"), 10, 2);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a03.htm"), 10, 3);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a04.htm"), 10, 4);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a05.htm"), 10, 5);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a06.htm"), 10, 6);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a07.htm"), 10, 7);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a08.htm"), 10, 8);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a09.htm"), 10, 9);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a10.htm"), 10, 10);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a11.htm"), 10, 11);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a12.htm"), 10, 12);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a13.htm"), 10, 13);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a14.htm"), 10, 14);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a15.htm"), 10, 15);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a16.htm"), 10, 16);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a17.htm"), 10, 17);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a18.htm"), 10, 18);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a19.htm"), 10, 19);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a20.htm"), 10, 20);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a21.htm"), 10, 21);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09a22.htm"), 10, 22);
			sqlVerse.writeFile(new File("C:\\temp\\1kings.sql"), dataList);
		}
	
	@Test
	public void runJob2kings() {
		new File("C:\\temp\\2kings.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b01.htm"), 11, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b02.htm"), 11, 2);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b03.htm"), 11, 3);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b04.htm"), 11, 4);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b05.htm"), 11, 5);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b06.htm"), 11, 6);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b07.htm"), 11, 7);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b08.htm"), 11, 8);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b09.htm"), 11, 9);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b10.htm"), 11, 10);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b11.htm"), 11, 11);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b12.htm"), 11, 12);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b13.htm"), 11, 13);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b14.htm"), 11, 14);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b15.htm"), 11, 15);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b16.htm"), 11, 16);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b17.htm"), 11, 17);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b18.htm"), 11, 18);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b19.htm"), 11, 19);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b20.htm"), 11, 20);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b21.htm"), 11, 21);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b22.htm"), 11, 22);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b23.htm"), 11, 23);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b24.htm"), 11, 24);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt09b25.htm"), 11, 25);
		sqlVerse.writeFile(new File("C:\\temp\\2kings.sql"), dataList);
	}
	
	@Test
	public void runJobIsaiah() {
		new File("C:\\temp\\isaiah.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1001.htm"), 12, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1002.htm"), 12, 2);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1003.htm"), 12, 3);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1004.htm"), 12, 4);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1005.htm"), 12, 5);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1006.htm"), 12, 6);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1007.htm"), 12, 7);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1008.htm"), 12, 8);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1009.htm"), 12, 9);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1010.htm"), 12, 10);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1011.htm"), 12, 11);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1012.htm"), 12, 12);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1013.htm"), 12, 13);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1014.htm"), 12, 14);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1015.htm"), 12, 15);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1016.htm"), 12, 16);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1017.htm"), 12, 17);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1018.htm"), 12, 18);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1019.htm"), 12, 19);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1020.htm"), 12, 20);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1021.htm"), 12, 21);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1022.htm"), 12, 22);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1023.htm"), 12, 23);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1024.htm"), 12, 24);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1025.htm"), 12, 25);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1026.htm"), 12, 26);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1027.htm"), 12, 27);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1028.htm"), 12, 28);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1029.htm"), 12, 29);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1030.htm"), 12, 30);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1031.htm"), 12, 31);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1032.htm"), 12, 32);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1033.htm"), 12, 33);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1034.htm"), 12, 34);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1035.htm"), 12, 35);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1036.htm"), 12, 36);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1037.htm"), 12, 37);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1038.htm"), 12, 38);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1039.htm"), 12, 39);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1040.htm"), 12, 40);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1041.htm"), 12, 41);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1042.htm"), 12, 42);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1043.htm"), 12, 43);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1044.htm"), 12, 44);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1045.htm"), 12, 45);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1046.htm"), 12, 46);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1047.htm"), 12, 47);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1048.htm"), 12, 48);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1049.htm"), 12, 49);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1050.htm"), 12, 50);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1051.htm"), 12, 51);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1052.htm"), 12, 52);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1053.htm"), 12, 53);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1054.htm"), 12, 54);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1055.htm"), 12, 55);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1056.htm"), 12, 56);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1057.htm"), 12, 57);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1058.htm"), 12, 58);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1059.htm"), 12, 59);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1060.htm"), 12, 60);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1061.htm"), 12, 61);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1062.htm"), 12, 62);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1063.htm"), 12, 63);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1064.htm"), 12, 64);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1065.htm"), 12, 65);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1066.htm"), 12, 66);
		sqlVerse.writeFile(new File("C:\\temp\\isaiah.sql"), dataList);
	}
	
	@Test
	public void runJobJerimiah() {
		new File("C:\\temp\\jerimiah.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1101.htm"), 13, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1102.htm"), 13, 2);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1103.htm"), 13, 3);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1104.htm"), 13, 4);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1105.htm"), 13, 5);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1106.htm"), 13, 6);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1107.htm"), 13, 7);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1108.htm"), 13, 8);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1109.htm"), 13, 9);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1110.htm"), 13, 10);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1111.htm"), 13, 11);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1112.htm"), 13, 12);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1113.htm"), 13, 13);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1114.htm"), 13, 14);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1115.htm"), 13, 15);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1116.htm"), 13, 16);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1117.htm"), 13, 17);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1118.htm"), 13, 18);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1119.htm"), 13, 19);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1120.htm"), 13, 20);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1121.htm"), 13, 21);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1122.htm"), 13, 22);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1123.htm"), 13, 23);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1124.htm"), 13, 24);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1125.htm"), 13, 25);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1126.htm"), 13, 26);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1127.htm"), 13, 27);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1128.htm"), 13, 28);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1129.htm"), 13, 29);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1130.htm"), 13, 30);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1131.htm"), 13, 31);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1132.htm"), 13, 32);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1133.htm"), 13, 33);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1134.htm"), 13, 34);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1135.htm"), 13, 35);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1136.htm"), 13, 36);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1137.htm"), 13, 37);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1138.htm"), 13, 38);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1139.htm"), 13, 39);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1140.htm"), 13, 40);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1141.htm"), 13, 41);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1142.htm"), 13, 42);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1143.htm"), 13, 43);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1144.htm"), 13, 44);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1145.htm"), 13, 45);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1146.htm"), 13, 46);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1147.htm"), 13, 47);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1148.htm"), 13, 48);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1149.htm"), 13, 49);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1150.htm"), 13, 50);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1151.htm"), 13, 51);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1152.htm"), 13, 52);
		sqlVerse.writeFile(new File("C:\\temp\\jerimiah.sql"), dataList);
	}
	
	@Test
	public void runJobEzekiel() {
		new File("C:\\temp\\ezekiel.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1201.htm"), 14, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1202.htm"), 14, 2);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1203.htm"), 14, 3);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1204.htm"), 14, 4);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1205.htm"), 14, 5);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1206.htm"), 14, 6);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1207.htm"), 14, 7);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1208.htm"), 14, 8);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1209.htm"), 14, 9);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1210.htm"), 14, 10);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1211.htm"), 14, 11);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1212.htm"), 14, 12);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1213.htm"), 14, 13);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1214.htm"), 14, 14);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1215.htm"), 14, 15);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1216.htm"), 14, 16);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1217.htm"), 14, 17);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1218.htm"), 14, 18);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1219.htm"), 14, 19);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1220.htm"), 14, 20);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1221.htm"), 14, 21);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1222.htm"), 14, 22);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1223.htm"), 14, 23);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1224.htm"), 14, 24);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1225.htm"), 14, 25);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1226.htm"), 14, 26);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1227.htm"), 14, 27);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1228.htm"), 14, 28);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1229.htm"), 14, 29);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1230.htm"), 14, 30);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1231.htm"), 14, 31);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1232.htm"), 14, 32);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1233.htm"), 14, 33);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1234.htm"), 14, 34);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1235.htm"), 14, 35);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1236.htm"), 14, 36);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1237.htm"), 14, 37);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1238.htm"), 14, 38);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1239.htm"), 14, 39);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1240.htm"), 14, 40);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1241.htm"), 14, 41);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1242.htm"), 14, 42);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1243.htm"), 14, 43);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1244.htm"), 14, 44);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1245.htm"), 14, 45);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1246.htm"), 14, 46);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1247.htm"), 14, 47);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1248.htm"), 14, 48);
		sqlVerse.writeFile(new File("C:\\temp\\ezekiel.sql"), dataList);
	}
	
	@Test
	public void runJobHosea() {
		new File("C:\\temp\\hosea.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1301.htm"), 15, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\hosea.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1302.htm"), 15, 2);
		sqlVerse.writeFile(new File("C:\\temp\\hosea.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1303.htm"), 15, 3);
		sqlVerse.writeFile(new File("C:\\temp\\hosea.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1304.htm"), 15, 4);
		sqlVerse.writeFile(new File("C:\\temp\\hosea.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1305.htm"), 15, 5);
		sqlVerse.writeFile(new File("C:\\temp\\hosea.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1306.htm"), 15, 6);
		sqlVerse.writeFile(new File("C:\\temp\\hosea.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1307.htm"), 15, 7);
		sqlVerse.writeFile(new File("C:\\temp\\hosea.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1308.htm"), 15, 8);
		sqlVerse.writeFile(new File("C:\\temp\\hosea.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1309.htm"), 15, 9);
		sqlVerse.writeFile(new File("C:\\temp\\hosea.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1310.htm"), 15, 10);
		sqlVerse.writeFile(new File("C:\\temp\\hosea.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1311.htm"), 15, 11);
		sqlVerse.writeFile(new File("C:\\temp\\hosea.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1312.htm"), 15, 12);
		sqlVerse.writeFile(new File("C:\\temp\\hosea.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1313.htm"), 15, 13);
		sqlVerse.writeFile(new File("C:\\temp\\hosea.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1314.htm"), 15, 14);
		sqlVerse.writeFile(new File("C:\\temp\\hosea.sql"), dataList);
	}
	
	@Test
	public void runJobJoel() {
		new File("C:\\temp\\joel.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1401.htm"), 16, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\joel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1402.htm"), 16, 2);
		sqlVerse.writeFile(new File("C:\\temp\\joel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1403.htm"), 16, 3);
		sqlVerse.writeFile(new File("C:\\temp\\joel.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1404.htm"), 16, 4);
		sqlVerse.writeFile(new File("C:\\temp\\joel.sql"), dataList);
	}
	
	@Test
	public void runJobAmos() {
		new File("C:\\temp\\amos.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1501.htm"), 17, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\amos.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1502.htm"), 17, 2);
		sqlVerse.writeFile(new File("C:\\temp\\amos.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1503.htm"), 17, 3);
		sqlVerse.writeFile(new File("C:\\temp\\amos.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1504.htm"), 17, 4);
		sqlVerse.writeFile(new File("C:\\temp\\amos.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1505.htm"), 17, 5);
		sqlVerse.writeFile(new File("C:\\temp\\amos.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1506.htm"), 17, 6);
		sqlVerse.writeFile(new File("C:\\temp\\amos.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1507.htm"), 17, 7);
		sqlVerse.writeFile(new File("C:\\temp\\amos.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1508.htm"), 17, 8);
		sqlVerse.writeFile(new File("C:\\temp\\amos.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1509.htm"), 17, 9);
		sqlVerse.writeFile(new File("C:\\temp\\amos.sql"), dataList);
	}
	
	@Test
	public void runJobObadiah() {
		new File("C:\\temp\\Obadiah.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1601.htm"), 18, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\Obadiah.sql"), dataList);
	}
	
	@Test
	public void runJobJonah() {
		new File("C:\\temp\\Jonah.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1701.htm"), 19, 1);
		sqlVerse.writeFile(new File("C:\\temp\\Jonah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1702.htm"), 19, 2);
		sqlVerse.writeFile(new File("C:\\temp\\Jonah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1703.htm"), 19, 3);
		sqlVerse.writeFile(new File("C:\\temp\\Jonah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1704.htm"), 19, 4);
		sqlVerse.writeFile(new File("C:\\temp\\Jonah.sql"), dataList);
	}
	
	@Test
	public void runJobMicah() {
		new File("C:\\temp\\Micah.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1801.htm"), 20, 1);
		sqlVerse.writeFile(new File("C:\\temp\\Micah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1802.htm"), 20, 2);
		sqlVerse.writeFile(new File("C:\\temp\\Micah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1803.htm"), 20, 3);
		sqlVerse.writeFile(new File("C:\\temp\\Micah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1804.htm"), 20, 4);
		sqlVerse.writeFile(new File("C:\\temp\\Micah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1805.htm"), 20, 5);
		sqlVerse.writeFile(new File("C:\\temp\\Micah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1806.htm"), 20, 6);
		sqlVerse.writeFile(new File("C:\\temp\\Micah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1807.htm"), 20, 7);
		sqlVerse.writeFile(new File("C:\\temp\\Micah.sql"), dataList);
	}
	
	@Test
	public void runJobNahum() {
		new File("C:\\temp\\Nahum.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1901.htm"), 21, 1);
		sqlVerse.writeFile(new File("C:\\temp\\Nahum.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1902.htm"), 21, 2);
		sqlVerse.writeFile(new File("C:\\temp\\Nahum.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt1903.htm"), 21, 3);
		sqlVerse.writeFile(new File("C:\\temp\\Nahum.sql"), dataList);
	}
	
	@Test
	public void runJobHabakkuk() {
		new File("C:\\temp\\Habakkuk.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2001.htm"), 22, 1);
		sqlVerse.writeFile(new File("C:\\temp\\Habakkuk.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2002.htm"), 22, 2);
		sqlVerse.writeFile(new File("C:\\temp\\Habakkuk.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2003.htm"), 22, 3);
		sqlVerse.writeFile(new File("C:\\temp\\Habakkuk.sql"), dataList);
	}
	
	@Test
	public void runJobZephaniah() {
		new File("C:\\temp\\Zephaniah.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2101.htm"), 23, 1);
		sqlVerse.writeFile(new File("C:\\temp\\Zephaniah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2102.htm"), 23, 2);
		sqlVerse.writeFile(new File("C:\\temp\\Zephaniah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2103.htm"), 23, 3);
		sqlVerse.writeFile(new File("C:\\temp\\Zephaniah.sql"), dataList);
	}
	
	@Test
	public void runJobHaggai() {
		new File("C:\\temp\\Haggai.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2201.htm"), 24, 1);
		sqlVerse.writeFile(new File("C:\\temp\\Haggai.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2202.htm"), 24, 2);
		sqlVerse.writeFile(new File("C:\\temp\\Haggai.sql"), dataList);
	}
	

	
@Test
	public void runJobZechariah() {
		new File("C:\\temp\\Zechariah.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2301.htm"), 25, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\Zechariah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2302.htm"), 25, 2);
		sqlVerse.writeFile(new File("C:\\temp\\Zechariah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2303.htm"), 25, 3);
		sqlVerse.writeFile(new File("C:\\temp\\Zechariah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2304.htm"), 25, 4);
		sqlVerse.writeFile(new File("C:\\temp\\Zechariah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2305.htm"), 25, 5);
		sqlVerse.writeFile(new File("C:\\temp\\Zechariah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2306.htm"), 25, 6);
		sqlVerse.writeFile(new File("C:\\temp\\Zechariah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2307.htm"), 25, 7);
		sqlVerse.writeFile(new File("C:\\temp\\Zechariah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2308.htm"), 25, 8);
		sqlVerse.writeFile(new File("C:\\temp\\Zechariah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2309.htm"), 25, 9);
		sqlVerse.writeFile(new File("C:\\temp\\Zechariah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2310.htm"), 25, 10);
		sqlVerse.writeFile(new File("C:\\temp\\Zechariah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2311.htm"), 25, 11);
		sqlVerse.writeFile(new File("C:\\temp\\Zechariah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2312.htm"), 25, 12);
		sqlVerse.writeFile(new File("C:\\temp\\Zechariah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2313.htm"), 25, 13);
		sqlVerse.writeFile(new File("C:\\temp\\Zechariah.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2314.htm"), 25, 14);
		sqlVerse.writeFile(new File("C:\\temp\\Zechariah.sql"), dataList);
	}



@Test
	public void runJobMalachi() {
		new File("C:\\temp\\Malachi.sql").delete();
		List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2401.htm"), 26, 1);
		//sqlVerse.print(chap1);
		sqlVerse.writeFile(new File("C:\\temp\\Malachi.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2402.htm"), 26, 2);
		sqlVerse.writeFile(new File("C:\\temp\\Malachi.sql"), dataList);
		dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2403.htm"), 26, 3);
		sqlVerse.writeFile(new File("C:\\temp\\Malachi.sql"), dataList);
	}


@Test
public void runJobPsalms() {
	new File("C:\\temp\\Psalms.sql").delete();
	List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2601.htm"), 27, 1);
	//sqlVerse.print(chap1);
	sqlVerse.writeFile(new File("C:\\temp\\Psalms.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2602.htm"), 27, 2);
	sqlVerse.writeFile(new File("C:\\temp\\Psalms.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2603.htm"), 27, 3);
	sqlVerse.writeFile(new File("C:\\temp\\Psalms.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2604.htm"), 27, 4);
	sqlVerse.writeFile(new File("C:\\temp\\Psalms.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2605.htm"), 27, 5);
	sqlVerse.writeFile(new File("C:\\temp\\Psalms.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2606.htm"), 27, 6);
	sqlVerse.writeFile(new File("C:\\temp\\Psalms.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2607.htm"), 27, 7);
	sqlVerse.writeFile(new File("C:\\temp\\Psalms.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2608.htm"), 27, 8);
	sqlVerse.writeFile(new File("C:\\temp\\Psalms.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2609.htm"), 27, 9);
	sqlVerse.writeFile(new File("C:\\temp\\Psalms.sql"), dataList);
	for (int i=10; i <= 150; i++) {
		if(i >= 100 && i < 110) {
			int x = i -100;
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt26a"+x+".htm"), 27, i);
			sqlVerse.writeFile(new File("C:\\temp\\Psalms.sql"), dataList);
		}
		else if(i >= 110 && i < 120) {
			int x = i -110;
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt26b"+x+".htm"), 27, i);
			sqlVerse.writeFile(new File("C:\\temp\\Psalms.sql"), dataList);
		}
		else if(i >= 120 && i < 130) {
			int x = i -120;
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt26c"+x+".htm"), 27, i);
			sqlVerse.writeFile(new File("C:\\temp\\Psalms.sql"), dataList);
		}
		else if(i >= 130 && i < 140) {
			int x = i -130;
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt26d"+x+".htm"), 27, i);
			sqlVerse.writeFile(new File("C:\\temp\\Psalms.sql"), dataList);
		}
		else if(i >= 140 && i < 150) {
			int x = i -140;
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt26e"+x+".htm"), 27, i);
			sqlVerse.writeFile(new File("C:\\temp\\Psalms.sql"), dataList);
		}
		else if(i == 150) {
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt26f0.htm"), 27, i);
			sqlVerse.writeFile(new File("C:\\temp\\Psalms.sql"), dataList);
		}
		else {
		
			dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt26"+i+".htm"), 27, i);
			sqlVerse.writeFile(new File("C:\\temp\\Psalms.sql"), dataList);
		}
	
	}
	
}

@Test
public void runJobProverbs() {
	new File("C:\\temp\\proverbs.sql").delete();
	List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2801.htm"), 28, 1);
	//sqlVerse.print(chap1);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2802.htm"), 28, 2);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2803.htm"), 28, 3);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2804.htm"), 28, 4);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2805.htm"), 28, 5);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2806.htm"), 28, 6);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2807.htm"), 28, 7);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2808.htm"), 28, 8);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2809.htm"), 28, 9);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2810.htm"), 28, 10);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2811.htm"), 28, 11);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2812.htm"), 28, 12);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2813.htm"), 28, 13);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2814.htm"), 28, 14);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2815.htm"), 28, 15);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2816.htm"), 28, 16);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2817.htm"), 28, 17);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2818.htm"), 28, 18);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2819.htm"), 28, 19);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2820.htm"), 28, 20);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2821.htm"), 28, 21);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2822.htm"), 28, 22);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2823.htm"), 28, 23);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2824.htm"), 28, 24);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2825.htm"), 28, 25);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2826.htm"), 28, 26);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2827.htm"), 28, 27);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2828.htm"), 28, 28);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2829.htm"), 28, 29);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2830.htm"), 28, 30);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2831.htm"), 28, 31);
	sqlVerse.writeFile(new File("C:\\temp\\proverbs.sql"), dataList);
}

@Test
public void runJobJob() {
	new File("C:\\temp\\job.sql").delete();
	List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2701.htm"), 29, 1);
	//sqlVerse.print(chap1);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2702.htm"), 29, 2);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2703.htm"), 29, 3);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2704.htm"), 29, 4);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2705.htm"), 29, 5);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2706.htm"), 29, 6);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2707.htm"), 29, 7);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2708.htm"), 29, 8);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2709.htm"), 29, 9);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2710.htm"), 29, 10);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2711.htm"), 29, 11);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2712.htm"), 29, 12);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2713.htm"), 29, 13);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2714.htm"), 29, 14);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2715.htm"), 29, 15);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2716.htm"), 29, 16);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2717.htm"), 29, 17);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2718.htm"), 29, 18);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2719.htm"), 29, 19);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2720.htm"), 29, 20);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2721.htm"), 29, 21);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2722.htm"), 29, 22);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2723.htm"), 29, 23);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2724.htm"), 29, 24);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2725.htm"), 29, 25);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2726.htm"), 29, 26);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2727.htm"), 29, 27);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2728.htm"), 29, 28);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2729.htm"), 29, 29);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2730.htm"), 29, 30);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2731.htm"), 29, 31);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2732.htm"), 29, 32);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2733.htm"), 29, 33);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2734.htm"), 29, 34);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2735.htm"), 29, 35);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2736.htm"), 29, 36);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2737.htm"), 29, 37);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2738.htm"), 29, 38);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2739.htm"), 29, 39);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2740.htm"), 29, 40);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2741.htm"), 29, 41);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2742.htm"), 29, 42);
	sqlVerse.writeFile(new File("C:\\temp\\job.sql"), dataList);
}

@Test
public void runJobSongs() {
	new File("C:\\temp\\songs.sql").delete();
	List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3001.htm"), 30, 1);
	//sqlVerse.print(chap1);
	sqlVerse.writeFile(new File("C:\\temp\\songs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3002.htm"), 30, 2);
	sqlVerse.writeFile(new File("C:\\temp\\songs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3003.htm"), 30, 3);
	sqlVerse.writeFile(new File("C:\\temp\\songs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3004.htm"), 30, 4);
	sqlVerse.writeFile(new File("C:\\temp\\songs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3005.htm"), 30, 5);
	sqlVerse.writeFile(new File("C:\\temp\\songs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3006.htm"), 30, 6);
	sqlVerse.writeFile(new File("C:\\temp\\songs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3007.htm"), 30, 7);
	sqlVerse.writeFile(new File("C:\\temp\\songs.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3008.htm"), 30, 8);
	sqlVerse.writeFile(new File("C:\\temp\\songs.sql"), dataList);
}

@Test
public void runJobRuth() {
	new File("C:\\temp\\Ruth.sql").delete();
	List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2901.htm"), 31, 1);
	//sqlVerse.print(chap1);
	sqlVerse.writeFile(new File("C:\\temp\\Ruth.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2902.htm"), 31, 2);
	sqlVerse.writeFile(new File("C:\\temp\\Ruth.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2903.htm"), 31, 3);
	sqlVerse.writeFile(new File("C:\\temp\\Ruth.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt2904.htm"), 31, 4);
	sqlVerse.writeFile(new File("C:\\temp\\Ruth.sql"), dataList);
}

@Test
public void runJobLamentations() {
	new File("C:\\temp\\Lamentations.sql").delete();
	List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3201.htm"), 32, 1);
	//sqlVerse.print(chap1);
	sqlVerse.writeFile(new File("C:\\temp\\Lamentations.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3202.htm"), 32, 2);
	sqlVerse.writeFile(new File("C:\\temp\\Lamentations.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3203.htm"), 32, 3);
	sqlVerse.writeFile(new File("C:\\temp\\Lamentations.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3204.htm"), 32, 4);
	sqlVerse.writeFile(new File("C:\\temp\\Lamentations.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3204.htm"), 32, 4);
	sqlVerse.writeFile(new File("C:\\temp\\Lamentations.sql"), dataList);
}

@Test
public void runJobEcclesiastes() {
	new File("C:\\temp\\Ecclesiastes.sql").delete();
	List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3101.htm"), 33, 1);
	//sqlVerse.print(chap1);
	sqlVerse.writeFile(new File("C:\\temp\\Ecclesiastes.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3102.htm"), 33, 2);
	sqlVerse.writeFile(new File("C:\\temp\\Ecclesiastes.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3103.htm"), 33, 3);
	sqlVerse.writeFile(new File("C:\\temp\\Ecclesiastes.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3104.htm"), 33, 4);
	sqlVerse.writeFile(new File("C:\\temp\\Ecclesiastes.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3105.htm"), 33, 5);
	sqlVerse.writeFile(new File("C:\\temp\\Ecclesiastes.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3106.htm"), 33, 6);
	sqlVerse.writeFile(new File("C:\\temp\\Ecclesiastes.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3107.htm"), 33, 7);
	sqlVerse.writeFile(new File("C:\\temp\\Ecclesiastes.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3108.htm"), 33, 8);
	sqlVerse.writeFile(new File("C:\\temp\\Ecclesiastes.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3109.htm"), 33, 9);
	sqlVerse.writeFile(new File("C:\\temp\\Ecclesiastes.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3110.htm"), 33, 10);
	sqlVerse.writeFile(new File("C:\\temp\\Ecclesiastes.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3111.htm"), 33, 11);
	sqlVerse.writeFile(new File("C:\\temp\\Ecclesiastes.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3112.htm"), 33, 12);
	sqlVerse.writeFile(new File("C:\\temp\\Ecclesiastes.sql"), dataList);
}

@Test
public void runJobDaniel() {
	new File("C:\\temp\\Daniel.sql").delete();
	List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3401.htm"), 35, 1);
	//sqlVerse.print(chap1);
	sqlVerse.writeFile(new File("C:\\temp\\Daniel.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3402.htm"), 35, 2);
	sqlVerse.writeFile(new File("C:\\temp\\Daniel.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3403.htm"), 35, 3);
	sqlVerse.writeFile(new File("C:\\temp\\Daniel.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3404.htm"), 35, 4);
	sqlVerse.writeFile(new File("C:\\temp\\Daniel.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3405.htm"), 35, 5);
	sqlVerse.writeFile(new File("C:\\temp\\Daniel.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3406.htm"), 35, 6);
	sqlVerse.writeFile(new File("C:\\temp\\Daniel.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3407.htm"), 35, 7);
	sqlVerse.writeFile(new File("C:\\temp\\Daniel.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3408.htm"), 35, 8);
	sqlVerse.writeFile(new File("C:\\temp\\Daniel.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3409.htm"), 35, 9);
	sqlVerse.writeFile(new File("C:\\temp\\Daniel.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3410.htm"), 35, 10);
	sqlVerse.writeFile(new File("C:\\temp\\Daniel.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3411.htm"), 35, 11);
	sqlVerse.writeFile(new File("C:\\temp\\Daniel.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3412.htm"), 35, 12);
	sqlVerse.writeFile(new File("C:\\temp\\Daniel.sql"), dataList);
}

@Test
public void runJobEsther() {
	new File("C:\\temp\\Esther.sql").delete();
	List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3301.htm"), 34, 1);
	//sqlVerse.print(chap1);
	sqlVerse.writeFile(new File("C:\\temp\\Esther.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3302.htm"), 34, 2);
	sqlVerse.writeFile(new File("C:\\temp\\Esther.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3303.htm"), 34, 3);
	sqlVerse.writeFile(new File("C:\\temp\\Esther.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3304.htm"), 34, 4);
	sqlVerse.writeFile(new File("C:\\temp\\Esther.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3305.htm"), 34, 5);
	sqlVerse.writeFile(new File("C:\\temp\\Esther.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3306.htm"), 34, 6);
	sqlVerse.writeFile(new File("C:\\temp\\Esther.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3307.htm"), 34, 7);
	sqlVerse.writeFile(new File("C:\\temp\\Esther.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3308.htm"), 34, 8);
	sqlVerse.writeFile(new File("C:\\temp\\Esther.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3309.htm"), 34, 9);
	sqlVerse.writeFile(new File("C:\\temp\\Esther.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt3310.htm"), 34, 10);
	sqlVerse.writeFile(new File("C:\\temp\\Esther.sql"), dataList);
}

@Test
public void runJobEzra() {
	new File("C:\\temp\\Ezra.sql").delete();
	List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35a01.htm"), 36, 1);
	//sqlVerse.print(chap1);
	sqlVerse.writeFile(new File("C:\\temp\\Ezra.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35a02.htm"), 36, 2);
	sqlVerse.writeFile(new File("C:\\temp\\Ezra.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35a03.htm"), 36, 3);
	sqlVerse.writeFile(new File("C:\\temp\\Ezra.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35a04.htm"), 36, 4);
	sqlVerse.writeFile(new File("C:\\temp\\Ezra.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35a05.htm"), 36, 5);
	sqlVerse.writeFile(new File("C:\\temp\\Ezra.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35a06.htm"), 36, 6);
	sqlVerse.writeFile(new File("C:\\temp\\Ezra.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35a07.htm"), 36, 7);
	sqlVerse.writeFile(new File("C:\\temp\\Ezra.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35a08.htm"), 36, 8);
	sqlVerse.writeFile(new File("C:\\temp\\Ezra.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35a09.htm"), 36, 9);
	sqlVerse.writeFile(new File("C:\\temp\\Ezra.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35a10.htm"), 36, 10);
	sqlVerse.writeFile(new File("C:\\temp\\Ezra.sql"), dataList);
}


@Test
public void runJobNehemiah() {
	new File("C:\\temp\\Nehemiah.sql").delete();
	List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35b01.htm"), 37, 1);
	//sqlVerse.print(chap1);
	sqlVerse.writeFile(new File("C:\\temp\\Nehemiah.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35b02.htm"), 37, 2);
	sqlVerse.writeFile(new File("C:\\temp\\Nehemiah.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35b03.htm"), 37, 3);
	sqlVerse.writeFile(new File("C:\\temp\\Nehemiah.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35b04.htm"), 37, 4);
	sqlVerse.writeFile(new File("C:\\temp\\Nehemiah.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35b05.htm"), 37, 5);
	sqlVerse.writeFile(new File("C:\\temp\\Nehemiah.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35b06.htm"), 37, 6);
	sqlVerse.writeFile(new File("C:\\temp\\Nehemiah.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35b07.htm"), 37, 7);
	sqlVerse.writeFile(new File("C:\\temp\\Nehemiah.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35b08.htm"), 37, 8);
	sqlVerse.writeFile(new File("C:\\temp\\Nehemiah.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35b09.htm"), 37, 9);
	sqlVerse.writeFile(new File("C:\\temp\\Nehemiah.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35b10.htm"), 37, 10);
	sqlVerse.writeFile(new File("C:\\temp\\Nehemiah.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35b11.htm"), 37, 11);
	sqlVerse.writeFile(new File("C:\\temp\\Nehemiah.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35b12.htm"), 37, 12);
	sqlVerse.writeFile(new File("C:\\temp\\Nehemiah.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt35b13.htm"), 37, 13);
	sqlVerse.writeFile(new File("C:\\temp\\Nehemiah.sql"), dataList);
}

@Test
public void runJob1Chronicles() {
	new File("C:\\temp\\1Chronicles.sql").delete();
	List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a01.htm"), 38, 1);
	//sqlVerse.print(chap1);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a02.htm"), 38, 2);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a03.htm"), 38, 3);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a04.htm"), 38, 4);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a05.htm"), 38, 5);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a06.htm"), 38, 6);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a07.htm"), 38, 7);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a08.htm"), 38, 8);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a09.htm"), 38, 9);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a10.htm"), 38, 10);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a11.htm"), 38, 11);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a12.htm"), 38, 12);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a13.htm"), 38, 13);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a14.htm"), 38, 14);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a15.htm"), 38, 15);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a16.htm"), 38, 16);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a17.htm"), 38, 17);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a18.htm"), 38, 18);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a19.htm"), 38, 19);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a20.htm"), 38, 20);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a21.htm"), 38, 21);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a22.htm"), 38, 22);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a23.htm"), 38, 23);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a24.htm"), 38, 24);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a25.htm"), 38, 25);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a26.htm"), 38, 26);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a27.htm"), 38, 27);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a28.htm"), 38, 28);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25a29.htm"), 38, 29);
	sqlVerse.writeFile(new File("C:\\temp\\1Chronicles.sql"), dataList);
}

@Test
public void runJob2Chronicles() {
	new File("C:\\temp\\2Chronicles.sql").delete();
	List<String[]> dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b01.htm"), 39, 1);
	//sqlVerse.print(chap1);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b02.htm"), 39, 2);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b03.htm"), 39, 3);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b04.htm"), 39, 4);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b05.htm"), 39, 5);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b06.htm"), 39, 6);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b07.htm"), 39, 7);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b08.htm"), 39, 8);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b09.htm"), 39, 9);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b10.htm"), 39, 10);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b11.htm"), 39, 11);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b12.htm"), 39, 12);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b13.htm"), 39, 13);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b14.htm"), 39, 14);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b15.htm"), 39, 15);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b16.htm"), 39, 16);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b17.htm"), 39, 17);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b18.htm"), 39, 18);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b19.htm"), 39, 19);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b20.htm"), 39, 20);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b21.htm"), 39, 21);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b22.htm"), 39, 22);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b23.htm"), 39, 23);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b24.htm"), 39, 24);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b25.htm"), 39, 25);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b26.htm"), 39, 26);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b27.htm"), 39, 27);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b28.htm"), 39, 28);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b29.htm"), 39, 29);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b30.htm"), 39, 30);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b31.htm"), 39, 31);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b32.htm"), 39, 32);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b33.htm"), 39, 33);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b34.htm"), 39, 34);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b35.htm"), 39, 35);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
	dataList = parser.parseJpsFile(new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt25b36.htm"), 39, 36);
	sqlVerse.writeFile(new File("C:\\temp\\2Chronicles.sql"), dataList);
}

@Test
public void makeFile() {
	//FilenameFilter x = new FilenameFilter(".sql");
	File temp = new File("C:\\temp");
	List<File> fileList = new ArrayList<File>();
	int cnt = 0;
	for(File file :temp.listFiles()) {
		if(file.canRead() && file.getName().endsWith(".sql") && file.getName().indexOf("Words") == -1 && file.getName().indexOf("Bible") == -1) {
			System.out.println(file.getAbsolutePath());
			fileList.add(file);
			cnt++;
		}
	}
	assertEquals(cnt,39);
	FileOutputStream out = null;
	try {
		out = new FileOutputStream("C:\\temp\\Bible.sql");
		for(File file : fileList) {
			FileInputStream in = new FileInputStream(file);
			IOUtils.copy(in,out);
			in.close();
		}
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
	}
	
}

}
