class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        // 내 풀이
        final String SCISSORS = "2";
        final String ROCK = "0";
        final String PAPER = "5";

        StringBuilder sb = new StringBuilder();

        for (String s : rsp.split("")) {
            switch (s) {
                case SCISSORS:
                    sb.append(ROCK);
                    break;
                case ROCK:
                    sb.append(PAPER);
                    break;
                case PAPER:
                    sb.append(SCISSORS);
                    break;
                default:
                    sb.append("");
            }
        }

        answer = sb.toString();
        
        
        return answer;
    }
}