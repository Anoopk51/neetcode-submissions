class Solution {
    public int pivotIndex(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int pivot=-1;
        while(low<=high){
            pivot=low+(high-low)/2;
            int leftSum=0;
            int rightSum=0;
            for(int i=0;i<pivot;i++){
                leftSum+=nums[i];
            }
            for(int j=pivot+1;j<nums.length;j++){
                rightSum+=nums[j];
            }
            if(leftSum==rightSum){
                return pivot;
                
            }
            if(low<pivot){
                high=pivot-1;
            }
            else{
                low=pivot+1;
                high=nums.length-1;
            }
        }
        return -1;
    }
}