package com.kyoungmin.contact.exec.Array;

public class ArrayV7 {
	public static void main(String[] args) {
		/*
		 * 정수형 배열 45개를 만들고 index 0 ~ 44 번까지 요소에 1 ~ 45까지의 정수를 저장
		 */
		int[] nums = new int[45];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = 1 + i;			
		}
		/*
		 * 배열 45개의 요소를 shuffle 하고 결과를 출력
		 */
		int temp = 0;
		for (int i = 0 ; i < nums.length ; i++) {
			int ix1 = (int)(Math.random() * nums.length) ;
			int ix2 = (int)(Math.random() * nums.length) ;
			temp = nums[ix1];
			nums[ix1] = nums[ix2];
			nums[ix2] = temp;
		
		}
		for(int n : nums) {
			System.out.printf("%d\t", n);	
		}
		System.out.println();
		
		int[] lottos = new int[6];
		
		for (int i = 0 ; i < lottos.length ; i++) {
			lottos[i] = nums[i];
		}
//		for(int n : lottos) {
//		System.out.println(n);
//		}
		/*
		 * lottos 배열에 저장된 각 값들을 오름차순 정렬하여 출력
		 */
		int temp1 = 0;
		for(int i = 0 ; i < lottos.length ; i++) {			
			for(int j=i+1; j < lottos.length ; j++) {				
				if (lottos[i] > lottos[j]) {
					temp1 = lottos[i];
					lottos[i] = lottos[j];
					lottos[j] = temp1;
				}			
			}
			
		}
		for(int n : lottos) {
			System.out.println(n);
			}

	}
	
}
