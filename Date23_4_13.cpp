/*#include<stdio.h>
int main()
{
	long long n, result;
	float temp = (1 + n) / 2;
	scanf("%lld",&n);
	if(n % 2 == 0)
		result = (1 + n) * (n / 2);
	else
		result = (1 + n) * ((n - 1) / 2) + temp;
	printf("%lld", result);
	return 0;
}*/
//#include<stdio.h>
//int main()
//{
//	int n, i, j;
//	scanf("%d", &n);
//	int num[n];
//	for(i = 0; i<n; i++)
//		scanf("%d", &num[i]);
//	for(i = 0; i<n-1; i++)
//	{
//		for(j = i + 1; j<n; j++)
//		{
//			if(num[i] > num[j])
//			{
//				int temp = num[i];
//				num[i] = num[j];
//				num[j] = temp;
//			}
//		}
////		printf("%d", num[i]);
//	}
//	for(i = 0; i < n; i++)
//		printf("%d ", num[i]);
//	return 0;
//	
//}
#include<stdio.h>
int main()
{
	int n, i, j, temp;
	scanf("%d", &n);
	int num[n];
	for(i = 0; i < n; i++)
		scanf("%d", &num[i]);
	for(i = 0; i < n-1; i++)
	{
		for(j = 0; j < n-i-1; j++)
		{
			if(num[j] > num[j+1])
			{
				temp = num[j];
				num[j] = num[j+1];
				num[j+1] = temp;
 			}
		}
	}
	for(i = 0; i < n; i++)
		printf("%d", num[i]);
}
