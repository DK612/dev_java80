package com.pattern;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutView {

	public static void main(String[] args) {
		JButton jbtn_north = new JButton("북쪽");
		JButton jbtn_south = new JButton("남쪽");
		JButton jbtn_center = new JButton("중앙");
		JButton jbtn_east = new JButton("동쪽");
		JButton jbtn_west = new JButton("서쪽");
		JFrame jf = new JFrame();
		jf.setLayout(new BorderLayout());
		jf.add("North", jbtn_north);
		jf.add("South", jbtn_south);
		jf.add("Center", jbtn_center);
		jf.add("East", jbtn_east);
		jf.add("West", jbtn_west);
		jf.setSize(500, 400);
		jf.setVisible(true);
	}

}
