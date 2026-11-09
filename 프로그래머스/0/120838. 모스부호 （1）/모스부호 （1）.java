class Solution {
    public String solution(String letter) {
        String answer = "";
        
        // 내 풀이
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", 
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        String[] letter_arr = letter.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < letter_arr.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (letter_arr[i].equals(morse[j])) {
                    sb.append((char) (j + 97));
                }
            }
        }

        answer = sb.toString();
        
        
        return answer;
    }
}