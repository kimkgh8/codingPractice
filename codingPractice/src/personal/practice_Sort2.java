package personal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

//성적이 낮은 순서로 학생 출력
public class practice_Sort2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		StringBuilder sb = new StringBuilder();
		
		//학생
		int N = Integer.parseInt(br.readLine());
		
		for (int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken();
			int score = Integer.parseInt(st.nextToken());
			
			map.put(name, score);
		}
		
		List<String> reverseOrderedKeys = new ArrayList<String>(map.keySet());
		Collections.reverse(reverseOrderedKeys);
		for (String key : reverseOrderedKeys) {
			sb.append(key).append(" ");
		}
		System.out.println(sb);
		
	}
	
	
}
