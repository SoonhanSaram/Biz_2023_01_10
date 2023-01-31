package com.kyoungmin.contact.exec.Array;

public class ArrayV3 {
	// final = const 
	private final static int ARRAY_LENGTH = 10;
	private final static int PLUS_NUM = 10;
	
	public static void main(String[] args) {
		int[] nums1 = new int[ARRAY_LENGTH];
				for (int index = 0 ; index < nums1.length ; index++) {
					nums1[index] = PLUS_NUM + index;
					System.out.println(nums1[index]);
				}
				/*
				 * 값을 저장하기 위한 for() 를 한번 사용하고
				 * 각 요소의 합산을 하기위한 for() 를 또 한번 사용
				 * 
				 * 단일책임의 원칙 : 한 가지일만 집중
				 * 		객체지향의 원칙 중 하나 
				 * 		코딩을 할 때 모든 분야(모듈, 블럭) 등에서
				 * 		주요한 개념
				 */
				int sum = 0;					
				for (int index = 0 ; index < nums1.length; index ++ ) {
					sum = sum + nums1[index];					
				}
	}
}
