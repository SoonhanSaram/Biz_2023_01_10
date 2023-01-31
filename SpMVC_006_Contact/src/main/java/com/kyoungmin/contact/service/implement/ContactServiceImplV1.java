package com.kyoungmin.contact.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyoungmin.contact.models.ContactDto;
import com.kyoungmin.contact.persistence.ContactDao;
import com.kyoungmin.contact.service.ContactService;

@Service
public class ContactServiceImplV1 implements ContactService {
	
	@Autowired
	private ContactDao contactDao;

	@Override
	public List<ContactDto> selectAll() {
		return contactDao.selectAll();
	}
	
	
}
