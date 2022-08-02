package ex08_num;

class Date{
	int year;
	int month;
	int date;
	String month_s;
	void print1() {
		System.out.println(year+"."+month+"."+date);
	}
	
	void print2() {
		switch(month) {
		case 1: 
			month_s="jan";
			break;
		case 2:
			month_s="feb";
			break;
		case 3:
			month_s="mar";
			break;
		case 4:
			month_s="apr";
			break;
		case 5:
			month_s="may";
			break;
		case 6:
			month_s="jun";
			break;
		case 7:
			month_s="july";
			break;
		case 8:
			month_s="aug";
			break;
		}
		System.out.println(month_s+" "+date+", "+year);
			
	}
}

public class num02 {

	public static void main(String[] args) {
		
		Date d = new Date();
		d.print1();
		d.print2();
		

	}

}
