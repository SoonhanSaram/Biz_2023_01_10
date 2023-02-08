package com.kyoungmin.contact.service;

import java.util.List;

import com.kyoungmin.contact.persistence.ContactDao;

/**
 * Generic class
 * interface 들의 parents prototype
 * CRUD 를 구현하기 위해 사용하는 여러 interface 들이 있는데
 * 이러한 interface 들에는 구현되지 않은 prototype 형태의 method들이
 * 중복되어 정의 된다
 * 기본 CRUD 는 보통 같은 이름의 method 를 사용
 * 객체 지향에선 중복돈 코드는 최소한으로 유지하는 것이 원칙
 * 이러한 원칙을 지키며 객체지향(자바) 코드의 장점을 활용하는 것
 */
public interface GenericService<DTO, PK> {
	public List<DTO> selectAll();

	public DTO findById(PK id);

	public int insert(DTO dto);

	public int update(DTO dto);

	public int delete(PK id);
}
