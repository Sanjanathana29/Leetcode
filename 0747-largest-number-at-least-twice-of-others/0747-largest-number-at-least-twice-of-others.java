class Solution {
    public int dominantIndex(int[] nums) {

       int max = nums[0];
       int element =0;

        for (int i =0;i<nums.length;i++){
            
            if (nums[i] > max){
              max = nums[i];
              element =i;
            }

        }
        for (int i =0;i<nums.length;i++){
            if(nums[i] *2 > max && nums[i] != max){
                return -1;
            }
        }

        return element;




        
    }
}