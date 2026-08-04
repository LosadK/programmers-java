class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        final int SERVING_TO_GET_FREE_DRINK = 10;
        final int PRICE_PER_SERVING = 12000;
        final int PRICE_BEVERAGE = 2000;
        
        int freeDrinks = n / SERVING_TO_GET_FREE_DRINK;
        
        answer = (n * PRICE_PER_SERVING) + ((k - freeDrinks) * PRICE_BEVERAGE);
        
        return answer;
    }
}