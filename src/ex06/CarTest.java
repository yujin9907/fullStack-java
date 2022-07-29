package ex06;

class Car{
	// 필드 정의
	String color;
	int speed;
	int gear;
	void print() {
		System.out.println(color+" "+speed+" "+gear+" ");
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car(); // 객체 생성
		myCar.color ="red"; // 객체 필드 변경
		myCar.speed = 0;
		myCar.gear = 1;
		myCar.print(); //객체 메서드 호출
		
		Car yourCar = new Car(); // 또 다른 객체 생성
		yourCar.color = "blue"; // 객체 필드 변경
		yourCar.gear = 3;
		yourCar.speed = 60;
		yourCar.print(); // 메서드 호출

	}

}
