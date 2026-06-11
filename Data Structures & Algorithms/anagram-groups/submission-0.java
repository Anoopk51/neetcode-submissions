class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        int n=strs.length;
        for(int i=0;i<n;i++){
            String word=strs[i];
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(word);
         }
        for(List<String> l:map.values()){
            list.add(l);
        }
        return list;
        // return new ArrayList<>(map.values());
            
    }
}
