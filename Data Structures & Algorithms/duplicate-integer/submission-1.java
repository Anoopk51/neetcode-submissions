class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dub=new HashSet<>();
        for(int i=0;i<nums.length;i++){
         if(dub.contains(nums[i])) return true;
         dub.add(nums[i]);
        
        }
        return false;
    }
}