class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        x=list(s)
        y=list(t)
        for i in range(len(x)):
            if x[i] in y:
                y.remove(x[i])
        return "".join(y)