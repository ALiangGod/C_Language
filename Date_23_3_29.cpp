/*#include<stdio.h>
#define INIFITY 1000000000

int main()
{
	
	long long i,j,k,N;
	k = 0;
	scanf("%ld",&N);
	printf("5");
//	long long num[INIFITY][INIFITY];
	printf("5");
	for(i=1;i<INIFITY;i++)
	{
		for(j=1;j<i+1;j++)
		{
			k++;
			if(j==1||j==i)
				num[i][j] = 1;
			else
			{
				num[i][j] = num[i-1][j-1]+num[i-1][j];
			}
			if(num[i][j]==N)
			{
				printf("%d",k);
				return 0;
			}
		}
	}
	for(i=1;i<N+1;i++)
	{
		for(j=1;j<i+1;j++)
		{
			printf("%d	",num[i][j]);
		}
		printf("\n");
	}
//	long long num[][] = {0};
//	num[0][0] = 1;
//	long i = 1;
//	long n;
//	scanf("%ld",&n);
//	while(num[i]!=n)
//	{
//		num[i] = 
//	}
	return 0;
}*/
#include<stdio.h>
int main()
{
	int n;
	scanf("%d",&n);
	int a[n];
	int min,max,sum = 0;
	float averages;
	min = 100;
	max = 0;
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
		if(min>a[i])
			min = a[i];
		if(max<a[i])
			max = a[i];
	}
	for(int i=0;i<n;i++)
	{
		sum += a[i];
	}
	printf("%d\n%d\n%.2lf",max,min,(float)sum/n);
}
