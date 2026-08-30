import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // 내 풀이
        
        answer = Arrays.stream(my_string.split(""))
                .map(String::toLowerCase)
                .sorted()
                .collect(Collectors.joining(""));
        
        
        // 다른 풀이
        /*
        char[] my_chars = my_string.toLowerCase().toCharArray();
        Arrays.sort(my_chars);
        answer = new String(my_chars);
        */
        
        
        return answer;
    }
}