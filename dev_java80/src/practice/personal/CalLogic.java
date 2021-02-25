package practice.personal;

public class CalLogic {

	//선언부
	private String	str	 		= null;
	private String 	op			= null;
	private long	memory	 	= 0L;
	private long	cur_value	= 0L;
	private long	result	 	= 0L;
	private boolean first 		= true;
             
	
	//생성자
	CalLogic() {
		this.init();
	}
	
	//메소드
    void init() {	//속성들을 초기화
    	this.str = "";
    	this.op = "";
		this.memory = 0L;
		this.cur_value = 0L;
		this.first = true;
    }
	String getResult() {
		return this.result + "";
	}

	void getOperation(String op) {
		this.cur_value = Long.parseLong(this.str);
		this.str = "";
		if(this.first == true) {
			this.memory = this.cur_value;
			this.first = false;
		}
		this.op = op;
	}
	
	String operate() {
		this.result = 0L;
		this.cur_value = Long.parseLong(this.str);
			
		if("+".equals(this.op)) {
			result = this.memory + this.cur_value;
		} else if("-".equals(this.op)) {
			result =  this.memory - this.cur_value;
		} else if("×".equals(this.op)) {
			result = this.memory * this.cur_value;
		} else if("÷".equals(this.op)) {
			result = this.memory / this.cur_value;
		} else if("=".equals(this.op)) {
			result = result;
		}
		this.memory = result;
		this.cur_value = 0;
		this.str = "";
		return Long.toString(result);
	}
	
	String getMemory() {
		return Long.toString(this.memory);
	}
	
	void backspace() {
		if(this.str.length() >= 1) {
			this.str = this.str.substring(0, this.str.length()-1);
		}
	}
	void clear() {
		this.str = "";
	}
		
	boolean isNum(String str) {
		if(str.charAt(0) >= '0' && str.charAt(0) <= '9') {
			return true;
		} else {
			return false;
		}
	}
	
	String getString() {
		return this.str;
	}
	
	String getString(String str) {
		return this.str = this.str.concat(str);
	}
	
}
