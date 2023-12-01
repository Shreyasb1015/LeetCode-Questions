class Solution {
    public int repeatedStringMatch(String a, String b) {
        
        int repetitions = 1;
        StringBuilder repeatedString = new StringBuilder(a);

        while (repeatedString.length() < b.length()) {
            repeatedString.append(a);
            repetitions++;
        }

        // Checking if 'b' is a substring of the repeated string
        if (repeatedString.indexOf(b) != -1) {
            return repetitions;
        }

        // If 'b' is not a substring, checking for a partial match at the end
        repeatedString.append(a);
        if (repeatedString.lastIndexOf(b) != -1) {
            return repetitions + 1;
        }

      
        return -1;
    }
}