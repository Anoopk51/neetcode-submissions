class Solution {
    public int findMin(int[] nums) {
        // Method-1 By linear search
        /*
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }
        return min;
        */

        // Method-2 Binary Search
        int n=nums.length;
        // if(nums[0]<nums[nums.length-1]){
        //     return nums[0];
        // }
        // if(n==2){
        //     if(nums[0]>nums[1]){
        //         return nums[1];
        //     }else{return nums[0];}
        // }
        int low=0;
        int high=n-1;
        int mid=0;
        while(low<high){
            mid=low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return nums[high];
    }
}
