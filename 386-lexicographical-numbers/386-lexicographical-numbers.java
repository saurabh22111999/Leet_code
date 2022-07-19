import java.util.*;
class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<String> v=new ArrayList<String>();
        for(int i=1;i<=n;i++){
            v.add(String.valueOf(i));
            
        }
        Collections.sort(v);
        ArrayList<Integer> nv=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            nv.add(Integer.valueOf(v.get(i)));
            
            
        }
        return nv;
        
    }
}