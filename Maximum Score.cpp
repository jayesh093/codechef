    #include<bits/stdc++.h>
    using namespace std;
    int main()
    {
        int t;
        cin>>t;
        while(t--)
        {
            int n;
            cin>>n;
            int a[n][n],i,j;
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    cin>>a[i][j];
                }
            }
            int mx=(1e9)+10,flag=0;
            long long ans=0;
            for(i=n-1;i>=0;i--)
            {
                int temp=-5;
                for(j=0;j<n;j++)
                {
                    if(a[i][j]<mx)
                    {
                        temp=max(temp,a[i][j]);
                    }
                }
                if(temp==-5)
                {
                    flag=1;
                    break;
                }
                mx=temp;
                ans+=temp;
            }
            if(flag)
            {
                cout<<-1<<endl;
            }
            else
            {
                cout<<ans<<endl;
            }
        }
    }
/*
#include<iostream>
#include<algorithm>
using namespace std;
int sum=0;
int main()
{
    int t,no,sum=0;
    cin>>t;
    while(t>0)
    {
        cin>>no;
        long long int arr[no][no];
        for(int i=0;i<no;i++ )
        {
            for(int j=0;j<no;j++)
            {
                cin>>arr[i][j];
            }
        }
        for(int i=0;i<no;i++)
        {
            sort(&arr[i][0],&arr[i][no]);
            sum+=arr[i][no-1];
        }
         cout<<sum;
         sum=0;
        t--;
    }
    return 0;
}
*/
