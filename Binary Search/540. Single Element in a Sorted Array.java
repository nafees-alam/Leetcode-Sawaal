 class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s = 0;
        int e = nums.length-1;

        // Case 1
        // checking boundary condition if boundary conatains the target element

        if (e == 0) {
            return nums[0];
        }
        else if (nums[s] != nums[s+1]) {
                return nums[s];
            }
        else if (nums[e] != nums[e-1]) {
                return nums[e];
            }
        while (s <= e) {
            int mid = s + (e - s) / 2;

            // case 2
            // if middle element is the target element

            if (nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]) {
                return nums[mid];
            }

            // case 3
            // for moving start position 
            // apply the condition below using example

            if ((nums[mid] == nums[mid-1] && mid%2 == 1) 
                        || (nums[mid] == nums[mid+1] && mid%2 == 0)) {
                s = mid+1;
            }
            else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
