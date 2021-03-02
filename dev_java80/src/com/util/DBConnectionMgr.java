package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionMgr {
	private final static String _DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final static String _URL 	= "jdbc:oracle:thin:@127.0.0.1:1521:orcl11";
	private final static String _USER	= "scott";
	private final static String _PW 	= "tiger";
	static DBConnectionMgr dbMgr = null;
	Connection con = null;
	public static DBConnectionMgr getInstance() {
		if(dbMgr == null) {
			dbMgr = new DBConnectionMgr();
		}
		return dbMgr;
	}
	
	public Connection getConnection() {
		try {
			Class.forName(_DRIVER);
			con =  DriverManager.getConnection(_URL, _USER, _PW);
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 클래스를 찾을수 없습니다.");
		} catch (SQLException se) {
			System.out.println(se + " - 오라클 서버와 연결 실패");
		}
		return con;
	}
	//사용한 자원 반납하기
	//SELECT일때 사용함.
	public void freeConnection(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		} catch (Exception e) {
			
		}
	}
	//사용한 자원 반납하기
	//INSERT, UPDATE, DELETE일떄 사용함.
	public void freeConnection(Connection con, PreparedStatement pstmt) {
		try {
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		} catch (Exception e) {
			
		}
	}
}
