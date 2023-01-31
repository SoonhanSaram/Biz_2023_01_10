package com.kyoungmin.contact.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kyoungmin.contact.models.AddrVO;

/*
 * interface 
 * Java Source Code 또 다른 class
 * 모양만 있는 클래스
 * 
 * 1. 클래스를 만들기 위한 prototype
 * 2. method 를 정의하고 모양(argument type, return type)을 구축
 * 3. 구체적인 method 의 코드가 없음, 코드블럭 ( "{}" ) 없음
 * 4. 클래스를 만들 때 implements 해 사용하는 부모 class
 * 5. 클래스를 객체로 만들 때는 구현체 클래스가 있어야 한다
 */

public interface AddrService {
	public List<AddrVO> selectAll();
	public AddrVO findbyId(String num);
	
	public int insert(AddrVO addrVO);
	public int update(AddrVO addrVO);
	public int delete(String num);
}
