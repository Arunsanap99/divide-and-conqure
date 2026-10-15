public class Nqueen {
    public static boolean issafe( char board[][], int row, int col) {
        //vertical col
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diag of left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        //right diag
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
        public static boolean nQueen(char board[][], int row) {
            //base case
            if (row == board.length) {
                //printBoard(board);
                count++;
                return true;
            }
            //kam
            for (int j = 0; j < board.length; j++) {
                if (issafe(board, row, j)) {
                    board[row][j] = 'Q';
                    if (nQueen(board, row + 1)) {
                        return true;
                    } else {
                        board[row][j] = 'x'; // backtraking steps
                    }
                }

            }
            return false;
        }


    public static void printBoard( char board[][]){
        System.out.println("_________ board ________");
        for(int i =0; i<board.length; i++){
            for(int j =0; j<board.length; j++){
                System.out.print(board[i][j] +" ");
            }
            System.out.println();
        }
    }
    static int  count = 0;
  public static  void main (String[]args){
           int n = 4;
           char board[][] = new char[n][n];
           for(int i = 0; i<n; i++){
               for(int j =0; j<n; j++){
                 board[i][j] = 'x';
               }
           }
           if(nQueen(board, 0)){
               System.out.println("solutuion is possible");
               printBoard(board);
           }else{
               System.out.println("solution is not possible");
           }
      System.out.println("print toatal number of ways to find these solution " +  count );
       }
   }
