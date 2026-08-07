class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int square = (int) Math.sqrt(n);
        
        answer = (n % square == 0) ? 1 : 2; 
        
        return answer;
    }
}