import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                sb.append(c);
            }
        }

        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);

        answer = new String(arr);
        
        
        return answer;
    }
}