class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> indexMap=new HashMap();
        Stack<Integer> stack= new Stack<>();
        int[] result=new int[nums2.length];
        int[] outPut=new int[nums1.length];
        
            
        for(int i=nums2.length-1;i>=0;i--){
            indexMap.put(nums2[i],i);
            
                
                while(!stack.empty()&& stack.peek()<=nums2[i]){
                    stack.pop();
            }
                if(stack.empty()){
                    result[i]=-1;
                }
            else{
                result[i]=stack.peek();
            }
        stack.push(nums2[i]);
            
           
        }
for(int j=0;j<nums1.length;j++){
    outPut[j]=result[indexMap.get(nums1[j])];
}
    return outPut;}
        
        
    }
