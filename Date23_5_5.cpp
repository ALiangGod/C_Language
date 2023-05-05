#include<stdio.h>
int main()
{
	int i;
	int num[10] = {2, 1, 3, 5, 7, 2, 4, 1, 6, 7};
	for(i = 0; i < 9; i++)
	{
		for(int j = 0; j < 10 - i; j++)
		{
			if(num[j] > num[j + 1])
			{
				int temp = num [j];
				num[j] = num[j + 1];
				num[j + 1] = temp;
			}
		}
	}
	for(i = 0; i < 10; i++)
	{
		printf("%d	", num[i]);
	}
}
