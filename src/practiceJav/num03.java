package practiceJav;

import java.util.Scanner;

public class num03 {
    public static void main(String[] args) {
        // 표준체중 = 키-100 * 0,9
        Scanner sc = new Scanner(System.in);

        int hight = sc.nextInt();
        int weight = sc.nextInt();
        double avg = (hight-100)*0.9;

        if (weight<avg){
            System.out.println("저");
        } else if (weight==avg) {
            System.out.println("정상");
        } else {
            System.out.println("과");
        }

    }
}
