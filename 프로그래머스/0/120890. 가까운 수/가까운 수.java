class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        // 내 풀이
        int prev = Integer.MAX_VALUE;
        for (int num : array) {
            int diff = Math.abs(n - num);

            if (diff < prev || (diff == prev && num < answer)) {
                answer = num;
                prev = diff;
            }
        }
        
        
        return answer;
    }
}