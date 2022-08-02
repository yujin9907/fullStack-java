package ex08_num;

class INum{
	int real;
	int imag;
	
	void print_img() {
		System.out.println(real+" "+imag+"i");
	}
}

public class num03 {

	public static void main(String[] args) {
		INum i = new INum();
		i.print_img();
		
	}

}
