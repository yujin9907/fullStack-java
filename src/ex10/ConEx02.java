package ex10;

class 햄버거 {
	String name = "햄버거";
	
	public 햄버거() {
		System.out.println(1);
	}

	public 햄버거(String name) {
		super();
		this.name = name;
	}
	
	
}
class 더블치즈햄버거 extends 햄버거 {
	public 더블치즈햄버거() {
		super("빅맥");
		System.out.println(2);
	}
}
// 다형성 성립해서 상속해줌
// new 더블치즈하면 햄버거도 뜨는 상태
public class ConEx02 {

	public static void main(String[] args) {
		더블치즈햄버거 s = new 더블치즈햄버거();
	}

}
