package ex09;

class 햄버거 {
	int price;
	String name;

	public 햄버거() {
		this(1000, "기본햄버거");
	}
	// 생성자; 일반적으로 생성자는 값을 초기화해야 한다.
	public 햄버거(int p, String n) {
		this.price = p;
		this.name = n;
	}
}

public class ConEx01 {

	public static void main(String[] args) {
		햄버거 s = new 햄버거(3000, "치즈햄버거");
	}

}
