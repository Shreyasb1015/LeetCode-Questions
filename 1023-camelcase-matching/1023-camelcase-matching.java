class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        char[] pat = pattern.toCharArray();
        List<Boolean> list = new ArrayList<>();
        
        for(String s : queries){
            char[] c = s.toCharArray();
			
            int x = 0;
			
            boolean flag = true, extra = false;
            for(int i = 0; i<c.length; i++){
				
                if(extra || c[i]!=pat[x]){
					
                    if(c[i]>=65 && c[i]<=90){
                        flag = false;
                        break;
                    }
                }
				
				else{
                    x++;
                    extra = x>=pat.length;
                }
            }
			
            flag = flag && x==pat.length;
            list.add(flag);
        }
        
        return list;
    }
}