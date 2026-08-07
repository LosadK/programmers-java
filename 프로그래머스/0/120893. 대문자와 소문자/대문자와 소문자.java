import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // 내 풀이
        /*
        answer = Arrays.stream(my_string.split(""))
            .map(s -> s.equals(s.toUpperCase()) ? s.toLowerCase() : s.toUpperCase())
            .collect(Collectors.joining());
        */
        
        
        // 다른 풀이
        answer = my_string.chars()
            .map(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c))
            .mapToObj(c -> String.valueOf((char) c))
            .collect(Collectors.joining());
        
        
        return answer;
    }
}