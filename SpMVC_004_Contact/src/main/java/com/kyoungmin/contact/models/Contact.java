package com.kyoungmin.contact.models;

public class Contact {
	/*
	 * 클래스 영역(멤버 영역)에 설정된 변수들
	 * 변수들을 인스턴스 변수라 함
	 * 인스턴스변수는 클래스를 사용해 객체를 선언하고
	 * 생성자(new) 를 사용해 초기화해 
	 * 객체가 인스턴스화 할 때 변수도 사용할 준비를 마침
	 * 
	 * Contact myContact = new Contact() 코드가 실행될 때
	 * Contact 클래스에 선언된 변수들이 사용할 준비가 된다
	 * (인스턴스변수 초기화)
	 * 
	 * 인스턴스
	 * 객체지향에서 선언된 클래스를 사용해 객체를 생성하고
	 * 초기화해 사용할 준비가 된 변수
	 * Class obj = new Class() 라는 코드가 있을 때
	 * Class : 미리 선언된 클래스(prototype)
	 * obj : 객체, object, 객체변수 등으로 부른다
	 * obj = new Class() 코드가 실행되면
	 * obj 객체는 인스턴스화 됨 (사용될 준비가 된 객체)
	 */
	private String c_id = "0001";
	private String c_name = "홍길동";
	private String c_tel;
	private String c_addr;
	private String c_hobby;
	private String c_email ;
	
	private int c_age = 30;
	/*
	 * 기본생성자 코드(생성자 method)
	 * 클래스를 사용해 객체를 선언하고
	 * 객체를 초기화 (인스턴스) 할 때 사용(호출)하는 method
	 * 
	 * 모든 클래스는 클래스를 선언하면 자동으로 기본 생성자가 만들어짐
	 * 다만 코드로 보여지진 않음
	 * 기본 생성자는 매개변수가 없고
	 * 		인스턴스 변수들을 기본값으로 초기화하는 코드가 내부적을 작성됨
	 * 
	 * 만약 개발자가 일부 인스턴스 변수를 특별한 값으로
	 * 초기화 하고 싶어 매개변수가 있는 생성자를 만들면
	 * 기본 생성자는 disable 됨
	 * 즉, 기본 생성자는 사용할 수 없다
	 * 
	 * 매개변수가 있는 생성자를 임의 생성자라고 함
	 * 임의 생성자를 만들 땐 기본생성자도 만들어주는 것이 좋다
	 * 
	 * 그래야만 기본생성자를 사용하는 코드에서
	 * 오류가 발생하지 않는다
	 */
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	 * 매개변수를 통한 생성자 코드
	 */
	public Contact(String c_id, String c_name, int c_age) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_age = c_age;
	}
	
	public Contact(String c_id,String c_email ,String c_name, int c_age) {
		super();
		
		// c_id 매개변수를 통해 전달받은 값을 
		// 인스턴스 변수(this가 부착된) 인 c_id 변수의 초기값으로 해
		// 객체 생성하기
		this.c_id = c_id;
		this.c_name = c_name;
		this.c_age = c_age;
		this.c_email = c_email;
	}
	public int getC_age() {
		return c_age;
	}
	public void setC_age(int c_age) {
		this.c_age = c_age;
	}
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_tel() {
		return c_tel;
	}
	public void setC_tel(String c_tel) {
		this.c_tel = c_tel;
	}
	public String getC_addr() {
		return c_addr;
	}
	public void setC_addr(String c_addr) {
		this.c_addr = c_addr;
	}
	public String getC_hobby() {
		return c_hobby;
	}
	public void setC_hobby(String c_hobby) {
		this.c_hobby = c_hobby;
	}
	public String getC_email() {
		return c_email;
	}
	public void setC_email(String c_email) {
		this.c_email = c_email;
	}
	@Override
	public String toString() {
		return "Contact [c_id=" + c_id + ", c_name=" + c_name + ", c_tel=" + c_tel + ", c_addr=" + c_addr + ", c_hobby="
				+ c_hobby + ", c_email=" + c_email + ", c_age=" + c_age + "]";
	}
	
	
	
}
