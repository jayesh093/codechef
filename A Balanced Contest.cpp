#include<iostream>
using namespace std;

int main()
{
    int test,N,P,arr[500],hard,cakewalk;
    cin>>test;
    while(test>0)
    {
        cakewalk=0;
        hard=0;
        cin>>N>>P;
        for(int i=0;i<N;i++)
        {
            cin>>arr[i];
        }
        for(int i=0;i<N;i++)
        {
        if(P/2==arr[i]||arr[i]==P)
        cakewalk++;
        else
            hard++;
        }
        if(cakewalk==1 && hard==2)
            cout<<"yes"<<endl;
        else
            cout<<"no"<<endl;
        test--;
        }
    return 0;
}

