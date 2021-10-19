package personal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

//숫자 카드 게임
public class practice_Greedy3_MyWay {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> arr;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int result = 0;
		
		for (int i=0;i<N;i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			arr = new ArrayList<Integer>();
			for (int j=0;j<M;j++) {
				arr.add(Integer.parseInt(st2.nextToken()));
			}
			Collections.sort(arr);
			if (result < arr.get(0)) {
				result = arr.get(0);
			}
		}
		
		System.out.println(result);
	}

}
