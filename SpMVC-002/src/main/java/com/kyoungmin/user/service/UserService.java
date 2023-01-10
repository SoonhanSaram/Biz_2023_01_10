package com.kyoungmin.user.service;

import com.kyoungmin.user.models.UserVO;

/*
 * UserVO type 의 user 객체에 저장된 데이터를
 * return 하는 method
 * return UserVO
 */
public class UserService {
	public UserVO getUser() {
		/*
		 * UserVO type 의 user 객체변수를 선언하고
		 * 객체를 생성(new UserVO()) 함
		 * 
		 * 미리 정의된 UserVO 클래스를 사용해
		 * user 객체를 선언하고, 초기화(생성)
		 * 
		 * 클래스의 각 속성(변수)에 데이터를 담기 위해서
		 * 클래스를 사용해 객체를 선언 초기화하고
		 * 
		 */
		UserVO user = new UserVO();
		user.setUsername("Kyoungmin");
		user.setRealname("이몽룡");
		user.setNickname("사또");
		user.setAge(18);
		
		return user;
	}
}
