package com.kyoungmin.contact.persistence;

import java.util.List;

import com.kyoungmin.contact.models.ContactDto;

public interface ContactDao {
	public List<ContactDto> selectAll();
}
