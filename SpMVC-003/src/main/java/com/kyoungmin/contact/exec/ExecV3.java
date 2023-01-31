package com.kyoungmin.contact.exec;

public class ExecV3 {
public static void main(String[] args) {
	
	// 정수값을 저장하는 변수 선언 그리고 값 할당
	int num1 = 100; // 32bit 저장공간
	long num2 = 1_000_000_000_000_000_000L; // 64bit 저장공간
	
	num1 =200;
	System.out.println(num1);
	
	// 실수 값을 저장하는 변수 선언 그리고 값 할당
	float num3 = 10.0F;
	double num4 = 10.0;
	
	// System.out.println(num1);
	// System.out.println(num2);
	// System.out.println(num3);
	// System.out.println(num4);
	
	num3 = 10 / 3;
	
	num4 = 10 / 3;
	
	System.out.println(num3);
	System.out.println(num4);
	
	/*
	 * 큰 수에서 작은수로 표현은 할 수 없어
	 * 오류가 날 때
	 * 강제형변환을 실행해서 int로 값을 도출한다
	 */
	num1 = (int)(10.0 / 3.0);
	num2 = (int)(10.0 / 3.0);
}
}
