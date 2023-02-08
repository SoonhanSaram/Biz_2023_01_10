package com.kyoungmin.contact.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kyoungmin.contact.models.ContactDto;
import com.kyoungmin.contact.service.ContactService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value="/api")
public class MyDBController {
	
	
	private final ContactService contactService;
	
	public MyDBController(ContactService contactService) {
		super();
		this.contactService = contactService;
	}
	
	
	
	@RequestMapping(value= {"/",""}, method=RequestMethod.GET)
	public List<ContactDto> selectAll() {
		log.debug("안녕하세요");
		return contactService.selectAll();
	
	}
	
	@RequestMapping(value= {"/list"}, method=RequestMethod.GET)
	public List<ContactDto> list() {
		List<ContactDto> contactList = contactService.selectAll();
		log.debug(contactList.toString());
		return contactList;
	
	}
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public ContactDto detail(String uid) {
		log.debug(uid);
		return contactService.findById(Long.valueOf(uid)-1);
	}
}
