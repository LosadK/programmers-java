import java.util.stream.Collectors;

class Solution {
    public String solution(int age) {
        String answer = "";
        
        // 내 풀이
        /*
        final int DIFF_ALPHABET_TO_NUMBER = 49;
        
        answer = String.valueOf(age).chars()
                .mapToObj(i -> String.valueOf((char) (i + DIFF_ALPHABET_TO_NUMBER)))
                .collect(Collectors.joining());
        */
        
        
        // 다른 풀이
        answer = String.valueOf(age).chars()
                .mapToObj(i -> String.valueOf((char) (i - '0' + 'a')))
                .collect(Collectors.joining());
        
        
        return answer;
    }
}