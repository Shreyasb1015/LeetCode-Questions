class Solution {
    public int repeatedStringMatch(String a, String b) {
        int m = a.length();
        int n = b.length();
        int maxLen = m + n - 1;

        int[] border = getBorder(b);
        int i = 0, j = 0, t = 0;

        while (i < maxLen && j < n) {
            int index = i % m;
            if (a.charAt(index) == b.charAt(j)) {
                i++;
                j++;
            } else if (j > 0) {
                j = border[j];
            } else {
                i++;
            }
        }
        
        int times = (int)(Math.ceil(i * 1.0 / m));
        return j == n ? times : -1;
    }

    private int[] getBorder(String str) {
        int n = str.length();
        int[] border = new int[n + 1];

        int left = 0, right = 1;
        while (right < n) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right++;
                border[right] = left;
            } else if (left > 0) {
                left = border[left];
            } else {
                right++;
            }
        }

        return border;
    }
}