/*Brain's photos */
#pragma comment(linker, "/STACK:1024000000,1024000000")
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<queue>
#include<stack>
#include<math.h>
#include<vector>
#include<map>
#include<set>
#include<cmath>
#include<complex>
#include<string>
#include<algorithm>
#include<iostream>
#define eps 1e-9
#define LL long long
#define PI acos(-1.0)
#define bitnum(a) __builtin_popcount(a)
using namespace std;
const int N = 205;
const int M = 40;
const int inf = 1000000007;
const int mod = 1000000007;
char s[N][N];
int main()
{
    int n,m,i,j;
    bool flag=true;
    scanf("%d%d\n",&n,&m);
    for(i=0;i<n;i++)
        gets(s[i]);
    for(i=0;i<n&&flag;i++)
        for(j=0;s[i][j]!='\0'&&flag;j++)
            if(s[i][j]=='C'||s[i][j]=='M'||s[i][j]=='Y')
                flag=false;
    if(flag)
        puts("#Black&White");
    else
        puts("#Color");
    return 0;
}


