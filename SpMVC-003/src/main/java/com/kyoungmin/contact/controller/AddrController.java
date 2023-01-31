package com.kyoungmin.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kyoungmin.contact.config.QualifierConfig;
import com.kyoungmin.contact.models.AddrVO;
import com.kyoungmin.contact.service.AddrService;

@Controller
@RequestMapping(value = "/addr")
public class AddrController {
	
	
	@Autowired
	@Qualifier(QualifierConfig.ADDR.SERVICE_V1)
	private AddrService adService;
	
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Model model) {
		/*
		 * interface 가 있고, 구현체가 있는 클래스를 
		 * 사용해 객체 선언과 생성하기
		 * 아직 구현체 클래스가 완성이 되지 않았어도
		 * 여기에서 생성된 객체를 사용해 다른 코드를 작성할 수 있다.
		 */
		AddrService adService = new AddrServiceimplV1();
		
		List<AddrVO> addrList = adService.selectAll();
		model.addAttribute("ADLIST", addrList);
		
		return "addr/list"
}
}
