class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null) {
            return null;
        }
        
        int len = nums.length;
        
        if (len == 0) {
            return new int[0];
        }
        
        int[] ans = new int[len];
        ans[0] = 1;
        
        for (int i = 1; i < len; i++) {
            ans[i] = nums[i - 1] * ans[i - 1]; 
        }
        
        
        for (int j = len - 2; j >= 0; j--) {
            ans[j] = ans[j] * nums[j + 1];
            nums[j] *= nums[j + 1];
        }
        
        return ans;
    }
      
}
