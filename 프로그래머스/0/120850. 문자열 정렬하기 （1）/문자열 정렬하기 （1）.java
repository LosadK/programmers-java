class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        // 내 풀이
        answer = my_string.chars()
            .filter(Character::isDigit)
            .map(c -> c - '0')
            .sorted()
            .toArray();
        
        
        return answer;
    }
}