package quiz.feb22;
/*
 * non-static 영역에서 static타입은 접근가능
 * 
 * static 영역에서 non-static은 접근불가
 * 
 */

class Q36_1 {
	 void methodC() {
		 Q36.methodB();
		 Q36 q36 = new Q36();
		 q36.methodB();
	 }
}

public class Q36 {

	static {
		System.out.println("static block");
	}

	void methodA() {
		System.out.println("methodA 호출");
		methodB();		
	}
	
	static void methodB() {
		System.out.println("satic methodB 호출");
		//methodA(); //안됨	
	}

	//메인 메소드도 static이다.
	//main thread라고 함. 높은 우선순위
	//자바스크립트는 싱글쓰레드
	public static void main(String[] args) {
		System.out.println("static main");

	}

}
