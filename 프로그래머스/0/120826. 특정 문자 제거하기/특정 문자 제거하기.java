class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        // solution 1
        //answer = my_string.replace(letter, "");
        
        // solution 2
        StringBuilder sb = new StringBuilder();
        
        char[] charArr = my_string.toCharArray();
        for (char c : charArr) {
            if (c != letter.charAt(0)) {
                sb.append(c);
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}