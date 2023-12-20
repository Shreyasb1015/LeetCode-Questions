class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < (1 << n); i++) {
            // Compute the XOR of the current index i with (i & -i) to generate the next gray code.
            num ^= i & (-i);
            // Add the generated gray code to the answer list.
            ans.add(num);
        }
        return ans;
    }
}