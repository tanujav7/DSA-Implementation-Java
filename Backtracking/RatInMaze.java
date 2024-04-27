import java.util.*;

public class RatInMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maze[][] = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                maze[i][j] = sc.nextInt();
            }
        }
        int res[][] = new int[n][n];

        if(ratInMaze(maze, res, 0, 0, n)){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                   System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
        }

        else{
            System.out.println("Solution doesn't exist");
        }
    }

    private static boolean ratInMaze(int maze[][], int res[][], int x, int y, int n){
        if(x==n-1 && y==n-1){
            res[x][y] = 1;
            return true;
        }
       

        if(isValid(maze, x, y, n)){
            res[x][y] = 1;

            if(ratInMaze(maze, res, x+1, y, n))
            return true;

            if(ratInMaze(maze, res, x, y+1, n))
            return true;

            res[x][y] = 0;
        }
        return false;
    }

    private static boolean isValid(int maze[][], int x ,int y, int n){
        if(x>=0 && y>=0 && x<n && y<n && maze[x][y]==1)
        return true;

        return false;
    }
}
