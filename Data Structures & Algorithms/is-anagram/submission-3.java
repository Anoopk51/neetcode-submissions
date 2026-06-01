class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> sCh=new HashMap<>();
        HashMap<Character,Integer> tCh=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            sCh.put(sChar,sCh.getOrDefault(sChar,0)+1);
            tCh.put(tChar,tCh.getOrDefault(tChar,0)+1);
        }
        return sCh.equals(tCh);
    }
}
