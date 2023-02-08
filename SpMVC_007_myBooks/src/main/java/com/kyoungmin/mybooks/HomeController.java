package com.kyoungmin.mybooks;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kyoungmin.mybooks.models.BookDto;

import lombok.extern.slf4j.Slf4j;

/**
 * Handles requests for the application home page.
 */
@Slf4j
@Controller
public class HomeController {
	
	/*
	 * 일반 컨트롤러에서 String 데이터를 return 하는 경우
	 * webINF/Views/ 폴더에 저장된 JSP 파일을 rendering 해 response 하라
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		log.info("Welcome home! The client locale is {}.", locale);
		
		// BookDto 클래스를 사용해
		//		bookDto 객체를 선언하고
		// 				생성자 method 를 사용해 객체를 초기화
		BookDto bookDto =new BookDto();
		bookDto.setIsbn("9700001");
		bookDto.setTitle("자바스크립트 완성");
		bookDto.setAuthor("금강성");
		bookDto.setDiscount("9000원");
		bookDto.setPublisher("이지즈");
		
		model.addAttribute("BOOK", bookDto);
		return "home";
	}
	/*
	 * method 에 @ResponseBody 가 설정되고
	 * 객체를 return 하는 경우
	 * 데이터를 JSON type 으로 response 하라  
	 */	
	@ResponseBody
	@RequestMapping (value= "/book", method=RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public BookDto getBook() {
		BookDto bookDto =new BookDto();
		bookDto.setIsbn("9700001");
		bookDto.setTitle("자바스크립트 완성");
		bookDto.setAuthor("금강성");
		bookDto.setDiscount("9000원");
		bookDto.setPublisher("이지즈");
		return bookDto;
	}
	public BookDto getMyBook() {
		/*
		 * java 는 전통적인 객체지향 언어
		 * 전통적인 객체지향 언어(POJO, plan old java object)이다 보니
		 * 클래스를 사용해 객체를 생성하는데, 다소 복잡한 규칙이 적용된다
		 * 1. 클래스를 이용해 객체를 선언
		 * 2. 생성자를 호출해 객체를 초기화
		 * 3. 초기화된 객체의 setter method 를 사용해
		 * 4. 각 속성(멤버변수)의 값을 설정하는 방법을 사용하거나
		 * 
		 * 1. 필드생성자를 만들고 
		 * 2. 생성자를 호출할 때, 초기값을 전달해 
		 * 3. 객체로 생성
		 * 
		 * lombok 도구를 활용하면 클래스를 객체로 생성하는데 
		 * builder 디자인패턴을 사용할 수 있다.
		 * 1. dto(vo) 클래스에 @Builder Annotation 을 부착하고
		 * 2. 객체를 생성할 때 클래스.builder() method를 먼저 호출하여
		 * 3. 객체를 초기화 하고,
		 * 4. 각 멤버변수 이름을 직접 사용해
		 * 5. 값을 setting 하고
		 * 6. build() method 를 호출하여 객체를 완전 생성하는 구조
		 * 
		 * 필요한 멤버변수 값만 초기화 할 수 있고
		 * 정확히 어떤 멤버변수를 초기화 하는지 개발자가 알 수 있음
		 */
		BookDto bookDto = BookDto.builder().isbn("9701111").title("React").author("홍길동").publisher("영진출판사").build();
		return bookDto;
	}
}
