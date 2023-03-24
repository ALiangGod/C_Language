/*#include<stdio.h>
main(){
	printf("hellow");
	return 0;
} */

//	简单选择排序 	simple selection Sort
/*#include<stdio.h>
int main()
{
	int n;
	scanf("%d",&n);
	int a[n];
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(int i=0;i<n-1;i++)
	{
		for(int k=i+1;k<n;k++)
		{
			if(a[i]>a[k])
			{
				int temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
		}
	}
	for(int i=0;i<n;i++)
	{
		printf("%d\t",a[i]);
	} 
	return 0;
}*/

//	冒泡排序	bubble Sort
/*#include<stdio.h>
int main()
{
	int n;
	scanf("%d",&n);
	int a[n];
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(int i=0;i<n-1;i++)
	{	
		int on_of = 1;
		for (int k=0;k<n-i-1;k++)
		{
			if(a[k]>a[k+1])
			{
				int temp = a[k];
				a[k] = a[k+1];
				a[k+1] = temp;
				on_of = 0;
			}
		}
		if(on_of == 1)
			break;
	 } 
	for (int i=0;i<n;i++)
	{
		printf("%d",a[i]);
	}
	return 0;
}*/

// 插入排序 	insertion Sort
/*#include<stdio.h>
int main()
{
	int n;
	scanf("%d",&n);
	int a[n];
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(int i=1;i<n;i++)
	{
		if(a[i]<a[i-1])
		{
			int j;
			int temp = a[i];
			for(j=i-1;j>=0&&a[j]>temp;j--)
				a[j+1] = a[j]; 
			a[j+1] = temp;
		}
	}
	for(int i=0;i<n;i++)
	{
		printf("%d",a[i]);
	}
	return 0;
 }*/ 
/*#include<stdio.h>
int main() {
	int n, m, i, j, temp;
	int arr[100];
 
	scanf("%d", &n);
	for (i = 0; i < n; i++) {
		scanf("%d", &arr[i]);						//输入 
	}
    for(i=1; i<n; i++)								//从无序组的第一个元素开始 
        if(arr[i] < arr[i-1])   						// 判断是否要向前寻找插入的位置 
        {
            int temp = arr[i];                       
            for(j=i-1; j>=0 && arr[j]>temp; j--)    //将大于自己的数依次向后挪位 
                arr[j+1] = arr[j];                    
            arr[j+1] = temp;                       //插入 
        }
	for (i = 0; i < n; i++) {
		printf("%d ", arr[i]);						//输出 
	}
	return 0;
}*/

// 快速排序		quickly sort









/*#include<stdio.h>
int main()
{
	/*int l = 9;
	int k,j;
	int a[10] = {1,5,8,9,10,17,17,20,23,25};
	for(int i=1;i<=4;i++)
	{
		k = l-i;
		j = l-k;
		printf("%d\n",a[k]+a[j]);
	}*/ 
	/*int b=0;
	int a[11] = {5,3,13,4,8,6,8,9,10,11,15};
	for(int i=0;i<11;i++){
		b =b+ a[i];
		printf("%d\n",b);
	}
	*/
	/*int n;
	scanf("%d",&n);
	int s[n];
	int s_[n];
	for(int i=0;i<n;i++)
	{
		scanf("%d",&s[i]);
	}

	//int box[];
	int box[n];
	for(int i=0;i<n;i++)
	{
		box[i] = 0;
		s_[i] = 0;
	}
	for(int i=0;i<n;i++)
	{
		for(int k=0;k<i+1;k++)
		{
			if(s[i]+box[k]<=100)
			{
				box[k] = box[k]+s[i];
				s_[i]=k+1;
				break;
			}
		}
	}
	int q = 0;
	for(int i=0;i<n;i++)
	{	
		printf("%d %d\n",s[i],s_[i]);
		if(box[i]>0)
		{
			q = q+1;
		}
	}
	printf("%d",q);
	return 0;
} */
/*#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct ListNode {
    char code[8];
    struct ListNode *next;
};

struct ListNode *createlist(); /*裁判实现，细节不表*/
/*int countcs( struct ListNode *head );

int main()
{
    struct ListNode  *head;

    head = createlist();
    printf("%d\n", countcs(head));
    
    return 0;
}
struct ListNode *createlist()
{
	struct ListNode arr[100];
	struct ListNode *p;
	struct ListNode *d;
	p = &arr[0];
	d = &arr[0];
	char a[7];
	int on_off = 1;
	while(on_off)
	{
		gets(a);
		
		strcpy(p->code,a);
		if(a[0] == '#'){
			on_off = 0;
			break;
		}
		//p->next = p->code;
		p = p+16;
	}
	return d;
}

/* 你的代码将被嵌在这里 */
/*int countcs(struct ListNode *head)
{
	int sum = 0;
	while((*head).code[0]!='#')
	{
		if((*head).code[1]=='0'&&(*head).code[2]=='2')
		{
			sum = sum+1;
		}
		head = head+16;
	}
	return sum;
}*/
/*#include<stdio.h>
int main()
{
	int i,j,n,temp;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
	}
	for(i=0;i<n;i++)
	{
		printf("%d ",a[i]);
	}
	return 0;
 } */
 
/*#include<stdio.h>			//十六进制转八进制 次品 
#include<stdlib.h>
#include<string.h> 
int main(){
	int i,n;
	scanf("%d%*c",&n);
	char *p[n];
	for(i=0;i<n;i++)
	{
		p[i] = (char*)malloc(100);
		gets(p[i]);
	}
	char arr[n][5] = {"0000"};
	char reference[16][5] = {"0001","0010","0011","0100"
	,"0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111","0000"
	};
	char reference1[7][4] = {"001","010","011","100","101","110","111"
	};
	for(i=0;i<n;i++)
	{
		char *temp;
		char temp2[100]={'\0'};
		char eight[4]={'\0'};
		char *q;
		q = p[i];
		for(int k=0;k<strlen(p[i]);k++)
		{
			
			if(q[k]-'0'<=9)
				strcpy(arr[k],reference[q[i]-'0']);
			else
				strcpy(arr[k],reference[q[i]-55]);
			strcat(temp,arr[k]);
		}
		printf("%s",temp);
		/*for(int k=strlen(temp)-2;k>=0;k=k-3)
		{
			int o=0;
			char temp1[4];
			strcpy(temp1,temp[k]);
			strcat(temp1,temp[k-1]);
			strcat(temp1,temp[k-2]);
			for(int w=1;w<7;w++)
			{
				if(strcmp(temp1,reference1[i])==0)
				{
					o=w;
					strcat(result,o);
				}
			 }
		}*/
