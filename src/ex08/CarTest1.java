package ex08;

class Car{
	// 상태
	private String color; // 색상
	private int speed; // 속도
	private int gear; // 기어
	
	// getter
	String getColor() {
		return color;
	}
	// setter
	void setColor(String color) {
		this.color = color;
		// 매개변수 color 스택
		// 속성 color 힙 뭐가 뭘까?
		// 그렇다면 여기선 가까이 있는 걸 쓴다, 스택 color;
		// 속성 color를 사용하기 위해선 this
	}
	
	int getSpeed() {
		return speed;
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
	int getGear() {
		return gear;
	}
	void setGear(int gear) {
		this.gear=gear;
	}
}

public class CarTest1 {

	public static void main(String[] args) {
		// 7장 예제 176페이지

		Car myCar = new Car(); // 커멜 표기법 ; 파스칼표기법이랑 차이?
		myCar.setColor("red");
		myCar.setSpeed(100);
		myCar.setGear(1);
		
		// 팀장이 설계를 잘해야 된다. 애초에 직접 접근 못하도록, private 과 게터세터
		System.out.println("현재 자동차의 색상은"+myCar.getColor());
		System.out.println("자동차의 속도는"+myCar.getSpeed());
		System.out.println("자동차의 기어는"+myCar.getGear());
		
	}

}
