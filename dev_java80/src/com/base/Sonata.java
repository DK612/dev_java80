package com.base;

public class Sonata {
	//전역변수 선언
	//변수를 호출하면 (호출하면) 
	//바퀴수를 담을 변수 선언
	int wheel = 4;// 선언과 초기화를 동시에 처리함.
	//타입이 String이면 문자열을 담을 수 있다.
	String carColor ="black";
	/********************************************
	 * 메소드를 선언하기
	 * @param args - 파라미터의 타입은 배열입니다.
	 * :파라미터는 사용자가 입력한 값을 받는 곳이다.
	 * :파라미터 자리에도 변수를 선언가능하다.
	 * ->이것을 지역변수라고 한다.
	 * ->초기화를 할수없다.
	 * ->호출시 값을 받기 때문에
	 ********************************************/
<<<<<<< HEAD
	public static void main(String[] args) {
		//System- 클래스이다.
		//out은 변수인데 출력을 담당하는 변수
		//사용자가 입력한 값을 받고 싶을땐 System.in과 같이 사용함.
		//System은 로컬에서 사용되고있는 컴퓨터를 말함
		//System이 출력을 위한 변수 out을 제공하는 것이다.
		//.(dot)연산자로 자바가상머신이 클래스의 속성에 접근한다.
		//소유주.속성.메소드이름()
		//클래스의 구성요소 2가지는 변수와 메소드이다.
		//변수는 타입 변수이름  대입연산자 값 으로 구성
		//메소드는 접근제한자 리턴값 이름 (파라미터)로 구성
		//전역변스 호출시 반드시 인스턴스화가 필요하다.
		//인스턴스화를 통해서 메모리에 올린다.
		//지역변수는 변수이름.변수로 호출이 불가하다.
		Sonata himCar = new Sonata();
		System.out.println("나는 소나타 입니다.");
		System.out.println("소나타의 바퀴수는 " + himCar.wheel + "개 입니다."); //4가 출력됨.
		int speed = 0;
		System.out.println("현재 소나타의 속도는 " + speed);
		speed = 50;
		System.out.println("현재 소나타의 속도는 " + speed);
		speed = 30;
		System.out.println("현재 소나타의 속도는 " + speed);
=======
	/* 25[메인메소드-메인스레드-entry point-가장먼저 시작됨-exe
	 * 25~38 (주석)-37[모니터 출력]-40[인스턴스화-지역변수 성격]
	 * 42[변수선언 및 초기화]
	 * 
	 * 
	 */
	public static void main(String[] args) {
		//System- 클래스이다.
		//out은 변수인데 출력을 담당하는 변수
		//사용자가 입력한 값을 받고 싶을땐 System.in과 같이 사용함.
		//System은 로컬에서 사용되고있는 컴퓨터를 말함
		//System이 출력을 위한 변수 out을 제공하는 것이다.
		//.(dot)연산자로 자바가상머신이 클래스의 속성에 접근한다.
		//소유주.속성.메소드이름()
		//클래스의 구성요소 2가지는 변수와 메소드이다.
		//변수는 타입 변수이름  대입연산자 값 으로 구성
		//메소드는 접근제한자 리턴값 이름 (파라미터)로 구성
		//전역변스 호출시 반드시 인스턴스화가 필요하다.
		//인스턴스화를 통해서 메모리에 올린다.
		//지역변수는 변수이름.변수로 호출이 불가하다.
		System.out.println("나는 소나타 입니다.");
		Sonata himCar = new Sonata();
		System.out.println("소나타의 바퀴수는 " + himCar.wheel + "개 입니다."); //4가 출력됨.
		int speed = 0;
		System.out.println("현재 소나타의 속도는 " + speed);
		speed = 50;
		System.out.println("현재 소나타의 속도는 " + speed);
		speed = 30;
		System.out.println("현재 소나타의 속도는 " + speed);
		
>>>>>>> refs/remotes/origin/master
	}

}
