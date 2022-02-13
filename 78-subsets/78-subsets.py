class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        x=[[]]
        for i in nums:
            x+=[[i]+j for j in x]
        return x
            