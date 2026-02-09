class Solution {
    public boolean isPalindrome(String s) {
        String sentence = s.replaceAll("[^a-zA-Z0-9]","");
        String lower = sentence.toLowerCase();
        int n = lower.length();
        int i =0;
        int j = n-1;
        while (i<=j){
            if (lower.charAt(i) != lower.charAt(j)){
                return false;
            }
            j--;
            i++;
        }
        return true;
    }
}