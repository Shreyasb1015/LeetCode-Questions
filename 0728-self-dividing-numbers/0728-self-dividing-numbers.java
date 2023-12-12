class Solution {
    public boolean selfDivide(int originalNum) {
        int num = originalNum;
        while(num>0) {
            int rem = num % 10;
            if(rem==0) {
                return false;
            }
            if(originalNum % rem !=0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=left; i<=right; i++) {
            if(selfDivide(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}