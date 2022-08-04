package ex10;

class 햄버거{
	String name="햄버거";

	String getName() {
		return "하하하";
	}
}
// 더블치즈 햄버거야 너 햄버거니? 응 -> 다형성 성립 -> 상속됨
class 더블치즈햄버거 extends 햄버거{
	String name="더블치즈햄버거";
	
	String getName() { //재정의=오버라이드=부모메서드의무효화
		return name;
	}
}
// 상속함, 이제 햄버거를 뷰 하면, 햄버거와 더블치즈햄버거가 둘 다 메모리에 뜸

public class ExtendsEx04 {

	public static void main(String[] args) {
		햄버거 s = new 더블치즈햄버거();
		// 이때 메모리에 햄/더치햄 둘 다 뜨기 때문에 이 새기의 타입을 (다형성성립) 아무거나 해도 됨
		// 타입을 햄버거로 했다면, s가 가리키는 건(바라보는 건) 햄버거(메모리는 둘 다 떠 있음)
		// 문제는 자식변수를 사용하고 싶다(메서드말고 변수,)
		System.out.println(s.getName()); // 자식 메서드가 호출됨
	}

}
