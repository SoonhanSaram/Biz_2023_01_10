package com.kyoungmin.contact.persistence;

import com.kyoungmin.contact.models.ContactDto;
import com.kyoungmin.contact.service.GenericService;

public interface ContactDao extends GenericService<ContactDto, Long> {

	// 프로젝트가 시작될 때 table 을 자동 생성하기위한 method 정의
	public void create_contact_table();

	public void create_hobby_table();
}
