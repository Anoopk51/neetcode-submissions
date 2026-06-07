class Solution {
    public int[] sortArray(int[] nums) {
        int size=nums.length;
        int startIndex=(size/2)-1;
        for(int i=startIndex;i>=0;i--){
            heapify(nums,i,size);
        }
        for(int i=size-1;i>0;i--){
            swap(nums,0,i);
            heapify(nums,0,i);
        }
        return nums;
    }

    void heapify(int[]nums,int i,int size){
        int maxIndex=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<size && nums[left]>nums[maxIndex]){
            maxIndex=left;
        }if(right<size && nums[right]>nums[maxIndex]){
            maxIndex=right;
        }if(maxIndex!=i){
            swap(nums,i,maxIndex);
            heapify(nums,maxIndex,size);
        }
    }

    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}