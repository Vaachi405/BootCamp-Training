class Solution {
    public void moveZeroes(int[] nums) {
        int len=nums.length;
        int i=0;
        int k=0;
        for(i=0;i<len;i++)
        {
            if(nums[i]!=0)
            {
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                k++;
            }
        }
    }
}