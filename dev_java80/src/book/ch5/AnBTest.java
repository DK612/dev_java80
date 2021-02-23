package book.ch5;

class A {
	int ival = 0;
	void piPrint() {
		B b = new B();
		double result = b.pi;
		System.out.println("result : " + result);
	}
}

class B {
	double pi = 0.0;
	void iPrint() {
		A a = new A();
		double result = a.ival;
		System.out.println("result : " + result);
	}

}

public class AnBTest {

	public static void main(String[] args) {
		A a = new A();
		a.piPrint();
		B b = new B();
		b.iPrint();
	}

}
