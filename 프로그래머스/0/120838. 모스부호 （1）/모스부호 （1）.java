class Solution {
    public String solution(String letter) {
        String answer = "";
        
        // 내 풀이
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", 
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

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
        
        
        return answer;
    }
}