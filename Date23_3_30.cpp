//#include <stdio.h>
//#include<iostream>
//#include<stdio.h>
//#include<malloc.h>
//#define MAX 100
//using namespace std;
////定义二叉树链表
//typedef struct Bitree 
//{
// char c;	
// struct Bitree *lchild,*rchild;
//}Bitree;
//
////定义队列
//struct Quene
//{
// struct Bitree *p;//指向树的节点的指针
// struct Quene *next;
//};
//
////建立二叉树的一个节点 
//Bitree* newnode(int a)
//{
//	Bitree* Node = new Bitree; //申请一个node类型变量的地址空间
//	Node->c = a; //结点权值为v
//	Node->lchild = NULL;
//	Node->rchild = NULL; //初始状态下无左右孩子
//	return Node; //返回新节点的地址
////	Bitree*node = (Bitree*)malloc(sizeof(Bitree));
////	node->c = a;
////	node->lchild->c = '#';
////	node->rchild->c = '#';
////	return node;
//}
//
////插入一个节点
//void insert(Bitree*& root,int a)
//{
//	if (root == NULL) { //空树，即查找失败，插入结点（递归边界）
//		root = newnode(a);
//		return;
//	}
//	if (root->c > a) { //往左子树搜索
//		insert(root->lchild, a);
//	}
//	else insert(root->rchild, a); //往右子树搜索
////	if(root->c == '#')		
////	{
////		root = newnode(a);
////		return;
////	}
////	if(root->c > a)
////		insert(root->lchild,a);
////	else
////		insert(root->rchild,a);
//}
//
////递归创建二叉树
//Bitree* creatBt(int date[],int n)
//{
//	Bitree* root;
//	root = NULL;     //新建空根结点
//	for (int i = 0; i < n; i++) {
//		insert(root, date[i]); //将data[0]到data[n-1]插入二叉树
//	}
//	return root; //返回根节点
////	int i;
////	Bitree* temp;
////	temp->c = '#';
////	for(i=0;i<n;i++)
////	{
////		insert(temp,date[i]);
////	}
////	return temp;
//}
//
////先序遍历递归
//void preOrder1(struct Bitree *btree)
//{
////	if(btree->c!='#')
////	{
////		printf("%d",btree->c);
////		preOrder1(btree->lchild);
////		preOrder1(btree->rchild);
////	}
//	if (btree == NULL) 
//		return; //到达空树，即递归边界
//	cout << btree->c << endl; //访问根节点数据域
//	preOrder1(btree->lchild); //访问左子树
//	preOrder1(btree->rchild); //访问右子树
//}
//
////中序遍历递归
//void inOrder1(struct Bitree *btree)
//{
//	if(btree->c!='#')
//	{
//		preOrder1(btree->lchild);
//		printf("%d",btree->c);
//		preOrder1(btree->rchild);
//	}
//}
//
////后序遍历递归
//void postOrder1(struct Bitree *btree)
//{
//	if(btree->c!='#')
//	{
//		preOrder1(btree->lchild);
//		preOrder1(btree->rchild);
//		printf("%d",btree->c);
//	}
//}
//
//int main()
//{
//	int date[10] = {1,2,3,4,5,6,7,8,9,10};
//	Bitree* btree= creatBt(date,10);
//	preOrder1(btree);
// 
//
//}
/*#include <iostream>
#include <queue>
using namespace std;

struct node
{
	int data;
	node * lchild;
	node * rchild;
};

node* newNode(int v) { 
	node*Node = new node; //申请一个node类型变量的地址空间
	Node->data = v; //结点权值为v
	Node->lchild = Node->rchild = NULL; //初始状态下无左右孩子
	return Node; //返回新节点的地址
}

void insert(node*& root, int x) {
	if (root == NULL) { //空树，即查找失败，插入结点（递归边界）
		root = newNode(x);
		return;
	}
	if (root->data > x) { //往左子树搜索
		insert(root->lchild, x);
	}
	else insert(root->rchild, x); //往右子树搜索
}

node*create(int data[], int n) {
	node* root = NULL;     //新建空根结点
	for (int i = 0; i < n; i++) {
		insert(root, data[i]); //将data[0]到data[n-1]插入二叉树
	}
	return root; //返回根节点
}

void preorder(node*root) { //先序遍历
	if (root == NULL) return; //到达空树，即递归边界
	cout << root->data << endl;; //访问根节点数据域
	preorder(root->lchild); //访问左子树
	preorder(root->rchild); //访问右子树
}

void inorder(node*root) { //中序遍历
	if (root == NULL) return; //到达空树，即递归边界
	inorder(root->lchild); //访问左子树
	cout << root->data << endl;; //访问根节点数据域
	inorder(root->rchild); //访问右子树
}
void postorder(node* root) { //后序遍历
	if (root == NULL) return; //到达空树，即递归边界
	preorder(root->lchild); //访问左子树
	preorder(root->rchild); //访问右子树
	cout << root->data << endl;; //访问根节点数据域
}

int main(){
	int n = 10;
	int nums[10] = {1,2,3,4,5,11,7,8,9,10};
	node* root = create(nums, 10);
	preorder(root);//前序遍历
	return 0;
}*/
#include<stdio.h>
#include<malloc.h>
typedef struct Btree	//定义树节点 
{
	char c;
	struct Btree* lchild;
	struct Btree* rchild;
}Btree;

Btree* newnode(int a)	//建立节点 
{
	Btree* node = (Btree*)malloc(sizeof(Btree));
	node->c = a;
	node->lchild = NULL;
	node->rchild = NULL;
	return node;
}

