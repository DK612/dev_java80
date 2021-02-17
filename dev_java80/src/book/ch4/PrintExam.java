package book.ch4;
import java.util.Random;
/*
 * java.util에 있는 패키지들은 제공되는 api를 통해서 뭔가를 만들때 유용한 기능들을 모아둔 패키지.
 * java.lang이 아닌 패키지는 모두 import대상 입니다.
 */
//import java.util.Scanner;

public class PrintExam {

	public static void main(String[] args) {
		//디폴트 생성자를 지원하지 않는 클래스가 존재한다.
		//여기서 System이란 현재 사용하고있는 장치(device)처리 주체이다.
		//
		/*Scanner sc = new Scanner(System.in);
		Scanner sc2 = null; 
		sc2 = new Scanner(System.in);
		*/
		Random r = new Random(); //채번하기, 난수만들기,
		for(int i = 0; i < 10; i=i+3) {
			System.out.println(i + ":" + r.nextInt(10));
		}
	}
}
