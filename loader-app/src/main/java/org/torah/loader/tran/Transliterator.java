package org.torah.loader.tran;

import java.util.LinkedHashMap;
import java.util.Map;

public class Transliterator {
	
	static Map<String,String> tranMap = new LinkedHashMap<String,String>();
	static {
		tranMap.put(" "," ");
		tranMap.put("א","ʾ");
		tranMap.put("ב","b");
		tranMap.put("ג","g");
		tranMap.put("ד","d");
		tranMap.put("ה","h");
		tranMap.put("ו","w");
		tranMap.put("ז","z");
		tranMap.put("ח","ḥ");
		tranMap.put("ט","ṭ");
		tranMap.put("י","y");
		tranMap.put("כ","k");
		tranMap.put("ך","k");
		tranMap.put("ל","l");
		tranMap.put("מ","m");
		tranMap.put("ם","m");
		tranMap.put("נ","n");
		tranMap.put("ן","n");
		tranMap.put("ס","s");
		tranMap.put("ע","ʿ");
		tranMap.put("פ","p");
		tranMap.put("ף","p");
		tranMap.put("צ","ṣ");
		tranMap.put("ץ","ṣ");
		tranMap.put("ק","q");
		tranMap.put("ר","r");
		tranMap.put("ש","š");
		tranMap.put("ת","t");
		tranMap.put("\uFB2E","ʾa");
		tranMap.put("\uFB2F","ʾā");
		tranMap.put("\uFB30","ʾ9");
		tranMap.put("\uFB31","b9");
		tranMap.put("\uFB4C","b");
		tranMap.put("\uFB32","g9");
		tranMap.put("\uFB33","d9");
		tranMap.put("\uFB34","h9");
		tranMap.put("\uFB35","w9");
		tranMap.put("\uFB4B","ô");
		tranMap.put("\uFB36","z9");
		tranMap.put("\uFB38","ṭ9");
		tranMap.put("\uFB39","y9");
		tranMap.put("\uFB3B","k9");
		tranMap.put("\uFB4D","k");
		tranMap.put("\uFB3A","k9");
		tranMap.put("\uFB3C","l9");
		tranMap.put("\uFB3E","m9");
		tranMap.put("\uFB40","n9");
		tranMap.put("\uFB41","s9");
		tranMap.put("\uFB44","p9");
		tranMap.put("\uFB4E","p");
		tranMap.put("\uFB43","p9");
		tranMap.put("\uFB46","ṣ9");
		tranMap.put("\uFB47","q9");
		tranMap.put("\uFB48","r9");
		tranMap.put("\u05C1","8");
		tranMap.put("\u05C2","7");
		tranMap.put("\uFB2A","š"); //ligature for שׁ
		tranMap.put("\uFB2C","š9");
		tranMap.put("\uFB2B","ś"); //ligature for שׂ
		tranMap.put("\uFB2D","š9");
		tranMap.put("\uFB4A","t9");
		// # vowels
		tranMap.put("\u05B0","ǝ"); //shewa
		tranMap.put("\u05B1","ĕ"); //hataf segol
		tranMap.put("\u05B2","ă"); //hataf patach
		tranMap.put("\u05B3","ŏ"); //hataf qamats
		tranMap.put("\u05B4","i"); //hiriq
		tranMap.put("\u05B5","ē"); //tsere
		tranMap.put("\u05B6","e"); //segol
		tranMap.put("\u05B7","a"); //patach
		tranMap.put("\u05B8","ā"); //qamats
		tranMap.put("\u05B9","ō"); //holam
		tranMap.put("\u05BA","ō"); //this is the codepoint for a holam on a const waw); but it is rarely used
		tranMap.put("\u05BB","u"); //qibbuts
		tranMap.put("\u05BC", "9"); // dagesh
		tranMap.put("\u05BD", ""); // metheg
		tranMap.put("\u05BE","-"); // maqqef
		tranMap.put("\u05BF",""); // rafe
		tranMap.put("\u05C7","o"); //qamets hatuf/qatan. Not used often); most use a qamats instead
		// # extra marks and cantillations
		tranMap.put("\u0591",""); //athna
		tranMap.put("\u0592","");
		tranMap.put("\u0593","");
		tranMap.put("\u0594","");
		tranMap.put("\u0595","");
		tranMap.put("\u0596","");
		tranMap.put("\u0597","");
		tranMap.put("\u0598","");
		tranMap.put("\u0599","");
		tranMap.put("\u059A","");
		tranMap.put("\u059B","");
		tranMap.put("\u059C","");
		tranMap.put("\u059D","");
		tranMap.put("\u059E","");
		tranMap.put("\u059F","");
		tranMap.put("\u05A0","");
		tranMap.put("\u05A1","");
		tranMap.put("\u05A2","");
		tranMap.put("\u05A3","");
		tranMap.put("\u05A4","");
		tranMap.put("\u05A5","");
		tranMap.put("\u05A6","");
		tranMap.put("\u05A7","");
		tranMap.put("\u05A8","");
		tranMap.put("\u05A9","");
		tranMap.put("\u05AA","");
		tranMap.put("\u05AB","");
		tranMap.put("\u05AC","");
		tranMap.put("\u05AD","");
		tranMap.put("\u05AE","");
		tranMap.put("\u05AF","");
		tranMap.put("\u05C3","");
		tranMap.put("'","'");
		tranMap.put(";",";");
		tranMap.put(",",",");
	}
	
	public static String transliterate(String x) {
		char[] buf = x!=null ? x.toCharArray() : new char[] {};
		StringBuffer sb = new StringBuffer();
		for(int c =0; c < buf.length; c++) {
			String val = tranMap.get(buf[c]+"");
			if(val != null)
			sb.append(val);
		}
		return sb.toString();
	}

}
