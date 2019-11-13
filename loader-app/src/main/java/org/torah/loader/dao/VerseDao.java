package org.torah.loader.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VerseDao {
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");  
			return DriverManager.getConnection(  
			"jdbc:mysql://www.myjavadoc.com:3306/nanzopco_torah","nanzopco_torah","AZ4H2wFh8?2B");  
	}
	
	public void close(Connection con) {
		try {
		con.close();
		} catch (Throwable t) {}
	}
	
    public void close(PreparedStatement stmt) {
    	try {
		stmt.close();
    	} catch (Throwable t) {}
	}
    
    public void close(ResultSet rs) {
    	try {
		rs.close();
    	} catch (Throwable t) {}
	}
	
	
	//select * from nanzopco_torah.torah_verse_word
	//verse_id,word,tran_word,num_value,created_by
	
	public List<String[]> versesByBook(int bookId) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
		stmt=con.prepareStatement("select id, verse from torah_verse a"
				+ " where a.book_id=?"); 
	    stmt.setInt(1, bookId);
		rs=stmt.executeQuery();
		List<String[]> rsList = new ArrayList<String[]>();
		while(rs.next()) {
			String[] row = new String[] {rs.getString(1), rs.getString(2)};
			rsList.add(row);
		}
		 return rsList;
		} catch(Exception e){  
			throw new RuntimeException("sql error", e);
		}  finally {
			 close(rs);
			 close(stmt);
			 close(con);
		}
	}
	
	public List<String[]> lookVerseWords(int verseId) {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
		stmt=con.prepareStatement("select id,word from torah_verse_word a"
				+ " where a.verse_id=?"); 
	    stmt.setInt(1, verseId);
		rs=stmt.executeQuery();
		List<String[]> rsList = new ArrayList<String[]>();
		while(rs.next()) {
			String[] row = new String[] {rs.getString(1), rs.getString(2)};
			rsList.add(row);
		}
		 return rsList;
		} catch(Exception e){  
			throw new RuntimeException("sql error", e);
		}  finally {
			 close(rs);
			 close(stmt);
			 close(con);
		}
	}

}
