package com.kyoungmin.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyoungmin.contact.dao.BookDao;
import com.kyoungmin.contact.models.Book;

@RestController
@RequestMapping(value="/book")
public class BookController {
	
	@Autowired
	private BookDao bookdao;
	@RequestMapping(value={"/",""}, produces = "application/json;charset=utf-8")
	public List<Book> list() {
		return bookdao.selectAll();
	}
}
