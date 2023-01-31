package com.kyoungmin.contact.exec.List;

import java.util.ArrayList;

public class ListV4 {
	public static void main(String[] args) {
		/**
		 * ArrayList 를 nums 라는 이름으로 생성하고 0 ~ 100까지 임의 난수를 100개 생성하여 nums List 에 추가
		 */
		ArrayList<Integer> nums = new ArrayList();
		for (int i = 0; i < 100; i++) {
			nums.add((int) (Math.random() * 100) + 1);
		}
		// for(int n : nums) {
		// System.out.println(n);
		// }

		/**
		 * nums list 의 요소중 짝수만 찾아서 출력하기
		 */
		for (Integer n : nums) {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		}
		/**
		 * 참고
		 * 다음의 두가지 변수는 결국은 같은 type 이라고 볼 수 있다
		 * 하지만, 엄연히 둘 사이는 다른 type
		 */
		int intnum = 100; // primitive 형
		Integer integerNum = 200; // wrapper class 형
		
		// primitive type 데이터를 wrapper class type 의 변수에
		// 저장하려고하면
		// 내부에서 type 변환이 발생
		// int 형에 Integer 형의 기능들이 포함되면서
		// Box 가 씌워짐
		integerNum = intnum;
		
		// class type 데이터를 기본형 type 의 변수에 저장하려고하면
		// 내부에서 type 변환 발생
		// integer 형에서 사용되는 모든 기능이 사라지고
		// 숫자값만 변환
		// Integer 형의 Box 가 벗겨짐
		intnum = integerNum;
	}
}
