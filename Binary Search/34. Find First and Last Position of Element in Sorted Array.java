class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans = new int[2];
        int start = 0;
        int end = nums.length-1;
        int fi = -1;
        int li = -1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target==nums[mid]) {
                fi = mid;
                end = mid - 1;
            }
            else if (target>nums[mid]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }

        }
        start = 0;
        end = nums.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target==nums[mid]) {
                li = mid;
                start = mid + 1;
            }
            else if (target>nums[mid]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }

        }
     ans[0] = fi;
     ans[1] = li;
     return ans;

  }
}
