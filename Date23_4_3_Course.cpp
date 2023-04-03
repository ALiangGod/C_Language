#include<stdio.h>
#include<malloc.h>
/*�����ȷ����㷨*/ 
typedef struct fcfs		//������� 
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

void input(fcfs* p,int N)	//���̵����� 
{
	int i;
	printf("�����롶��������������ʱ�䡷������ʱ�䡷�����磺��a 0 100��\n\n");
	for(i=0;i<N;i++)
	{
		printf("�������%d�����̵���Ϣ:\t",i+1);
		scanf("%s %f %f",&p[i].name,&p[i].arrivetime,&p[i].servicetime);
		printf("\n");
	}
}
void print(fcfs* p,int N)	//�㷨��� 
{
	int k;
	printf("\n\n���������ȳ��㷨�Ľ�������˳��Ϊ��");
	printf("%s",p[0].name);
	for(k=1;k<N;k++)
		printf("-->%s",p[k].name);
	printf("\n\n������ϢΪ��\n");
	printf("\t������\t����ʱ��\t����ʱ��\t��ʼʱ��\t����ʱ��\t��תʱ��\t��Ȩ��תʱ��\n");
	for(k=0;k<N;k++)
	{
		printf("\t%s\t%-.2f\t\t%-.2f\t\t%-.2f\t\t%-.2f\t\t%-.2f\t\t%-.2f",p[k].name,p[k].arrivetime,p[k].servicetime,p[k].starttime,p[k].finishtime,p[k].zztime,p[k].dqtime);
		printf("\n");
	}
}
void sort(fcfs* p,int N)	//�������� 
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

/*��̽��������㷨*/
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
	printf("����������������ӭ�������̵����㷨ʵ�顶��������������\n");
	printf("������������������ 1 �����ȷ�������㷨��������������\n");
	printf("������������������ 2 ��̽������ȵ����㷨������������\n");
	printf("��������������������  �� 1 / 2 ��  ��ѡ������㷨: "); 
	int key;
	scanf("%d",&key);
	printf("��������������ѡ��ɹ�\n");
	int N;
	printf("�����뱾��ʵ����̵�������");
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
