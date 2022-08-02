package ex08_num;

import java.util.Scanner;

class Rectangle{
	private int w;
	private int h;
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	
	int area() {
		return h*w;
	}
	int permeter() {
		return 2*(h+w);
	}
}

public class Num01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle re = new Rectangle();
		re.setW(sc.nextInt());
		re.setH(sc.nextInt());
		System.out.println(re.area());
		System.out.println(re.permeter());

	}

}
