import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";

        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", 
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        
        
        // 내 풀이
        /*
        StringBuilder sb = new StringBuilder();

        for (String code : letter.split(" ")) {
            for (int j = 0; j < morse.length; j++) {
                if (code.equals(morse[j])) {
                    sb.append((char) ('a' + j));
                    break;
                }
            }
        }

        answer = sb.toString();
        */
        
        
        // 다른 풀이
        Map<String, Character> code_map = new HashMap<>();
        
        for (int i = 0; i < morse.length; i++) {
            code_map.put(morse[i], (char) ('a' + i));
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (String code : letter.split(" ")) {
            sb.append(code_map.get(code));
        }
        
        answer = sb.toString();        
        
        
        return answer;
    }
}