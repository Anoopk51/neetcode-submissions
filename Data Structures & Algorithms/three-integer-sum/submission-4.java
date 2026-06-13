class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // TC become O(n^3)
        /*
        HashSet<List<Integer>> set=new HashSet<>();
        List<List<Integer>> list=new ArrayList<>();
        
        int n=nums.length;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i==j || j==k || k==i){
                        continue;
                    }if((nums[i]+nums[j]+nums[k])==0){
                        List<Integer> lt=new ArrayList<>();
                        lt.add(nums[i]);
                        lt.add(nums[j]);
                        lt.add(nums[k]);
                        // list.add(lt);
                        Collections.sort(lt);
                        set.add(lt);
                    }
                }
            }
        }
       list.addAll(set);
        return list;
        */
        // Now TC for O(n^2)

        HashSet<List<Integer>> set=new HashSet<>();
        List<List<Integer>> list=new ArrayList<>();
        
        int n=nums.length;
        sort(nums,n);
        for(int i=0;i<n;i++){
            int a=nums[i];
            int low=i+1;
            int high=n-1;
            int target=-a;
            if(i==low ){
                    break;
                }
            while(low<high){
               
                if((nums[low]+nums[high])<target){
                    low++;
                }else if((nums[low]+nums[high])>target){
                    high--;
                }else if((nums[low]+nums[high])==target){
                    List<Integer> lt=new ArrayList<>();
                    lt.add(nums[low]);
                    lt.add(nums[high]);
                    lt.add(nums[i]);
                    Collections.sort(lt);
                    set.add(lt);
                   low++;
                   high--;
                }
            }
        }
        list.addAll(set);
        return list;
    }
    void sort(int[] nums,int size){
        for(int i=0;i<size-1;i++){
            int flag=0;
            for(int j=0;j<size-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
    }
}
