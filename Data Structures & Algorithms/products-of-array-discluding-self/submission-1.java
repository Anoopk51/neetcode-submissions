class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] output=new int[n];
        /*
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    product=product*nums[j];
                }
            }
            output[i]=product;
        }
        return output;
        */

        int lProduct=1;
        int[] left=new int[n];
        left[0]=lProduct;
        for(int i=1;i<n;i++){
           lProduct=lProduct*nums[i-1];
           left[i]=lProduct;
        }

        int rProduct=1;
        int[] right=new int[n];
        right[n-1]=rProduct;
        for(int i=n-2;i>=0;i--){
            rProduct=rProduct*nums[i+1];
            right[i]=rProduct;
           
        }
       
      
        for(int i=0;i<n;i++){
           output[i]=right[i]*left[i];
        }
        return output;
    }
}  
