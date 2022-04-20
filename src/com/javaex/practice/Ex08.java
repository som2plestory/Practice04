package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		int lotto[] = new int[6];
		int lottoCheck;
		int j=0;
	
		for(int i=0; i<lotto.length; i++) {
			while(j<=i) {
				lottoCheck = (int)(Math.random()*45+1);
				if(lottoCheck!=lotto[j]) {
					j++;
				}else {
					j=0;
				}
				lotto[i]=lottoCheck;
				System.out.print(lotto[i]+" ");
			}
		}
		
	}
}