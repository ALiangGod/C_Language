//#include <stdio.h>
//#include<iostream>
//#include<stdio.h>
//#include<malloc.h>
//#define MAX 100
//using namespace std;
////�������������
//typedef struct Bitree 
//{
// char c;	
// struct Bitree *lchild,*rchild;
//}Bitree;
//
////�������
//struct Quene
//{
// struct Bitree *p;//ָ�����Ľڵ��ָ��
// struct Quene *next;
//};
//
////������������һ���ڵ� 
//Bitree* newnode(int a)
//{
//	Bitree* Node = new Bitree; //����һ��node���ͱ����ĵ�ַ�ռ�
//	Node->c = a; //���ȨֵΪv
//	Node->lchild = NULL;
//	Node->rchild = NULL; //��ʼ״̬�������Һ���
//	return Node; //�����½ڵ�ĵ�ַ
////	Bitree*node = (Bitree*)malloc(sizeof(Bitree));
////	node->c = a;
////	node->lchild->c = '#';
////	node->rchild->c = '#';
////	return node;
//}
//
////����һ���ڵ�
//void insert(Bitree*& root,int a)
//{
//	if (root == NULL) { //������������ʧ�ܣ������㣨�ݹ�߽磩
//		root = newnode(a);
//		return;
//	}
//	if (root->c > a) { //������������
//		insert(root->lchild, a);
//	}
//	else insert(root->rchild, a); //������������
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
////�ݹ鴴��������
//Bitree* creatBt(int date[],int n)
//{
//	Bitree* root;
//	root = NULL;     //�½��ո����
//	for (int i = 0; i < n; i++) {
//		insert(root, date[i]); //��data[0]��data[n-1]���������
//	}
//	return root; //���ظ��ڵ�
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
////��������ݹ�
//void preOrder1(struct Bitree *btree)
//{
////	if(btree->c!='#')
////	{
////		printf("%d",btree->c);
////		preOrder1(btree->lchild);
////		preOrder1(btree->rchild);
////	}
//	if (btree == NULL) 
//		return; //������������ݹ�߽�
//	cout << btree->c << endl; //���ʸ��ڵ�������
//	preOrder1(btree->lchild); //����������
//	preOrder1(btree->rchild); //����������
//}
//
////��������ݹ�
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
////��������ݹ�
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
	node*Node = new node; //����һ��node���ͱ����ĵ�ַ�ռ�
	Node->data = v; //���ȨֵΪv
	Node->lchild = Node->rchild = NULL; //��ʼ״̬�������Һ���
	return Node; //�����½ڵ�ĵ�ַ
}

void insert(node*& root, int x) {
	if (root == NULL) { //������������ʧ�ܣ������㣨�ݹ�߽磩
		root = newNode(x);
		return;
	}
	if (root->data > x) { //������������
		insert(root->lchild, x);
	}
	else insert(root->rchild, x); //������������
}

node*create(int data[], int n) {
	node* root = NULL;     //�½��ո����
	for (int i = 0; i < n; i++) {
		insert(root, data[i]); //��data[0]��data[n-1]���������
	}
	return root; //���ظ��ڵ�
}

void preorder(node*root) { //�������
	if (root == NULL) return; //������������ݹ�߽�
	cout << root->data << endl;; //���ʸ��ڵ�������
	preorder(root->lchild); //����������
	preorder(root->rchild); //����������
}

void inorder(node*root) { //�������
	if (root == NULL) return; //������������ݹ�߽�
	inorder(root->lchild); //����������
	cout << root->data << endl;; //���ʸ��ڵ�������
	inorder(root->rchild); //����������
}
void postorder(node* root) { //�������
	if (root == NULL) return; //������������ݹ�߽�
	preorder(root->lchild); //����������
	preorder(root->rchild); //����������
	cout << root->data << endl;; //���ʸ��ڵ�������
}

int main(){
	int n = 10;
	int nums[10] = {1,2,3,4,5,11,7,8,9,10};
	node* root = create(nums, 10);
	preorder(root);//ǰ�����
	return 0;
}*/
#include<stdio.h>
#include<malloc.h>
typedef struct Btree	//�������ڵ� 
{
	char c;
	struct Btree* lchild;
	struct Btree* rchild;
}Btree;

Btree* newnode(int a)	//�����ڵ� 
{
	Btree* node = (Btree*)malloc(sizeof(Btree));
	node->c = a;
	node->lchild = NULL;
	node->rchild = NULL;
	return node;
}

void insert(Btree*& node,int a)		//����ڵ� 
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

