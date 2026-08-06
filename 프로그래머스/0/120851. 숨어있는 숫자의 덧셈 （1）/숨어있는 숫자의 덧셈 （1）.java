import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        // 내 풀이
        String[] my_string_arr = my_string.split("");

        for (String str :  my_string_arr) {
            if (str.matches("[0-9]")) {
                answer += Integer.parseInt(str);
            }
        }
        
        
        // 다른 풀이1
        /*
        answer = Arrays.stream(my_string.split(""))
            .filter(str -> str.matches("[0-9]"))
            .mapToInt(Integer::parseInt)
            .sum();
        */
        
        
        // 다른 풀이2
        /*
        answer = my_string.chars()  // 문자열의 각 문자를 IntStream 으로 만듦
            .filter(Character::isDigit) // = .filter(c -> Character.isDigit(c))
            .map(Character::getNumericValue)    // = .map(c -> Character.getNumericValue(c))
            .sum();
        */

        
        return answer;
    }
}