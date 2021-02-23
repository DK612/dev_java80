package book.ch5;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.vo.DeptVO;
import com.vo.EmpVO;

public class SalaryMgr implements ActionListener {
	//선언부
	JFrame 			  	 jf_sal 	 	 = null;
	String 				 cols[] 	 	 = {"사원명", "부서명"}; //DefaultTableModel(DateSet역할) + JTable = 테이블
	String				 data[][]   	 = new String[5][2];
	JTable 				 jtb_sal 	     = null; //화면, 양식, 폼을 그린다.
	DefaultTableModel	 dtm_sal 	     = null;
	JScrollPane			 jsp_sal		 = null;
	JTableHeader 		 jth_sal		 = null;
	JButton				 jbtns[] 		 = null;
	JButton				 jbtn			 = null;
	String				 jbtns_label[] 	 = {"조회", "입력", "수정", "삭제", "종료"};
	JPanel				 jp_north		 = null;
	
	//생성자 = 초기화
	public SalaryMgr() {
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
		for (int i = 0; i < jbtns_label.length; i++) {
			jbtn = new JButton(jbtns_label[i]);
			jbtns[i] = jbtn;//버튼객체 배열과 동기화처리
			jp_north.add(jbtn);
			//이벤트소스와 이벤트 처리 핸들러 메소드 매칭
			jbtns[i].addActionListener(this); //this는 현재 활성화된 객체 주소 번지 SalaryMgr
		}
		initDisplay();
	}
	
	//화면처리부
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
	
	//main
	public static void main(String[] args) {
		new SalaryMgr();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();//버튼의 주소번지를 출력함
		String command = ae.getActionCommand();  //버튼의 라벨값을 출력함
//		if(obj == jbtns[4]) { //직관적이지 않음
		if("종료".equals(command)) {
			System.out.println("종료버튼 이벤트 감지됨");
			//자바 가상머신과의 연결고리를 끊어줌. -가비지컬렉터에 의해서 Candidate상태로 빠짐
			System.exit(0);
			//System.gc(); //쓰레기값 청소 요청 그러나 호출해도 바로 처리되지는 않고 스레드에 의해 순서대로 처리됨
		}
		else if("조회".equals(command)) {
			System.out.println("조회버튼 이벤트 감지됨");
			EmpVO eVO = new EmpVO();
			eVO.setEname("이순신");
			DeptVO dVO = new DeptVO();
			dVO.setDname("개발1팀");
			eVO.setDvo(dVO);// Today's issue
			//java.util에서 제공되는 클래스로 타입에 대한 제약없이 늘었다 줄었다함.
			//연관있는 레코드를 한번에 밀어넣기 위해서 사용함.
			/*
			Vector oneRow = new Vector();
			oneRow.addElement(eVO.getEname());
			oneRow.addElement(eVO.getDvo().getDname());
			dtm_sal.addRow(oneRow);
			*/
			for(int r=0; r<cols.length; r++) {
				//for(int c=0; c<2; c++) {
				dtm_sal.setValueAt(eVO.getEname(), r, 0);
				dtm_sal.setValueAt(eVO.getDvo().getDname(), r, 1);
				//}
			}
		}
	}
}