/*		
	}
	
	for(i=0;i<n;i++)
	{
		free(p[i]);
	}
	
	
	return 0;
}*/
/*#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define M_SIZE 100000
int main()
{
	int i,j,n,str_len;
	int result;
	scanf("%d",&n);
	char str[n][M_SIZE];
	memset(str,0,n*M_SIZE);
	char deference[16][5]=
	{"0000","0001","0010","0011","0100","0101","0110","0111","1000",
	 "1001","1010","1011","1100","1101","1110","1111"
	};
	for(i=0;i<n;i++)
	{
		scanf("%s",str[i]);
		str_len=strlen(str[i]);
		int k=0;
		int ss=4*str_len%3;
		if(ss==0)
			ss = 3;
		char temp[4*str_len+3-ss];
		memset(temp,0,4*str_len+3-ss);
		if(ss==1){
			strcat(temp,"00");
			k +=2;
		}
		else if(ss==2){
			strcat(temp,"0"); 
			k +=1;
		}
		for(j=0;j<str_len;j++)
		{
			if(str[i][j]<65){
				temp[k++] = deference[str[i][j]-'0'][0];
				temp[k++] = deference[str[i][j]-'0'][1];
				temp[k++] = deference[str[i][j]-'0'][2];
				temp[k++] = deference[str[i][j]-'0'][3];
			}
			else if(str[i][j]>=65){
				temp[k++] = deference[str[i][j]-55][0];
				temp[k++] = deference[str[i][j]-55][1];
				temp[k++] = deference[str[i][j]-55][2];
				temp[k++] = deference[str[i][j]-55][3];
			}
		}
		//temp[k]=0;
		for(j=0;j<4*str_len+3-ss;j=j+3)
		{
			if(j==0){
				result = (4*(temp[j]-48)+2*(temp[j+1]-48)+1*(temp[j+2]-48));
				if(result!=0){
					printf("%d",result);
				}
			}
			else{
				result = (4*(temp[j]-48)+2*(temp[j+1]-48)+1*(temp[j+2]-48));
				printf("%d",result);
			}
			
		}
		printf("\n");	
	}
	return 0;
}
*/
/*#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define NUM 100000
int power(int b){
	int c = 2;
	if(b>1){
		for(int i=1;i<b;i++)
		{	
		c = c*2;
		}
		return c; 
	}
	else if(b==1){
		return 2;
	}
	else{
		return 1;
	}
	
	
}
int main()
{
	int i,j,n,str_len;
	scanf("%d",&n);
	char str[n][NUM];
	memset(str,0,n*NUM);
	char deference[16][5] = {"0000","0001","0010","0011","0100","0101","0110",
	"0111","1000","1001","1010","1011","1100","1101","1110","1111"};
	for(i=0;i<n;i++)
	{
		scanf("%s",str[i]);
		int result = 0;
		int k=0;
		str_len = strlen(str[i]);
		char temp[4*str_len];
		memset(temp,0,4*str_len);
		for(j=0;j<str_len;j++)
		{
			if(str[i][j]<65)
			{
				temp[k++] = deference[str[i][j]-48][0];
				temp[k++] = deference[str[i][j]-48][1];
				temp[k++] = deference[str[i][j]-48][2];
				temp[k++] = deference[str[i][j]-48][3];
			}
			else if(str[i][j]>=65)
			{
				temp[k++] = deference[str[i][j]-55][0];
				temp[k++] = deference[str[i][j]-55][1];
				temp[k++] = deference[str[i][j]-55][2];
				temp[k++] = deference[str[i][j]-55][3];
			}
		}
		temp[k] = 0;
		printf("%s\n",temp);
		for(j=0;j<4*str_len;j++)
		{
			int w = 4*str_len-1-j;
			result += power(w)*(temp[j]-'0');
		}
		printf("%d",result);
	}
} 
*/
/*#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int power(int a){
	int b=2;
	if(a>1){
		for(int i=1;i<a;i++){
			b = b*2;
		}
		return b;
	}
	else if(a==1)
		return 2;
	else
		return 1;
}
int main(){
	int i,j,str_len;
	int result=0;
	char str[10001];
	scanf("%s",str);
	char deference[16][5]={"0000","0001","0010","0011","0100","0101","0110",
	"0111","1000","1001","1010","1011","1100","1101","1110","1111"};
	int k=0;
	str_len=strlen(str);
	char temp[4*str_len];
	for(i=0;i<str_len;i++)
	{
		if(str[i]<65){
			temp[k++]=deference[str[i]-48][0];
			temp[k++]=deference[str[i]-48][1];
			temp[k++]=deference[str[i]-48][2];
			temp[k++]=deference[str[i]-48][3];
		}
		else{
			temp[k++]=deference[str[i]-55][0];
			temp[k++]=deference[str[i]-55][1];
			temp[k++]=deference[str[i]-55][2];
			temp[k++]=deference[str[i]-55][3];
		}
	}
	for(i=0;i<4*str_len;i++)
	{
		int num = 4*str_len-1-i;
		result += power(num)*(temp[i]-48);
	}
	printf("%d",result);
	return 0;
}
*/
/*#include<stdio.h>		//十六转换十进制 
#include<string.h>
#include<stdlib.h>
int power(int a);
int main()
{
	int i,str_len;
	int result = 0;
	char str[10001];
	scanf("%s",str);
	str_len = strlen(str);
	for(i=0;i<str_len;i++)
	{
		int temp = str_len-1-i;
		if(str[i]<65)
			result += power(temp)*(str[i]-48);
		else
			result +=power(temp)*(str[i]-55);
	}
	printf("%d",result);
}
int power(int a)
{
	int c=16;
	int i;
	if(a>1)
	{
		for(i=1;i<a;i++){
			c = c*16;
		}
		return c;
	}
	else if(a==1)
		return 16;
	else
		return 1;
}
*/
/*#include<stdio.h>
#include<string.h>
#include<stdlib.h>	//十进制转十六 
int main()
{
	int i,num;
	char str[10001];
	memset(str,0,10001);
	char temp;
	scanf("%d",&num);
	i=0;
	while(num/16!=0)
	{
		int temp1;
		temp1 = num%16;
		if(temp1>=10)
		{
			temp = temp1+55;
			str[i] = temp;
			i++;
		}
		else{
			temp = temp1+48;
			str[i] = temp;
			i++;
		}
		num = num/16;
	}
	if(num>=10)
	{
		temp = 55+num;
		str[i] = temp;
	}
	else
		{
			temp = 48+num;
			str[i] = temp;
		}
	for(i=strlen(str)-1;i>=0;i--)
		printf("%c",str[i]);
	return 0;
}
*/
/*#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int power_10(int a)
{
	int i;
	int c=10;
	if(a>1){
		for(i=1;i<a;i++){
			c = c*10;
		}
		return c;
	}
	else if(a==1)
		return 10;
	else
		return 1;
	}
int main()
{
	int i,j,n;
	scanf("%d",&n);
	for(i=10000;i<=999999;i++)
	{
		char str[7];
		char temp[7];
		if(i<100000)
		{
			for(j=0;j<5;j++)
			{
				str[j] = i/power_10(4-j)+48;
				i = i%power_10(4-j);
			}
			str[5] = '\0';
			if((str[0]+str[1]+str[2]+str[3]+str[4]-(5*48))!=n)
				continue;
			strcpy(temp,str);
			strrev(temp);
			if(strcmp(str,temp)==0)
				printf("%d\n",i);
			else
				continue;	
	}
		else{
			for(j=0;j<6;j++){
				str[j] = i/power_10(5-j)+48;
				i = i%power_10(5-j);
			}
			if((str[0]+str[1]+str[2]+str[3]+str[4]+str[5]-(6*48))!=n)
				continue;
						strcpy(temp,str);
			strrev(temp);
			if(strcmp(str,temp)==0)
				printf("%d\n",i);
			else
				continue;	
		}
	}
	return 0;
 } 
*/
 
