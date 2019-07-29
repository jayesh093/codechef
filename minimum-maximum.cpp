
/*
#include<iostream>
#include <stdio.h>

using namespace std;

inline void scanint(long long int &x)

{
    register long long int c = getchar();

    x = 0;

    long long int neg = 0;

    for(;((c<48 || c>57) && c != '-');c = getchar());

    if(c=='-') {neg=1;c=getchar();}

    for(;c>47 && c<58;c = getchar()) {x = (x<<1) + (x<<3) + c - 48;}

    if(neg) x=-x;

}

int main()

{
    long long int t;

    scanint(t);
    while(t--)
    {
        long long int n,temp=1e6;
        scanint(n);

        long long int arr[n];

        for(long long int i=0;i<n;i++)
        {
            scanint(arr[i]);
            if(temp>arr[i])
            {
                temp=arr[i];
            }
        }
        cout << temp*(n-1) << endl;

    }

    return 0;

}

*/
#include<iostream>
#include<algorithm>
using namespace std;

int main()
{
     long long int t,sum=0;
    long long int size;
    cin>>t;
    while(t>0)
    {
        cin>>size;
        long long int  arr[size];
        for(int i=0;i<size;i++)
        {
            cin>>arr[i];
        }
        sort(&arr[0],&arr[size]);
         for(int i=1;i<size;i++)
         {
             if(arr[0]<=arr[i])sum+=arr[0];
         }
        cout<<sum;
        sum=0;
        t--;
    }
    return 0;
}


