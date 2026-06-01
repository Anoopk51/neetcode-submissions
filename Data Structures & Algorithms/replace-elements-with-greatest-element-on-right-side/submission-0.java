class Solution {
    public int[] replaceElements(int[] arr) {
        int size=arr.length;
        int start=0;
        int end=size-1;
        while(start<end){
            int max=arr[start+1];
            int index=start;
            for(int i=start+1;i<arr.length;i++){
                if(max<=arr[i]){
                    max=arr[i];
                    index=i;
                }
            }
            arr[start]=arr[index];
            start++;
        }
        arr[end]=-1;
        return arr;
    }
}