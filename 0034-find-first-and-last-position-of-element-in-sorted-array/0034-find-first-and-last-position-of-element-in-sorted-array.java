class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[nums.length];
        int k =0;
    
        
        for(int i =0;i<nums.length;i++){
            if (nums[i] == target){
                res[k]=i;
                k++;
            }
        }

        if (k == 0) {
    return new int[]{-1, -1};
}

int start = res[0];
int end = res[k - 1];

return new int[]{start, end};

    }
}