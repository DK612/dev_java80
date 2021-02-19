package book.ch7;

public class MethodOverloading {
	void go() {
		
	}
	//public void go() {} 접근제한자는 영향없다.
	public void go(int[] a) {}
	//public void go(int[] b) {} //메소드 오버로딩이 아님.
	
	public static void main(String[] args) {
	}

}
