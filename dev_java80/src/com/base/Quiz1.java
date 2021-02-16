package com.base;

import java.util.Scanner;

/*
public class Quiz1 {

	public static void main(String[] args) {
		double wEarth = 0.0;
		double wMoon = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게를 입력하시오: ");
		wEarth = sc.nextDouble();
		wMoon = (wEarth * 17)/100;
		System.out.println("달에서의 몸무게는 " + wMoon + "kg 입니다.");
	}
}
*/

/*
public class Quiz1 {
	
	public double moonWeight(double wEarth) {
		//달에서의 몸무게
		double wMoon = 0.0;
		wMoon = (wEarth * 17)/100.0;
		return wMoon;
	}
	
	public static void main(String[] args) {
		double wEarth = 0.0;
		Scanner sc = new Scanner(System.in);
		Quiz1 q = new Quiz1();
		System.out.print("몸무게를 입력하시오: ");
		wEarth = sc.nextDouble();
		double wMoon = 0.0;
		wMoon = q.moonWeight(wEarth);
		System.out.println("달에서의 몸무게는 " + wMoon + "kg 입니다.");
	}
}
*/

class  Common {
	
	public double moonWeight(double wEarth) {
		//달에서의 몸무게
		double wMoon = 0.0;
		wMoon = (wEarth * 17)/100.0;
		return wMoon;
	}
	
}

public class Quiz1 {
	
	
	public static void main(String[] args) {
		double wEarth = 0.0;
		Scanner sc = new Scanner(System.in);
		Common c = new Common();
		System.out.print("몸무게를 입력하시오: ");
		wEarth = sc.nextDouble();
		double wMoon = 0.0;
		wMoon = c.moonWeight(wEarth);
		System.out.println("달에서의 몸무게는 " + wMoon + "kg 입니다.");
	}
}
