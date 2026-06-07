class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }
 
        int max=map.get(nums[0]);
        int majority=nums[0];
        for(int i:map.keySet()){
            if(max<map.get(i)){
                max=map.get(i);
                majority=i;
            }
        }

        if(max>(n/2)){
            return majority;
        }
        return majority;
    }
    
}