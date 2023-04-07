/*#include<stdio.h>			//迪杰斯特拉算法 
#include<stdlib.h>
#define INIFITY 9999
int G[20][20];
void add(char a,char b,int c)
{
	int q,p;
	q = a - 'A'+1;
	p = b - 'A'+1;
	G[q][p] = c;
	G[p][q] = c;
}
void CreateG()
{
		add('A','B',2);
	add('A','C',1);
	add('A','D',1);
	add('A','E',1);
	add('B','G',1);
	add('B','J',2);
	add('C','F',3);
	add('C','D',3);
	add('C','G',3);
	add('D','E',1);
	add('D','G',2);
	add('D','H',1);
	add('D','I',2);
	add('E','H',1);
	add('E','I',3);
	add('F','G',1);
	add('F','J',1);
	add('G','I',3);
	add('G','K',2);
	add('H','I',1);
	add('I','M',3);
	add('J','S',2);
	add('K','L',3);
	add('K','N',1);
	add('K','P',2);
	add('L','M',1);
	add('L','R',1);
	add('M','N',2);
	add('M','Q',1);
	add('M','S',1);
	add('N','P',1);
	add('O','P',1);
	add('O','Q',1);
	add('O','R',3);
	add('R','S',1);
}
int main()
{
	int dist[20];
	int path[20];
	int mark[20] = {0};
	int i,j,min;
	for(i=0;i<20;i++)
	{
		for(j=0;j<20;j++)
		{
			G[i][j] = INIFITY;
		}
	}
	
	CreateG();
//	for(i=0;i<20;i++)
//	{
//		for(j=0;j<20;j++)
//		{
//			printf("%d	",G[i][j]);
//		}
//		printf("\n");
//	}
	for(i=0;i<20;i++)
		path[i] = 1;
	for(i=1;i<20;i++)
		dist[i] = G[1][i];
	mark[1] = 1;
	int k;
	for(i=2;i<20;i++)
	{
		min = INIFITY;
		
		for(j=1;j<20;j++)
		{
			if(!mark[j]&&dist[j]<min)
			{
				min = dist[j];
				k = j;
			}
		}
		mark[k] = 1;
		for(j=1;j<20;j++)
		{
			if(!mark[j]&&dist[j]>min+G[k][j])
			{
				dist[j] = min+G[k][j];	
				path[j] = k;
			}
		}
	}
	printf("%d",dist[19]);
	return 0;
}*/

#include<stdio.h>			//弗洛伊德算法 
#define INIFITY 9999
int G[5][5];
void add(int a,int b,int lenth)
{
	G[a][b] = lenth;
}
void CreateG()
{
	add(1,2,3);
	add(1,4,5);
	add(2,1,2);
	add(2,4,4);
	add(3,2,1);
	add(4,3,2);
}
int main()
{
	int i,j,k,min;
	int path[5][5];
	int dist[5][5];
	for(i=0;i<5;i++)
		for(k=0;k<5;k++)
			G[i][k] = INIFITY;
	CreateG();
	for(i=1;i<5;i++)
	{
		for(j=1;j<5;j++)
		{
			dist[i][j] = G[i][j];
			if(i==j)
				dist[i][j] = 0;
		}
	}
	for(i=1;i<5;i++)
		for(j=0;j<5;j++)
			path[i][j] = i;
	for(k=2;k<5;k++)
	{
		for(i=1;i<5;i++)
		{
			for(j=1;j<5;j++)
			{
				if(dist[i][j] > dist[i][k]+dist[k][j])
				{
					dist[i][j] = dist[i][k]+dist[k][j];
					path[i][j] = k;
				}
			}
		}
	}
	for(i=1;i<5;i++)
	{
		for(j=1;j<5;j++)
		{
			if(j == i)
			{
				dist[i][j] = 0;
//				continue;	
			}
			printf("%d	",path[i][j]);
		}
		printf("\n");
	}
	i = 1;
	j = 3;
	printf("%d",i);
	while(path[i][j]!=i)
	{
		printf("%d",path[i][j]);
		i = path[i][j];
	}
	
}
