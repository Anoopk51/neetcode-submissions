class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result=new int[k];
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<k;i++){
            int majority=nums[0];
            int frequent=0;
            for(int key:map.keySet()){
                if(map.get(key)>frequent){
                    frequent=map.get(key);
                    majority=key;
                }
            }
            result[i]=majority;
            map.remove(majority);
        }
        return result;
        

    }
}
