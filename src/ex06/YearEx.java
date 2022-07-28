package ex06;

import java.util.Scanner;

public class YearEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("연도: ");
		int year = sc.nextInt();
		System.out.print("월: ");
		int month = sc.nextInt();
		System.out.print("일: ");
		int day = sc.nextInt();
		int total_days = (year-1900)*365; //40880
//		System.out.println(total_days);
		int yun = (year-1900)/4;
		String week="";
		
		total_days+=yun; //40828
		
//		System.out.println(total_days);
		
//		if((year%4==0&&month<=2)) {
//			--total_days;
//		} else {
//			total_days+= ((month-1)*30) + day ;
//		}
		
		// month가 7 이하인 경우 이상인 경우
		// month가 7 이하면서 짝수인지 홀수인지
		// month가 7 이상일 때
		
//		if(year%4==0) {
//			if(month<=2) {
//				total_days=(month-1)*31+day;
//			} else if(month<=7) {
//				if(month%2==0) {
//					totals_days=
//				}
//			}
//		}
		// 이런 더러운 알고리즘을 짤 바엔 직접 더하는 게 맞다
		int n =0;
		
		if(year%4==0) {
			n=29;
		}else {
			n=28;
		}
		System.out.println(n);
		if(month==1) {
			total_days+=day;
		}else if(month==2) {
			total_days+=31 +day;
		}else if(month==3) {
			total_days+=31+n+day;
		}else if(month==4) {
			total_days+=31+n+31+day;
		}else if(month==5) {
			total_days+=31+n+31+30+day;
		}else if(month==6) {
			total_days+=31+n+31+30+31+day;
		}else if(month==7) {
			total_days+=31+n+31+30+31+30+day;
		}else if(month==8) {
			total_days+=31+n+31+30+31+30+31+day;
		}else if(month==9) {
			total_days+=31+n+31+30+31+30+31+31+day;
		}else if(month==10) {
			total_days+=31+n+31+30+31+30+31+31+30+day;
		}else if(month==11) {
			total_days+=31+n+31+30+31+30+31+31+30+31+day;
		}else if(month==12) {
			total_days+=31+n+31+30+31+30+31+31+30+31+30+day;
		}
		
		
		
		int result = total_days%7;
		
		System.out.println(result);
		
		switch(result) {
		case 0:
			week="일요일";
			break;
		case 1:
			week="월요일";
			break;
		case 2:
			week="화요일";
			break;
		case 3:
			week="수요일";
			break;
		case 4:
			week="목요일";
			break;
		case 5:
			week="금요일";
			break;
		case 6:
			week="토요일";
			break;
		}
		
		System.out.println(week);
		
//		if(result==1) {
//			System.out.println(year+"년"+month+"월"+day+"일은 월입니다.");
//		} else if (result==2) {
//			System.out.println(year+"년"+month+"월"+day+"일은 화입니다.");
//		}else if (result==3) {
//			System.out.println(year+"년"+month+"월"+day+"일은 수입니다.");
//		}else if (result==4) {
//			System.out.println(year+"년"+month+"월"+day+"일은 목입니다.");
//		}else if (result==5) {
//			System.out.println(year+"년"+month+"월"+day+"일은 금입니다.");
//		}else if (result==6) {
//			System.out.println(year+"년"+month+"월"+day+"일은 토입니다.");
//		}else if (result==7) {
//			System.out.println(year+"년"+month+"월"+day+"일은 일입니다.");
//		}
		
		
	}

}
