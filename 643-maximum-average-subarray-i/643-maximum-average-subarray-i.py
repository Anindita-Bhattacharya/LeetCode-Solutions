class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        temp=[] 
        x=0
        for i in range(k):
            x=x+nums[i]
        temp.append(x/k)
        for i in range(k,len(nums)):
            x=x+nums[i]-nums[i-k]
            temp.append(x/k)
            
        return max(temp)
        