#User function Template for python3

class Solution:
    def diagonalSumDifference(self,N,Grid):
        #code here
        sum1=0
        sum2=0
        for i in range(N):
            sum1=sum1+Grid[i][i]
            sum2=sum2+Grid[i][N-i-1]
        return abs(sum1-sum2)

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        N=int(input())
        Grid = [[0 for i in range(N)] for j in range(N)]
        for i in range(N):
            s=list(map(int,input().strip().split(' ')))
            for j in range(N):
                Grid[i][j]=s[j]
        ob=Solution()
        print(ob.diagonalSumDifference(N,Grid))
# } Driver Code Ends