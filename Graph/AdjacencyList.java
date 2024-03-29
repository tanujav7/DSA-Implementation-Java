import java.util.*;

public class AdjacencyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nodes = sc.nextInt();
        int edges = sc.nextInt();

        List<List<Integer>> adjList = new ArrayList<>();

        for(int i=0; i<nodes; i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0; i<edges; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }


        for(int i=0; i<nodes; i++){
            for(int j=0; j<adjList.get(i).size(); j++){
                System.out.print(adjList.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
