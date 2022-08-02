package ex08_num;

class Movie{
	String 제목;
	int 평점;
	String 감독;
	int 연도;
	
	void print() {
		System.out.println(제목);
		System.out.println(평점);
		System.out.println(감독);
		System.out.println(연도);
	}
}

public class num04 {

	public static void main(String[] args) {
		
		Movie m = new Movie();
		m.print();

	}

}
