package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2438 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for (int i=0;i<N;i++) {
			for (int j=N;j>=0;j--) {
				if (j<=i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
