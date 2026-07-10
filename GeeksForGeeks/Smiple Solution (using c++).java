class Solution {
    public int maxPoint(int k, int[] arr1, int[] arr2) {
        int n = arr1.length;
        int res = 0;

        for (int i = 0; i < n; i++) {

            int points = (k / arr1[i]) * arr2[i];

            res = Math.max(res, points);
        }

        return res;
    }
}