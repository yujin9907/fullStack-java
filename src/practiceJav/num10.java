package practiceJav;

import java.util.Scanner;

public class num10 {
    public static void main(String[] args) {
        long a =0, b=1, c;
        int i;

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println(a+" "+b);

        for(i=2;i<=x;i++){
            // a b를 더하여 c에 대입
            c = a+b;
            //출력
            System.out.print(c + "\t");
            // b 값을 a로 옮김
            a = b;
            // c의 값을 b로 옮김
            b = c;
        }

    }
}
