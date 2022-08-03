package ex10;

class 동물{
	void sound() {
		System.out.println("동물");
	}
}
class 강아지 extends 동물{
	void sound() {
		System.out.println("강아지");
	}
} // 다형성 성립 -> 상속할 수 있음 강아지야 너 동물이니
class 고양이 extends 동물{
	void sound() {
		System.out.println("고양이");
	}
}

public class ExtendsEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		강아지 u1 = new 강아지();
		u1.sound();
		동물 u2 = new 강아지();
		u2.sound(); // 타고내려가서 자동으로 강아지로 변함
	}

}
