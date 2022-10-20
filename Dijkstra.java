import java.util.*;
class Graph_Shortest_Path {

	int minDistance(int path[], Boolean visited[], int n)
	{
		int min = Integer.MAX_VALUE, minIdx = -1;
		for (int v = 0; v < n; v++)
		if (visited[v] == false && path[v] <= min) {
			min = path[v];
			minIdx = v;
		}
		return minIdx;
	}
	
	void print(int path[])
	{
		System.out.println("Vertex# \t Minimum Distance from Source");
		for (int i = 0; i < path.length; i++)
			System.out.println(i + " \t\t\t " + path[i]);
	}
	
	void algo_dijkstra(int graph[][], int n, int src)
	{
		int path[] = new int[n]; 
		Boolean visited[] = new Boolean[n];
		for (int i = 0; i < n; i++) {
			path[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}
		path[src] = 0;
		for (int i = 0; i < n - 1; i++) 
		{
			int u = minDistance(path, visited, n);
			visited[u] = true;
			for (int v = 0; v < n; v++)
				if (!visited[v] && graph[u][v] != 0 && path[u] != Integer.MAX_VALUE && path[u] + graph[u][v] < path[v])
					path[v] = path[u] + graph[u][v];
		}
		print(path);
	}
}
class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of nodes : ");
		int n = sc.nextInt();
		int graph[][] = new int[n][n];
		System.out.println("Enter Adjacency matirx : ");
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				graph[i][j] = sc.nextInt();
		Graph_Shortest_Path g = new Graph_Shortest_Path();
		g.algo_dijkstra(graph, n, 0);
	}
}
