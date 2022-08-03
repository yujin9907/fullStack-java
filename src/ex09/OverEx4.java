package ex09;

class 유닛{
	void 공격(유닛 a) {}
}
class Zealot extends 유닛{
	int power = 5;
	int hp = 100;
	
	void 공격(Zealot z, Dragoon b) {
		b.hp-=power;
	}
	void 공격(Zealot z, River r) {
		r.hp-=power;
	}
}
class Dragoon{
	int power = 10;
	int hp = 100;
}
class River{
	int power = 50;
	int hp = 100;
}

public class OverEx4 {

	public static void main(String[] args) {
		유닛 z = new Zealot();
		
		유닛.공격(z, d);
	}

}
