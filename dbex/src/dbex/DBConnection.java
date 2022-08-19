package dbex;

import java.sql.Connection;
import java.sql.DriverManager;

// emp, empdao, dbconnection 세개로 프로그램
public class DBConnection {
	// public 이 붙어야 다른 패키지에서 import 가능, 접근제어자 공부좀...
	public static Connection connection() {
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
}
