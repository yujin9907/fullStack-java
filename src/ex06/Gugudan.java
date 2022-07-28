package ex06;

public class Gugudan {

	public static void main(String[] args) {

		String s1 ="안녕"; // 문자열 저장
		int num = 10;
		System.out.println(s1+num);
		System.out.println("num: "+num); // 문자열과 숫자 출력
		
		// 구구단 작성 패턴을 생각하고 단순화를 생각해서 풀어나가는 것
		// 처음에는 경우를 그대로 써보고 [2*1 2*2 ... 2가 반복됨] 이런식으로 
		// 중복을 최대한 제거하려고 해보고
		for(int k=2;k<10;k++) {
			for(int i=1;i<10;i++) {
				System.out.println(k+"*"+i+"="+k*i);
			}
		}
		
		// 단계1 : 구구단 2단 작성
		System.out.println("2*1=2");
		System.out.println("2*2=4");
		System.out.println("2*3=6");
		System.out.println("2*4=8");
		
		// 단계2 : 2단 이상 작성
		// 변수 x를 통해서 3, 4, 5... 다른 구구단까지 유지보수 용이해짐
		//
		// 재사용성 고려, 모양을 같게 만듦이 중요
		int x; // 선언만, 왜? 밑의 코드의 일관성을 유지하기 위해 int x=2; 와 같이 작성하지 않음
		
		x=2;
		System.out.println(x+"*1=2");
		System.out.println(x+"*2=4");
		System.out.println(x+"*3=6");
		System.out.println(x+"*4=8");
		
		x=3;
		System.out.println(x+"*1="+x*1);
		System.out.println(x+"*2="+x*2);
		System.out.println(x+"*3="+x*3);
		System.out.println(x+"*4="+x*4);
		
		// 단계3 : 간결하게 표현
		// 반복되는 1, 2, 3 ... 도 표현
		for(int n=1;n<5;n++){
			System.out.println(x+"*"+n+"="+x*n);
		}
		
		// 변수 x도 반복이므로 for문을 활용해서 맨 위와 같은 결과
		
		
		System.out.println("------수업--------");

		for(int i=1; i<10; i++) {
			for(int m=2;m<10;m++) {
				if(m==9) {
					System.out.println();
				}
				else{
					System.out.print(m+"*"+i+"="+m*i+"\t");
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
