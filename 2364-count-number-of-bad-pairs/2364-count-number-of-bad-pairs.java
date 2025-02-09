class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer,Integer>freq=new HashMap<>();
        int n= nums.length;
        long good =0;
        for(int i=0 ;i<n;i++){
            int key= nums[i]-i;
            good+=freq.getOrDefault(key,0);
            freq.put(key,freq.getOrDefault(key,0)+1);
        }
        return (long) n*(n-1)/2 -good;
        
    }
}