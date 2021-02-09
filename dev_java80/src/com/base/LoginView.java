package com.base;

import javax.swing.JFrame;
/*
 * 메소드의 파라미터는 없을 수도 있고
 * 하나일 수도 있으며
 * 둘이상도 가능 하더라..... 느낀점 -setSize(title,boolean)
 * 즉 메소드를 호출할 때는 파라미터의 갯수와 타입 모두가 일치해야 함.
 */
public class LoginView {
	int go(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		JFrame jf2 = new JFrame();
		String title = "로그인";
		int width = 700;
		int height = 500;
		
		jf.setTitle(title);
		jf.setSize(width, 300);
		jf.setVisible(true);
		
		LoginView lv = new LoginView();
		int y = lv.go(50,100);
		System.out.println(y);
		
		jf2.setSize(500, 300);
		jf2.setVisible(true);
	}

}
