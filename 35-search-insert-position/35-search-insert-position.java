class Solution {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        int low=0;
        int high=len-1;
        while(low<=high){
            int mid=low+(high-low)/2;
        if(nums[mid]==target)
            return mid;
            
        else if(target>nums[mid])
            low=mid+1;
            
        else if(target<nums[mid])
            high=mid-1;
            
        }
        return low;
    }
}