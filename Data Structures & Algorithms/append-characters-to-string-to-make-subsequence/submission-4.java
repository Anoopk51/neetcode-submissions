class Solution {
    public int appendCharacters(String s, String t) {
        boolean found=false;
        int match=0;
        int count=0;
        if(t.length()==0){
            return count;
        }
        if(s.length()==0){
            return t.length();
        }
        for(int i=0;i<t.length();i++){
            found=false;
            for(int j=match;j<s.length();j++){
                char chT=t.charAt(i);
                char chS=s.charAt(j);
                if(chT==chS){
                    match=j+1;
                    found=true;
                    break;
                }
            }
            if(!found){
                return t.length()-i;
                
            }
        }
        return count;
    }
}