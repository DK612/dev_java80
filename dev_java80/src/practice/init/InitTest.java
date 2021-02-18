package practice.init;

public class InitTest {
	int x = 5;	//맴버변수 선언시 초기화
	static int y = 5;
	String str = "aaa";
	
	static {	//static 초기화 블록
		System.out.println("static 초기화 블록 실행전 \ny = " + y);
		y = 10;
	}

	{		//일반 초기화 블록
		System.out.println("초기화 블록 실행전\nx = " + x);
		System.out.println("y = " + y);
		System.out.println("str = " + str);
		x = 20;
		y = 20;
		str = "bbb";
	}
	
	InitTest() { //생성자
		System.out.println("생성자 실행전\nx = " + x);
		System.out.println("y = " + y);
		System.out.println("str = " + str);
		x = 30;
		y = 30;
		str = "cccc";
	}
	
	
	void print() { //블록들의 위치를 뒤섞어서 실행해봐도 반드시  |맴버변수 선언 초기화 >> static 초기화 블록 >> 일반 초기화 블록 >> 생성자| 순서로 실행됨.
		System.out.println("모든 초기화 후\nx = " + x);
		System.out.println("y = " + y);
	}
}
