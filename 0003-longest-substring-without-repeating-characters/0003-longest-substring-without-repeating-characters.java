class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n = s.length();
        int max = 0;

        for (int i = 0; i < n; i++) {

            int[] arr = new int[256];
            int len = 0;
            int j = i;

            while (j < n) {
                char c = s.charAt(j);

                if (arr[c] == 1)  
                    break;

                arr[c] = 1;      
                len++;
                j++;
            }

            if (len > max)
                max = len;
        }

     return max;
    }
}
        
    