package com.base;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		double wEarth = 0.0;
		Scanner sc = new Scanner(System.in);
		Common c = new Common();
		System.out.print("몸무게를 입력하시오: ");
		wEarth = sc.nextDouble();
		if(sc.hasNextDouble()) {

			double wMoon = 0.0;
			Quiz2 q2 = new Quiz2();
			wMoon = c.moonWeight(wEarth);
			System.out.println("달에서의 몸무게는 " + wMoon + "kg 입니다.");
		} else {
			System.out.println("double형이 아닙니다.");
			return; //main메소드를 종료
		}
	System.out.println("막줄");	

	}

}
