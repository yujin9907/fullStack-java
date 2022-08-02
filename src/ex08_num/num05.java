package ex08_num;

import java.util.Scanner;

class reString{
	void print(String t) {
	for(int i=t.length();i>=1;i--) {
		System.out.print(t.charAt(i-1));
	}
	}
}

public class num05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String t = sc.next();
		reString re = new reString();
		
		re.print(t);
		

	}

}
