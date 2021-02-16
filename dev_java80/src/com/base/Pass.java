package com.base;

public class Pass {
 	public static void main(String []args) {
 		int x = 5;
 		Pass p = new Pass();
 		p.doStuff(x);  //x는 값에의한 전달로 값이 복사되어 doStuff메소드 안에서 사용되므로 메소드 안에서 일어난 변경은 main의 지역변수 x에 아무런 영향을 주지 않는다. 
 		System.out.print(" main x = "+ x);
 	}
 	
 	void doStuff(int x) {
 		System.out.print(" doStuff x = "+ x++); //doStuff내에서 사용되는 x는 main메소드 안의 x와는 무관하다.  
 	}
 }
/*
public class Pass {
	int x = 5; //x를 클래스의 맴버 전역변수로 사용하게 되면
	public static void main(String []args) {
		
		Pass p = new Pass();
		p.doStuff(p); // 참조에 의한 전달로 doStuff메소드가 class Pass의 주소를 참조하여 사용하게 되고
		System.out.print(" main x = "+ p.x);
	}
	
	void doStuff(Pass p) {
		System.out.print(" doStuff x = "+ p.x++); Pass의 주소에 있는 값을 연산하므로 doStuff안에서의 연산이 p.x에 영향을 준다.
	}
}
*/