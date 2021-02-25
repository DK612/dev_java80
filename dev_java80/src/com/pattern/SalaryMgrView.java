package com.pattern;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/*
 * 클래스 쪼개기를 하면서 생성자에 대한 활용능력을 키워본다.
 * static을 사용하는것은 반칙이다.(생성자 공부가 되지 않는다.)
 * 뷰계층-업무처리계층-이벤트처리핸들러
 * 
 * 누가 누구를 인스턴스화 해야하는가? 내생각:뷰가 핸들러를 그리고 핸들러가 로직을
 * 생성자의 피라미터 자리에는 무엇을써야할까요?
 * SalaryMgrView 는 이벤트핸들러에게 버튼같은것의 라밸이나 주소같은것을 넘긴다.
 * SalaryMgrHendler 이벤트핸들러는 라벨이나 주소를 받아 거기에 걸맞는 로직을 호출한다.
 * SalaryMgrLogic 이벤트 핸들러에게 호출을 받아서 처리를 한다.
 * 세 개의 클래스를 그림으로 표시한 뒤 화살표를 통해서 객체 주입관계를 완성하시오
 */
public class SalaryMgrView {
	
	JFrame 			  	 jf_sal 	 	 = null;
	String 				 cols[] 	 	 = {"사원명", "부서명"}; //DefaultTableModel(DateSet역할) + JTable = 테이블
	String				 data[][]   	 = new String[0][2];
	JTable 				 jtb_sal 	     = null; //화면, 양식, 폼을 그린다.
	DefaultTableModel	 dtm_sal 	     = null;
	JScrollPane			 jsp_sal		 = null;
	JTableHeader 		 jth_sal		 = null;
	JButton				 jbtns[] 		 = null;
	JButton				 jbtn			 = null;
	String				 jbtns_label[] 	 = {"조회", "입력", "수정", "삭제", "종료"};
	JPanel				 jp_north		 = null;
	SalaryMgrHandler 	 handler 		 = null;
	
	//생성자 = 초기화
	public SalaryMgrView() {
		jf_sal = new JFrame(); //선언과 생성을 분리해본다. -차이가 무엇인지  이때 메모리 로딩(점유)
		//테이블안에 면에 데이터를 매칭하는데 필요한 클래스 선언(DataSet의 역할을 함-SELECT문 혹은 저장 또는 프로시저와 연계할 클래스
		//웹에서는 JSON의 역할을 수행하는 클래스
		dtm_sal = new DefaultTableModel(data, cols);
		//테이블의 양식을 작성하는 클래스
		jtb_sal = new JTable(dtm_sal);
		//JTable에 스크롤 바를 그려줄 속지 클래스
		jsp_sal = new JScrollPane(jtb_sal);
		//메소드를 통해서도 객체를 주입받을수있다.
		//테이블의 헤더를 그려줄 클래스 생성
		jth_sal = jtb_sal.getTableHeader();
		//버튼을 추가할 속지 클래스
		jp_north = new JPanel();
		//버튼을 추가한 속지에 layout 셋팅
		jp_north.setLayout(new GridLayout(1, jbtns_label.length, 3, 3));
		//버튼 초기화 및 속지에 할당
		jbtns = new JButton[jbtns_label.length];

		handler = new SalaryMgrHandler(this);

		for (int i = 0; i < jbtns_label.length; i++) {
			jbtn = new JButton(jbtns_label[i]);
			jbtns[i] = jbtn;//버튼객체 배열과 동기화처리
			jp_north.add(jbtn);
			//이벤트소스와 이벤트 처리 핸들러 메소드 매칭
			jbtns[i].addActionListener(handler); //this는 현재 활성화된 객체 주소 번지 SalaryMgr
		}
		
		initDisplay();
	}
	
	public void initDisplay() {
		System.out.println("initDisplay 호출성공");
		jth_sal.setBackground(Color.green); //API활용 능력을 키워준다.
		//jth_sal.setReorderingAllowed(false); //컬럼의 순서가 바뀌는 것을 막아준다.
		jf_sal.add("North", jp_north);
		jf_sal.add("Center", jsp_sal);
		jf_sal.setTitle("급여명세서");
		jf_sal.setSize(400,300);
		jf_sal.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new SalaryMgrView();
	}
}
