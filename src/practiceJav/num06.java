package practiceJav;

public class num06 {
    public static void main(String[] args) {

        for(int i=2;i<=100;i++){
            int n=0;
            for(int j=2;j<i;j++){
                if(i%j==0) {
                   n++;
                }
            }
            if(n==0){
                System.out.println(i);
            }
        }
    }
}