/*#include<stdio.h>
int main()
{		//2<=	<=20		0-1   0-9	0-3 0-9		//0929
//	int q=0;
//	int i,j,x,y;
//	int i_,j_,x_,y_;
//	for(i=1;i<10;i++)
//	{
//		for(j=0;j<10;j++)
//		{
//			if(i==1&&j!=9)
//				continue;
//			for(x=0;x<10;x++)
//			{
//				for(y=0;y<10;y++)
//				{
//					for(i_=0;i_<10;i_++)
//					{
//						if(i_==1)
//						{
//							for(j_=0;j_<3;j++)
//							{
//								for(x_=0;x)
//							}		
//						}
//						else
//						{
//							
//						}
//					 } 
//				}
//			}
//		}
//	}
//	printf("%d",q); 1 3 5 7 8 10 12   2 4 6 9 11
	int day;
	int i,j,x,y,i_,j_,x_,y_;
	int e=0;
	for(day=1900;day<=9999;day++)
	{
		int temp = day;
		i=day/1000;
		day = day%1000;
		j = day/100;
		day = day%100;
		x = day/10;
		day = day%10;
		y = day;
		int on_off = 0;
		if(temp%4==0&&temp%100!=0||temp%400==0)
		{
			on_off = 1;
		}
		for(i_=0;i_<2;i_++)
		{
			for(j_=0;j_<9;j_++)
			{
				if(i_=1&&j_>2||i_==0&&j_==0)
					continue;
				for(x_=0;x_<4;x_++)
				{
					for(y_=0;y_<9;y_++)
					{
						if(x_==0&&y_==0||x_==3&&y_>1||i_==0&&j_==2&&x_==3&&y_>0||i_==0&&j_==4&&x_==3&&y_>0||i_==0&&j_==6&&x_==3&&y_>0||i_==0&&j_==9&&x_==3&&y_>0||i_==1&&j_==1&&x_==3&&y_>0)
							continue;
						if(on_off==1&&i_==0&&j_==2&&x_>2)
							continue;
						if((i+j+x+y)==(i_+j_+x_+y_))
							e++;
					}
				}
			}
		} 	
	}
	printf("%d",e);
}
*/
/*#include<stdio.h>
int main()
{
	int i,k,j;
	k=0;
	int num[30] = {99, 22, 51, 63, 72, 61, 20, 88, 40, 21, 63, 30, 11, 18,
	 99, 12, 93, 16, 7, 53, 64, 9, 28, 84, 34, 96, 52, 82, 51, 77}; 
	for(i=0;i<29;i++)
	{
		for(j=i+1;j<30;j++)
		{
			if(num[i]*num[j]>2022)
			{
				k++;
				printf("%d	%d\n",i,j);
			}
		}
	}
	printf("%d",k);
	return 0;
}*/ 
/*#include<stdio.h>
int main()
{
	int num[30][60]={1,1,0,0,1,0,0,0,0,0,1,1,1,1,1,1,1,0,1,0,1,0,0,1,0,0,1,0,0,1,1,0,1,0,1,0,1,1,1,0,1,1,0,1,1,0,1,1,1,0,1,0,0,1,1,1,1,1,1,0,
0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,1,0,1,1,0,0,0,0,0,0,1,0,0,1,0,1,1,0,0,0,1,1,1,1,1,0,0,0,1,0,1,0,1,1,0,0,0,1,1,1,1,0,
0,0,1,0,1,1,1,0,1,0,0,0,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,0,0,0,0,1,0,0,1,0,1,0,1,0,1,0,1,1,1,0,0,1,0,0,0,0,1,0,1,0,0,
1,0,1,1,0,0,0,0,1,1,0,1,0,1,1,1,0,1,1,0,1,0,1,1,0,1,1,0,0,1,0,0,0,1,1,0,1,1,1,1,1,1,0,1,0,0,0,0,0,0,0,1,1,0,1,1,0,0,0,0,
0,1,0,1,0,1,1,0,0,1,0,0,0,1,0,0,0,0,1,1,1,0,0,0,1,0,0,1,1,1,1,0,0,1,1,0,0,0,1,1,1,0,1,1,1,1,0,1,0,1,0,0,1,1,0,0,1,0,1,1,
0,1,0,0,1,1,0,1,1,0,1,0,0,1,1,1,1,0,1,1,1,1，0，1，1，1，1，0，0，1，0，0，1，0，0，1，0，1，0，1，1，1，1，1，0，0，0，1，1，0，1，0，0，0，1，0，0，0，1，1， 
1，0，1，0,0,1,0,1,1,0,0,0,1,1,0,1,0,0,0,0,1,1,0,1,0,1,1,0,0,0,0,0,0,1,1,0,1,1,0,1,1,0,1,0,0,1,0,0,1,1,0,1,1,1,1,0,1,0,1,1,
1,0,1,1,1,1,0,0,0,0,0,0,1,0,1,0,0,0,1,1,1,0,0,1,1,0,0,0,1,0,1,1,0,0,0,0,1,0,0,1,1,0,0,0,1,0,0,1,0,0,0,1,0,1,0,1,1,0,0,1,
0,0,1,1,1,0,1,1,1,0,1,0,0,0,1,0,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,1,0,1,0,1,0,1,0,0,1,1,1,0,0,1,1,0,1,0,1,0,1,1,1,0,
001010101000110001011111001010111111100110000011011111101010
　　011111100011001110100101001011110011000101011000100111001011
　　011010001101011110011011111010111110010100101000110111010110
　　001110000111100100101110001011101010001100010111110111011011
　　111100001000001100010110101100111001001111100100110000001101
　　001110010000000111011110000011000010101000111000000110101101
　　100100011101011111001101001010011111110010111101000010000111
　　110010100110101100001101111101010011000110101100000110001010
　　110101101100001110000100010001001010100010110100100001000011
　　100100000100001101010101001101000101101000000101111110001010
　　101101011010101000111110110000110100000010011111111100110010
　　101111000100000100011000010001011111001010010001010110001010
　　001010001110101010000100010011101001010101101101010111100101
　　001111110000101100010111111100000100101010000001011101100001
　　101011110010000010010110000100001010011111100011011000110010
　　011110010100011101100101111101000001011100001011010001110011
　　000101000101000010010010110111000010101111001101100110011100
　　100011100110011111000110011001111100001110110111001001000111
　　111011000110001000110111011001011110010010010110101000011111
　　011110011110110110011011001011010000100100101010110000010011
　　010011110011100101010101111010001001001111101111101110011101};
 } 

*/
/*#include<stdio.h>
int main()
{
	int w,n;
	int result;
	scanf("%d",&w);
	scanf("%d",&n);
	if(n>=7)
	{
		n = n%7;
	}
	result = w+n;
	if(result>7)
	{
		result = result%7;
		printf("%d",result);
	}
	else
		printf("%d",result);
	return 0;
 } */
