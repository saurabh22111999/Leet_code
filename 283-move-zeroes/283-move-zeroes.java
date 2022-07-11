class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i,j=0;
        int temp=0;
        for(i=0;i<n;i++){
        if(nums[i]!=0 && nums[j]==0){
temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        j++;}
            
            else if(nums[j]!=0){
j++;}
        }
        
   return; }
}