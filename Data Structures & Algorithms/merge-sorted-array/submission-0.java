class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<nums2.length;i++){
            nums1[m+i]=nums2[i];
        }
        int size=nums1.length;
        int startIndex=(size/2)-1;
        for(int i=startIndex;i>=0;i--){
            heapify(nums1,i,size);
        }

        for(int i=size-1;i>0;i--){
            swap(nums1,0,i);
            heapify(nums1,0,i);
        }
    }

    void swap(int[] nums1,int i,int j){
        int temp=nums1[i];
        nums1[i]=nums1[j];
        nums1[j]=temp;
    }

    void heapify(int[]nums1 ,int i,int size){
        int maxIndex=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<size && nums1[left]>nums1[maxIndex]){
            maxIndex=left;
        }
        if(right<size && nums1[right]>nums1[maxIndex]){
            maxIndex=right;
        }if(maxIndex!=i){
            swap(nums1,i,maxIndex);
            heapify(nums1,maxIndex,size);
        }
    }
}