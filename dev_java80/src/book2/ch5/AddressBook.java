package book2.ch5;

import javax.swing.JFrame;

//싱글톤 패턴을 적용하여 디스플레이를 사용함으로써
//디스플레이가 객체마다 반복적으로 호출되고 사용되는 낭비를  방지한다.
public class AddressBook extends JFrame {
	//선언부
	private static AddressBook aBook = null;
	JFrame jf = null;
	
	//생성자
	
	//메소드
	public static AddressBook getInstance() {
		if(aBook == null)
			aBook = new AddressBook();
		return aBook;
	}
	
	public void initDisplay() {
			jf = new JFrame();
	}

	public static void main(String[] args) {
		aBook = new AddressBook();
		aBook.initDisplay();
	}

}
