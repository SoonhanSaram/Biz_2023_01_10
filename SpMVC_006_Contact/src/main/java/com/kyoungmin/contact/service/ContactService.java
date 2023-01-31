package com.kyoungmin.contact.service;

import java.util.List;

import com.kyoungmin.contact.models.ContactDto;


public interface ContactService {
	public List<ContactDto> selectAll();
}
