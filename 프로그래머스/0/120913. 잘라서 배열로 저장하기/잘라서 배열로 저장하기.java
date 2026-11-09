class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        
        // 내 풀이
        int length = my_str.length();
        int substr_count = (length + n - 1) / n;
        
        answer =  new String[substr_count];

        int start = 0;
        int last = n;

        for (int i = 0; i < substr_count; i++) {

            if (last > length) {
                last =  length;
            }

            answer[i] = my_str.substring(start, last);

            start += n;
            last += n;
        }        
        
        
        return answer;
    }
}