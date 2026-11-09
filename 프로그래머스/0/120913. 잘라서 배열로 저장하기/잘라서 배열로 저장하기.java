class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        
        // 내 풀이
        /*
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
        */
        
        
        // 다른 풀이
        int length = my_str.length();
        
        answer = new  String[(length + n - 1) / n];

        for (int i = 0; i < answer.length; i++) {
            int start = i * n;
            int end = Math.min(start + n, length);

            answer[i] = my_str.substring(start, end);
        }        
        
        
        return answer;
    }
}