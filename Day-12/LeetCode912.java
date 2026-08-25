class Solution {

    public void conqure(int [] arr,int si,int mid,int ei){
        // created one more array to store sorted elements 
        int[] merge=new int[ei-si+1];
        int ind1=si;
        int ind2=mid+1;
        int ind3=0;

        while(ind1<=mid && ind2<=ei){
            if(arr[ind1]<arr[ind2]){
                // storing sorted elements into merge array 
                merge[ind3++]=arr[ind1++];
            }else{
                merge[ind3++]=arr[ind2++];
            }
        }

        // storing the remaining elements if remainin
        while(ind1<=mid){
            merge[ind3++]=arr[ind1++];
        }
         while(ind2<=ei){
            merge[ind3++]=arr[ind2++];
        }
// storing sorted elements into our original array
        for(int i=0,j=si;i<merge.length;i++,j++){
            arr[j]=merge[i];
        }
    }
public void sort(int []  arr,int si,int ei){
    // si=start index , ei= end index

    // sort() is a recursive function which will divide array int o 
    // smaller parts according to the mid

    //basecase condition
    if(si>=ei){
        return;
    }
    int mid=si+(ei-si)/2;
    // dividing array from start index to mid
    sort(arr,si,mid);

    // dividing array from mid+1 to end index
    sort(arr,mid+1,ei);

    // calling conqure method to merge the divided array in sorting manner
    conqure(arr,si,mid,ei);
}

    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
    }
}