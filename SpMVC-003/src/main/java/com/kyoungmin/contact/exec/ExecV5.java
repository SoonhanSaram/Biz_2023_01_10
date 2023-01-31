package com.kyoungmin.contact.exec;

public class ExecV5 {
	/*
	 * 한 모듈(class) 단위에서
	 * 같은 이름의 변수, 같은 이름의 함수(method)는
	 * 중복해 만들 수 없다(중복선언 금지)
	 * 
	 * 자바는 완전한 객체지향 표준어
	 * 객체지향 특징중에
	 * 		method의 매개변수의 상태에 따라
	 * 		method의 이름을 중복하여 선언할 수 있다
	 * 이 것을 Overloading(method의 중복선언) 이라 한다
	 * 
	 * 중복선언된 method 는 호출하는 곳에서 주입한 값의 상태에 따라
	 * 자동으로 정확한 method 가 호출된다
	 * 
	 * method 영역이 다르면
	 * 같은 이름의 변수를 또 선언해 사용할 수 있다
	 */
	
	public static void num(int num1) {
		
	}
	public static void num(int num1, int num2) {
	
	}
	public static void num(float num1) {
		
	}
	public static void num(double num1) {
		
	}
	public static void main(String[] args) {
		/*
		 * overloading :
		 * 객체지향 프로그래밍 언어에서는
		 * method의 매개변수 개수나 타입이 다를경우
		 * 여러가지 중복된 method를 선언할 수 있다
		 */
		num(100);
		num(100,200);
		num(100f);
		num(100.0);
	}
}
