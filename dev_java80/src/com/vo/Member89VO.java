package com.vo;

public class Member89VO {

	private String	mem_id = null; //아이디 담기
	private String 	mem_pw = null; //비번
	private boolean gender = false;//성별
	
	/*
	 * 생성자는 반환 타입이없다.
	 * 클래스의 이름과 동일해야함
	 * 전역변수의 초기화를 담당
	 * static블럭에서 하는 일을 맡겨도 된다.
	 * 소켓통신을 통한다면 서버사이드와 클라이언트 사이드 구현
	 * 
	 * 메소드 오버로딩
	 * 전제조건 - 같은 이름이어야 한다.
	 * 접근 제한자 유무는 상관 없다.
	 * 리턴타입 유무도 상관 없다. -생성자는 리턴타입이 없으니 상관없음.
	 * 예외를 던지는지 아닌지는 상관없다.
	 */
	public Member89VO() {
		this.mem_id = null;
		this.mem_pw = null;
		this.gender = false;
	}
	public Member89VO(String mem_id) {
		this.mem_id = mem_id;
		this.mem_pw = null;
		this.gender = false;
	}
	public Member89VO(String mem_id, String mem_pw) {
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.gender = false;
	}
	public Member89VO(String mem_id, String mem_pw, boolean gender) {
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.gender = gender;
	}

	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pw() {
		return mem_pw;
	}
	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
