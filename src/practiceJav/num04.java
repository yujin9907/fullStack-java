package practiceJav;

import java.util.Scanner;

public class num04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int min = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            if (i>0){
                if(arr[i]<arr[i-1]){
                    min=arr[i];
                } else{
                    min=arr[i-1];
                }
            }
        }

        System.out.println(min);
    }
}
