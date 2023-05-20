#include<stdio.h>
void quicklySort(int[], int, int);
int main()
{
	int num[] = {5,23, 1,1,4,6,2,3,5,7,1,2,22,155,1};
//	printf("%d",num[12]);
	printf("%d",sizeof(num)/sizeof(num[0]));
	quicklySort(num, 0, sizeof(num)/sizeof(num[0])-1);
	for(int i=0; i<sizeof(num)/sizeof(num[0]); i++)
	{
		printf("%d\n",num[i]);
	}
}
void quicklySort(int num[], int i, int k)
{
	int start = i;
	int end = k;
	int basenum = i;
	
	if(start >= end)
		return;
		
	while(start != end)	//51324
	{
		if(num[end] > num[basenum])
		{
			end--;
			continue;
		}
		if(num[start] <= num[basenum])
		{
			start++;
			continue;
		}
		int temp = num[start];
		num[start] = num[end];
		num[end] = temp;
	}
	int temp = num[start];
	num[start] = num[i];
	num[i] = temp;
	
	quicklySort(num, i, start-1);
	quicklySort(num, start+1, k);
}
