package book.ch5;

public class ParameterTest {
	String g_rdname = null;
	
	static int methodA() {
		return 100;
	}
	
	static int methodA(int p_empno) {
		return 100;
	}
	void methodA(int p_empno, String rdname) {
		g_rdname = rdname;

	}
	public static void main(String[] args) {
		//int x = ParameterTest.methodA();
		//int x = ParameterTest.methodA(7566);
		ParameterTest pt = new ParameterTest();
		String rdname = "개발2팀";
		pt.methodA(7566, rdname);
		System.out.println(pt.g_rdname);
	}

}
