class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x =0;
        int y =n;
        int[] res = new int[2*n];
        for (int i =0;i<2*n;i+=2){
            res[i] = nums[x];
            res[i+1] = nums[y];
            x++;
            y++;
        }
        return res;
        
    }
}