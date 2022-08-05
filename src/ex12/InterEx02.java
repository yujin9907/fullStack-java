package ex12;

interface Callable{
	void 음식해();
}

class 라면 implements Callable{
	void 냄비물담기() {
		
	}
	void 가스에냄비올리기() {
		
	}
	void 불켜기() {
		
	}
	void 스프면넣기() {
		
	}
	@Override
	public void 음식해() {
		냄비물담기();
		가스에냄비올리기();
		불켜기();
		스프면넣기();
		System.out.println("라면 완성");
	}
}
class 김치찌개 implements Callable{
	void 냄비물담기() {
		
	}
	void 가스에냄비올리기() {
		
	}
	void 불켜기() {
		
	}
	void 김치추가() {
		
	}
	void 두부추가() {
		
	}
	@Override
	public void 음식해() {
		냄비물담기();
		가스에냄비올리기();
		불켜기(); // 이 세개는 추상 클래스로 끌어올릴 수 있음
		김치추가();
		두부추가();
		System.out.println("김치찌개 완성");
	}
}

public class InterEx02 {

	public static void main(String[] args) {

		Callable c = new 라면();
		Callable c2 = new 김치찌개();
		
		c.음식해(); // 이것만 하면 끝남
	}

}
