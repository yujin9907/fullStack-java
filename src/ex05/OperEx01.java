package ex05;

public class OperEx01 {

	public static void main(String[] args) {
		// 연산자, 교재 85
		System.out.println(1+1);
		System.out.println(1-1);
		System.out.println(1*1);
		System.out.println(4/2);
		System.out.println(3%2);
		System.out.println();
		
		// int/int = int
		System.out.println(10/3); // 3.333 이 아닌 몫만 3 나옴
		
		// int/double = double
		System.out.println(10/3.0); // 이렇게 해야 3.3333333
	}

}
