package variable.step1;

public class Variable {
	//선언부
	
	//메소드 선언 
	void methodA(int x) {
		return;
	}
	
	double methodB(int x) {
		return 3.14;
	}
	
	/********************************************
	 * 문제해결능력 키움
	 * @return void
	 * @param args
	 ********************************************/
	
	//메인 메소드 - exe 파일 생성 가능
	public static void main(String[] args) {
		//System.out.print();		//줄바꿈 없음
		Variable v = new Variable();
		//System.out.println(v.methodA(1));
		System.out.println(v.methodB(1));
		
		
		
		System.out.print("|1");		//줄바꿈 없음
		System.out.println(" |");	//줄바꿈
		System.out.print("| ");
		System.out.print("2|");
	}

}
