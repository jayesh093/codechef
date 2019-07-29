#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t--)
    {
        int n;cin>>n;
        int a[n];
        for(int i=0;i<n;i++)
        {
            cin>>a[i];
        }
        int counti=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]<a[i-1])
            {
                counti++;
            }
        }
        }
        if(counti==0||(counti==1&&a[0]>=a[n-1]))
        {
            cout<<"YES"<<endl;
        }
        else
        cout<<"NO"<<endl;
    }
}
