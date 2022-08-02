package ex08;

class Car3{

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
	@Override
	public String toString() {
		return "Car3 [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	
}

public class CarTest2 {

	public static void main(String[] args) {

		Car3 myCar = new Car3(); 
		myCar.setColor("red");
		myCar.setSpeed(100);
		myCar.setGear(1);
		
		System.out.println(myCar.toString());
	}

	
}
