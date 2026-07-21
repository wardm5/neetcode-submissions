class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0, left = 0, right = 0, sum = 0;

        while (right < arr.length) {
            while (right < arr.length && right - left < k)
                sum += arr[right++];

            if (sum >= threshold * k)
                count++;

            sum -= arr[left++];
        }

        return count;
    }
}