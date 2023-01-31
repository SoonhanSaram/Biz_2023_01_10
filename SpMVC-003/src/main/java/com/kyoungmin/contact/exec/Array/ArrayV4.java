package com.kyoungmin.contact.exec.Array;

public class ArrayV4 {
	public static void main(String[] args) {
		/**
		 * 1부터 100까지 중의 임의 숫자 1개를 만들기
		 */
		int rndNum = (int)(Math.random() * 100 ) +1 ;
		/*
		 * 정수형 배열 nums 를 만들고 요소개수를 10개로 초기화
		 * 한 후 각각의 요소에 정수 1 ~ 100까지 중 임의의 수를 생성해 저장
		 */
		
		int[] nums = new int[10];
		for (int index = 0 ; index < nums.length ; index++) {
			nums[index] = (int)(Math.random()*100) +1;
			// System.out.println(nums[index]);
		}
		/**
		 * nums 배열에 담긴 모둔 요소를 화면에 출력하고 
		 * 요소의 값을 덧셈하여 결과를 출력
		 */
		int sum = 0;
		
		for (int i = 0 ; i<nums.length ; i ++) {
			// %d\t 숫자 1개를 출력하고 tab(8칸의 빈칸)을 출력
		//	System.out.printf("%d\t", nums[i]);
			sum = sum + nums[i];		
		}
	//	System.out.printf("총합 : %d ", sum);
		
		/**
		 * 배열에 저장된 요소중에 짝수만 출력하고
		 * 짝수들을 합산해 출력
		 */
		int sum1 = 0;
		for (int i = 0  ; i < nums.length ; i++) {
			if (nums[i] % 2 == 0) {
				System.out.printf("짝수 : %d\t", nums[i]);
				sum1 = sum1 + nums[i];
			}
		}
		System.out.println("");
		System.out.println(sum1);
	}
}