/*#include<stdio.h>
int main()
{
		int i,j,x,y,k;
		k=0;
		int num[100001];
		for(i=1;i<10;i++)
		{
			for(j=0;j<10;j++)
			{
				for(x=0;x<10;x++)
				{
					for(y=0;y<10;y++)
					{
						if(i==y&&j==x)
						{
							num[k] = i*1000+j*100+x*10+y;
							k++;
						}
					}
				}
			}
		}
		for(i=0;i<k;i++)
		{
			for(j=i+1;j<k;j++)
			{
				if(num[i]>num[j])
				{
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for(i=0;i<k;i++)
		{
			printf("%d\n",num[i]);
		}
		return 0;
}*/
/*#include<stdio.h>
int power_3(int a)
{
	int i,c;
	c = a;
	for(i=0;i<2;i++)
	{
		a = a*c;
	}
	return a;
}
int main()
{
	int i,j,k,x;
	x = 0;
	int a[1001];
	for(i=1;i<10;i++)
	{
		for(j=0;j<10;j++)
		{
			for(k=0;k<10;k++)
			{
				if(power_3(i)+power_3(j)+power_3(k)==i*100+j*10+k)
				{
					a[x] = i*100+j*10+k;
					x++;
				}
			}
		}
	}
	for(i=0;i<x;i++)
	{
		for(j=i+1;j<x;j++)
		{
			if(a[i]>a[j])
			{
				int temp = a[i];
				a[i]=a[j];
				a[j] = temp;
			}
		}
	}
	for(i=0;i<x;i++)
		printf("%d\n",a[i]);
	return 0;
}*/ 
/*#include<stdio.h>
//int factorial(int a)
//{
//	int result = 1;
//	int b = a;
//	for(int i=0;i<a;i++)
//	{
//		result = result*b--;
//	}
//	return result;
//}
double factorial(int a)
{
	double i;
	if(a==0)
		return 1;
	else
		return a*factorial(a-1);
}
int main()
{
	int n;
	int i,j;
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		if(i==1)
		{
			printf("%d\n",1);
			continue;
		}
		for(j=0;j<i;j++)
		{
			double temp = 0;
			int k = i-1;
			if(j==0||j==k)
			{
				printf("%d ",1);
				continue;
			}
			temp = factorial(k)/factorial(j)/(factorial(k-j));
			printf("%.0f ",temp);		//C j i = i!/j!*(i-j)!
		}
		printf("\n");
	}	
}
*/
/*#include<stdio.h>
int main()
{
	int i,n,a;
	scanf("%d",&n);
	int b[n];
	for(i=0;i<n;i++)
	{
		scanf("%d",&b[i]);
	}
	scanf("%d",&a);
	int on_of = 0;
	for(i=0;i<n;i++)
	{
		if(b[i]==a)
		{
			printf("%d",i+1);
			on_of = 1;
			break;
		}
	}
	if(on_of==0)
		printf("%d",-1);
	return 0;
}*/
/*#include<stdio.h>
int main()
{
	int j,i,n;
	scanf("%d",&n);
	int a[n];
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	 }
	for(i=0;i<n-1;i++)
	{
		for(j=i;j<n;j++)
		{
			if(a[i]>a[j])
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	int sum = 0;
	for(i=0;i<n;i++)
	{
		sum += a[i];
	}
	printf("%d\n",a[n-1]);
	printf("%d\n",a[0]);
	printf("%d\n",sum);
	return 0;
}*/ 
//#include<stdio.h>
//int main()
//{
//	char str[27] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//	int n,m,i,j;
//	scanf("%d%d",&n,&m);
//	for(i=0;i<n;i++)
//	{ 
//		for(j=0;j<m;j++)
//		{
//			if(i-j>0)
//				printf("%c",str[i-j]);
//			else
//				printf("%c",str[j-i]);
//		}
//		printf("\n");
//	}
//	return 0; 
//}
/*#include<stdio.h>
int main()
{
	printf("00000\n");
	printf("00001\n");
	printf("00010\n");
	printf("00011\n");
	printf("00100\n");
	printf("00101\n");
	printf("00110\n");
	printf("00111\n");
	printf("01000\n");
	printf("01001\n");
	printf("01010\n");
	printf("01011\n");
	printf("01100\n");
	printf("01101\n");
	printf("01110\n");
	printf("01111\n");
	printf("10000\n");
	printf("10001\n");
	printf("10010\n");
	printf("10011\n");
	printf("10100\n");
	printf("10101\n");
	printf("10110\n");
	printf("10111\n");
	printf("11000\n");
	printf("11001\n");
	printf("11010\n");
	printf("11011\n");
	printf("11100\n");
	printf("11101\n");
	printf("11110\n");
	printf("11111\n");
	return 0;
}*/
/*#include<stdio.h>
int main()
{
	char str[6] = "00000";
	int i,j;
	for(i=0;i<32;i++)
	{
		printf("%s\n",str);
		str[4] += 1;
		for(j=4;j>=0;j--)
		{
			if(str[j]=='2')
			{
				str[j-1]++;
				str[j] -= 2;
			}
		}
	}
	return 0;
}*/
/*#include<stdio.h>	//模拟赛相等日期 
int leap_years(int a)
{
	if(a%4==0&&a%100!=0||a%400==0)
		return 1;
	else
		return 0;
}
int main()
{
	int year,month,day,i,j,x,y,m_1,m_2,d_1,d_2;
	int result = 0;
	for(year=1900;year<=9999;year++)
	{
		int temp1 = year;
		int on_of = 0;
		i = temp1/1000;
		temp1 = temp1%1000;
		j = temp1/100;
		temp1 = temp1%100;
		x = temp1/10;
		temp1 = temp1%10;
		y = temp1;
		on_of = leap_years(year);
		for(month = 1;month<=12;month++)
		{
			int temp2 = month;
			m_1 = temp2/10;
			temp2 = temp2%10;
			m_2 = temp2;
			for(day=1;day<=31;day++)
			{
				int temp3 = day;
				d_1 = temp3/10;
				temp3 = temp3%10;
				d_2 = temp3;
				if(i+j+x+y==m_1+m_2+d_1+d_2)		//1
				{
					if(month==2&&on_of==1&&day>29||month==2&&on_of==0&&day>28||month==4&&day>30||month==6&&day>30||month==9&&day>30||month==11&&day>30)
						continue;				// 2 4 6 9 11
					result++;
				}
			}
		}
	}
	printf("%d",result);
}*/
/*#include<stdio.h>		//同上 
int sum(int a)
{
	int i;
	int sum_ = 0;
	while(a)
	{
		sum_ += a%10;
		a /= 10;
	}
	return sum_; 
}
int main()
{
	int year,month,day;
	int result = 0;
	int m[12] = {31,28,31,30,31,30,31,31,30,31,30,31};
	for(year=1900;year<=9999;year++)
	{
		bool on_of = year%4==0&&year%100!=0||year%400==0;
		int y = sum(year);
		for(month=1;month<=12;month++)
		{
			int m_ = sum(month);
			if(on_of)
				m[1] = 29;
			else
				m[1] = 28;
			for(day=1;day<=m[month-1];day++)
			{
				int d = sum(day);
				if(d+m_==y)
					result++;
			}
		}
	}
	printf("%d",result);
	return 0;
}*/
//#include<stdio.h>
//int main()
//{
//	int i;
//	long n;
//	long result=1;
//	scanf("%l	d",&n);
//	long f[n] = {1,1};
//	for(i=3;i<=n;i++)
//	{
//		int i_ = i-1;
//		if(n==1)
//		{
//			printf("%d",1);
//			break;
//		}
//		else if(n==2)
//		{
//			printf("%d",2);
//			break;
//		}
//		else
//		{
//			result = f[i_-1]%10007+f[i_-2]%10007;
//			f[i_-1] = f[i_-2];
//			f[i_-2] = result;
//		}
//	}
//	printf("%ld",result);
//	return 0;
//}
/*#include<stdio.h>		//斐波那契数列 fail 
long f(long a)
{
	long x;
	if(a==1||a==2)
		return 1;
	else if(a==0)
		return 0;
	x = f(a-1)+f(a-2);
	return x;
}
int main()
{
	long i,n,result,a=1,b=1;
	result = 0;
	scanf("%d",&n);
	long fn = f(n);
	int k = 0;
	int temp1 = fn;
	while(fn)
	{
		k++;
		fn /= 10;
	}
	char str[k+1];
	for(i=k-1;i>=0;i--)
	{
		str[i] = temp1%10+48;
		temp1 = temp1/10;
	}
	for(i=0;i<k;i++)
	{
		int temp;
		result = (result*10+str[i]-'0')%10007;
	}	
	printf("%ld",result);
}*/
//#include<stdio.h>
//int main()
//{
//	int fy[100000];
//	int i,n;
//	scanf("%d",&n);
//	fy[1] = 1;
//	fy[2] = 1;
//	for(i=3;i<=n;i++)
//	{
//		fy[i] = (fy[i-1]+fy[i-2])%10007;
//	}
//	printf("%d",fy[n]);
//	return 0;
//}
/*#include<stdio.h>
int main()
{
	int i,sum,j;
	int n,a,b;
	a=1;
	b=0;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		sum = (a+b)%10007;
		a = b;
		b = sum;
	}
	printf("%d",sum);
	return 0;
 } */
