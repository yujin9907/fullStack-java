package ex09;

class Zealot{
	int power = 5;
	int hp = 100;
}
class Dragoon{
	int power = 10;
	int hp = 100;
}
class River{
	int power = 50;
	int hp = 100;
}

// 리버가 추가됨 그럼 메서드 +4 개

// 근데 20개가 캐릭터가 늘어났다고 생각해보자... 어떡함..?
// 오버로딩의 한계
// -> 추상화
// 상속은 다형성, 추상화를 위해 사용하는 것; 코드의 아름다움을 위해

public class OverEx03 {
	
	// 질럿이 드라군을 공격
	static void attack(Zealot u1, Dragoon u2) {
		u2.hp -= u1.power;
		System.out.println("u2의 hp:"+u2.hp);
	}
	// 최악의 코드1 ; 어택 안에 if로 질럿이 드라곤 패고 드라곤이 패고 여러 책임 다 때려넣기
	// 최악의 코드2
//	static void attack2(Zealot u1, Dragoon u2) {
//		u2.hp -= u1.power;
//		System.out.println("u2의 hp:"+u2.hp);
//	}	
	//좋은 코드 ; 인자를 바꿈으로서 같은 어택이지만 깔끔하게 코드 작성
	static void attack(Dragoon u2, Zealot u1) {
		u2.hp -= u1.power;
	}
	static void attack(Dragoon u2, River u3) {
		u2.hp -= u3.power;
	}
	static void attack(River u3, Dragoon u2) {
		u3.hp -= u2.power;
	}
	static void attack(Zealot u1, River u3) {
		u1.hp -= u3.power;
	}
	static void attack(River u3, Zealot u1) {
		u3.hp -= u1.power;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zealot z = new Zealot();
		Dragoon d = new Dragoon();
		
		attack(z, d);

	}

}
