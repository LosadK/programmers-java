class Solution {
    public int solution(String s) {
        int answer = 0;
        
        // 내 풀이
        String[] s_arr = s.split(" ");

        int prev = 0;
        for (int i = 0; i < s_arr.length; i++) {
            if (s_arr[i].equals("Z")) {
                answer -= prev;
            } else {
                answer +=  Integer.parseInt(s_arr[i]);
                prev = Integer.parseInt(s_arr[i]);
            }

        }
        
        
        return answer;
    }
}