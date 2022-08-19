package dbex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class test02 {

	static void send() {

	}

	static Connection connection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", // protocol name @ ip
																									// 주소 : 포트 :DB의 이름
					"SCOTT", // id
					"TIGER" // password
			);
			return conn;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		// 메인스택안에 트라이 스택이 있는 거임
		// 즉, 메인 스택에서 정의한 변수는 사용할 수 있지만, 트라이에서 생성할 걸 메인은 참조못함 ㅅㄱ

		ArrayList<Emp> emps = new ArrayList<>();
		// Emp[] s = new Emp[14]; 타입이 emp 객체를 사용하면 배열도 가능하지만
		// 고정 배열이기 때문에 스키마가 바뀌면;; 아니면 데이터가 수정되면 ;;
		// 아직은 메모리 속도 고려하지 말자 arraylist가 좀 느림, 그때 가서 어떻게 해볼 문제

		try {
			// 1 DB연결
			Connection conn = connection();

			// 2 문장완성
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM emp");

			// 3 문장 전송
			ResultSet rs = pstmt.executeQuery(); // rs가 커서

			// 4. 커서 한칸 내리기
			// rs.next(); // 커서를 한칸 내리는 것
			// boolean isTrue = rs.next();

			// 5. 커서 false까지 내리기
//	         while(rs.next()) {
//	        	 System.out.println(rs.getInt("empno"));
//	         }

			// 6. 테이블 만들기
			// Emp emp; // 이런 경우는? 노션참고
			while (rs.next()) { // 14바퀴
				Emp emp = new Emp(); // 와일스택 안 생성한 것 -> 트라이스택에선 참조 못함 당연히
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("JOB"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getTimestamp("hiredate"));
				emp.setSal(rs.getInt("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				emps.add(emp);
				// 엔티티를 생성해서 옮겨주고 마무리로 컬렉션에 담아줌으로서 힙공간에 데이터를 추가해준 것.
				// 컬렉션은 레퍼런스가 밖에 있으니까 안 사라짐 (emps => 메인 스택에서 생성했음)

			}
			System.out.println("끝");

		} catch (Exception e) {
			e.printStackTrace();
			// 디버깅을 위해 필요
			// 피범벅의 제일 끝 줄을 보는 게 맞음. 중간에 있을 수도 있긴 있음. 내가 적은 클래스를 찾아서 디버깅
		}
		// 데이터 확인, for+컨트룰스페이스=인텔리의 알트엔터
		// 컬렉션의 크기는 length 아니고 size
		// 메서드 호출 = 점프, 순서가 느려짐.
		// 그래서 i<emps.size()를 하는 것보다(포문 실행할 때마다 점프를 해야됨) 변수를 만들고 (점프를 한번만 하면됨)
		// 훨씬 효율적.
		// 인텔리에 컨y = 컨d
		int size = emps.size();
		for (int i = 0; i < size; i++) {
			System.out.println(emps.get(i).getEname());

		}
		// 데이터 전송
		// send(emps);

	}
}
