package practice.personal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalHandler implements ActionListener {

	//선언부
	CalView 	view	= null;
	CalLogic 	logic	= null;
	
	//생성자
	CalHandler(CalView view) {
		//System.out.println("handler 초기화됨");
		this.view = view;
		this.logic = new CalLogic();
	}

	//메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		//Object obj = e.getSource();
		String cmd = e.getActionCommand();
		
		if(logic.isNum(cmd)) {
			view.jt_area.setText(logic.getString(cmd));
			
		} else if("+".equals(cmd)) {
			logic.getOperation(cmd);
			view.jt_area.setText(logic.getMemory());
		} else if("-".equals(cmd)) {
			logic.getOperation(cmd);
			view.jt_area.setText(logic.getMemory());
		} else if("×".equals(cmd)) {
			logic.getOperation(cmd);
			view.jt_area.setText(logic.getMemory());
		} else if("÷".equals(cmd)) {
			logic.getOperation(cmd);	
			view.jt_area.setText(logic.getMemory());

		} else if("=".equals(cmd)) {
			view.jt_area.setText(logic.operate());
		} else if("←".equals(cmd)) {
			logic.backspace();
			view.jt_area.setText(logic.getString());
		} else if("C".equals(cmd)) {
			logic.clear();
			view.jt_area.setText("");
		} else if("AC".equals(cmd)) {
			logic.init();
			view.jt_area.setText("");
		} else if("".equals(cmd)) {

		} else if("종료".equals(cmd)) {
			System.exit(0);

		}
	}

}
