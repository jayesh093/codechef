#include<iostream>
using namespace std;
int a;
int sum(int D,int N)
{
    if(D>0)
    {
    int s=0;
    for(int i=1;i<=N;i++)
    {
        s+=i;
        a=s;
    }
    D--;
    sum(D,s);
    }
    if(D<=0)
    {
        return a;
    }

}
int main()
{
    int test,N,D;
    cin>>test;
    while(test>0)
    {
        cin>>D>>N;
        cout<<sum(D,N)<<endl;;
        test--;
    }
    return 0;
}
