class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        int len = A.length;
        int rlen = A[0].length;
        
        for(int i=0; i< len; i++){
            for(int j=0; j< (rlen+1)/2; j++){
                int temp = A[i][j];
                A[i][j] = A[i][rlen-j-1]^1;
                A[i][rlen-j-1] = temp^1;
            }
        }
        return A;   
    }
}