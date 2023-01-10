package com.kyoungmin.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kyoungmin.user.models.UserVO;
import com.kyoungmin.user.service.UserService;

@Controller(value="/user")
public class UserController {
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join() {
		return "user/join";
	}
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(UserVO uservo, Model model) {
		/*
		 * UserVO 클래스를 작성할 때
		 * 모든 변수를 private 으로 선언하고
		 * getter(), setter() method 를 만듦
		 * java 코드에 변수값을 읽을 때는 객체.getter() 
		 * 형식으로 사용해야 함
		 */
		System.out.println(uservo.getUsername());
		model.addAttribute("USER", uservo);		
		return "user/join_ok";
	}
	/*
	 * userService 클래스에 선언된 getUser() method 를 호출해
	 * 사용자 정보 받아오기(getter)
	 * 
	 * UserService 클래스에 선언된 getUser() method 를 호출해
	 * 일을 시키려면 클래스를 객체로 선언하고,
	 * 초기화하는 과정을 먼저 수행
	 * 		UserServicxe.getUser() 처럼 사용 불가
	 */
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String detail(Model model) {
		UserService userService = new UserService();

		UserVO user = userService.getUser();
		model.addAttribute("USER", user);
		return "user/join_ok";
	}
}
