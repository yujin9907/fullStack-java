package ex08_num;

import java.util.Scanner;

class CalA{
	int v=0;
	int c=0;
	
	void cal(String s) {
		for(int i=0;i<s.length();i++) {
			switch(s.charAt(i)) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
				v++;
			break;
			default:
				c++;
			}
		}
	}
}

public class num06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		CalA c = new CalA();
		
		c.cal(s);
	}

}
