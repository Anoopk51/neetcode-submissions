class Solution {
    public int maxArea(int[] heights) {
        
        int area=0;
        int low=0;
        int high=heights.length-1;
        int currentArea=maxAr(heights,low,high);
        while(low<high){
            if(heights[low]<heights[high]){
                
                area=maxAr(heights,low,high);
                if(area>currentArea){
                    currentArea=area;
                }
                low++;
            // }if(heights[low]<heights[high-1]){
            //     high--;
            //     area=maxAr(heights,low,high);
            //     if(area>currentArea){
            //         currentArea=area;
            //     }
            }
            else{
               
                area=maxAr(heights,low,high);
                if(area>currentArea){
                    currentArea=area;
                }
                 high--;
            }
          
        }
        return currentArea;
    }

    int maxAr(int[] heights,int low,int high){
        int hight=0;
        int base=high-low;
        if(heights[high]>heights[low]){
            hight=heights[low];
        }else{
            hight=heights[high];
        }
        return base*hight;
       

    }
}
