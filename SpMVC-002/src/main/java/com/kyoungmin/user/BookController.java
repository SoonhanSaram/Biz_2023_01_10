package com.kyoungmin.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kyoungmin.user.models.BookVO;
import com.kyoungmin.user.service.BookService;

@Controller
@RequestMapping(value="/book")
public class BookController {
	
	/*
	 * Spring Web Application Service 프로젝트의 핵심기능
	 * 		의존성주입(Dependency inject), 제어의 역전(inversion of control)
	 * Spring project 에서 일반적으로 Service 클래스는
	 * 개발자가 객체로 선언하는 코드가 없음
	 * 프로젝트가 시작될 때 자동으로 1개의 객체를 생성하고 
	 * Container에 보관하고 있음
	 * 다른곳에서 객체의 method 를 호출하는 코드가 실행되면
	 * Container 가 자동으로 주입 함
	 * 
	 */
	@Autowired
	private BookService bService;
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public String book(Model model) {
		BookVO book = bService.getBook();
		model.addAttribute("Book", book);
		return "book/detail";
	}
}
