package com.kyoungmin.contact.service.implement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.kyoungmin.contact.models.ContactDto;
import com.kyoungmin.contact.persistence.ContactDao;
import com.kyoungmin.contact.service.ContactService;

import lombok.extern.slf4j.Slf4j;


/**
 * Spring Project 에서 Bean
 *  spring project 는 project 가 시작될 떄, 
 *	@Component(@Controller, @Service, @Bean) 들이 설정된 class 들을
 *	scan 해 객체로 생성한 후 Container 에 보관
 *
 *	@Autowired 로 설정된 코드가 발견되면 해당 객체를 사용할 수 있도록
 *	주입(공급) 한다
 *
 *	또는 private final 로 설정된 코드가 발견되면
 *	생성자를 통해 해당 객체를 사용할 수 있도록 주입(공급) 한다
 *
 *	Container 에 보관중인 객체를 필요한 곳에 주입을 하는데
 *	시점이 중요
 *	1. private final 로 선언된 코드가 있나?
 *		있으면 생성자를 통해서 주입
 *		없으면 생성자를 통한 주입 포기
 *	
 *	2. @Autowired 로 선언된 코드가 있나?
 *		있으면 (Service) 객체가 만들어졌다면
 *		setter 를 통해서 주입
 *
 *	아래 코드에서 생정자 contactDao 를 참조해 method 들을 사용하려면
 *	contactDao 도 생성자에서 초기화 되어야 한다
 */
@Slf4j
@Service
public class ContactServiceImplV1 implements ContactService {
	
	private String[]names;
	private List<ContactDto> contactList; 
	// ContactDao 클래스를 사용해 만들어진 객체를 사용하고 싶으니
	// 누군가 나에게 주입(공급) 해달라는 요청
	private final ContactDao contactDao;	
	
	
	public ContactServiceImplV1(ContactDao contactDao) {
		super();
		this.contactDao = contactDao;
		contactDao.create_contact_table();
		contactDao.create_hobby_table();
		
		names = new String[] {"홍길동", "이몽룡","성춘향", "장녹수", "임꺽정"};
		contactList = new ArrayList<>();
	}


	@Override
	public List<ContactDto> selectAll() {		 
contactList.removeAll(contactList);
		Random rnd = new Random();
		for (int i = 0; i < 10 ; i++) {
			int rndIndex = rnd.nextInt(names.length);
			ContactDto dto = new ContactDto();
			dto.setC_uid(i+1L);
			dto.setC_name(names[rndIndex]);
			contactList.add(dto);
		}
		return contactList;
	}


	@Override
	public ContactDto findById(Long uid) {
log.debug(uid+"");
		return contactList.get((int)(long)(uid));
	}


	@Override
	public int insert(ContactDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int update(ContactDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
