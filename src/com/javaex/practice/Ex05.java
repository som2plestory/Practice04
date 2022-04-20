package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] number = new int[5]; //입력받을 숫자
		int sum=0; //입력받은 숫자 합계
		
		for(int i=0; i<number.length; i++) {
			number[i] = sc.nextInt();
			sum += number[i];
		}
		double mean = (double)sum/5; //입력받은 숫자 평균
		System.out.println("평균은 "+mean +" 입니다.");
		
		
		
		sc.close();
			
	}

}
