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
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<malloc.h>
typedef struct Node
{
	int a;
	Node* next;
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
		p->w = NULL;
		node->next = p;
	}
}
void del(Node*& node, int a)
{
	int i;
	for(i = 1; i < a; i++)
		node = node->next;
	node->next = node->next->next;
}
int main()
{
	int i, n, k;
	scanf("%d%d", &n, &k);
	int num[n];
	for(i = 0; i < n; i++)
		scanf("%d", &num[i]);
	
}
