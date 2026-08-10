class Solution {
    public int solution(int price) {
        int answer = 0;
        
        // 내 풀이 1
        /*
        final float DISCOUNT_RATE_10 = (float) 5 / 100;
        final float DISCOUNT_RATE_30 = (float) 10 / 100;
        final float DISCOUNT_RATE_50 = (float) 20 / 100;

        if (price >= 100000 && price < 300000) {
            answer = (int) (price - (price * DISCOUNT_RATE_10));
        } else if (price >= 300000 && price < 500000) {
            answer = (int) (price - (price * DISCOUNT_RATE_30));
        } else if (price >= 500000 && price <= 1000000) {
            answer = (int) (price - (price * DISCOUNT_RATE_50));
        } else {
            answer = price;
        }
        */

        
        // 내 풀이2
        if (price >= 500000) {
            answer = price * 80 / 100;
        } else if (price >= 300000) {
            answer = price * 90 / 100;
        } else if (price >= 100000) {
            answer = price * 95 / 100;
        } else {
            answer = price;
        }
        
        
        return answer;
    }
}