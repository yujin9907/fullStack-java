package ex06;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		// 수업 문제
		// 무한루프를 돌면서 1,2,3 ... 번호를 출력하는 프로그램
		// 단, 숫자가 10이 되면 출력 멈추기

		int i = 1;
		while(true) {
			System.out.println(i);
			i++;
			if(i>10) {
				break;
			}
		}
		
		Averager();
	}
	public static void Averager() {
		// 위 문제를 풀기 위한 125p 예제
		int total = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("점수를 입력하시오: ");
			int grade = sc.nextInt();
			if (grade<0) {
				break;
			}
			total+=grade;
			count++;
		}
		System.out.println("평균은 "+total/count);
	}
}

