class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        
        // 내 풀이
        /*
        switch (direction) {
            case "left":
                for (int i = 0; i < numbers.length; i++) {
                    if (i == numbers.length - 1) {
                        break;
                    }

                    int prev_value = numbers[i];
                    int next_value = numbers[i + 1];
                    
                    numbers[i + 1] = prev_value;
                    numbers[i] = next_value;
                }
                break;
            case "right":
                for (int i = numbers.length - 1; i >= 0; i--) {
                    if (i == 0) {
                        break;
                    }

                    int prev_value = numbers[i];
                    int next_value = numbers[i - 1];

                    numbers[i] = next_value;
                    numbers[i - 1] = prev_value;
                }
                break;
        }

        answer = numbers;
        */
        
        
        // 다른 풀이1
        /*
        answer = new int[numbers.length];
        
        if (direction.equals("right")) {
            answer[0] = numbers[numbers.length - 1];
            
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i + 1] = numbers[i];
            }
        } else {
            answer[numbers.length - 1] = numbers[0];
            
            for (int i = 1; i < numbers.length; i++) {
                answer[i - 1] = numbers[i];
            }
        }
        */
        
        
        // 다른 풀이2
        answer = new int[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            if (direction.equals("right")) {
                answer[(i + 1) % numbers.length] = numbers[i];
            } else {
                answer[i] = numbers[(i + 1) % numbers.length];
            }
        }
        
        
        
        return answer;
    }
}