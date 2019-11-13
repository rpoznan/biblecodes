package org.torah.loader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.torah.loader.gem.GematriaCalc;
import org.torah.loader.tran.Transliterator;

public class LoadFileTest {
	
	@Test
	public void testString() {
		String x = "'בְּבֹאָם אֶל-אֹהֶל מוֹעֵד, וּבְקָרְבָתָם אֶל-הַמִּזְבֵּחַ--יִרְחָצוּ: כַּאֲשֶׁר צִוָּה יְהוָה, אֶת-מֹשֶׁה {ס}'";
				System.out.println(x.replaceAll("[סש]+\\}|\\{", ""));
		
	}
	
	@Test
	public void parseGenesis1() {
		
		File gen1 = new File("C:\\Users\\randy\\Downloads\\pt003\\pt\\pt0101.htm");

		Document html;
		try {
			
			
			html = Jsoup.parse(gen1,"UTF-8");
			String title = html.title();
	        String h1 = html.body().getElementsByTag("h1").text();
	        //<TABLE CELLPADDING="4" CELLSPACING="4" WIDTH="100%">
	        System.out.println(h1);
	        System.out.println(title);

	        Element table = html.select("table").get(1); //select the first table.
	        Elements rows = table.select("tr");
            List<String[]> verseList = new ArrayList<String[]>();
 	        for (int i = 0; i < rows.size(); i++) { //first row is the col names so skip it.
	            
 	        	
 	        	Element row = rows.get(i);
	            Elements cols = row.select("td");
	            String[] data = new String[9];
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
	            data[0] = "1";
	            data[1] = sb.toString().trim();
	            data[2] = cols.get(1).text();
	            data[3] = "1";
	            data[4] = cols.get(1).select("b").get(0).text();
	            data[5] = hebrewNum;
	            data[6] = "rpoznan";
	            data[7] = Transliterator.transliterate(data[1]);
	            data[8] = GematriaCalc.calculate(data[1])+"";
	            System.out.println(toSql(data));
	            
	            verseList.add(data);
	            
	            //	            System.out.println(sb.toString());
//	      
//	            System.out.println(cols.get(1).select("b").get(0).text());
//	            System.out.println(cols.get(1).text());
	            

	        }
 	       //System.out.println(verseList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String toSql(String[] data) {
		StringBuffer sb = new StringBuffer();
		sb.append("insert into nanzopco_torah.torah_verse (book_id,verse,eng_verse,num_chapter,num_verse,h_verse,created_by,tran_verse,num_value) values (");
		sb.append("'"+data[0]+"',");
		sb.append("'"+escapeChars(data[1])+"',");
		sb.append("'"+escapeChars(data[2])+"',");
		sb.append("'"+data[3]+"',");
		sb.append("'"+data[4]+"',");
		sb.append("'"+data[5]+"',");
		sb.append("'"+data[6]+"',");
		sb.append("'"+data[7]+"',");
		sb.append("'"+data[8]+"');");
		return sb.toString();
	}
	
	public String escapeChars(String x) {
		return x.replaceAll("'", "''");	
     }
}
