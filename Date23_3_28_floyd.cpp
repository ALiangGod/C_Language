/*#include<stdio.h>	//弗洛伊德算法
#define INIFITY 9999
int cost[5][5];
void add(int a,int b,int c){
	int q = a-64;
	int p = b-64;
	cost[q][p] = c;
	cost[p][q] = c;
}

void create_g(){
	int i,j;
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
			cost[i][j] = INIFITY;
		}
	}
	add('A','B',2);
	add('A','D',6);
	add('B','D',2);
	add('B','C',3);	
	add('C','D',2);
}

int main()
{
	int k,i,j;
	int dist[3][5][5];
	int path[5][5];
//	int final[5] = {0};
	create_g();
	
	for(i=0;i<3;i++)
	{
		for(j=1;j<5;j++)
		{
			for(k=1;k<5;k++)
			{
				dist[i][j][k] = cost[j][k];
			}
		}
	}
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
			path[i][j] = j;
		}
	}
//	printf("%d\n",dist[2][1][3]);;
	for(i=0;i<3;i++)
	{
		for(j=1;j<5;j++)
		{
			for(k=1;k<5;k++)
			{
				if(dist[i][j][k]>dist[i][j][i+2]+dist[i][i+2][k])
				{
					dist[i][j][k] = dist[i][j][i+2]+dist[i][i+2][k];
					path[j][k] = i;
				}
			}
		}
	}
	printf("%d\n",dist[2][1][3]);
	while(path[i][j]!=j)
	{
		printf("%d\n",path[i]);
		j = path[i][j];
	}
	
	
	
	return 0;
}*/
/*#include<stdio.h>
#define INIFITY 9999
int cost[5][5];
void add(int a,int b,int c){
	int q = a-64;
	int p = b-64;
	cost[q][p] = c;
	cost[p][q] = c;
}

void create_g(){
	int i,j;
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
			cost[i][j] = INIFITY;
		}
	}
	add('A','B',2);
	add('A','D',6);
	add('B','D',2);
	add('B','C',3);	
	add('C','D',2);
}

int main()
{
	int k,i,j;
	int dist[5][5];
	int path[5][5];
	create_g();
	
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
			dist[i][j] = cost[i][j];
		}
	}
	
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
			path[i][j] = 0;
		}
	}
	
	for(k=2;k<5;k++)
	{
		for(i=1;i<5;i++)
		{
			for(j=1;j<5;j++)
			{
				if(i!=j&&dist[i][j]>dist[i][k]+dist[k][j])
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
			if(i==j)
				dist[i][j] = 0;
		}
	}
	printf("各节点到其他点距离为：\n");
	printf("	A	B	C	D\n\n");
	for(i=1;i<5;i++)
	{
		printf("%c",i+64);
		for(j=1;j<5;j++)
		{
			printf("	%d",dist[i][j]);
		}
		printf("\n");
	}
	printf("\n\n");
	printf("源点到各个节点经过的节点为：\n");
	printf("	A	B	C	D\n");
	for(i=1;i<5;i++)
	{
		printf("%c",i+64);
		for(j=1;j<5;j++)
		{
			if(path[i][j]==0)
			{
				printf("	0");
				continue; 
			}
			printf("	%c",path[i][j]+64);
		}
		printf("\n");
	}
	return 0;
}*/
#include<stdio.h>
#define INIFITY 9999
int main()
{
	int i,j,k,n,s;
	scanf("%d",&n);
	int cost[n+1][n+1];
	int dist[n+1][n+1];
	int path[n+1][n+1] = {0};
	
	for(i=1;i<n+1;i++)
	{
		for(j=1;j<n+1;j++)
		{
			scanf("%d",&s);
			cost[i][j] = s;
		}
	}
	for(i=0;i<n+1;i++)
	{
		for(j=0;j<n+1;j++)
		{
			if(i==j)
			{
				cost[i][j] = 0;	
				continue;
			}
			if(cost[i][j]==0)
				cost[i][j] = INIFITY;
		}
	}
	for(i=1;i<n+1;i++)
	{
		for(j=1;j<n+1;j++)
		{
			dist[i][j] = cost[i][j];
		}
	}
	for(k=2;k<n+1;k++)
	{
		for(i=1;i<n+1;i++)
		{
			for(j=1;j<n+1;j++)
			{
				if(dist[i][j]>dist[i][k]+dist[k][j])
				{
					dist[i][j] = dist[i][k]+dist[k][j];
					path[i][j] = k;
				}
			}
		}
	}
	for(i=1;i<n+1;i++)
	{
		for(j=1;j<n+1;j++)
		{
			if(dist[i][j]>=INIFITY)
				dist[i][j] = -1;
			printf("%d	",dist[i][j]);
		}
		printf("\n");
	}
	return 0;
}










