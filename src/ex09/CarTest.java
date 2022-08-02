package ex09;

class Car{
	private String color;
	private int speed;
	private int gear;
	
	// 생성자 ; 초기 상태값을 결정 / 클래스 이름과 똑같은 형태는 메서드
	public Car(String color, int speed, int gear) {
		System.out.println("Car 객체가 만들어졌습니다.");
		this.color=color; // 일단 메모리에 스택이 올라감(생성자 메서드를 호출햇으니까)
		// 그럼 이제 그 생성자 메서드의 인자들은 스택 메모리에 올라갈 거고 그걸 힙에 올려줘야 되니까
		// 위 변수에 값을 전달하기 위해 this. 값 전달
		this.speed = speed;
		this.gear = gear;
	}
	// 초기화 코드 3번, 자주 활용함
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	
}

public class CarTest {

	public static void main(String[] args) {
		// 198p 생성자
		
		Car c = new Car("red", 10, 2);
		// new => 힙에 띄워라
		// ctrl 누르고 클릭하면 저새끼 근본으로 감
		// javac(컴파일러)가 컴파일할 때 자동으로 생성자를 만들어줌
	
		// 생성자 만들고 나니까, new객체에도 생성자 매개변수에 맞춰 인수를 넣어줘야 됨
		// 컴파일러가 자동으로 만들어주는 생성자는 인수가 없는 생성자임
		
		// 결국에 쓰다보면 생성자를 만드는 게 더 편함
	
		// 생성자가 호출이 될 때, 저 클래스의 변수가 메모리에 뜸
		
		System.out.println(c.toString()); // 3번 확인코드 출력
	}

}
