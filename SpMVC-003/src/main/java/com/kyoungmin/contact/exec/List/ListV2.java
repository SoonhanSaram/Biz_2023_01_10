package com.kyoungmin.contact.exec.List;

import java.util.ArrayList;

public class ListV2 {
	public static void main(String[] args) {
		/*
		 * integer type의 list nums1 을 생성
		 * List nums1 을 생성하고
		 * 각 요소의 값을 똑같이 10으로 채우기
		 */
		
		// 1. 빈 List nums1 를 생성하고
		ArrayList<Integer> nums1 = new ArrayList();
		
		// 2. for() 반복문을 열번 반복하면서
		// 3. nums1 list 에 정수 10을 add() 한다
		for (int i = 0; i< 10; i++) {
			nums1.add(10);
		}
		/*
		 * Java 에서 생성한 모든 object
		 * 	( object 는 클래스를 사용해 생성한 변수)
		 * 모두 .toString() method 를 가지고 있다
		 * print(object) 형식의 코드가 실행되면
		 * print() 는 object.toString() method 를 실행
		 * "문자열"을 console 에 출력
		 */
		System.out.println(nums1.toString());
	}
}
