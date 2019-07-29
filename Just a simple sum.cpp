#include<iostream>
using namespace std;

int main()
{
    int test;
    int n,m,sum;
    cin>>test;
    while(test>0)
    {
        cin>>n>>m;
        sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=(i*i);
        }
        cout<<(sum%m);
        test--;
    }
return 0;
}

