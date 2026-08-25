class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        // 내 풀이
        String[] num_arr = String.valueOf(num).split("");

        answer = -1;

        for (int i = 0; i < num_arr.length; i++) {
            if (k == Integer.parseInt(num_arr[i])) {
                answer = i + 1;
                break;
            }
        }
        
        
        return answer;
    }
}