m,n=map(int,input().split())
a=list(map(int,input().split()))
b=[]
if len(a)//n==n or len(a)==n:
    for i in range(0,m+n,n):
        b.append(a[i:n+i])
    for i in range(len(b)):
        if b[i]==[]:
            b.remove(b[i])
else:
    b.append([])
print(b)
