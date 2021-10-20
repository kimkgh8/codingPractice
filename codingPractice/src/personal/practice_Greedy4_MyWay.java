package personal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//1이 될 때까지
public class practice_Greedy4_MyWay {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int result = 0;
		
		while (true) {
			if ( N % K == 0 ) {
				N = N / K;
				result ++;
			} else {
				N--;
				result ++;
			}
			if (N == 1 ) {
				break;
			}
		}
		System.out.println(result);
		System.out.println(Runtime.getRuntime().totalMemory());
	}

}
