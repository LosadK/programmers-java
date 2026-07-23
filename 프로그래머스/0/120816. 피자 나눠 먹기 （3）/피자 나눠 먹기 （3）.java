class Solution {
    public int solution(int slice, int n) {
    
        int quotient = 0;
        int remainder = 0;
        
        quotient = n / slice;
        remainder = n % slice;
        
        return (remainder >= 1) ? quotient + 1 : quotient;
    }
}