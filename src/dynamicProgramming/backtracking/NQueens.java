package dynamicProgramming.backtracking;

public class NQueens {
    public static void main(String[] args){
        nQueens(4);
    }

    /**
     * Prints out the placement of n queens on a NXN chess board
     * such that no queen can attack other queen
     * If there is no solution , it prints out no solution
     * @param n
     */
    public static void nQueens(int n){
        int[] board = new int[n];
        if(!helper(board,0)){
            System.out.println("No solution");
        }
    }

    public static boolean helper(int[] board,int i){
        if(i == board.length){
            for(int row : board){
                for(int c=0;c<board.length;c++){
                    if(c == row){
                        System.out.print(" O ");
                    }else{
                        System.out.print(" X ");
                    }
                }
                System.out.println("");
            }
            return true;
        }
        for(int c=0;c<board.length;c++){
            boolean flag = false;
            for(int r=0;r<i;r++){
                if(board[r] == c || Math.abs(board[r]-c) == (i-r)){
                    flag = true;
                    break;
                }
            }
            if(flag){
                continue;
            }
            board[i]=c;
            if(helper(board,i+1)){
                return true;
            }
        }
        return false;
    }
}
