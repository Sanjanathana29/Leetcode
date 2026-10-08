class Solution {
    public int primePalindrome(int n) {

        if (n <= 11) {
            if (n <= 2) return 2;
            if (n <= 3) return 3;
            if (n <= 5) return 5;
            if (n <= 7) return 7;
            return 11;
        }

        // Generate odd-length palindromes
        for (int i = 1; ; i++) {

            int palindrome = makePalindrome(i);

            if (palindrome >= n && isPrime(palindrome)) {
                return palindrome;
            }
        }
    }

    // Create an odd-length palindrome
    public int makePalindrome(int n) {

        int result = n;

        n = n / 10;

        while (n > 0) {
            result = result * 10 + n % 10;
            n = n / 10;
        }

        return result;
    }

    public boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        if (n % 2 == 0) {
            return n == 2;
        }

        for (int i = 3; i * i <= n; i += 2) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}