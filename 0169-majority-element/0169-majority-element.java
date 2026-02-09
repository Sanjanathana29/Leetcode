class Solution {
    public int majorityElement(int[] nums) {
        int count =1;
        int countmax =1;
        int element =nums[0];
        Arrays.sort(nums);
        for (int i =0;i<nums.length-1;i++){
            if (nums[i] == nums[i+1]){
                count++;

                if (count >countmax){
                    countmax =count;
                    element = nums[i];
                }
                
            }
            else{
                count =1;
            }

        }
        return element;
        
    }
}