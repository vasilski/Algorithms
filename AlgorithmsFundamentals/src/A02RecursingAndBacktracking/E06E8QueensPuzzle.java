package A02RecursingAndBacktracking;

public class E06E8QueensPuzzle {

    public static char[][] board = new char[8][8];

    public static void fillBord() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = '-';
            }
        }
    }

    public static void main(String[] args) {
        fillBord();

        findQueenPositions(0);
    }

        private static void findQueenPositions ( int row){
            if (row == 8) {
                printBord();
            } else {
                for (int col = 0; col < 8; col++) {
                    if (canPlaceQueen(row, col)) {
                        putQueen(row, col);
                        findQueenPositions(row + 1);
                        removeQueen(row, col);
                    }
                }
            }
        }

        private static void removeQueen ( int row, int col){
            board[row][col] = '-';

        }

        private static void putQueen ( int row, int col){

            board[row][col] = '*';

        }

        private static boolean canPlaceQueen ( int row, int col) {
            for (int c = 0; c < 8; c++) {
                if (board[row][c] == '*') {
                    return false;
                }
            }

            for (int r = 0; r < 8; r++) {
                if (board[r][col] == '*') {
                    return false;
                }
            }

            int r = row , c = col;

            while (r >= 0 && c >= 0) {
                if (board[r--][c--] == '*') {
                    return false;
                }
            }

            r = row;
            c = col;

            while (r < 8 && c < 8) {
                if (board[r++][c++] == '*') {
                    return false;
                }
            }

            r = row;
            c = col;

            while (r >= 0 && c < 8) {
                if (board[r--][c++] == '*') {
                    return false;
                }
            }
                r = row;
                c = col;

                while (r < 8 && c >= 0) {
                    if (board[r++][c--] == '*') {
                        return false;
                    }
                }
                return true;
            }
    public static void printBord () {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    }