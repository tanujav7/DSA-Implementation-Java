import java.util.Scanner;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        int edges = sc.nextInt();

        int adjMatrix[][] = new int[nodes][nodes];

        for(int i=0; i<edges; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1;
        }

        for(int i=0; i<nodes; i++){
            for(int j=0; j<nodes; j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
