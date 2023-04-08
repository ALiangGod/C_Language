"""
n = int(input())
l1 = input().split()
# l1 = list(map(int, l1))
for i in range(0, n):
    l1[i] = int(l1[i])
l1 = sorted(l1)
for i in range(0, n):
    print(l1[i], end=" ")
"""

    # n = input()
    # x = input()
    # m = []
    # m = x.split()
    # for i in range(0, int(n)):
    #     m[i] = int(m[i])
    # m = sorted(m)
    # for i in range(0, int(n)):
    #     print(m[i], end=" ")


n = int(input())
x = input()
k = int(input())
m = []
m = x.split()
c = 0
for i in range(0, n):
    m[i] = int(m[i])
for i in range(0, n):
    if k == m[i]:
        print(i+1)
        c = c + 1
        break
if c == 0:
    print(-1)
