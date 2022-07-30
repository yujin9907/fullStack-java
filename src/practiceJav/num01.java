package practiceJav;

import java.io.*;

public class num01 {

	public static void main(String[] args) throws IOException {
		// 3개의 숫자로 고정 크기 -> 배열 사용
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int ans = 0;
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int n3 = Integer.parseInt(br.readLine());
		br.close();
		
		
		if(n1>n2) {
			if(n2>n3) {
				ans = n1;
			} else if(n1>n3) {
				ans = n1;
			} else {
				ans = n3;
			}
		} else if(n2>n3) {
			ans=n2;
		} else {
			ans=n3;
		}
		
		bw.write(ans);
		bw.flush();
		bw.close();
		
	}

}
