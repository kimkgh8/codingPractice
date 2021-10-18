package personal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

//동빈이의 큰 수의 법칙
public class practice_Greedy2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " " );
		

		// N, M, K를 공백을 기준으로 구분하여 입력 받기
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		// N개의 수를 공백을 기준으로 구분하여 입력 받기
		int[] arr = new int[n];
		
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " " );
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(arr); // 입력 받은 수들 정렬하기
		int first = arr[n - 1]; // 가장 큰 수
		int second = arr[n - 2]; // 두 번째로 큰 수

		// 가장 큰 수가 더해지는 횟수 계산
		int cnt = (m / (k + 1)) * k;
		cnt += m % (k + 1);

		int result = 0;
		result += cnt * first; // 가장 큰 수 더하기
		result += (m - cnt) * second; // 두 번째로 큰 수 더하기

		System.out.println(result);
	}

}
