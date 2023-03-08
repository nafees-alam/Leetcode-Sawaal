class Solution {
    public int[][] generateMatrix(int n) {
        int[][] generateMatrix = new int [n][n];
        int minr = 0;
        int minc = 0;
        int maxr = n-1;
        int maxc = n-1;
        int total = n * n;
        int count = 0;
        while (count < total) {
            //top line
            for (int i = minr, j = minc; j <= maxc && count < total; j++) {
                count++;
                generateMatrix[i][j] = count;
            }
            minr++;
            //right side
             for (int i = minr, j = maxc; i <= maxr && count < total; i++) {
                count++;
                generateMatrix[i][j] = count;
            }
            maxc--;
            //bottom line
             for (int i = maxr, j = maxc; j >= minc && count < total; j--) {
                count++;
                generateMatrix[i][j] = count;
            }
            maxr--;
            //left side 
             for (int i = maxr, j = minc; i >= minr && count < total; i--) {
                count++;
                generateMatrix[i][j] = count;
            }
            minc++;
        }
        return generateMatrix;
    }
}
