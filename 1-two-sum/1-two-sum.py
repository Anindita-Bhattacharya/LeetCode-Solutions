class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        arr=[]
        for i,val in enumerate(nums):
            arr.append([val,i])
        
        arr.sort()
        
        i=0
        j=len(nums)-1
        
        while i<j:
            if arr[i][0]+arr[j][0]==target:
                return [arr[i][1],arr[j][1]]
            elif arr[i][0]+arr[j][0]<target:
                i+=1
            else:
                j-=1