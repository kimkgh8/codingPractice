package personal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practice_Greedy {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int[] coinTypes = { 500, 100, 50, 10 };

		for (int i = 0; i < 4; i++) {
			int coin = coinTypes[i];
			cnt += n / coin;
			n %= coin;
		}

		System.out.println(cnt);
	}

}
