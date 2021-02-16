package com.base;

import java.util.Scanner;

public class Series {
	private int num = 1;
	private int numOfElements = 1;
	private int[] arr = null;
	
	void setNum(int n) {
		this.num = n;
	}
	void setElements(int n) {
		this.numOfElements = n;
	}
	
	void setArr() {
		arr = new int[numOfElements];
	}
	
	 void makeSeries() {

		for(int i = 0; i <arr.length; i++) {
			arr[i] = num * (i+1);
		}
	}
	void printSeries() {
		System.out.println("등비 " + num + "의 " + arr.length + "번째까지의 수열은");
		for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Series series = new Series();

		System.out.print("등비수열을 몇번째까지 출력할까요? : ");
		series.setElements(sc.nextInt());
		System.out.print("등비 n을 입력하세요: ");
		series.setNum(sc.nextInt());
		
		
		series.setArr();
		series.makeSeries();
		series.printSeries();
	
	}

}
