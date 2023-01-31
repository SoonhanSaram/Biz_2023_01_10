package com.kyoungmin.contact.exec.List;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import com.kyoungmin.contact.config.QualifierConfig;

public class ListV5 {
	public static void main(String[] args) {
		/**
		 * List type 의 객체는
		 * ArrayList, LinkedList 를 사용해 만들 수 있음
		 * 이 두가지 클래스는 부모 인터페이스를 implements 하여 작성되어 있다
		 * List type 의 객체를 만들 땐, 선언문은 List interface type 으로 하고
		 * 생성은 ArrayList 또는 LinkedList로 한다.
		 */
		List<Integer> nums = new LinkedList<Integer>(); // new ArrayList<Integer>();
		/**
		 * 빈(blank) nums 의 끝에 새로운 데이터 추가
		 */
		for (int i = 0 ; i < 10 ; i++) {
			int rndNum = (int)(Math.random()*100) +1;
					nums.add(rndNum);
		}
		// System.out.println(nums);
		
		 /**
		  * "a", a 위치부터 끼워넣기
		  */
		for (int i = 0 ; i < 10 ; i++) {
			int rndNum = (int)(Math.random()*100) +1;
					nums.add(3, rndNum);
		}
		// System.out.println(nums);
		List<Integer> nums2 = new Stack<Integer>();
		
		
	}
}
