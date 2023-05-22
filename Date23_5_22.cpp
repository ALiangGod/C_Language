#include<stdio.h>
int main()
{
	int a[10] = {1,4,2,5,1,6,1,3,6,2};
	int b[10];
	for(int i=0; i<9; i++)
	{
//		printf("%d	",b[i]);
// 		printf("I don't want to write anymore");
		for(int j=i+1; j<10; j++)
		{
			if(a[i] > a[j])
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	for(int i=0; i<10; i++)
	{
		printf("%d	",a[i]);
	}
}
