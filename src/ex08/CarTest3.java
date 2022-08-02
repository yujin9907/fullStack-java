package ex08;

class Car2{ // 같은 패키지 내 같은 이름의 클래스가 있으면 안 됨.(서로 접근 가능하므로)
	// 상태
	private String color; // 색상
	private int speed; // 속도
	private int gear; // 기어
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	
	//값확인 3. 로그출력
	void print() {
		System.out.println("color:"+color);
		System.out.println("speed:"+speed);
		System.out.println("gear:"+gear);
	}
	
	// 상태만들고 -> 게터세터하는 것 : 하나의 세트
}

public class CarTest3 {

	public static void main(String[] args) {
		// 7장 예제 176페이지

		Car2 myCar = new Car2(); // 커멜 표기법 ; 파스칼표기법이랑 차이?
		myCar.setColor("red");
		myCar.setSpeed(100);
		myCar.setGear(1);
		
		myCar.print(); // 로그출력(3)
		
		// 이 값을 확인하기 위해2: 디버그
		System.out.println();
		
		//값확인위해 1번방법
		// 팀장이 설계를 잘해야 된다. 애초에 직접 접근 못하도록, private 과 게터세터
//		System.out.println("현재 자동차의 색상은"+myCar.getColor());
//		System.out.println("자동차의 속도는"+myCar.getSpeed());
//		System.out.println("자동차의 기어는"+myCar.getGear());
		
	}

}
