package personal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//시각
//완전 탐색 유형
//가능한 경우의 수를 모두 검사해보는 방식.
public class practice_Time {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		for (int i=0;i<=N;i++) {
			for (int j=0;j<60;j++) {
				for (int k=0;k<60;k++) {
					boolean result = numberThree(i,j,k);
					if (result) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
	
	public static boolean numberThree(int h, int m, int s) {
		if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3) {
			return true;
		}
        return false;
	}

}
