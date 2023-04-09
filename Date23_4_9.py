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


# n = int(input())
# x = input()
# k = int(input())
# m = []
# m = x.split()
# c = 0
# for i in range(0, n):
#     m[i] = int(m[i])
# for i in range(0, n):
#     if k == m[i]:
#         print(i+1)
#         c = c + 1
#         break
# if c == 0:
#     print(-1)
# n = int(input())
# x = input()
# k = int(input())
# m = []
# m = x.split()
# w = 0
# for i in range(0, n):
#     m[i] = int(m[i])
# for i in range(0, n):
#     if m[i] == k:
#         print(i+1)
#         w = w + 1
#         break
# if w == 0:
#     print(-1)
# year = int(input())
# if year%4 == 0 and year%100 != 0 or year%400 == 0:
#     print("yes")
# else
#     print("no")
# def qn(n):
#     if n == 1 or n == 2:
#         return 1
#     else:
#         return qn(n - 1) + qn(n - 2)


# n = int(input())
# a, b = 1, 1
# # result = qn(k) % 10007
# for i in range(2, n+1):
#     a, b = b, (a+b)%10007
# print(a)
# a = 1.11
# b = str(a)
# b.replace(".", " ")
# print(b[1])

# a = float(input())
# b = float(input())
# while a >= 1.0:
#     a = a-1
# while b >= 1.0:
#     b = b - 1
# print("%.12f %.12f",a, b)
# str1 = str(a)
# str2 = str(b)
# l1 = list(str1)
# l2 = list(str2)
# print(l1, l2)
# len1 = len(str1)
# len2 = len(str2)
# k1 = str1.find('.')
# k2 = str2.find('.')
# print(k1,  k2, l1[k1], l2[k2])
# c = 0
# for i in range(1, 12):
#     if l1[k1+i] != l2[k2+i]:
#         print("no")
#         c = 1
#         break
# if c == 0:
#     print("yes")

# num = input().split()
# # print(num[0], num[1])
# a = list(num[0])
# b = list(num[1])
# # print(a)
# # print(b)
# k1 = a.index('.')
# k2 = b.index('.')
# c = 0
# for i in range(1, 13):
#     if a[k1+i] != b[k2+i]:
#         print("NO")
#         c = c+1
#         break
# if c == 0:
#     print("YES")

def Qmax(a):
    k = 2
    if a == 1:
        return k-1
    else:
        for i in range(1, a):
            k = k*2
        return k-1


def Qmin(a):
    k = 2
    if a == 1:
        k = k - 2*k
        return k
    else:                       # 10 4
        for i in range(1, a):   # -3 5 6 -4 5 3 -4 1 -1 0
            k = k*2
        k = k - 2*k
        return k
def Qa(a):
    len1 = len(a)
    for i in range(len1):
        a[i] = abs(a[i])
    return min(a)

def Qaindex(b):
    len1 = len(b)
    for i in range(len1):
        b[i] = abs(b[i])
    mi = min(b)
    k = b.index(mi)
    return k

num = input().split()
n = int(num[0])
k = int(num[1])
num2 = input()
a = []
a = num2.split()
for i in range(0, n):
    a[i] = int(a[i])
for i in range(0, n-1):
    for j in range(i+1, n):
        temp1 = abs(a[i])
        temp2 = abs(a[j])
        if temp1 > temp2:
            temp = a[i]
            a[i] = a[j]
            a[j] = temp
print(a)
b = []
b = a
print(b)
sum = Qa(b)

result = 1
max1 = Qmax(k-1)
min1 = Qmin(k-1)
final = []
for i in range(0, n):
    final.append(0)
# s = Qaindex(b)
final[0] = 1
print(a)
print(final, max1, min1, n)
for j in range(0, n):
    for i in range(0, n):
        if final[i] == 0:
            sum = sum + a[i]
            if min1 <= sum <= max1:
                result = result + 1
                final[i] = 1
                print(final, result, sum)
                break
            else:
                sum = sum - a[i]
print(result)




# for i in range(0, n-1):
#     for j in range(i+1, n):
#         temp1 = abs(a[i])
#         temp2 = abs(a[j])
#         if temp1 > temp2:
#             temp = a[i]
#             a[i] = a[j]
#             a[j] = temp
# # print(a)
# sum = 0
# result = 0
# c = 0
# max1 = Qmax(k-1)
# min1 = Qmin(k-1)
#
# for i in range(0, n):
#     sum = sum + a[i]
#     if sum > max1 or sum < min1:
#         break
#     result = result + 1
# print(result)

# num1 = input().split()
# n = int(num1[0])
# xend = int(num1[1])
# yend = int(num1[2])
# x = []
# y = []
# for i in range(0, n):
#     num2 = input().split()
#     x.append(int(num2[0]))
#     y.append(int(num2[1]))
# result = 0
# if x[0] < xend:
#     resultx = xend - x[0]
# else:
#     resultx = x[0] - xend
# if y[0] < yend:
#     resulty = yend - y[0]
# else:
#     resulty = y[0] - yend
# print(resulty+resultx+1)
# xmax = x[n-1] + n - 1
# ymax = y[n-1] + n - 1
# xmin = x[n-1]
# ymin = y[n-1]
# result = 0
# while xmin <= x[0] <= xmax:
#     x[0] = x[0] + 1
#     result = result + 1
#     if x[0] == xend:
#         break
# while ymin <= y[0] <= ymax:
#     y[0] = y[0] + 1
#     result = result +1
#     if y[0] == yend:
#         break
# print(result)
