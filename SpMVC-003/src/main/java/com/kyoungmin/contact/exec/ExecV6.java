package com.kyoungmin.contact.exec;

public class ExecV6 {
	public static void main(String[] args) {
		for(int i = 0 ; i<10; i++) {
			// System.out.println(i);
		}
		int num1 = (int)(Math.random()*10) +1 ;
		for(int i = 0 ; i<10 ; i++) {
			int num2= (int)(Math.random()*10) +1;
			// System.out.println(num2);
			/*
			 * num2 의 수를 2로 나눴을 때 나머지가 0이면 true 로
			 * 나머지가 있으면 false로 담김			 
			 */
			boolean even = num2 % 2 == 0;
			if (even) {
				System.out.println(num2 + "의 값은 짝수");
			} else {
				System.out.println(num2 + "의 값은 짝수 아님");
			}
		}
	}
}
