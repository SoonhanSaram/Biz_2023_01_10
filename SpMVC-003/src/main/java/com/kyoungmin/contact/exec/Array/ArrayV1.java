package com.kyoungmin.contact.exec.Array;
/*
 * java 배열 (Array)
 * 1. 단일 type 의 데이터만 저장할 수 있다
 * 2. 크기를 초기 설정값에서 변경할 수 없다
 * 3. 배열은 처음에 개수를 정하고, 초기화를 해야한다
 */
public class ArrayV1 {
	// main() 시작점 method
	public static void main(String[] args) {
		int num1 = 0 ;
		// java 에서 문자열은 변수이면서, 객체다
		String str = ""; 
		// String str = new String();
		// 정수형데이터 10개를 저장할 배열을 만들기		
		int[] nums1 = new int[10];
		// 실수형 데이터 10개를 저장할 배열 nums2 만들기
		float[] nums2 = new float[10];
		
		//nums1 배열에 정수형 데이터를 저장하기
		nums1[0] = 100;
		nums1[1] = 200;
		//nums1 배열의 요소 중 일부 데이터를 읽기
		int sum = nums1[0] + nums1[1];
		
		//java 는 초기에 개수가 정해지면 개수를 변경할 수 없다
		//아래 코드로 선언하면 기존의 nums1 이라는 배열은 사라지고
		//새로운 배열이 선언된다
		nums1 = new int[20];
		nums1[0] = 200;
		// nums1 배열은 20개의 요소(item)을 가지고 있다
		// 20 index 의 요소에 값을 저장하려고 하면
		// ArrayIndexOutOfBound exception 이 발생
		nums1[20] = 100;
		
	System.out.println(nums1[20]);
	/*
	 * 배열의 index 의 최대값은 항상 전체 큭리의 -1 까지이다
	 */
	}
}
