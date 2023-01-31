package com.kyoungmin.contact.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.kyoungmin.contact.models.Book;

public interface BookDao {
	
	@Select("SELECT * FROM tbl_books")
	public List<Book> selectAll();
}
