package com.base;
<<<<<<< HEAD

public class Test {
	 public static void main(String [] args) {
		 int x =5;
		 boolean b1 = true;
		 boolean b2 = false;

		 if((x==4) && !b2)  System.out.print("1 ");  
		 System.out.print("2 ");  
		 if ((b2 = true) && b1)  System.out.print("3 ");  
	 }
=======
/*
 * ()가 있는 경우는 세가지
 * ():메소드
 * ():생성자
 * ():형변환(Casting)연산자
 */
public class Test {

	public static void main(String[] args) {
		float f = 3.14f;
		double d = 3.14;
		
		f = (float)d;	//Casting연산자
		
		d = f;
		
		System.out.println(f);
		System.out.println(d);
	}

>>>>>>> refs/remotes/origin/master
}
