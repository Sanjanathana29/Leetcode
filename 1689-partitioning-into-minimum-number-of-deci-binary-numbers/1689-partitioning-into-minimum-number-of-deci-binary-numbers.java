class Solution {
    public int minPartitions(String n) {
        int max =Integer.MIN_VALUE;
        for (int i =0;i<n.length();i++){
            char c = n.charAt(i);
            int num = c-'0';
            if (num > max){
                max =num;
            }
        }
        return max;
        
    }
}