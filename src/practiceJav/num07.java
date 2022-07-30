package practiceJav;

public class num07 {

    public static void main(String[] args) {
        int n = 0;

        for(int a=1; a<100;a++){
            for(int b=1;b<100;b++){
                for(int c=1;c<100;c++){
                    if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)) {
                        n++;
                    }
                }
            }
        }

        System.out.println(n);
    }
}
