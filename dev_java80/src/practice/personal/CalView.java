package practice.personal;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CalView {
	//선언부
	JFrame 		jf 		 	= null;
	JPanel 		jp_center	= null;
	JTextArea	jt_area		= null;
	JButton		numbers[] 	= null;
	JButton		buttons[] 	= null;
	String		btn_label[] = {"+", "-", "×", "÷", "7", "8", "9", "C", "4", "5", "6", "=", "1", "2", "3", "0"};
	CalHandler	handler		= null;
	
	//생성자
	public CalView() {

		jf = new JFrame();
		jf.setLayout(new BorderLayout());
		jt_area = new JTextArea();
		jp_center = new JPanel();
		jp_center.setLayout(new GridLayout(4,4,3,3));
		buttons = new JButton[btn_label.length];
		handler = new CalHandler(this);
		for(int i=0; i<btn_label.length; i++) {
			buttons[i] = new JButton(btn_label[i]);
			jp_center.add(buttons[i]);
			buttons[i].addActionListener(handler);
		}
		
		this.initDisplay();
		
	}
	
	//메소드
	public void initDisplay() {
		
		jf.add("Center", jt_area);
		jf.add("South", jp_center);
		jf.setTitle("계산기");
		jf.setSize(200, 200);
		jf.setVisible(true);
	}
	
	//main
	public static void main(String[] args) {
		new CalView();
	}

}
