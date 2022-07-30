package practiceJav;

import java.util.Arrays;
import java.util.Scanner;

public class Test_num01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		int n3= sc.nextInt();

		if(n1>n2){
			if(n2>n3){
				arr[0]=n1;
				arr[1]=n2;
				arr[2]=n3;
			} else if(n1>n3){
				arr[0]=n1;
				arr[1]=n3;
				arr[2]=n2;
			} else{
				arr[0]=n3;
				arr[1]=n1;
				arr[2]=n2;
			}
		} else if(n1>n3){
			arr[0]=n2;
			arr[1]=n1;
			arr[2]=n3;
		} else if(n2>n3){
			arr[0]=n2;
			arr[1]=n3;
			arr[2]=n1;
		} else{
			arr[0]=n3;
			arr[1]=n2;
			arr[2]=n1;
	}

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

		System.out.println(Arrays.toString(arr));
	}

}
