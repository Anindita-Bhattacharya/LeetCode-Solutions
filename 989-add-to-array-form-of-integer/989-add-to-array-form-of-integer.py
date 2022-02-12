class Solution:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        ans=""
        for i in num:
            ans=ans+str(i)
        ans=int(ans)+k 
        temp=[x for x in str(ans)]
        return temp
        