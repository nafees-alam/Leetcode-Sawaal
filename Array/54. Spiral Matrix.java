class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> Arraylist = new ArrayList<>();
        int minr = 0;
        int minc = 0;
        int maxr = matrix.length-1;
        int maxc = matrix[0].length-1;
        int total = (matrix.length) * (matrix[0].length);
        int count = 0;
        while (count < total) {
            //top line
            for (int i = minr, j = minc; j <= maxc && count < total; j++) {
                Arraylist.add(matrix[i][j]);
                count++;
            }
            minr++;
            //right side
             for (int i = minr, j = maxc; i <= maxr && count < total; i++) {
                Arraylist.add(matrix[i][j]);
                count++;
            }
            maxc--;
            //bottom line
             for (int i = maxr, j = maxc; j >= minc && count < total; j--) {
                Arraylist.add(matrix[i][j]);
                count++;
            }
            maxr--;
            //left side 
             for (int i = maxr, j = minc; i >= minr && count < total; i--) {
                Arraylist.add(matrix[i][j]);
                count++;
            }
            minc++;
        }
        return Arraylist;
    }
}
