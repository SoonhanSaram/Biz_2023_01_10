package com.kyoungmin.contact.exec.List;

import java.util.ArrayList;

public class ListV3 {
	public static void main(String[] args) {
		/*
		 * Generic type : <> 둘러쌓인 type
		 * List<GenericType> : List 객체에 add 할 수 있는
		 * 		datatype 을 강제 지정
		 * 		
		 * 		Generic type 외의 데이터를 add() 하면
		 * 		코드에 오류가 표현된다
		 * 		잘못된 데이터를 add()하여
		 * 		이 후에 발생할 문제를
		 * 		사전에 방지할 수 있도록 알림
		 * 
		 * generic type 은 클래스 type 만 사용 가능
		 * primitive type 은 사용할 수 없음
		 *  (int, long, float, double, boolean, char, byte)
		 * primitive type은 첫글자가 소문자이고 이 단어들은 keyword, 예약어 다
		 */
		ArrayList<Integer> nums = new ArrayList();
		
		/*
		 * keyword, 예약어(resolved word)
		 * java 언어가 탄생될 때, 미리 만들어진 명령어들
		 * 위 단어들은 절대 변수명, 함수명, 클래스명 등으로 사용할 수 없음
		 * 또 용도를 변경할 수도 없음
		 */
		
		/**
		 * 정수형 Generic type 을 갖는 List 를 만들고 싶다
		 * 하지만 Generic type 에는 primitive keyword를
		 * 		사용할 수 없음
		 * 그러한 경우에 정수형 Generic type 을 갖는 List를 
		 * 		만드는 법?
		 * 			변수를 선언하는 class를 제공
		 * 			primitive keyword 와 같거나 유사하며 첫글자가 대문자
		 * 기본형 변수에 여러가지 추가된 확장기능을 첨가해
		 * 만들어진 클래스
		 * 
		 * 변수를 선언하는 클래스 = wrapper class 라고 함
		 * 기본 변수 선언 키워드와 유사한 성질을 가지며
		 * 추가된 확장기능을 포함하고 있음
		 */
		int num1 = 0;
		Integer num11 = 0;
		
		
		long num3 = 0l;
		Long num33 = 0l;
		
		float num2 = 0.0f;
		Float num22 = 0.0f;
		
		double num4 = 0.0;
		Double num44 = 0.0;
		
		boolean bYes1 = true;
		Boolean bYes11 = true;

	}
}
