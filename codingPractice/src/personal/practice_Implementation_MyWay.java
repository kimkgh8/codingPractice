package personal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//상하좌우
public class practice_Implementation_MyWay {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int x = 1;
		int y = 1;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int excuteCnt = st.countTokens();
		for (int i=0;i<excuteCnt;i++) {
			String moveLocation = st.nextToken();
			String val = move(moveLocation,N,x,y);
			x = Integer.parseInt(val.substring(0,val.indexOf(",")));
			y = Integer.parseInt(val.substring(val.indexOf(",")+1,val.length()));
		}
		
		System.out.println(x+" "+y);
		
	}
	
	public static String move (String moveLocation, int range, int x, int y ) {
		switch (moveLocation) {
			case "L":
				if (y-1 > 0) {
					y -= 1;
				}
				break;
			case "R":
				if (y+1 <= range) {
					y += 1;
				}
				break;
			case "U":
				if (x-1 > 0) {
					x -= 1;
				}
				break;
			case "D":
				if (x+1 <= range) {
					x += 1;
				}
				break;
		}
		String movement = String.valueOf(x)+","+String.valueOf(y);
		return movement;
	}

}
