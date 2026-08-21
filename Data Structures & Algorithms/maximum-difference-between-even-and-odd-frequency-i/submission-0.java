class Solution {
    public int maxDifference(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i =0 ; i<s.length() ; i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;
        for(Character ch : map.keySet()){
        int frequency = map.get(ch);
        if(frequency%2 !=0){
            maxOdd = Math.max(frequency,maxOdd);
        }
        else{
            minEven = Math.min(frequency,minEven);
        }
        }
        return maxOdd - minEven;
    }
}