class Solution {
public:
    int hammingWeight(uint32_t n) {
        


        int num = n;
        int count = 0;
        unsigned long res1 = static_cast<unsigned long>(num);
unsigned long res2 = static_cast<unsigned long>(count);

        while(res1 != 0){
            int mask = res1 & (-res1);
            res1 = res1 - mask;
            res2++;
        }
        return res2;
    }
        
    
};