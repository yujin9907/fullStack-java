package ex06;

// 상태(변수) 만들기, 위치 : 클래스 하위(바로 아래) 메서드 안에는 아님
// 이 클래스를 나중에 힙에 올리면 실체화가 되는 것 (인스턴스화)
class People{
	String name = "허";
	String gender = "남";
	int age = 20;
	int money = 1000;
}



public class OpEx01 {
	
	static int num = 10;
	
	public static void main(String[] args) {
		// jvm 아키텍처1) static 키워드를 찾고(메모리에 띄우고) 
		// 2) main을 찾아 띄운다(=static? 메모리에 올린다), 즉 static은 메인 메서드 전에 먼저 실행 됨.
		// 단, static name, static age 처럼 모든 변수를 static에 띄우면 프로그램 시작부터 실행되기 때문에 비효율적
		
		System.out.println(num); // 결과값 나옴
		
		// new = heap 에 띄워라
		new People(); // 힙에 피플을 띄워라, static이 없는 변수들을 힙에 띄움, static 이 붙은 변수는 힙에 못 들어감
		// 이 경우엔, 메인 이후 실행 (힙에 people 블럭 실행)
		// 주소, 부를 수 있어야 되기 때문에 변수에 넣어줌
		// 타입은 클래스명 -> 커스텀 타입 (또는 클래스 타입)
		People p = new People();
		// 힙에 각각 두개가 떠 있게 됨 (별도의 객체)
		People p2 = new People();
		
		// 이 .은 연결 연산자, 힙 공간에 있는 것-> 주소를 명시하기 위해서 .
		System.out.println(p.money);
		System.out.println(p.name);
		System.out.println(p.gender);
		System.out.println(p.age);
		System.out.println("-----------------------------");
		System.out.println(p2.name);
		System.out.println(p2.gender);
		System.out.println(p2.age);
		System.out.println(p2.money);
		
	}

}
