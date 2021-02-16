package com.base;
/*
 * ++i는 i = i + 1과 같다.
 * --i는 i = i - 1과 같다.
 * i++는 후위 연산자이므로 선비교 후 증가.
 * ++i는 전위 연산자
 */

public class Exam1 {

	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		if((++i > j--) | (++i > j)) {
			System.out.println("조건: true, i : " + i + ", j : " + j);
		} else {
			System.out.println("조건: false, i : " + i + ", j : " + j);
		}
		i = 1;
		j = 2;
		if((++i > j--) || (++i > j)) {
			System.out.println("조건: true, i : " + i + ", j : " + j);
		} else {
			System.out.println("조건: false, i : " + i + ", j : " + j);
		}
	}

}
