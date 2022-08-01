package practiceJav;

import java.util.Scanner;

public class num04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int min = 0;
        // 미완

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<arr.length;i++) {
        	if(arr[i]<arr[i-1]) {
        		
        	} else {
        		min=arr[i-1];
        	}
        }

        System.out.println(min);
    }
}
