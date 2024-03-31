
import java.util.*;

public class PrintPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int nodes = sc.nextInt();
		int edges = sc.nextInt();
		
		int adjMatrix[][] = new int[nodes][nodes];
		
		for(int i=0; i<edges; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			adjMatrix[u][v] = 1;
		}
		
		int src = sc.nextInt();
		int dest = sc.nextInt();
		
		boolean visited[] = new boolean[1005];
		
		
		printPaths(adjMatrix, src, dest, visited, new ArrayList<>());
	}

	private static void printPaths(int[][] adjMatrix, int src, int dest, boolean[] visited, List<Integer> path) {
		// TODO Auto-generated method stub
		
		visited[src] = true;
		
		path.add(src);
		
		if(src==dest) {
			for(int ele : path) {
				System.out.print(ele+" -> ");
			}
			System.out.println();
		}
		
		for(int i=0; i<adjMatrix.length; i++) {
			if(adjMatrix[src][i]==1 && visited[i]==false) {
				printPaths(adjMatrix, i, dest, visited, path);
			}
		}
		
		visited[src] = false;
		path.remove(path.size()-1);
		
	}

}

/*
8
9
0 1
0 3
1 2
3 4
3 5
4 5
4 6
5 7
6 7

0
7

*/