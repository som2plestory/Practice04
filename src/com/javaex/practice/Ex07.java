package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;
		*/
		int wonArray[] = {50000,10000,5000,1000,500,100,50,10,5,1};
		System.out.print("금액: ");
		int[] quotient = new int[10]; //해당 지폐 개수
		int money = sc.nextInt(); //입력받을 금액
		for(int i=0; i<wonArray.length; i++) {
			quotient[i] = money/wonArray[i];
			System.out.println(wonArray[i]+"원:"+quotient[i]+"개");
			money -= quotient[i]*wonArray[i]; 
		}
			
		
		sc.close();
	}

}
