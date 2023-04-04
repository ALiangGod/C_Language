#include<stdio.h>
int main()
{
	long long n;
	long long hour,minute,second;
	scanf("%lld",&n);
	second = n/1000%60;
	minute = n/1000/60%60;
	hour = n/1000/60/60%24;
	printf("%02ld:%02ld:%02ld",hour,minute,second);
	return 0;
}
