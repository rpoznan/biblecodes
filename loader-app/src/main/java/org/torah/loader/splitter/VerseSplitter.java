package org.torah.loader.splitter;

import java.util.ArrayList;
import java.util.List;

public class VerseSplitter {
	
	public static String[] splitVerse(String verse) {
		String[] result = verse != null ? verse.replaceAll("'|,|;|'|\\(|\\)|\\:", "").split("\\s") : new String[] {};
	    List<String> strList = new ArrayList<String>();
	    for(String x: result) {
	    	if(x.trim().length() > 0) {
	    		strList.add(x);
	    	}
	    }
	    return strList.toArray(new String[] {} );
	}
	
	public static String convertTranslator(String[] x) {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i < x.length; i++) {
			sb.append(x[i]);
			if(i < x.length-1)
				sb.append(" ,");
		}
		return sb.toString();
	}

}
