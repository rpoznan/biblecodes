package org.torah.loader.gem;

public class GematriaCalc {
	
	static final int[] val = {1,2,3,4,5,6,7,8,9,10,20,30,
			40,40,50,50,60,70,80,80,90,90,
			100,200,300,400 }; 
	
	static final char[] hebrew = { 'א','ב','ג','ד','ה','ו','ז','ח','ט','י','כ','ל',
			'מ','ם','נ','ן','ס','ע','פ','ף','ץ','צ',
			'ק','ר','ש','ת'};
	
	public static int calculate(String x) {
		assert val.length == hebrew.length;
		char[] buf = x!=null ? x.toCharArray() : new char[] {};
		int sum = 0;
		for(int v = 0; v < buf.length; v++) {
			//System.out.println(buf[v]);
			int g = findVal(buf[v]);
			sum = sum + g;
			//System.out.println(g);
		}
		return sum;
	}
	
	public static int findVal(char c) {
		int y = hebrew.length-1;
		for(int x=0; x < (hebrew.length / 2); x++) {
			if(hebrew[x] == c) {
				return val[x];
			}
			if(hebrew[y] == c) {
				return val[y];
			}
			y--;
		}
		return 0;
	}

}
