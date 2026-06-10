class Solution {
    public int longestConsecutive(int[] nums) {

        int size=nums.length;
        if(nums==null || size==0){return 0;}
        // for heapify
        int startIndex=(size/2)-1;
        for(int i=startIndex;i>=0;i--){
            heapify(nums,i,size);
        }

        // for sorting
        for(int i=size-1;i>0;i--){
            swap(nums,0,i);
            heapify(nums,0,i);
        }

        // for longest consecutive sequence
        int currentLength=1;
        int maxLength=1;
        int prev=nums[0];
        for(int i=1;i<size;i++){
            if((nums[i]==prev)){
            continue;}
            if(nums[i]==prev+1){
                currentLength++;
             }else{
                currentLength=1;
            }
        
             maxLength = Math.max(maxLength, currentLength);
            prev=nums[i];
        }
        return maxLength;
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

    void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
