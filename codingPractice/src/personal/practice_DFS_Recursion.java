package personal;

//참고URL:https://codingnojam.tistory.com/44
public class practice_DFS_Recursion {
	static boolean[] vistied = new boolean[9];
	
	static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
	
	public static void main(String[] args) {
		dfs(1);
	}
	
	static void dfs(int nodeIndex) {
		vistied[nodeIndex] = true;
		
		System.out.println(nodeIndex + " -> ");
		
		for (int node : graph[nodeIndex]) {
			if (!vistied[node]) {
				dfs(node);
			}
		}
	}

}
