package ex07;

class 계산기{
	int result=0; // 힙 변수
	
	// 메서드는 무조건 클래스 하위에
	void add(){	
		System.out.println("더하기 메서드 호출");
	} // 메서드의 기본형, {} 내부는 메서드를 호출했을 때 실행
	
	int a = 10; // 얘는 힙에
	void minor(int a, int b) {
		// 메서드 내부에서 만들어진 변수는 스택에
		// 메모리 위치가 같으면 오류, 다르면 ㄱㅊ
		// 스택 메모리: 메서드 실행시 부여되고 종료되면서 사라짐
		System.out.println(a-b);
		result = a-b; // 리절트는 힙 변수기 때문에 함수가 종료되도 result는 유지됨(값이 유지됨)
	}
	//하지만 굳이 힙 변수를 사용하지 않고 return 을 많이 사용함
	int plus(int a, int b) {
		return a+b;
	}
	
	int mul(int x, int y) {
		return(x*y);
	}
	int div(int x, int y) {
		return(x/y);
	}
	
}

public class MethEx01 {
	
	//여기에도 메서드 생성 가능
	
	public static void main(String[] args) {
		// 객체지향관 조금 멀리... 문법 공부
		계산기 g = new 계산기();
		g.add();
		g.minor(10,5);
		// 이 메서드가 호출 됐을 때, minor의 매개변수가 스택에 순간 4바이트씩, 메모리에 떴다가 메서드 종료시 사라짐
		// 마이너가 종료되는 시점, 즉 15번 라인에 메모리의 ab가 사라짐
		g.plus(10, 5); // 5
		int resultPlus=g.plus(10, 5); // 결과값이 바로 나오기 때문에 이렇게 변수에 담을 수도 있음
		System.out.println(resultPlus);
		
		System.out.println(g.mul(10, 5));
		System.out.println(g.div(10, 5));
	}

}
