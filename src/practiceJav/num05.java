package practiceJav;

import java.util.Scanner;

public class num05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextInt(); // pow() 정수 반환

        if(x>0){
            x=7*x+2;
        } else {
            x= Math.pow(x,3) - x*9 +2;
        }
        System.out.println(x);
    }
}
