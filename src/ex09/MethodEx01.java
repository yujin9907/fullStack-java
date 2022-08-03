package ex09;


public class MethodEx01 {
	static int add(int a, int b) {
		return a+b;
	}
	static int minus(int a, int b) {
		return a-b;
	}
	public static void main(String[] args) {
		
		int r1 = add(10,5);
		int r2 = minus(r1,10);
		System.out.println(add(10, 5));
		System.out.println(minus(10, 5));
		
//		정리
//		1. 메서드 안에 메서드 못 넣음 => 메모리와 관련해서 이해
//		2. 메서드를 호출하면 결과값으로 변하는 것
//		3. 그렇기 때문에 변수에 담거나 뭐 상수처럼 사용할 수 있음
//		4. r1, r2를 만드는 게 목적
//		생활코딩 메서드 참고
	}

}
