import java.util.*;

public class TopologicalSorting {
	static Stack<Integer> stack;
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
			
			
		    int res[] = new int[nodes];
	        
	        stack = new Stack<>();
	        
	        boolean visited[] = new boolean[100005];
	        
	        for(int i=0; i<nodes; i++){
	            if(visited[i]==false)
	             topologicalSorting(adjList, i, visited);
	        }
	        
	        
	        int i = 0;
	        
	        while(!stack.isEmpty()){
	            res[i++] = stack.pop();
	        }
	        
	        for(int j=0; j<nodes; j++) {
	        	System.out.print(res[j]+" ");
	        }
	        
	}


    
    static void topologicalSorting(List<List<Integer>> adjList, int u, boolean visited[]){
        visited[u] = true;
        
        for(int ele : adjList.get(u)){
            if(visited[ele]==false)
            topologicalSorting(adjList, ele, visited);
        }
        
        stack.push(u);
    }
}

/*


6
6
5 0 
5 2
4 0
4 1
1 3
2 3
o/p : 5 4 2 1 3 0 


*/
