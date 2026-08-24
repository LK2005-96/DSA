class Solution {

    int[][] dir = {
        {-1, 0},
        {1, 0},
        {0, -1},
        {0, 1}
    };

    boolean dfs(char[][] board, String word,
                int row, int col, int index) {

        // Finished the whole word
        if (index == word.length()) {
            return true;
        }

        // Invalid position
        if (row < 0 || row >= board.length ||
            col < 0 || col >= board[0].length) {
            return false;
        }

        // Wrong character
        if (board[row][col] != word.charAt(index)) {
            return false;
        }

        // Mark current cell as visited
        char temp = board[row][col];
        board[row][col] = '#';

        // Try all 4 directions
        for (int[] d : dir) {

            int nr = row + d[0];
            int nc = col + d[1];

            if (dfs(board, word, nr, nc, index + 1)) {
                return true;
            }
        }

        // BACKTRACK / UNDO
        board[row][col] = temp;

        return false;
    }

    public boolean exist(char[][] board, String word) {

        for (int row = 0; row < board.length; row++) {

            for (int col = 0; col < board[0].length; col++) {

                if (dfs(board, word, row, col, 0)) {
                    return true;
                }
            }
        }

        return false;
    }
}