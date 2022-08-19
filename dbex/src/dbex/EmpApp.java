package dbex;

import java.util.ArrayList;

public class EmpApp {
	public static void main(String[] agrs) {
		empEao empDao = new empEao();
		ArrayList<Emp> emps = empDao.직원목록보기();
		Emp emp = empDao.직원한건보기(7369);
	}
}
