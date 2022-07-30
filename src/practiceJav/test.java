package practiceJav;

import java.io.*;

public class test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int i = Integer.parseInt(br.readLine());
		br.close();

		bw.write(Integer.toString(i));
		bw.flush();
		bw.close();

	}
}