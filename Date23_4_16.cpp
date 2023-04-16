//#include<stdio.h>
//int main()
//{
//	int i, n, k;
//	scanf("%d%d",&n, &k);
//	int a[n];
//	int b[n-1];
//	for(i = 0; i < n; i++)
//	{
//		scanf("%d", &a[i]);
//		b[i] = a[i];
//	}
//	for(i = k-1; i < n-1; i++)
//		b[i] = a[i+1];
//	for(i = 0; i < n-1; i++)
//		printf("%d ", b[i]);
//}
#include<stdio.h>		//链表中删除某一个节点 
#include<stdlib.h>
#include<string.h>
#include<malloc.h>
typedef struct Node
{
	int a;
	struct Node* next;
}Node;
void insert(Node*& node, int a)
{
	if(node == NULL)
	{
		node->a = a;
		node->next = NULL;
	}
	else
	{
		Node* p = (Node*)malloc(sizeof(Node));
		p->a = a;
		p->next = NULL;
		node->next = p;
	}
}
void del(Node*& node, int a)
{
	int i;
	if(a == 1)
	{
		node = node->next;
	}
	else
	{
		Node* p;
		p = node;
		for(i = 2; i < a; i++)		//找到删除节点的上一个节点 
			p = node->next;
		p->next = p->next->next;
	}
}
void Create(Node*& head, int num[], int n)
{
	int i;
	Node* p = (Node*)malloc(sizeof(Node));
	p->a = num[0];
	p->next = NULL;
//	p = NULL;
	head = p;
	for(i = 1; i < n; i++)
	{
		insert(p, num[i]);
		p = p->next;
	}
}
int main()
{
	int i, n, k;
	scanf("%d%d", &n, &k);
	int num[n];
	for(i = 0; i < n; i++)
		scanf("%d", &num[i]);
	Node* node, *q;
	node = (Node*)malloc(sizeof(Node));
	Create(node, num, n);
	del(node, k);
	printf("%d	%d	", node->a, node->next->a);
	return 0;
}
