package com.kyoungmin.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * @Controller : Annotation, 주석  
 * 특별한 기능을 수행하는 Spring Keyword
 * HelloController 클래스가 지금부터 Request Router 라는 선언
 * Spring 에서는 Router 를 Controller 라고 함
 * MVC (Model, View, Controller) 패턴에서
 * Client 의 Request 를 제일먼저 수신하는 클래스 파일
 */
@Controller
public class HelloController {
	/*
	 * Client 에서 http://localhost:8080/hello/korea 라는 요청이 오면
	 * hello() method 의 코드를 실행해 응답
	 */
	@RequestMapping(value="/korea", method=RequestMethod.GET)
	public String hello() {
		/*
		 * /webapp/WEB-INF/views/hello.jsp 파일을 Rendering 해 응답
		 */
		return "hello";
	}
	/*
	 * client 에서 http://localhost:8080/hello/nation 이라는 요청이 오면
	 * WEB-INF / views 폴더의 korea.jsp 파일을 Rendering 해 응답
	 */
	@RequestMapping(value="/nation", method=RequestMethod.GET)
	public String korea() {
		return "korea";
	}
	/*
	 * Client 에서 http://localhost:8080/hello/ 라는 요청이 오면
	 * 	/WEB-INF/views/home.jsp 파일을 Rendering 해 응답
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		return "home";
		}
}
