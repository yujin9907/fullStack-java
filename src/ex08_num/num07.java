package ex08_num;

import java.util.Scanner;

class Login{
	private String id;
	
	void user(String s) {
		if(id.equals(s)) {
			System.out.println("맞음");
		}
	}
}

public class num07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Login l = new Login();
		
		l.user(s.next());

	}

}
