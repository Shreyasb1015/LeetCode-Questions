class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word: words){
            sb.append((word.length() <= 2 ? word.toLowerCase() : word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase())+" ");
        }
        return sb.toString().substring(0,sb.length()-1);
    }
}