package personal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//숫자 카드 게임
public class practice_Greedy3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int result = 0;
		
		for (int i=0;i<N;i++) {
			int min_value = 10001;
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			for (int j=0;j<M;j++) {
				int x = Integer.parseInt(st2.nextToken());
				min_value = Math.min(min_value, x);
			}
			result = Math.max(result, min_value);
		}
		
		System.out.println(result);
	}

}