/*#include<stdio.h>
#define PI 3.14159265358979323
int main()
{
	double s;
	int r;
	scanf("%d",&r);
	s = r*r*PI;
	printf("%.7f",s); 
	return 0;
}
*/
/*#include<stdio.h>
int main()
{
	long long n;
	scanf("%ld",&n);
	printf("%lld",n*(n+1)/2);
	return 0;
}*/
/*#include <stdio.h>	//单词分析 
#include <stdlib.h>
#include<string.h>


int main(int argc, char *argv[])
{
  // 请在此输入您的代码
  char a[1001];		//1122
  scanf("%s",a);
  int b[strlen(a)] = {0};
  int i,j;
  for(i=0;i<strlen(a);i++)		//laa
  {
    for(j=0;j<strlen(a);j++)
    {
      if(a[i]==a[j])
      {
		b[j]++;
      	break;
	  }
    }
  }
	int max=0;
  for(i=1;i<strlen(a);i++)
  {
		if(b[max]<b[i])
		{
			max = i;
		}
		
	}
	for(i=1;i<strlen(a);i++)
	{
		if(b[max]==b[i]&&a[max]>a[i])
		{
			max = i;
		}
	}
    printf("%c\n%d",a[max],b[max]);
  return 0;
}*/
/*#include<stdio.h>
int main()
{
	int s[26] = {0};
	int i,max;
	char ch;
	max = 0;
	while((ch=getchar())!='\n')
	{
		s[ch-'a']++;
	}
	for(i=1;i<26;i++)
	{
		if(s[max]<s[i])
		{
			max = i;
		}
	}
	printf("%c\n%d",max+'a',s[max]);
	return 0;
}*/
//#include<stdio.h>
//int main()
//{
//  // 请在此输入您的代码
//  double pass,good;
//  pass = 0;
//  good = 0;
//  int i,n;
//  scanf("%d",&n);
//  int stu[n];
//  for(i=0;i<n;i++)
//    scanf("%d",&stu[i]);
//  for(i=0;i<n;i++)
//  {
//    if(stu[i]>=60)
//      pass++;
//    if(stu[i]>=85)
//      good++;
//  }
//  pass = (pass/n*1000);
//  good = (good/n*1000);
//  int pass_ = (int)pass;
//  int good_ = (int)good;
//  if(pass_%10>=5)
//    pass_ = pass_+10-pass_%10;
//  else
//    pass_ = pass_ - pass_%10;
//  if(good_%10>=5)
//    good_ = good_+10-good_%10;
//  else
//    good_ = good_ - good_%10;
//  printf("%d%%\n%d%%\n",pass_/10,good_/10);
//  return 0;
//}
/*#include<stdio.h>
int main()
{
	int num[19][19] = 
	{
		999,2  ,1  ,1  ,1  ,999,999,999,999,999,999,999,999,999,999,999,999,999,999,
		2  ,999,999,999,999,999,2  ,999,999,2  ,999,999,999,999,999,999,999,999,999,
		1  ,999,999,3  ,999,3  ,3  ,999,999,999,999,999,999,999,999,999,999,999,999,
		1  ,999,3  ,999,1  ,999,2  ,1  ,3  ,999,999,999,999,999,999,999,999,999,999,
		1  ,999,999,1  ,999,999,999,1  ,3  ,999,999,999,999,999,999,999,999,999,999,
		999,999,3  ,999,999,999,1  ,999,999,1  ,999,999,999,999,999,999,999,999,999,
		999,1  ,3  ,2  ,999,1  ,999,999,3  ,999,2  ,999,999,999,999,999,999,999,999,
		999,999,999,1  ,1  ,999,999,999,1  ,999,999,2  ,999,999,999,999,999,999,999,
		999,999,999,2  ,3  ,999,999,1  ,999,999,999,999,3  ,999,999,999,999,999,999,
		999,2  ,999,999,999,1  ,999,999,999,999,999,999,999,999,999,999,999,999,2  ,
		999,999,999,999,999,999,2  ,999,999,999,999,3  ,999,1  ,999,2  ,999,999,999,
		999,999,999,999,999,999,999,2  ,999,999,3  ,999,1  ,999,999,999,999,1  ,999,
		999,999,999,999,999,999,999,999,3  ,999,999,1  ,999,2  ,999,999,1  ,999,1  ,
		999,999,999,999,999,999,999,999,999,999,1  ,999,2  ,999,999,1  ,999,999,999,
		999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,1  ,1  ,3  ,999,
		999,999,999,999,999,999,999,999,999,999,2  ,999,999,1  ,1  ,999,999,999,999,
		999,999,999,999,999,999,999,999,999,999,999,999,1  ,999,1  ,999,999,999,999,
		999,999,999,999,999,999,999,999,999,999,999,1  ,999,999,3  ,999,999,999,1  ,
		999,999,999,999,999,999,999,999,999,2  ,999,999,1  ,999,999,999,999,1  ,999,
	};
//	printf("%3d",num[18 ][18]);
	int i,j,min;
	int num[19][19];
	int dis[20] = {0};
	for(i=0;i<18;i++)
	{
		for(j=i+1;j<19;j++)
		{
			
		}
}
	
	
	
	
}*/

