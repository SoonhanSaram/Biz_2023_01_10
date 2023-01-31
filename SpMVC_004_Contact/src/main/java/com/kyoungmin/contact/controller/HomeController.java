package com.kyoungmin.contact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	public HomeController() {}
 	/**
	 * Contoroller 의 method 에서
	 * 문자열을 return 하면
	 * views/문자열.jsp 파일을 찾아서 rendering 해
	 * client 에 response 하도록 기본설정 돼 있다
	 * 이 때 method 에 @ResponseBody Annotation을 설정해두면
	 * 문자열을 return 했을 때, 문자열.jsp 파일을 찾지않고
	 * 문자열 그대로를 client 에 response 함
	 */
	@ResponseBody
	@RequestMapping(value="/")
	public String home() {
		return "Good Mornig Korea";
	}
}
