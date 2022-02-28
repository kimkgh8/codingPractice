package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test2588 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int one = Integer.parseInt(br.readLine());
		String two = br.readLine();
		
		System.out.println(one * (two.charAt(2) - '0'));
		System.out.println(one * (two.charAt(1) - '0'));
		System.out.println(one * (two.charAt(0) - '0'));
		System.out.println(one * Integer.parseInt(two));
	}

}

