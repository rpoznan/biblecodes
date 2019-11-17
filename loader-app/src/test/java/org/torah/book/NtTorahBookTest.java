package org.torah.book;

import org.junit.Test;
import org.torah.loader.book.NtTorahBook;

public class NtTorahBookTest {
	
	@Test
	public void testNtBooks() {
		System.out.println(new NtTorahBook().getSql()); 
	}

}
