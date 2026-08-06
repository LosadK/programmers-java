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
        
        
        
        return answer;
    }
}