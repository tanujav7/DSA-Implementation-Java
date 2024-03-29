import java.util.*;

public class BFS_Graph {
    public static void main(String[] args) {
        Graph g = new Graph(8);

        g.addNode(50);
        g.addNode(10);
        g.addNode(200);
        g.addNode(20);
        g.addNode(15);
        g.addNode(30);
        g.addNode(5);
        g.addNode(300);
      
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 4);
        g.addEdge(1, 5);
        g.addEdge(2, 3);
        g.addEdge(4, 5);
        g.addEdge(4, 6);
        g.addEdge(4, 1);
        g.addEdge(5, 7);
        g.addEdge(5, 6);

        g.bfs();
    }
}

class Node{
    int data;
    boolean visited;
    Node(int data){
        this.data = data;
        visited = false;
    }
}



class Graph{
    int numNodes = 0;
    int adjMatrix[][];
    Node adjList[];
    Queue<Integer> queue = new LinkedList<>();
    int index = 0;

    Graph(int size){
        adjList = new Node[size];
        adjMatrix = new int[size][size];
        numNodes = size;
    }


    void addNode(int data){
        adjList[index++] = new Node(data);
    }

    void addEdge(int u, int v){
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }

    void printNode(int ind){
        System.out.println(adjList[ind].data);
    }

    int getUnvisited(int ind){
        for(int j=0; j<numNodes; j++){
            if(adjMatrix[ind][j]==1 && adjList[j].visited==false)
            return j;
        }
        return -1;
    }

    void bfs(){
        queue.add(0);
        adjList[0].visited = true;
        printNode(0);
        int node1;

        while(!queue.isEmpty()){
            int node2 = queue.remove();
            
            while((node1 = getUnvisited(node2))!=-1){
                queue.add(node1);
                printNode(node1);
                adjList[node1].visited = true;
            }
        }
    }

}