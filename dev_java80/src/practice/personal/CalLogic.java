package practice.personal;

public class CalLogic {

	//선언부
	private String	 str	 = null;
	private int		 memory	 = 0;
	private int		 num	 = 0;
	private int		 result	 = 0;

	
	//생성자
	CalLogic() {
		this.str = "";
		this.memory = 0;
		this.num = 0;
		this.result = 0;
	}
	
	//메소드
	String getResult() {
		return this.result + "";
	}

	//각 계산을 구현해야한다.
		
		
		
	
	void clear() {
		this.str = "";
		this.memory = 0;
		this.num = 0;
		this.result = 0;
	}
		
	boolean isNum(String str) {
		if(str.charAt(0) >= '0' && str.charAt(0) <= '9') {
			return true;
		} else {
			return false;
		}
	}
	
	String makeNumStr(String str) {
		return this.str = this.str.concat(str);
	}
	
}
