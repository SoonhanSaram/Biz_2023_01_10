package com.kyoungmin.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyoungmin.contact.models.ContactDto;
import com.kyoungmin.contact.service.ContactService;

@RestController
public class MyDBController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value= {"/",""})
	public List<ContactDto> selectAll() {
		return contactService.selectAll();
	}
}