void insert(Btree*& node,int a)		//插入节点 
{
	if(node==NULL)
	{
		node = newnode(a);
		return;
	}
	if(node->c > a)
		insert(node->lchild,a);
	else
		insert(node->rchild,a);
}

Btree* createB(int date[],int n)	//创建树 
{
	Btree* node = NULL;
	for(int i=0;i<n;i++)
	{
		insert(node,date[i]);
	}
	return node;
}

void preorder(Btree* bitree)		//先序
{
	if(bitree==NULL)	return;
	printf("%d	",bitree->c);
	preorder(bitree->lchild);
	preorder(bitree->rchild);
}

void middle_order(Btree* bitree)	//中序 
{
	if(bitree==NULL)	return;
	middle_order(bitree->lchild);
	printf("%d	",bitree->c);
	middle_order(bitree->rchild);
}

void epilogue(Btree* bitree)		//后序 
{
	if(bitree==NULL)	return;
	middle_order(bitree->lchild);
	middle_order(bitree->rchild);
	printf("%d	",bitree->c);
}

typedef struct queueNode{	//创建队列节点
	Btree* date;
	struct queueNode* next;
}queueNode;

typedef struct Queue{	//创建队列
	queueNode* infont;
	queueNode* rear;
}Queue;

//1.初始化队列(无头结点)
void initQ(Queue& Q) {
	Q.infont = Q.rear = NULL;		//初始化时front、rear都指向NULL
}

//void initQ(Queue q){	//初始化队列
//	q.infont = NULL;
//	q.rear = NULL;
//}

//bool EmptyQ(Queue q){	//判断队列是否为空
//	if(q.infont==NULL)
//		return true;
//	else
//		return false;
//}

//2.判空(无头结点)
bool EmptyQ(Queue Q) {
	return (Q.infont == NULL);
}



//3.入队操作(无头结点)
bool InQ(Queue& Q, Btree* x) {
	queueNode* s = (queueNode*)malloc(sizeof(queueNode));
	if (s == NULL)
		return false;	//内存不足，分配失败
	s->date = x;		//为新结点赋值
	s->next = NULL;		//因为新结点只能从队尾插入，即新结点为最后一个结点，其next指针为NULL
	if (Q.rear == NULL)		//如果当前队列为空，入队结点为第一个结点
		Q.infont = Q.rear = s;	//修改队头和队尾指针
	else {				//其他结点的插入与带头结点的插入一致
		Q.rear->next = s;		//新结点插入到rear之后：原先队尾指针所指结点的next指向新结点
		Q.rear = s;			//修改队尾结点指针，指向新的队尾结点
	}
	return true;
}

//bool InQ(Queue& q,Btree* bitree){//入队
//	queueNode* q_node = (queueNode*)malloc(sizeof(queueNode));
//	if(q_node == NULL)	return false;	//内存不够，无法分配空间 
//	q_node->date = bitree;
//	q_node->next = NULL;
//	if(q.rear==NULL)
//		q.infont = q.rear = q_node;
//	else
//	{
//		q.rear->next = q_node;
//		q.rear = q_node;
//	}
//	return true;
//}

//4.出队操作(无头结点)
bool ExQ(Queue& Q, Btree*& x) {
	if (Q.infont == NULL)
		return false;	//队空，报错
	queueNode* p = Q.infont;	//找到队头元素
	x = p->date;				//变量x返回队头元素
	Q.infont = p->next;	//修改队头指针：将队头结点的后继结点赋给队头指针
	if (Q.rear == p)			//如果此次为最后一个结点出队	
		Q.rear = Q.infont = NULL;		//修改rear指针,队列置空
	free(p);		//释放结点空间
	return true;
}

//bool ExQ(Queue& q,Btree* bitree){	//出队
//	if(q.infont==NULL)	return false;
//	queueNode* q_node = q.infont;
//	bitree = q_node->date;
//	q.infont = q_node->next;
//	if(q_node==q.rear)
//	{
//		q.infont = q.rear = NULL;
//	}
//	free(q_node);
//	return true;
//}

//6.打印结点-用于遍历
void visit(Btree* p) {
	printf("%c\t", p->c);
}
	
//void visit(Btree* bitree){	//显示出队节点 
//	printf("%d	",bitree->c);
//}

//7.二叉树的层次遍历
void LevelOrder(Btree* T) {
	Queue Q;
	initQ(Q);		//初始化辅助队列
	Btree* p;
	InQ(Q, T);			//根结点入队
	while (!EmptyQ(Q)) {		//队列不空则循环
		ExQ(Q, p);		//队头结点出队
		visit(p);					//访问出队结点
		if (p->lchild != NULL)
			InQ(Q, p->lchild);		//左子树不空，则左子树根结点入队
		if (p->rchild != NULL)
			InQ(Q, p->rchild);		//右子树不空，则右子树根结点入队
	}
}

//void LevelOrder(Btree* bitree)	//队列层次遍历 
//{
//	Queue q;
//	initQ(q);
//	Btree* temp;
//	InQ(q,bitree);
//	while(!EmptyQ(q))
//	{
//		ExQ(q,temp);
//		visit(temp);
//		if(temp->lchild!=NULL)
//			InQ(q,temp->lchild);
//		if(temp->rchild!=NULL)
//			InQ(q,temp->rchild);
//	}
//}

int main()
{
	int date[10] = {1,2,3,4,5,6,7,8,9,10};
	Btree* bitree = createB(date,10);
//	preorder(bitree);
//	printf("\n");
//	middle_order(bitree);
//	printf("\n");
//	epilogue(bitree);
//	printf("\n");
	LevelOrder(bitree);
	return 0;
}
