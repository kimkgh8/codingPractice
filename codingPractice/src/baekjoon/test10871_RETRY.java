package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test10871_RETRY {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		String numbers = br.readLine();
		
		String[] numberArr = numbers.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for (String number:numberArr) {
			int numberInt = Integer.parseInt(number);
			if (X > numberInt) {
				sb.append(number + " ");
			}
		}
		System.out.println(sb.toString().strip());
		
	}

}
