package com.kyoungmin.contact.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kyoungmin.contact.config.QualifierConfig;
import com.kyoungmin.contact.models.AddrVO;
import com.kyoungmin.contact.service.AddrService;

/**
 * AddrService interface 를 implements 한 class
 * interface 를 implements 한 클래스는 interface 에 정의된
 * method 들을 반드시 구현해야 함
 *
 * interface 를 설계도로 삼아 클래스를 작성하는 것
 */
@Service(QualifierConfig.ADDR.SERVICE_V1)
public class AddrServiceimplV1 implements AddrService{

	@Override
	public List<AddrVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddrVO findbyId(String num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(AddrVO addrVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(AddrVO addrVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String num) {
		// TODO Auto-generated method stub
		return 0;
	}

}
