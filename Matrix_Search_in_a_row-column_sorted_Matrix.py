n=int(input("Enter the no of rows"))
m=int(input("Enter the no of columns"))
matrix=[]
for i in range(0,n):
    l=[]
    for j in range(0,m):
        l.append(int(input()))
    matrix.append(l)
for i in range(0,n):
    for j in range(0,m):
        print(matrix[i][j], end='')
    print()