class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        final int PRICE = 5500;
        
        int cups = money / PRICE;
        int change = money % PRICE;
        
        answer = new int[]{cups, change};
        return answer;
    }
}