package book.ch5;

import com.vo.DeptVO;
import com.vo.EmpVO;

public class EmpList {
	/**********************************************************************
	 *
	 * @param empno - 사원번호
	 * @return String[] - 사원이름, 부서명
	 **********************************************************************/
	public String[] getEmpDetail(int empno) {
		String[] info = new String[2];
		EmpVO eVO = new EmpVO();
		eVO.setEmpno(7566);
		int deptno = eVO.getDeptno();
		String ename = eVO.getEname();
		info[0] = ename;
		DeptVO dVO = new DeptVO();
		dVO.setDeptno(deptno);
		String dname = dVO.getDname();
		info[1] = dname;
		return info;
	}
	public static void main(String[] args) {
		
	}

}
