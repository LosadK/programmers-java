class Solution {
    public int solution(int n) {

        final int PIECE = 7;
        int quotient = 0;
        int remainder = 0;
        
        quotient = n / PIECE;
        remainder = n % PIECE;
        
        return (remainder >= 1) ? quotient + 1 : quotient;
    }
}