/*#include <stdio.h>
#include <stdlib.h>

int map[20][20];//记录每一个点到其邻接点的距离 
void add(char n, char m, int length)
{
    int a = n - 'A' + 1;
    int b = m - 'A' + 1;
    map[a][b] = map[b][a] = length;
}//将图转换为邻接表样式;
void floyd()
{
    for(int k=1;k<=19;k++)							1	
        for(int i=1;i<=19;i++)						1		
        {												
            for(int j=1;j<=19;j++)					1	
            {
                if(map[i][j]>map[i][k]+map[k][j])
                {
                    map[i][j]=map[i][k]+map[k][j];
                }
            }
        }
    }
    printf("%d",map[1][19]);
}
int main(int argc, char* argv[])
{
    for(int i=1;i<=19;i++)
    {
        for(int j=1;j<=19;j++)
        {
            map[i][j]=9999;
        }
    }
    add('A', 'B', 2);
    add('A', 'C', 1);
    add('A', 'D', 1);
    add('A', 'D', 1);
    add('B', 'J', 2);
    add('B', 'G', 1);
    add('C', 'D', 3);
    add('C', 'F', 3);
    add('C', 'G', 3);
    add('D', 'E', 1);
    add('D', 'G', 2);
    add('D', 'H', 1);
    add('D', 'I', 2);
    add('E', 'H', 1);
    add('E', 'I', 3);
    add('F', 'G', 1);
    add('F', 'J', 1);
    add('G', 'F', 1);
    add('G', 'I', 3);
    add('G', 'K', 2);
    add('H', 'I', 1);
    add('H', 'L', 2);
    add('I', 'M', 3);
    add('J', 'S', 2);
    add('K', 'N', 1);
    add('K', 'L', 3);
    add('K', 'P', 2);
    add('L', 'M', 1);
    add('L', 'R', 1);
    add('M', 'N', 2);
    add('M', 'Q', 1);
    add('M', 'S', 1);
    add('N', 'P', 1);
    add('O', 'P', 1);
    add('O', 'Q', 1);
    add('O', 'R', 3);
    add('R', 'S', 1);
    floyd();
    return 0;
}*/
/*#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#define NUM 9999
int cost[6][6];
void add(char a,char b,int length){
	int p,q;
	p = a - 'A'+1;
	q = b - 'A'+1;
	cost[p][q] = length;
	cost[q][p] = length;
}
int main()
{
	int i,j,min,temp;
	int final[6];
	int path[6]; 
	int dist[6] = {9999};
	
	for(i=0;i<6;i++)	//初始化数组 
	{
		for(j=0;j<6;j++)
		{
			cost[i][j] = NUM;
		}
	}
	
	add('A','B',6);
	add('A','C',1);
	add('B','C',3);
	add('B','E',10);
	add('C','D',4);
	add('D','E',1);
	
	for(i=0;i<6;i++)	//初始化最短路径 
	{
		dist[i] = cost[1][i];
	}
	
	for(i=0;i<6;i++)	//初始化查找过最短路径的点 
	{
		final[i] = 0;
	}
	
	for(i=0;i<6;i++)		//初始化前驱节点 
	{
		path[i] = 1;
	}
	
	final[1] = 1;	//A - A 不用查找最短路径 
	
	for(i=2;i<6;i++)
	{
		min = NUM;
		for(j=1;j<6;j++)
		{
			if(!final[j]&&dist[j]<min)
			{
				min = dist[j];
				temp = j;
			}
		}
		final[temp] = 1;
		for(j=1;j<6;j++)
		{
			if(!final[j]&&dist[j]>dist[temp]+cost[temp][j])
			{
				dist[j] = dist[temp]+cost[temp][j];	
				path[j] = temp;
			}
		}
	}
	printf("A到E最短路径为；%d\n",dist[5]);
	int temp1 = 5;
	char path_[6] = "E";
//	printf("A到E的路径为：E");
	while(1)
	{
//		printf("%c",path[temp1]+'A'-1);
		char temp2[2];
		temp2[0] = path[temp1]+64; 
		strncat(path_,temp2,1);
		temp1 = path[temp1];
		if(path[temp1]==1)
		{
			strcat(path_,"A");
			strrev(path_);
			break;
		}
	}
	printf("A到E的路径为：%s\n",path_);
	return 0;
}
*/
/*#define MAXVEX 9
#define INFINITY 65535
typedef int Pathmatirx[MAXVEX];	//用于存储最短路径下标的数组
typedef int ShortPathTable[MAXVEX];	//用于存储到各点最短路径的权值和
/* Dijkstra算法，求有向图G的v0顶点到其余顶点v最短路径P[v]及带权长度D[v]，P[v]的值为前驱顶点下标，D[v]表示v0到v的最短路径长度和 */
//void ShortestPath_Dijkstra(MGraph G, int v0, Pathmatirx *P, ShortPathTable *D){
//	int v, w, k, min;
//	int final[MAXVEX];	//final[w] = 1表示求得顶点v0到vw的最短路径
//	for(v=0;v<G.numVertexes;v++){		//初始化数据
//		final[v] = 0;	//全部顶点初始化为未知最短路径状态
//		(*D)[v] = G.matirx[v0][v];	//将与v0点有连线的顶点加上权值
//		(*P)[v] = 0;	//初始化路径数组P为0
//	}
//	(*D)[v0] = 0;	//v0至v0路径为0
//	final[v0] = 1;	//v0至v0不需要求路径
//	/* 开始主循环，每次求得v0到某个v顶点的最短路径 */
//	for(v=1;v<G.numVertexes;v++){
//		min = INFINITY;	//当前所知离v0顶点的最近距离
//		for(w=0;w<G.numVertexes;w++){	//寻找离v0最近的顶点
//			if(!final[w] && (*D)[w]<min){
//				k = w;
//				min = (*D)[w];	//w顶点离v0顶点更近
//			}
//		}
//		final[k] = 1;	//将目前找到的最近的顶点置为1
//		for(w=0;w<G.numVertexes;w++){	//如果经过v顶点的路径比现在这条路径的长度短的话
//			if(!final[w] && (min+G.matirx[k][w] < (*D)[w])){	//说明找到了更短的路径，修改D[w]和P[w]
//				(*D)[w] = min +G.matirx[k][w];	//修改当前路径长度
//				(*P)[w] = k;
//			}	
//		}
//	}
//}
/*#include<stdio.h>		// DIJKSTRA算法 
#include<stdlib.h>
#include<string.h>
#define INIFITY 9999
int cost[20][20];
void add(char a,char b,int length)
{
	int p,q;
	p = a - 'A'+1;
	q = b- 'A'+1;
	cost[p][q] = length;
	cost[q][p] = length;
}
void add_G()
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
	int i,j,min,k;
	int dist[20];
	int path[20];
	int final[20];
	
	for(i=0;i<20;i++)
	{
		for(j=0;j<20;j++)
		{
			cost[i][j] = INIFITY;
		}
	}
	add_G();
	
	for(i=0;i<20;i++)
		dist[i] = cost[1][i];
	
	for(i=0;i<20;i++)
		path[i] = 1;
	
	for(i=0;i<20;i++)
		final[i] = 0;
		
	final[1] = 1;
	for(i=2;i<20;i++)
	{
		min = INIFITY;
		for(j=1;j<20;j++)
		{
			if(!final[j]&&dist[j]<min)
			{
				min = dist[j];
				k = j;
			}
		}
		final[k] = 1;
		for(j=1;j<20;j++)
		{
			if(!final[j]&&dist[j]>min+cost[k][j])
			{
				dist[j] = min+cost[k][j];
				path[j] = k;
			}
		}
	}
	printf("%d\n",dist[19]);
//	printf("%d\n",path[2]);		//10 2 1
//	int temp = 19;
//	printf("S");
//	while(path[temp]!=1)
//	{
//		printf("%c",path[temp]+64);
//		temp = path[temp];
//	}
//	printf("A");
	int temp = 19;
	int path_[10] = {19};
	int w = 1;
	while(path[temp]!=1)
	{
		path_[w] = path[temp];
		temp = path[temp];
		w++;
	}
	path_[w] = 1;
	for(i=w;i>=0;i--)
	{
		printf("%c",path_[i]+64);
	}
}
*/
/*#include<stdio.h>
#include<string.h>
#include<stdbool.h>
#include<stdlib.h>
int main()
{
	int day,month,year,i,j,k,date,date1,date2;
	int fate[13] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	scanf("%d",&date);
	int w = date;
	int e = date;
	day = w%100+1;
	w /= 100;
	month = w%100;
	w /= 100;
	year = w;
	
//	printf("	day%d month%d year%d\n",day,month,year);
	bool find1 = false;
	bool find2 = false;
//	printf("%d\n\n%d\n\n",date1,date2);
	for(i=year;i<=9999;i++)
	{	
		if(year%4==0&&year%100!=0||year%400==0)
			fate[2] = 29;
		else 
			fate[2] = 28;
		for(j=month;j<=12;j++)
		{
			month = 1;
			for(k=day;k<=fate[j];k++)
			{
				int year1,year2,year3,year4,month1,month2,day1,day2,temp;
				temp = i;
				year1 = temp%10;
				temp /= 10;
				year2 = temp%10;
				temp /= 10;
				year3 = temp%10;
				temp /= 10;
				year4 = temp;
				temp = j;
				month1 = temp%10;
				temp /= 10;
				month2 = temp;
				temp = k;
				day1 = temp%10;
				temp /= 10;		//4321 21 21 20211202
				day2 = temp;	//2101 10 12  2021 1202
				
				if(year1==month2&&year2==month1&&year3==day2&&year4==day1)
				{
					find1 = true;
					date1 = i*10000+j*100+k;
					break;
				}
			}
			day = 1;
			if(find1)
				break;
		}
		if(find1)
			break;
	}
	day = e%100+1;
	e /= 100;
	month = e%100;
	e /= 100;
	year = e;
//	printf("%d\n%d\n%d\n",year,month,day);
	for(i=year;i<=9999;i++)
	{	
		if(year%4==0&&year%100!=0||year%400==0)
			fate[2] = 29;
		else 
			fate[2] = 28;
		for(j=month;j<=12;j++)
		{
			month = 1;
			for(k=day;k<=fate[j];k++)
			{
				
				int year1,year2,year3,year4,month1,month2,day1,day2,temp;
				temp = i;
				year1 = temp%10;
				temp /= 10;
				year2 = temp%10;
				temp /= 10;
				year3 = temp%10;
				temp /= 10;
				year4 = temp;
				temp = j;
				month1 = temp%10;
				temp /= 10;
				month2 = temp;
				temp = k;
				day1 = temp%10;
				temp /= 10;	
				day2 = temp;
				if(year1==month2&&year1==year3&&year1==day2&&year2==year4&&year2==month1&&year2==day1)
				{
					find2 = true;
					date2 = i*10000+j*100+k;
					break;
				}
			}
			day = 1;
			if(find2)
				break;
		}
		if(find2)
			break;
	}
	printf("%d\n%d",date1,date2);
}*/
/*#include<stdio.h>		//回文日期 
#include<string.h>
int fate[13] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
void leap_year(int year)
{
	if(year%4==0&&year%100!=0||year%400==0)
		fate[2] = 29;
	else
		fate[2] = 28;
}
int effective(int date)
{
	int year,month,day;
	day = date%100;
	month = (date/100)%100;
	year = date/10000;
	leap_year(year);
	if(month<=12&&month>=1&&day>=1&&day<=fate[month])
		return 1;
	else
		return 0;
}
int main()
{
	int i,j,date;
	scanf("%d",&date);
	int on_of = 0;
	for(i=date+1;i<=99999999;i++)
	{
		int k = effective(i);
		if(!k)
			continue;
		int year1,year2,year3,year4,month5,month6,day7,day8;
		day8 = i%10;
		day7 = (i/10)%10;
		month6 = (i/100)%10;
		month5 = (i/1000)%10;
		year4 = (i/10000)%10;
		year3 = (i/100000)%10;
		year2 = (i/1000000)%10;
		year1 = i/10000000;
//		printf("%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n",year1,year2,year3,year4,month5,month6,day7,day8);
//		printf("%d",i);
		if(on_of==0&&year1==day8&&year2==day7&&year3==month6&&year4==month5)
		{
			printf("%d\n",i);
			on_of = 1;
		}
		if(year1==day8&&year2==day7&&year3==month6&&year4==month5&&year1==year3&&year2==year4)
		{
			printf("%d",i);
			break;
		}
//		if(i==10000102)
//			break;
	}
}*/
#include<stdio.h>
int main()
{
	
	int num[10] = {2021,2021,2021,2021,2021,2021,2021,2021,2021,2021};
	int i=0,result=0;
	while(num[0]!=-1&&num[1]!=-1&&num[2]!=-1&&num[3]!=-1&&num[4]!=-1&&num[5]!=-1&&num[6]!=-1&&num[7]!=-1&&num[8]!=-1&&num[9]!=-1)
	{
		int temp = i;
		if(i==0)
			num[0]--;
		else
		{
			while(temp)
			{
				num[temp%10]--;
				temp = temp/10;
			}
		}
		i++;
	}
	printf("%d",i-2);
	return 0;
}





