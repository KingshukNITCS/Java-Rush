// https://leetcode.com/problems/rotate-image/description/
class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0; i<row; i++)
        {
        for(int j=i+1; j<col; j++)
        {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
        }
        int left=0; int right=col-1;
        while(left<right)
        {
            for(int k=0; k<row; k++)
            {
                int temp = matrix[k][left];
                matrix[k][left] = matrix[k][right];
                matrix[k][right] = temp;
            }
            left++; right--;
        }
    }
 }
