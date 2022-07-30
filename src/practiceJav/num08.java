package practiceJav;

public class num08 {
    public static void main(String[] args) {
        for(int i=1;i<11;i++){
            for(int j=1;j<11;j++){
                System.out.print(i*j+"\t");
                if(j==10){
                    System.out.println("");
                }
            }
        }
    }
}
