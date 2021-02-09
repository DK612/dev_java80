package variable.step1;

public class Quiz1 {

	public static void main(String[] args) {
		Quiz1 q = new Quiz1();
		q.methodA();
		q.methodA();
		
	}
	
	private void methodA() {
		System.out.println("methodA호출 성공");
	}

	private void methodA(int x) {
		System.out.println("methodA(int x)호출 성공");
	}
}
