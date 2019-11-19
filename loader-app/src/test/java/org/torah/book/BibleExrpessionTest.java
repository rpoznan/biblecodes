package org.torah.book;

import static org.junit.Assert.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;
import org.torah.loader.book.BibleExpression;

public class BibleExrpessionTest {
	
	private BibleExpression bibleExpression = new BibleExpression();
	
	@Test
	public void testExpression() {
		String expression = bibleExpression.createExpression();
		System.out.println(expression);
		Pattern x = Pattern.compile(expression);
		Pattern a = Pattern.compile("(\\d+)");
		Pattern b = Pattern.compile("(\\d+):(\\d+)");
		Pattern c = Pattern.compile("(\\d+):(\\d+)\\-(\\d+)");
		String[] cases = new String[] { 
				"Gen 30",
				"Gen 30:6",
				"Gen 30:1-12"
		};
		for(String bv: cases) {
			Matcher m = x.matcher(bv);
			//assertTrue(bv, m.matches());
//			System.out.println(bv + m.matches());
//			for(int c =1; c <= m.groupCount() ; c++) {
//				System.out.println(m.group(c) + y.matcher(m.group(c)).matches());
//				System.out.println(m.group(c) + z.matcher(m.group(c)).matches());
//				System.out.println(m.group(c) + a.matcher(m.group(c)).matches());
//			}
			if(m.matches()) {
				String book = m.group(1);
				String cv = m.group(2);
				Matcher am = a.matcher(cv);
				Matcher bm = b.matcher(cv);
				Matcher cm = c.matcher(cv);
				if(am.matches()) {
					System.out.println(book + " chapter: " +am.group(1));
				}
				if(bm.matches()) {
					System.out.println(book + " chapter: " +bm.group(1) + " versex: "+bm.group(2));
				}
				if(cm.matches()) {
					System.out.println(book + " chapter: " +cm.group(1) + " versex: "+cm.group(2)+ " versey: "+cm.group(3));
				}
			}
		}
	}

}
