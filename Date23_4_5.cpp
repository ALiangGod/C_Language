/*#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{
	int i,k,n;
	int result;
	scanf("%d",&n);
	char str[n][100001];
	memset(str,0,n*100001);
	char reference[16][5] = {"0000","0001","0010","0011","0100","0101","0110","0111",
	"1000","1001","1010","1011","1100","1101","1110","1111"};
	for(i=0;i<n;i++)
	{
		scanf("%s",str[i]);
		int len = strlen(str[i]);
		int j = 0;
		int ss = 4*len%3;
		if(ss==0)
			ss = 3;
		char binary[4*len+4-ss];
		memset(binary,0,4*len+4-ss);
		if(ss==1)
		{
			strcat(binary,"00");
			j += 2;
		}
		else if(ss==2)
		{
			strcat(binary,"0");
			j++;
		}
		for(k=0;k<len;k++)		//转成二进制 
		{
			if(str[i][k] < 'A')
			{
				binary[j++] = reference[str[i][k]-'0'][0];
				binary[j++] = reference[str[i][k]-'0'][1];
				binary[j++] = reference[str[i][k]-'0'][2];
				binary[j++] = reference[str[i][k]-'0'][3];
			}
			else
			{
				binary[j++] = reference[str[i][k]-55][0];
				binary[j++] = reference[str[i][k]-55][1];
				binary[j++] = reference[str[i][k]-55][2];
				binary[j++] = reference[str[i][k]-55][3];
			}
		}
		
		int len_2 = strlen(binary);
		for(k=0;k<len_2;k=k+3)
		{
			if(k==0)
			{
				result =  4*(binary[k]-'0') + 2*(binary[k+1]-'0') + 1*(binary[k+2]-'0');
				if(result!=0)
					printf("%d",result);
			}
			else
			{
				result =  4*(binary[k]-'0') + 2*(binary[k+1]-'0') + 1*(binary[k+2]-'0');
				printf("%d",result);
			}
		}
		printf("\n");
	}
	return 0;
}*/
#include<stdio.h>
#include<math.h>
float distance(int a,int b,int c,int d)
{
	float s;
	int temp = (a+c)*(a+c)+(b+d)*(b+d);
	s = sqrt(temp);
	return s;
}
int main()
{
	int i,j,n,D;
	scanf("%d %d",&n,&D);
	int x[n+1],y[n+1];
	for(i=1;i<n+1;i++)
	{
		scanf("%d %d",&x[i],&y[i]);
	}
	float G[n+1][n+1] = {0};
	for(i=1;i<n+1;i++)
	{
		for(j=1;j<n+1;j++)
		{
			if(i==j)
			{
				G[i][j]==0;
				continue;
			}
			G[i][j] = distance(x[i],y[i],x[j],y[j]);
		}
	}
	
	
	
}



