package com.javaex.practice;

public class Ex08_mistake {
	
	public static void main(String[] args) {
		
		int lotto[] = new int[6];
		int lottoCheck;
		
		//실패의 이유 : 검증할 변수(lottoCheck)를 다시 뽑았을때 이미 확인했던 lotto[j]에 대해서는 파악하지 않음
		//lottoCheck로 뽑혔던 수가 다시 뽑힐 수 있다는 점을 고려하지 못함

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
