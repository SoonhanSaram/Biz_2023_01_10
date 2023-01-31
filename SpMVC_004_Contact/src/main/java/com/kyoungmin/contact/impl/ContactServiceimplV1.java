package com.kyoungmin.contact.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.kyoungmin.contact.models.Contact;
import com.kyoungmin.contact.service.ContactService;

@Service
public class ContactServiceimplV1 implements ContactService {
	
	
	/*
	 * 클래스 인스턴스변수 초기화 하기
	 * 인스턴스 변수는 기본생성자에서 보통기본값으로
	 * 초기화가 된다, null 또는 0 
	 * 
	 *  기본값이 null 로 선언된 객체를 통해
	 *  무언갈 실행 하려고 하면 Null Pointer Exception 이
	 *  주로 발생
	 *  
	 *  Null Pointer Exception 문제는 오래전부터 있었다
	 *  
	 */
	private Random rnd; // 선언만 하고 생성자에서 초기화
	
	private String[] names;
	// 기본 생성자에서 names 인스턴스 배열을 
	// 5개의 이름이 담긴 문자열 배열로 만들기
	public ContactServiceimplV1() {		
		this.names = new String[] {
			"홍길동", "이몽룡", "성춘향", "임꺽정", "장보고"
		};
		 this.rnd = new Random();
	}

	@Override
	public List<Contact> selectAll() {
		List<Contact> contactList = new ArrayList<>();
		for (int i = 0 ; i < 10  ; i++) {
			
			Contact con = new Contact();
			// S라는 문자열을 붙이고 $03 3칸의 빈칸을 만들고, d에 i+1 을 넣어라 
			String strId = String.format("S%03d", i+1);
			con.setC_id(strId);
			// 0~4까지 랜덤 수를 만듦
			int num = rnd.nextInt(5);
			con.setC_name(names[num]);
			contactList.add(con);
			
		}
		return contactList;
	}

	@Override
	public Contact findById(String id) {
		/**
		 * Contact 클래스를 사용해 Contact 정보를 저장할 myContact 객체 선언 new Contact() 생성자를 사용해
		 * myContact 객체를 생성 => 인스턴스화
		 * 
		 * 이 때, Contact 에 선언된 변수들은 모두 초기화
		 */
		Contact myContact = new Contact("0001","홍길동","kyengmin911@naver.com",30);
		System.out.println(myContact.toString());
		
		Contact myCA = new Contact("A0001", "이묭룡", 20);
		Contact myCB = new Contact("F0001", "성춘향", 16);
		
	    /*
	     * 기본생성자를 사용해 모든 인스턴스변수를 
	     * 기본값 (String = null , 숫자 = 0) 으로 하는
	     * 객체 생성방법
	     */
		Contact myBlank = new Contact();
		myBlank.setC_name("장보고");
		myBlank.setC_id("B0001");
		
		return myContact;
	}

	@Override
	public int insert(Contact contact) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Contact contact) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
