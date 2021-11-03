package personal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//음료수 얼려 먹기
public class practice_DFS_icecream {
	public static int n, m;
	public static int[][] graph = new int[1000][1000];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		for (int i=0;i<n;i++) {
			String str = br.readLine();
			for (int j=0;j<m;j++) {
				graph[i][j] = str.charAt(j) - '0';
			}
		}
		
		int result = 0;
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				if (dfs(i,j)) {
					result += 1;
				}
			}
		}
		System.out.println(result);
		
	}
	
	// DFS로 특정 노드를 방문하고 연결된 모든 노드들도 방문
	public static boolean dfs(int x, int y) {
		
		// 범위 외의 경우 종료
		if (x <= -1 || x >= n || y <= -1 || y >= m) {
			return false;
		}
		
		// 현재의 노드를 방문하지 않았다면
		if (graph[x][y] == 0) {
			// 노드의 방문 처리
			graph[x][y] = 1;
			
			// 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
		}
		return false;
	}

}
