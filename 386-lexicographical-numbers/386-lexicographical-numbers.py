from functools import cmp_to_key
class Solution:
    def lexicalOrder(self, n: int) -> List[int]:
        # def compare(a, b):
        #     if a > b:
        #         return +1
        #     elif b > a:
        #         return -1
        #     else:
        #         return 0
        output = []
        for i in range(1, n+1):
            output.append(str(i))
        output = sorted(output)
        return [int(x) for x in output]