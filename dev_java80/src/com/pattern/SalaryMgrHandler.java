package com.pattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalaryMgrHandler implements ActionListener{

	SalaryMgrLogic logic = null;
	SalaryMgrView  view  = null;
	
	public SalaryMgrHandler(SalaryMgrView view) {
		this.view = view;
		logic= new SalaryMgrLogic(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		Object obj = ae.getSource();//버튼의 주소번지를 출력함
		String command = ae.getActionCommand();  //버튼의 라벨값을 출력함
		if(obj == view.jbtns[4]) { //직관적이지 않음
		//if("종료".equals(command)) {
			System.out.println("종료버튼 이벤트 감지됨");
			//자바 가상머신과의 연결고리를 끊어줌. -가비지컬렉터에 의해서 Candidate상태로 빠짐
			System.exit(0);
			//System.gc(); //쓰레기값 청소 요청 그러나 호출해도 바로 처리되지는 않고 스레드에 의해 순서대로 처리됨
		}
		else if("조회".equals(command)) {
			System.out.println("조회버튼 이벤트 감지됨");
			logic.getEmpDetail(7566);
			
		}
	}
}
