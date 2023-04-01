#include<stdio.h>
#include<malloc.h>
// 一.创建二叉树
// 二.先序遍历
// 三.中序遍历
// 四.后序遍历
// 五.层次遍历 
 
/* 一.创建二叉树 */

// 定义二叉树节点 
typedef struct Btree
{
	char c;
	struct Btree* lchild, * rchild;
}Btree;
// 先序创建二叉树
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
// 根据输入字符大小创建二叉树 
Btree* NewNode(char c)	//建立二叉树节点 
{
	Btree* node = (Btree*)malloc(sizeof(Btree));
	node->c = c;
	node->lchild = NULL;
	node->rchild = NULL;
	return node;
}
void insert(Btree*& bitree,char c)	//插入二叉树节点 
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
Btree* CreateB(char data[], int n)	//创建树
{
	Btree* bitree = (Btree*)malloc(sizeof(Btree));
	bitree = NULL;
	for(int i=0;i<n;i++)
	{
		insert(bitree, data[i]);
	}
	return bitree;
}

/* 二三四.先中后序遍历 */ 
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

/* 五. 队列层次遍历 	*/ 
typedef struct QueueNode	//定义队列节点 
{
	Btree* b;
	QueueNode* next;
}QueueNode;
typedef struct Queue	//定义队列 
{
	QueueNode* infont, * rear;
}Queue;
void InitQ(Queue& Q)		//初始化队列
{
	Q.infont = Q.rear = NULL;
}
bool EmptyQ(Queue Q)	//判断队列是否为空
{
	if(Q.infont == NULL)
		return true;
	else
		return false;
}
bool EnQ(Queue& Q, Btree* bitree)		//入队
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
bool ExQ(Queue& Q,Btree*& T)		//出队 
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
void Visit(Btree* T)	//打印出队节点
{
	printf("%c	",T->c);
}
void LevelOrder(Btree* bitree)	//队列层次遍历
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

/*	六. 主函数	*/
int main()
{
	/*char data[11] = {75,80,73,68,70,84,78,79,68,71};		// 按字符大小创建二叉树 
	Btree* bitree = CreateB(data,10);*/ 
	printf("************************************\n");
	printf("创建二叉树：\n按照先序依次输入二叉树，'#'代表空\n") ; 
	Btree* bitree;											// 先序创建二叉树 
	PreCreateB(bitree);
	printf("二叉树创建成功\n请选择你需要进行的操作\n");
	printf("************************************\n");
	printf("		选择菜单		\n");
	printf("输入 0 ：关闭系统\n输入 1 ：先序遍历二叉树\n输入 2 ：中序遍历二叉树\n输入 3 ：后序遍历二叉树\n输入 4 ：层次遍历二叉树\n");
	int key = 99;
	for(;key!=0;)
	{
		printf("请选择您的输入选项：");
		scanf("%d",&key);
		switch(key)
		{
			case 0:
				printf("关闭成功\n");
				break;
			case 1:
				printf("先序遍历结果：\n");
				PreOrder(bitree);
				printf("\n");
				break;
			case 2:
				printf("中序遍历结果：\n");
				MiddleOrder(bitree);
				printf("\n");
				break;
			case 3:
				printf("后序遍历结果：\n");
				PostOrder(bitree);
				printf("\n");
				break;
			case 4:
				printf("层次遍历结果：\n");
				LevelOrder(bitree);
				printf("\n");
				break;
			default:
				printf("输入错误!请重新输入\n");
		}
	}
	 
	return 0;
}









