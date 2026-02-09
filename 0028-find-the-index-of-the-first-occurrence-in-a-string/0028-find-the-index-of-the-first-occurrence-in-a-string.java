class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.isEmpty()){
            return 0;
        }
       
        int i =0;
        

        int h = haystack.length();
        int n = needle .length();
        
        while (i<= h-n){
            int j =0;
            while( j<n && haystack.charAt(i+j) ==needle.charAt(j)){
                j++;
            }
            if (j == n){
            return i;
            }
            i++;
        }
        
        return -1;
        
    }
}