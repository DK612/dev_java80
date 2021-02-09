package com.base;

public class A {
	int age = 30;
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.age);
		A b = null; //NullPointerException 발생하지 않음
		System.out.println(b.age);//사용하면 발생
	}
}
