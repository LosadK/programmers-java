import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        // 내 풀이
        answer = my_string.chars()
            .filter(Character::isDigit)
            .map(c -> c - '0')
            .sorted()
            .toArray();
        
        
        // 다른 풀이
        /*
        answer = Arrays.stream(my_string.split(""))
                .filter(s -> s.matches("[0-9]"))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        */
        
        
        return answer;
    }
}