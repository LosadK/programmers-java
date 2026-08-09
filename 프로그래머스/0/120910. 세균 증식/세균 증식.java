class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        
        // 내 풀이
        final int MULTI_PER_HOUR = 2;

        for (int i = 1; i <= t; i++) {
            n *= MULTI_PER_HOUR;
        }

        answer = n;
        
        return answer;
    }
}