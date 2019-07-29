#include<iostream>
using namespace std;
int main()
{
    int t,a,b,c;
    cin>>t;
    while(t>0)
    {
        cin>>a>>b>>c;

        if((a+b+c)==180)
        {
            if((a==0) || (b==0) || (c==0))
            cout<<"NO"<<endl;
            else
            cout<<"YES"<<endl;
        }
        else
            cout<<  "NO"<<endl;
        t--;
    }
    return 0;
}
