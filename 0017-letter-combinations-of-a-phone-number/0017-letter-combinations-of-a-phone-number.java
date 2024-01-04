class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> list = new ArrayList<>();
        if(digits.isEmpty()) return list;
        pad("",digits,list);
        return list;
    }
    public void pad(String p, String up,ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        int digit = up.charAt(0)-'0';

        if(digit == 7){
            for (int i = 0; i < 4; i++) {
                char ch = (char)('a'+15+i);
                pad(p+ch, up.substring(1),list);
            }
        }

        else if(digit == 8){
            for (int i = 0; i < 3; i++) {
                char ch = (char)('a'+19+i);
                pad(p+ch, up.substring(1),list);
            }
        }

        else if(digit == 9){
            for (int i = 0; i < 4; i++) {
                char ch = (char)('a'+22+i);
                pad(p+ch, up.substring(1),list);
            }
        }

        else{
            for (int i = (digit-2)*3; i < ((digit-1)*3); i++) {
                char ch = (char)('a'+i);
                pad(p+ch, up.substring(1),list);
            }
        }
    }
}