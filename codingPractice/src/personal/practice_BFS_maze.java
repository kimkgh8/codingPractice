package personal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
	
	private int x;
	private int y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
}

//미로 탈출
public class practice_BFS_maze {
	
	public static int n,m;
	public static int[][] graph = new int[201][201];
	
	//상 하 좌 우
	public static int dx[] = {-1,1,0,0};
	public static int dy[] = {0,0,-1,1};
	
	public static int bfs(int x,int y) {
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x,y));
		//큐가 빌 때까지 반복
		while (!q.isEmpty()) {
			Node node = q.poll();
			x = node.getX();
			y = node.getY();
			
			//4가지 위치의 방향 확인
			for (int i=0;i<4;i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				//공간을 벗어난 경우
				if (nx < 0 || nx >= n || ny < 0 || ny >= m ) {
					continue;
				}
				
				//벽인 경우
				if (graph[nx][ny] == 0) {
					continue;
				}
				
				//해당 노드를 처음하는 경우에만 최단 거리 기록
				if (graph[nx][ny] == 1) {
					graph[nx][ny]  = graph[x][y] + 1;
					q.offer(new Node(nx,ny));
				}
				
			}
		}
		
		//가장 오른쪽 아래까지의 최단 거리 반환
		return graph[n-1][m-1]; 
	}
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
		
		System.out.println(bfs(0,0));
		
		
	}
	

}

