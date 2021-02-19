package com.pattern;

import java.awt.BorderLayout;
//import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class RandomGameView implements ActionListener {
	
	//동쪽에 붙일 속지 선언 및 생성
	JPanel jp_east = new JPanel(); //Fragment - in 안드로이드
	JButton jbtn_new = new JButton("새 게임");
	JButton jbtn_clear = new JButton("지우기");
	JButton jbtn_dap = new JButton("정답");
	JButton jbtn_exit = new JButton("종료");
	
	//중앙에 그려질 속지 선언 및 생성
	JTextArea jta_display = new JTextArea(7, 20);
	JScrollPane jsp_display = new JScrollPane(jta_display,
											  JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
											  JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	//남쪽에 그려질 속지, 버튼틀 10개 선언 및 생성
	JPanel jp_south = new JPanel();
	JButton jbtns[] = new JButton[10];
	JButton jbtn = null;
	String nums_label[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	
	public void initDisplay() {
		
		jbtn_exit.addActionListener(this);

		JFrame jf = new JFrame();	
		jp_south.setLayout(new GridLayout(1,10,3,3));
		jp_east.setLayout(new GridLayout(4,1,2,2));
		jp_east.add(jbtn_new);
		jp_east.add(jbtn_clear);
		jp_east.add(jbtn_dap);
		jp_east.add(jbtn_exit);
		
		//남쪽의 숫자버튼들
		for(int i=0; i<jbtns.length; i++) {
			jbtn = new JButton(nums_label[i]);
			jbtns[i] = jbtn;
			jp_south.add(jbtn);
			jbtn.addActionListener(this);
		}
		//jp_east.setBackground(Color.blue);
		//jp_south.setBackground(Color.red);
		jf.setLayout(new BorderLayout());
		jf.add("East", jp_east);
		jf.add("Center", jsp_display);
		jf.add("South", jp_south);
		jf.setSize(500, 400);
		jf.setVisible(true);
	}
	

	public static void main(String[] args) {
		RandomGameView rgView = new RandomGameView();
		rgView.initDisplay();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		System.out.println(command+" , "+ e.getSource());
		if(e.getSource() == jbtn_exit) {
			System.exit(0); //자바 가상 머신과 연결고리 끊어짐.
		} else if(e.getSource()==jbtns[5]) {
			jta_display.append(command);
		}
	}

}
