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
		for (int i=0;i<st.countTokens();i++) {
			String moveLocation = st.nextToken();
			System.out.println("moveLocation:"+moveLocation);
			if (moveLocation != null && !moveLocation.isEmpty()) {
				String val = move(moveLocation,x,y);
				x = Integer.parseInt(val.substring(0,val.indexOf(",")));
				y = Integer.parseInt(val.substring(val.indexOf(",")+1,val.length()));
			} else {
				break;
			}
		}
		
		System.out.println(x+" "+y);
		
	}
	
	public static String move (String moveLocation, int x, int y ) {
		switch (moveLocation) {
			case "L":
				y -= 1;
			case "R":
				y += 1;
			case "U":
				x -= 1;
			case "D":
				x += 1;
		}
		String movement = String.valueOf(x)+","+String.valueOf(y);
		return movement;
	}

}
