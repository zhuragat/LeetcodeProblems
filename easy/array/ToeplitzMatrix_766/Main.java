package easy.array.ToeplitzMatrix_766;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };
        System.out.println(solution.isToeplitzMatrix(matrix));
    }
}
