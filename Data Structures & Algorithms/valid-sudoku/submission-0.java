class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, HashSet<Character>> row = new HashMap<>();
        Map<Integer, HashSet<Character>> col = new HashMap<>();
        Map<List<Integer>, HashSet<Character>> grid = new HashMap<>();

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                if (board[i][j] == '.') continue;

                List<Integer> gridIdx = new ArrayList<>();
                gridIdx.add(i / 3); 
                gridIdx.add(j / 3);

                if (row.getOrDefault(i, new HashSet<>()).contains(board[i][j])) return false;
                if (col.getOrDefault(j, new HashSet<>()).contains(board[i][j])) return false;
                if (grid.getOrDefault(gridIdx, new HashSet<>()).contains(board[i][j])) return false;

                row.computeIfAbsent(i, k -> new HashSet<>()).add(board[i][j]);
                col.computeIfAbsent(j, k -> new HashSet<>()).add(board[i][j]);
                grid.computeIfAbsent(gridIdx, k -> new HashSet<>()).add(board[i][j]);
            }
        }
        return true;
    }
}
