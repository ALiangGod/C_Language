#include<stdio.h>
#include<malloc.h>
// һ.����������
// ��.�������
// ��.�������
// ��.�������
// ��.��α��� 
 
/* һ.���������� */

// ����������ڵ� 
typedef struct Btree
{
	char c;
	struct Btree* lchild, * rchild;
}Btree;
// ���򴴽�������
void PreCreateB(Btree*& T)
{
	char c;
	scanf("%c",&c);
	if(c=='#')
	{
		T = NULL;
		return;
	}
	else
	{
		T = (Btree*)malloc(sizeof(Btree));
		T->c = c;
		PreCreateB(T->lchild);
		PreCreateB(T->rchild);
	}
} 
// ���������ַ���С���������� 
Btree* NewNode(char c)	//�����������ڵ� 
{
	Btree* node = (Btree*)malloc(sizeof(Btree));
	node->c = c;
	node->lchild = NULL;
	node->rchild = NULL;
	return node;
}
void insert(Btree*& bitree,char c)	//����������ڵ� 
{
	if(bitree==NULL)
	{
		bitree = NewNode(c);
		return;
	}
	else
	{
		if(bitree->c > c)
			insert(bitree->lchild,c);
		else
			insert(bitree->rchild,c);
	}
}
Btree* CreateB(char data[], int n)	//������
{
	Btree* bitree = (Btree*)malloc(sizeof(Btree));
	bitree = NULL;
	for(int i=0;i<n;i++)
	{
		insert(bitree, data[i]);
	}
	return bitree;
}

/* ������.���к������ */ 
void PreOrder(Btree* bitree)
{
	if(bitree==NULL)
		return;
	printf("%c	",bitree->c);
	PreOrder(bitree->lchild);
	PreOrder(bitree->rchild);
}
void MiddleOrder(Btree* bitree)
{
	if(bitree==NULL)
		return;
	MiddleOrder(bitree->lchild);
	printf("%c	",bitree->c);
	MiddleOrder(bitree->rchild);
}
void PostOrder(Btree* bitree)
{
	if(bitree==NULL)
		return;
	PostOrder(bitree->lchild);
	PostOrder(bitree->rchild);
	printf("%c	",bitree->c);
}

/* ��. ���в�α��� 	*/ 
typedef struct QueueNode	//������нڵ� 
{
	Btree* b;
	QueueNode* next;
}QueueNode;
typedef struct Queue	//������� 
{
	QueueNode* infont, * rear;
}Queue;
void InitQ(Queue& Q)		//��ʼ������
{
	Q.infont = Q.rear = NULL;
}
bool EmptyQ(Queue Q)	//�ж϶����Ƿ�Ϊ��
{
	if(Q.infont == NULL)
		return true;
	else
		return false;
}
bool EnQ(Queue& Q, Btree* bitree)		//���
{
	QueueNode* node = (QueueNode*)malloc(sizeof(QueueNode));
	if(node == NULL)	return false;
	node->b = bitree;
	node->next = NULL;
	if(Q.rear == NULL)
		Q.rear = Q.infont = node;
	else
	{
		Q.rear->next = node;
		Q.rear = node;
	}
	return true;
}
bool ExQ(Queue& Q,Btree*& T)		//���� 
{
	if(Q.infont==NULL)	return false;
	QueueNode* p = Q.infont;
	T = p->b;
	Q.infont = p->next;
	if(Q.rear == p)
		Q.rear = Q.infont = NULL;
	free(p);
	return true;
}
void Visit(Btree* T)	//��ӡ���ӽڵ�
{
	printf("%c	",T->c);
}
void LevelOrder(Btree* bitree)	//���в�α���
{
	Queue Q;
	Btree* t;
	InitQ(Q);
	EnQ(Q,bitree);
	while(!EmptyQ(Q))
	{
		ExQ(Q,t);
		Visit(t);
		if(t->lchild!=NULL)
			EnQ(Q,t->lchild);
		if(t->rchild!=NULL)
			EnQ(Q,t->rchild);
	}
	return;
}

/*	��. ������	*/
int main()
{
	/*char data[11] = {75,80,73,68,70,84,78,79,68,71};		// ���ַ���С���������� 
	Btree* bitree = CreateB(data,10);*/ 
	printf("************************************\n");
	printf("������������\n�����������������������'#'�����\n") ; 
	Btree* bitree;											// ���򴴽������� 
	PreCreateB(bitree);
	printf("�����������ɹ�\n��ѡ������Ҫ���еĲ���\n");
	printf("************************************\n");
	printf("		ѡ��˵�		\n");
	printf("���� 0 ���ر�ϵͳ\n���� 1 ���������������\n���� 2 ���������������\n���� 3 ���������������\n���� 4 ����α���������\n");
	int key = 99;
	for(;key!=0;)
	{
		printf("��ѡ����������ѡ�");
		scanf("%d",&key);
		switch(key)
		{
			case 0:
				printf("�رճɹ�\n");
				break;
			case 1:
				printf("������������\n");
				PreOrder(bitree);
				printf("\n");
				break;
			case 2:
				printf("������������\n");
				MiddleOrder(bitree);
				printf("\n");
				break;
			case 3:
				printf("������������\n");
				PostOrder(bitree);
				printf("\n");
				break;
			case 4:
				printf("��α��������\n");
				LevelOrder(bitree);
				printf("\n");
				break;
			default:
				printf("�������!����������\n");
		}
	}
	 
	return 0;
}









