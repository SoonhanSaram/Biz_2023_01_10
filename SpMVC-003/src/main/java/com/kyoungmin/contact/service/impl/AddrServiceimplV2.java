package com.kyoungmin.contact.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kyoungmin.contact.config.QualifierConfig;
import com.kyoungmin.contact.models.AddrVO;
import com.kyoungmin.contact.service.AddrService;


@Service(QualifierConfig.ADDR.SERVICE_V2)
public class AddrServiceimplV2 implements AddrService{

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
