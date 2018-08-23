class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int rightMul = 1, leftMul = 1;
        for(int i = nums.length -1; i >=0; i--){
            result[i] = rightMul;
            rightMul *= nums[i];
        }
        for(int i = 0; i < nums.length; i++){
            result[i] *= leftMul;
            leftMul *= nums[i];
        }
        return result;
    }
}