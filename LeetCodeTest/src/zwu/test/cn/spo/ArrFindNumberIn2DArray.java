package zwu.test.cn.spo;

public class ArrFindNumberIn2DArray {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) {
            return false;
        }
        int columns = matrix[0].length;
        if (columns == 0) {
            return false;
        }
        int midRow = (int) rows / 2;
        int midCol = (int) columns / 2;
        if (matrix[midRow][midCol] == target) {
            return true;
        } else if (matrix[midRow][midCol] < target) {
            for (int i = 0; i < rows; ++i) {
                for (int j = i < midRow ? midCol : 0; j < columns; ++j) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
            }
        } else {
            for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < (i >= midRow ? midCol : columns); ++j) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean flag = findNumberIn2DArray(new int[][]{{5, 6, 10, 14}, {6, 10, 13, 18}, {10, 13, 18, 19}}, 14);
        System.out.println(flag);
    }

}
