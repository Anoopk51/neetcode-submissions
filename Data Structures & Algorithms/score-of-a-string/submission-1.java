class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for( int i = 1 ; i < s.length() ; i++){
            char firstCh = s.charAt(i - 1);
            char secondCh = s.charAt(i);
            score += Math.abs(firstCh - secondCh);
            
        }
        return score;
    }
}