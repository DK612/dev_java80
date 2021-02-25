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
			view.jt_area.setText(logic.makeNumStr(cmd));
			
		} else if("+".equals(cmd)) {

		} else if("-".equals(cmd)) {

		} else if("×".equals(cmd)) {
			
		} else if("÷".equals(cmd)) {

		} else if("C".equals(cmd)) {
			logic.clear();
			view.jt_area.setText("");

		} else if("=".equals(cmd)) {
			view.jt_area.setText(logic.getResult());
		}
	}

}
