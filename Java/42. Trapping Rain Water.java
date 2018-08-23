class Solution {
    public int trap(int[] A){
        int left = 0;
        int right = A.length - 1;
        int lmax = 0;
        int rmax = 0;
        int maxTrap = 0;
        while(left < right){
            lmax = Math.max(lmax, A[left]);
            rmax = Math.max(rmax, A[right]);
            if(lmax < rmax){
                maxTrap = maxTrap + (lmax - A[left]);
                left ++;
            }
            else{
                maxTrap = maxTrap + (rmax - A[right]);
                right --;
            }
        }
        return maxTrap;
    }
}