package ex12;

// 추상메서드만 가진다
// new 못 함
interface Move{
	abstract void left();
	void right(); // 이래도 오류 안 남? 근데 자동으로 추상메서드 처리해줌 컴파일러가
}
class Game implements Move{

	@Override
	public void left() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		
	}
}
// 인터페이스는 다형성을 지킬 필요가 없음
// 그럼 추상클래스랑 뭐가 다른가?
// 인터페이스는 왜 쓰고 어디에 사용되는가?

public class InterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