Btree* createB(int date[],int n)	//������ 
{
	Btree* node = NULL;
	for(int i=0;i<n;i++)
	{
		insert(node,date[i]);
	}
	return node;
}

void preorder(Btree* bitree)		//����
{
	if(bitree==NULL)	return;
	printf("%d	",bitree->c);
	preorder(bitree->lchild);
	preorder(bitree->rchild);
}

void middle_order(Btree* bitree)	//���� 
{
	if(bitree==NULL)	return;
	middle_order(bitree->lchild);
	printf("%d	",bitree->c);
	middle_order(bitree->rchild);
}

void epilogue(Btree* bitree)		//���� 
{
	if(bitree==NULL)	return;
	middle_order(bitree->lchild);
	middle_order(bitree->rchild);
	printf("%d	",bitree->c);
}

typedef struct queueNode{	//�������нڵ�
	Btree* date;
	struct queueNode* next;
}queueNode;

typedef struct Queue{	//��������
	queueNode* infont;
	queueNode* rear;
}Queue;

//1.��ʼ������(��ͷ���)
void initQ(Queue& Q) {
	Q.infont = Q.rear = NULL;		//��ʼ��ʱfront��rear��ָ��NULL
}

//void initQ(Queue q){	//��ʼ������
//	q.infont = NULL;
//	q.rear = NULL;
//}

//bool EmptyQ(Queue q){	//�ж϶����Ƿ�Ϊ��
//	if(q.infont==NULL)
//		return true;
//	else
//		return false;
//}

//2.�п�(��ͷ���)
bool EmptyQ(Queue Q) {
	return (Q.infont == NULL);
}



//3.��Ӳ���(��ͷ���)
bool InQ(Queue& Q, Btree* x) {
	queueNode* s = (queueNode*)malloc(sizeof(queueNode));
	if (s == NULL)
		return false;	//�ڴ治�㣬����ʧ��
	s->date = x;		//Ϊ�½�㸳ֵ
	s->next = NULL;		//��Ϊ�½��ֻ�ܴӶ�β���룬���½��Ϊ���һ����㣬��nextָ��ΪNULL
	if (Q.rear == NULL)		//�����ǰ����Ϊ�գ���ӽ��Ϊ��һ�����
		Q.infont = Q.rear = s;	//�޸Ķ�ͷ�Ͷ�βָ��
	else {				//�������Ĳ������ͷ���Ĳ���һ��
		Q.rear->next = s;		//�½����뵽rear֮��ԭ�ȶ�βָ����ָ����nextָ���½��
		Q.rear = s;			//�޸Ķ�β���ָ�룬ָ���µĶ�β���
	}
	return true;
}

//bool InQ(Queue& q,Btree* bitree){//���
//	queueNode* q_node = (queueNode*)malloc(sizeof(queueNode));
//	if(q_node == NULL)	return false;	//�ڴ治�����޷�����ռ� 
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

//4.���Ӳ���(��ͷ���)
bool ExQ(Queue& Q, Btree*& x) {
	if (Q.infont == NULL)
		return false;	//�ӿգ�����
	queueNode* p = Q.infont;	//�ҵ���ͷԪ��
	x = p->date;				//����x���ض�ͷԪ��
	Q.infont = p->next;	//�޸Ķ�ͷָ�룺����ͷ���ĺ�̽�㸳����ͷָ��
	if (Q.rear == p)			//����˴�Ϊ���һ��������	
		Q.rear = Q.infont = NULL;		//�޸�rearָ��,�����ÿ�
	free(p);		//�ͷŽ��ռ�
	return true;
}

//bool ExQ(Queue& q,Btree* bitree){	//����
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

//6.��ӡ���-���ڱ���
void visit(Btree* p) {
	printf("%c\t", p->c);
}
	
//void visit(Btree* bitree){	//��ʾ���ӽڵ� 
//	printf("%d	",bitree->c);
//}

//7.�������Ĳ�α���
void LevelOrder(Btree* T) {
	Queue Q;
	initQ(Q);		//��ʼ����������
	Btree* p;
	InQ(Q, T);			//��������
	while (!EmptyQ(Q)) {		//���в�����ѭ��
		ExQ(Q, p);		//��ͷ������
		visit(p);					//���ʳ��ӽ��
		if (p->lchild != NULL)
			InQ(Q, p->lchild);		//���������գ�����������������
		if (p->rchild != NULL)
			InQ(Q, p->rchild);		//���������գ�����������������
	}
}

//void LevelOrder(Btree* bitree)	//���в�α��� 
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
