package ex12;


// 미완성 설계도, 굳이 뉴에 띄울 필요가 없음.
// 추상클래스는 new, 객체 생성을 하지 못함.
abstract class Animal {
	abstract void sound(); // 추상메서드 ; 미완성 설계도
	// 강제성 부여 ; 기본: 추상메서드를 들고 있으면 뉴를 못함
	// 즉, 익스탠스를 하면서 추상메서드를 가지게 된 도그와 캣은
	// 추상메서드를 정의해야만 사용할 수 있음. 
	
	// 추상 클래스의 특징: 공통적인 거 뽑아내기, 강제성
	void move() {
		System.out.println("달린다");
	}
}
class Dog extends Animal{
// 오류 떴을 때, 그냥 위에 올리고 에드 매서드 어쩌고 눌러주면 자동완성
	@Override // 그냥 힌트 정도로 생각하면 됨
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
	
}
class Cat extends Animal{
	void sound() {
		System.out.println("야옹");
	}

}
// 의존했기 때문에, 도그와 캣에 직접 접근할 필요 없고 애니멀에 접근하면 다 사용할 ㅅ ㅜ잇느 장점
// 위부터 설계하는 게 아니라 추상적인 거부터하는 게 아니라
// 구체적인 거 일단 상태와 행위를 정해놓고
// 공통적인 걸 뽑아서 설계하는 거임 ; 원리

public class AbstEx01 {

	public static void main(String[] args) {

		Cat c = new Cat();
		c.sound();
		
	}

}
