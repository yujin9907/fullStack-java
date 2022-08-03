package ex10;

class 엔진 {
	int power = 200;
	
	void powerUp() {
		power += power;
	}
}
class 자동차 extends 엔진{
	
}

public class Ex01 extends 엔진{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		자동차 s = new 자동차();
		
		System.out.println(s.power);
		s.powerUp();
	}

}
