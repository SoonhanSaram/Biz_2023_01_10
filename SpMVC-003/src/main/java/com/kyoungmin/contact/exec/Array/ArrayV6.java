package com.kyoungmin.contact.exec.Array;

public class ArrayV6 {
	public static void main(String[] args) {
		
		// 문자열 객체를 만드는 코드
		// String nation = new String("Korea");
		// 짧게 만드는 코드
		String nation = "Korea";
		
		String[] nations = nation.split("");
		for (String n : nations) {
		//	System.out.printf("%s\t", n);
		}
		/**
		 * 분해된 문자열이 담긴 nations 배열의
		 * 각 알파벳을 무작위로 shuffle 하기
		 */
		String temp = "";
		for (int i = 0 ; i < nations.length ; i++) {
			int index1 = (int)(Math.random() * nations.length);
			int index2 = (int)(Math.random() * nations.length);
			temp = nations[index1];
			nations[index1] = nations[index2];
			nations[index2] = temp;		
		}
		
		for (String n : nations) {
			System.out.printf("%s\t", n);
		}
	}
}
