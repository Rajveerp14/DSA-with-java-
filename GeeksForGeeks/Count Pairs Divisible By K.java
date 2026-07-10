class Solution {
    public int countKdivPairs(int[] arr, int k) {
int[] rem = new int[k];
    int count = 0;
        for (int i = 0; i < arr.length; i++) {

            int r = arr[i] % k;

            if (r == 0) {
                count += rem[0];
            } else {
                count += rem[k - r];
            }

            rem[r]++;
        }
        return count;

    }
}