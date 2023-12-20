class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);

        for(int i = 1; i <= n; i++){
            int val = (int)Math.pow(2,i-1);
            List<Integer> temp = new ArrayList<>(list);
            for(int loop = temp.size() - 1;loop>=0;loop--) list.add(temp.get(loop)+val);
        }
        
        return list;
    }
}