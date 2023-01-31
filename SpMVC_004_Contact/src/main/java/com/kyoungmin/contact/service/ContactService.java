package com.kyoungmin.contact.service;

import java.util.ArrayList;
import java.util.List;

import com.kyoungmin.contact.models.Contact;

public interface ContactService {
	public List<Contact> selectAll() ;
	public Contact findById(String id);

	public int insert(Contact contact);

	public int update(Contact contact);

	public int delete(String id);
}
