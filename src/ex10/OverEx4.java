package ex10;

class unit{
	int p;
	int hp;
	
	int hp(){
		return 1;
	}
	int p() {
		return 1;
	}
	void setHp(int re) {
		hp = re;
	}
}
class Zealot extends unit{
	int power = 5;
	int hp = 100;
	
	int hp() {
		return hp;
	}
	int p() {
		return power;
	}
	void setHp(int re) {
		hp = re;
	}
}
class Dragoon extends unit{
	int power = 10;
	int hp = 100;
	
	int hp() {
		return hp;
	}
	int p() {
		return power;
	}
	void setHp(int re) {
		hp = re;
	}
}
class River extends unit{
	int power = 50;
	int hp = 100;
	
	int hp() {
		return hp;
	}
	int p() {
		return power;
	}
	void setHp(int re) {
		hp = re;
	}
}

public class OverEx4 {
	

	static void attack(unit a, unit b) {
		int hp = b.hp();
		int p = a.p();
		int re = hp-p;
		b.setHp(re);
		System.out.println("공격: "+p+" hp는 "+b.hp());
	}

	public static void main(String[] args) {
		unit z = new Zealot();
		unit d = new Dragoon();
		unit r = new River();
		
		attack(z, d);
		
	}

}
