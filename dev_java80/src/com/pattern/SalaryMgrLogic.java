package com.pattern;

import java.util.Vector;

import com.vo.DeptVO;
import com.vo.EmpVO;

public class SalaryMgrLogic {
	SalaryMgrView	 view	 = null;
	SalaryMgrHandler handler = null;
	
	public SalaryMgrLogic(SalaryMgrHandler handler) {
		this.handler = handler;
		view = handler.view;
	}

	public void getEmpDetail(int pempno) {
		EmpVO eVO = new EmpVO();
		eVO.setEname("김유신");
		DeptVO dVO = new DeptVO();
		dVO.setDname("형상관리팀");
		eVO.setDvo(dVO);// Today's issue
		//java.util에서 제공되는 클래스로 타입에 대한 제약없이 늘었다 줄었다함.
		//연관있는 레코드를 한번에 밀어넣기 위해서 사용함.
		
		Vector oneRow = new Vector();
		oneRow.addElement(eVO.getEname());
		oneRow.addElement(eVO.getDvo().getDname());
		view.dtm_sal.addRow(oneRow);
		/*
		for(int r=0; r<cols.length; r++) {
			//for(int c=0; c<2; c++) {
			dtm_sal.setValueAt(eVO.getEname(), r, 0);
			dtm_sal.setValueAt(eVO.getDvo().getDname(), r, 1);
			//}
		}*/
	}
}
