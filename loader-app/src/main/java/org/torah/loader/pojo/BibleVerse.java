package org.torah.loader.pojo;

public class BibleVerse {

	private int book;
	private int chapter;
	private int verse;
	private String text;
	private String lang;
	private String hChapter;
	private String hVerse;
	
	
	public String gethChapter() {
		return hChapter;
	}
	public void sethChapter(String hChapter) {
		this.hChapter = hChapter;
	}
	public String gethVerse() {
		return hVerse;
	}
	public void sethVerse(String hVerse) {
		this.hVerse = hVerse;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public int getBook() {
		return book;
	}
	public void setBook(int book) {
		this.book = book;
	}
	public int getChapter() {
		return chapter;
	}
	public void setChapter(int chapter) {
		this.chapter = chapter;
	}
	public int getVerse() {
		return verse;
	}
	public void setVerse(int verse) {
		this.verse = verse;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "BibleVerse [book=" + book + ", chapter=" + chapter + ", verse=" + verse + ", text=" + text + ", lang="
				+ lang + ", hChapter=" + hChapter + ", hVerse=" + hVerse + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + book;
		result = prime * result + chapter;
		result = prime * result + verse;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BibleVerse other = (BibleVerse) obj;
		if (book != other.book)
			return false;
		if (chapter != other.chapter)
			return false;
		if (verse != other.verse)
			return false;
		return true;
	}
}
