class Solution {
        public String encode(List<String> strs) {
        StringBuilder st=new StringBuilder();
        for(String s:strs){
            st.append(s.length());
            st.append("#");
            st.append(s);
        }

        String encoded_string=st.toString();
        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> decoded_strs=new ArrayList<>();
        int len=str.length();
        int i=0;
        while(i<len){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int leng=Integer.parseInt(str.substring(i,j));
            String word=str.substring(j+1,j+1+leng);
            decoded_strs.add(word);
            i=j+1+leng;}
        return decoded_strs;
    }
}
