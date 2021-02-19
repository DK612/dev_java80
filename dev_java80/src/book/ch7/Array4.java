package book.ch7;
/*
 * 배열과 메소드 오버로딩 확인
 * 메소드 오버로딩 규칙
 * 1.반드시 파라미터의 갯수가 달라야한다.
 * 2.반드시 파라미터의 타입이 달라야 한다.
 * 
 * 주의 사항
 * 1.리턴타입이 있는지 없는지는 상관없다.
 * 2.접근제한자가 있는지 없는지는 상관없다.
 */
public class Array4 {
	double ds[], d2;
	double[] d3, d4;
	void methodA() {
		ds = new double[3];
		d2 = 5.4;
		d3 = new double[2];
		//d4 = 5.1 
		d4 = new double[6];
	}

	public static void main(String[] args) {
		
	}

}
