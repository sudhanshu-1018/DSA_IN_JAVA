public class BackTracking_Sudoku {
    public static boolean isValid(int[][] sudoku, int row, int col, int digit) {
        // Check row and column
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == digit || sudoku[i][col] == digit) {
                return false;
            }
        }
        // Check 3x3 subgrid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean Findsudoku(int[][] sudoku, int row, int col) {
        if (row == 9) {
            return true; // Sudoku solved
        }
        if (col == 9) {
            return Findsudoku(sudoku, row + 1, 0); // Move to next row
        }
        if (sudoku[row][col] != 0) {
            return Findsudoku(sudoku, row, col + 1); // Skip filled cells
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isValid(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (Findsudoku(sudoku, row, col + 1)) {
                    return true;
                }
                sudoku[row][col] = 0; // Backtrack
            }
        }
        return false; // Trigger backtracking
    }

    public static void main(String[] args) {
        int[][] sudoku = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };
        if (Findsudoku(sudoku, 0, 0)) {
            for (int r = 0; r < 9; r++) {
                for (int d = 0; d < 9; d++) {
                    System.out.print(sudoku[r][d]);
                    System.out.print(" ");
                }
                System.out.print("\n");

                if ((r + 1) % 3 == 0) {
                    System.out.print("");
                }
            }
        } else {
            System.out.println("No solution exists");
        }
    }
}
