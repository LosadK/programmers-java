import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        // 내 풀이
        /*
        String[] cipher_arr = cipher.split("");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < cipher_arr.length; i++) {
            int strIndex = i + 1;

            if (strIndex >= code && strIndex % code == 0) {
                sb.append(cipher_arr[i]);
            }
        }
        
        answer = sb.toString();
        */
        
        
        // 다른 풀이1
        /*
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < cipher.length(); i++) {
            if ((i + 1) % code == 0) {
                sb.append(cipher.charAt(i));
            }
        }
        
        answer = sb.toString();
        */
        
        
        // 다른 풀이2
        answer = IntStream.range(0, cipher.length())
            .filter(i -> (i + 1) % code == 0)
            .mapToObj(i -> String.valueOf(cipher.charAt(i)))
            .collect(Collectors.joining());
        
        
        return answer;
    }
}