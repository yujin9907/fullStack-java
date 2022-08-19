package dbex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

//dao = data, access, object
public class empEao {
	// 이 메서드이 책임 = emp 데이터의 모든 데이터를 리턴
	public ArrayList<Emp> 직원목록보기() {
		ArrayList<Emp> emps = new ArrayList<>();

		try {
			Connection conn = DBConnection.connection();
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM emp");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Emp emp = new Emp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("JOB"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getTimestamp("hiredate"));
				emp.setSal(rs.getInt("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				emps.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return emps;
	}

	public Emp 직원한건보기(int e) {
		Emp emp = new Emp();
		try {
			Connection conn = DBConnection.connection();
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM emp WHERE empno="+e);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("JOB"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getTimestamp("hiredate"));
				emp.setSal(rs.getInt("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return emp;
	}
}
