package book.ch7;
/*
 * 배열은 한번 선언하면 원소의 수를 조정 불가함.
 * 끼워 넣기가 안됨.
 * 
 */
public class Array1 {
	
	public void printArray(int empnos[]) {
		int cnt = 0;
		for(int i = 0; i < empnos.length; i++) {
			System.out.println(++cnt+"번방 : " +empnos[i]);
		}
	}

	public static void main(String[] args) {
		int empnos[] = new int[14];
		Array1 a1 = new Array1();
		a1.printArray(empnos);
		
	}

}
