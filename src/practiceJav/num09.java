package practiceJav;

import java.util.Scanner;

public class num09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(s.equals("+")){
            System.out.println(x+y);
        } else if (s.equals("-")){
            System.out.println(x-y);
        } else if (s.equals("*")){
            System.out.println(x*y);
        } else{
            if(y!=0){
                System.out.println(x/y);
            } else {
                System.out.println("분모0");
            }
        }
    }
}
