package com.kyoungmin.contact.exec;



public class ExecV2 {
	public static void main(String[] args) {
		
		// java 에서는 변수를 선언할 때 
		// type 키워드가 먼저 온다
		// 명령문 끝에는 반드시 세미콜론(;) 온다
		int num1 = 100;
		int num2 = 200;
		int sum = 0;
		sum = num1 + num2;
		
		 // form 에 맞도록 출력하기
		System.out.printf("%d + %d = %d", num1, num2, sum);		
		System.out.print("대한민국");
		System.out.print("우리나라");
	}
}
