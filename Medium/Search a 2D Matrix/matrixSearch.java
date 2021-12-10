/**
 * matrixSearch - solution for https://leetcode.com/problems/search-a-2d-matrix/
 */
public class matrixSearch {

    public boolean searchMatrix(int[][] matrix, int target) {
        
        // check for an empty input
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int n = matrix[0].length;
        int m = matrix.length;
        // we know the smallest value is in matrix[0][0]
        // we know the largest value is in matrix[n][m]
        if (target < matrix[0][0] || matrix[m-1][n-1] < target) {
            return false;
        }
        // we will treat the matrix like a 1D array - since we know how to solve the problem for 1D array
        // given a cordinate in the matrix (i, j) the proper index in a 1D array is i * n + j
        // and the values of j are 0 <= j < n
        // so the correct row index can be calculated by divding the index by n
        // and the correct colmn index can be calculated by module devision by n
        int left = 0;
        int right = m*n - 1; // last index
        // calculate the middle index
        while (left <= right) {
            int middle = (right - left) / 2 + left; // in this case we must consider with the offset of the 2D Matrix
            int value = matrix[middle / n][middle % n]; //the row and the column are effected by the row size of the matrix
            if (value > target) {
                right = middle - 1;
            } else if (value < target) {
                left = middle + 1;
            } else { //targer == value
                return true;
            }
        }
        return false;
    }
}