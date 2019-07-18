package easy.array.AvailableCapturesForRook_999;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] A = new char[][]{
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'B', '.', '.', '.', '.'},
                {'.', 'p', 'B', 'R', 'p', 'B', 'p', '.'},
                {'.', '.', '.', 'p', 'p', '.', '.', '.'},
                {'.', '.', '.', 'B', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };
        System.out.println(solution.numRookCaptures(A));
    }
}

