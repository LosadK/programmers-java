import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        // 내 풀이
        /*
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
        */
        
        
        // 다른 풀이1
        /*
        String[] s_arr = s.split(" ");

        int prev = 0;
        for (String str : s_arr) {
            if (str.equals("Z")) {
                answer -= prev;
            } else {
                prev = Integer.parseInt(str);
                answer += prev;
            }
        }
        */
        
        
        // 다른 풀이2
        Stack<Integer> stack = new Stack<>();

        for (String str : s.split(" ")) {
            if (str.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(str));
            }
        }

        for (int num : stack) {
            answer += num;
        }        
        
        
        return answer;
    }
}