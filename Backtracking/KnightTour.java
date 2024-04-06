import java.util.*;

public class KnightTour{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int board[][] = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = -1;
            }
        }

        int move_x[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int move_y[] = {1, 2, 2, 1, -1, -2, -2, -1};
        int pos = 1;
        board[0][0] = 0;
        if(knightTour(board, move_x, move_y, 0, 0, pos, n)){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    else{
        System.out.println("No Solution");
    }
    }

    private static boolean isValid(int x, int y, int board[][], int n){
        if(x>=0 && y>=0 && x<n && y<n && board[x][y]==-1)
        return true;

        return false;
    }

    private static boolean knightTour(int board[][], int move_x[], int move_y[], int curr_x, int curr_y, int pos, int n){
        if(pos == n * n)
        return true;

        for(int i=0; i<8; i++){
            int new_x = curr_x + move_x[i];
            int new_y = curr_y + move_y[i];

            if(isValid(new_x, new_y, board, n)){
                board[new_x][new_y] = pos;

                if(knightTour(board, move_x, move_y, new_x, new_y, pos+1, n))
                return true;

                else
                board[new_x][new_y] = -1;

            }

        }
        return false;
    }
}