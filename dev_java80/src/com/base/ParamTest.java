package com.base;

public class ParamTest {

	public static void main(String[] args) {
		Param p = new Param();
		p.ival = 100;

	}
	void effectParam(Param p) {
		p.ival = 500;
		
	}
}
