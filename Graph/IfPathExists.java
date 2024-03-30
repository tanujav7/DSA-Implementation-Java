import java.util.*;

public class IfPathExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nodes = sc.nextInt();
		int edges = sc.nextInt();
		
		List<List<Integer>> adjList = new ArrayList<>();
		
		for(int i=0; i<nodes; i++) {
			adjList.add(new ArrayList<>());
		}
		
		for(int i=0; i<edges; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			adjList.get(u).add(v);
		}
		
		boolean visited[] = new boolean[10005];
		
		int src = sc.nextInt();
		int dest = sc.nextInt();
		
		if(ifExists(adjList, visited, src, dest))
			System.out.println("True");
		
		else
			System.out.println("False");
		
	}
	
	static boolean ifExists(List<List<Integer>> adjList, boolean visited[], int src, int dest) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(src);
		
		visited[src] = true;
		
		while(!queue.isEmpty()) {
			int node = queue.remove();
			
			if(node==dest)
				return true;
			
			for(int ele : adjList.get(node)) {
				if(visited[ele]==false) {
					visited[ele] = true;
					queue.add(ele);
				}
			}
		}
		
		
		return false;
		
	}

}

//8
//9
//0 1
//0 3
//1 2
//3 4
//3 5
//4 5
// 4 6
//5 7
//6 7
//
//3
//7
