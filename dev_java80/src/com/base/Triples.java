package com.base;

import java.util.Scanner;

/*
public class Triples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번쨰 정수 a를 입력하시오 : ");
		int a = sc.nextInt();
		int b = 0;
		 do {
			System.out.print("두번째 정수 b를 입력하시오 (a < b): ");
			b = sc.nextInt();
		} while(a > b);

		int numOfTriples = 0;
		for(int i = a; i <= b; i++) {
			if(i == 0) continue;
			if(i%3 == 0) {
				numOfTriples++;
			}
		}
		System.out.println("첫번째 정수 " + a + "와 " + "두번째 정수 " + b + "사이에 있는 3의 배수의 숫자는 " + numOfTriples + "개 입니다.");
		
	}

}
*/

public class Triples {
	int a;
	int b;
	
	int getTriples(int a, int b) {
		int triples = 0;
		for(int i = a; i <= b; i++) {
			if(i == 0) continue;
			if(i%3 == 0) {
				triples++;
			}
		}
		return triples;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triples tp = new Triples();
		System.out.print("첫번쨰 정수 a를 입력하시오 : ");
		tp.a = sc.nextInt();
		do {
			System.out.print("두번째 정수 b를 입력하시오 (a < b): ");
			tp.b = sc.nextInt();
		} while(tp.a > tp.b);
		
		int numOfTriples = tp.getTriples(tp.a, tp.b);
		
		System.out.println("첫번째 정수 " + tp.a + "와 " + "두번째 정수 " + tp.b + "사이에 있는 3의 배수의 숫자는 " + numOfTriples + "개 입니다.");
		
	}
	
}
