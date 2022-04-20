package com.javaex.practice;

public class Ex08 {
	
	public static void main(String[] args) {
		
		int lotto[] = new int[6];
		int lottoCheck;

		lotto[0] = (int)(Math.random()*45+1);
		System.out.print(lotto[0]);
		for(int i=1; i<lotto.length; i++) {
			int j=0;
			lottoCheck = (int)(Math.random()*45+1);
			while(j<i) {
				if(lottoCheck==lotto[j]) {
					lottoCheck = (int)(Math.random()*45+1);
					continue;
				}
				j++;
			}
			lotto[i]=lottoCheck;
			System.out.print(" "+lotto[i]);
		}
			
	}

}
