package com.base;

import javax.swing.JFrame;
public class SeoulTemp {
	void methodA() {
		
	}
	double methodB() {
		return 3.14;
	}
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		SeoulTemp st = new SeoulTemp();
		st.methodB();
		System.out.println(st.methodB());
	}

}
