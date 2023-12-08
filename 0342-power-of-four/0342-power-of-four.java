class Solution {
    public boolean isPowerOfFour(int n) {
        if (n > 0 && (n & (n - 1)) == 0) {
           
            if ((n - 1) % 3 == 0) {
                return true;
            }
        }
        return false;
    }
}