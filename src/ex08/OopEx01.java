package ex08;

class 엘리스{
	private int 갈증 = 100; // 객체의 상태
	
	// 왜 사용을 해야 하는지 이해를 해야 됨
	
	// getter ; 175p, 접근자(그냥 접근)
	int 갈증확인() {
		return 갈증; 
	}

	// 갈증 지수를 변경하기 위한 행위
	// setter ; 설정자(뭔가 변경)
	void 물마시기() {
		갈증-=20; // 내부에 있는 변수는 따로 호출(.) 없이 바로 호출, this가 생략돼 있음
	}
}

public class OopEx01 {

	public static void main(String[] args) {
		// 접근지정자

		엘리스 e = new 엘리스(); // 메모리(힙)에 띄우기
		// e.갈증 = e.갈증-20; // 상태에 바로 접근해서 바꾸는 건 객체지향 어긋
		// System.out.println("엘리스 갈증 지수: "+e.갈증);
		
		// 이런 실수를 방지하기 위한 설계로 private 활용
		// 변수에 바로 접근할 수 없음
		e.물마시기();
		// 출력 또한 메서드로, 객체지향의 원칙대로 모든 변수는 직접 접근하지 않고
		// 행위를 통해, 메서드를 통해 변경함, 이 강제성(상태에 직접 접근하는 것을 위해 private을 사용
		System.out.println("갈증 지수는"+e.갈증확인());
		
	}

}