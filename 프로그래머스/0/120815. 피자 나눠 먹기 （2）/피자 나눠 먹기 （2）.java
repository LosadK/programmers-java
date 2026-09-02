class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 내 풀이
        final int PIECES = 6;

        for (int i = 1;  i <= n; i++) {
            if ((PIECES * i) % n == 0) {
                answer = i;
                break;
            }
        }
        
        
        return answer;
    }
}