class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        // 내 풀이1
        int max = 1;

        for (int len : box) {
            max *= (len / n);
        }

        answer = max;
        
        
        return answer;
    }
}