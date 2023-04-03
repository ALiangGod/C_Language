#include<stdio.h>
#include<malloc.h>
/*先来先服务算法*/ 
typedef struct fcfs		//定义进程 
{
	char name[10];
	float arrivetime;
	float servicetime;
	float starttime;
	float finishtime;
	float zztime;
	float dqtime;
}fcfs;
fcfs a[100];

void input(fcfs* p,int N)	//进程的输入 
{
	int i;
	printf("请输入《进程名》《到达时间》《服务时间》。例如：（a 0 100）\n\n");
	for(i=0;i<N;i++)
	{
		printf("请输入第%d个进程的信息:\t",i+1);
		scanf("%s %f %f",&p[i].name,&p[i].arrivetime,&p[i].servicetime);
		printf("\n");
	}
}
void print(fcfs* p,int N)	//算法输出 
{
	int k;
	printf("\n\n调用先来先出算法的进程运行顺序为：");
	printf("%s",p[0].name);
	for(k=1;k<N;k++)
		printf("-->%s",p[k].name);
	printf("\n\n具体信息为：\n");
	printf("\t进程名\t到达时间\t服务时间\t开始时间\t结束时间\t周转时间\t带权周转时间\n");
	for(k=0;k<N;k++)
	{
		printf("\t%s\t%-.2f\t\t%-.2f\t\t%-.2f\t\t%-.2f\t\t%-.2f\t\t%-.2f",p[k].name,p[k].arrivetime,p[k].servicetime,p[k].starttime,p[k].finishtime,p[k].zztime,p[k].dqtime);
		printf("\n");
	}
}
void sort(fcfs* p,int N)	//进程排序 
{
	int i,j;
	for( i=0;i<N;i++)
	{
		for(j=i;j<N;j++)
		{
			if(p[i].arrivetime>p[j].arrivetime)
			{
				fcfs temp;
				temp = p[i];
				p[i] = p[j];
				p[j] = temp;
			}
		}
	}
}
void deal(fcfs* p,int N)
{
	int i;
	float time = 0;
	for(i=0;i<N;i++)
	{
		p[i].starttime = time;
		p[i].finishtime = time + p[i].servicetime;
		p[i].zztime = p[i].finishtime - p[i].arrivetime;
		p[i].dqtime = p[i].zztime / p[i].servicetime;
		time += p[i].servicetime;
	}
}
void FCFS(fcfs* p,int N)
{
	sort(p,N);
	deal(p,N);
	print(p,N);
}

/*最短进程优先算法*/
void sort_(fcfs* p,int N)
{
	int i,j;
	for(i=0;i<N;i++)
	{
		for(j=i;j<N;j++)
		{
			if(p[i].servicetime>p[j].servicetime)
			{
				fcfs temp;
				temp = p[i];
				p[i] = p[j];
				p[j] = temp;
			}
		}
	}
}
void deal_(fcfs* p,int N)
{
	int i;
	for(i=0;i<N;i++)
	{
		if(i==0)
		{
			p[i].starttime = p[i].arrivetime;
			p[i].finishtime = p[i].starttime + p[i].servicetime;
		}
		else
		{
			if(p[i].arrivetime>p[i-1].finishtime)
				p[i].starttime = p[i].arrivetime;
			else
				p[i].starttime = p[i-1].finishtime;
			p[i].finishtime = p[i].starttime + p[i].servicetime;
		}
	}
}
void sjff(fcfs* p,int N)
{
	sort_(a,N);
	deal_(a,N);
	print(a,N);
}

int main()
{
	printf("》》》》》》》欢迎来到进程调度算法实验《《《《《《《《\n");
	printf("》》》》》》》输入 1 先来先服务调度算法《《《《《《《\n");
	printf("》》》》》》》输入 2 最短进程优先调度算法《《《《《《\n");
	printf("》》》》》》》请输入  （ 1 / 2 ）  来选择调度算法: "); 
	int key;
	scanf("%d",&key);
	printf("》》》》》》》选择成功\n");
	int N;
	printf("请输入本次实验进程的数量：");
	scanf("%d",&N);
	input(a,N);
	switch(key)
	{
		case 1:
			FCFS(a,N);
			break;
		case 2:
			sjff(a,N);
	
			break;
	}
	return 0;	
}
