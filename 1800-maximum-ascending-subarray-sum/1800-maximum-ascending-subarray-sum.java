class Solution {
    public int maxAscendingSum(int[] arr) {

        int sum = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[i - 1]) {
                sum = sum + arr[i];
            } else {
                sum = arr[i];
            }

            max = Math.max(sum, max);
        }

        return max;
    }
}