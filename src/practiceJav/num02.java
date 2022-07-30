package practiceJav;

import java.io.*;

public class num02 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        br.close();

        switch (s){
            // switch로 char 되지만.. br을 str으로 읽음
            case "a": case "i": case "o": case "e": case "u":
                bw.write("모음");
                bw.flush();
                break;
            default:
                bw.write("자음");
                bw.flush();
        }
        bw.close();
    }
}
