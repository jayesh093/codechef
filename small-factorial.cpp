/*
    #include <bits/stdc++.h>
    using namespace std;
    void fact(int n)
    {
    	int a[205];
    	int dig=1;
        a[0]=1;
        for(int i=2;i<=n;i++)
        {
        	int temp=0;
        	int x;
        	for(int j=0;j<dig;j++)
        	{
        		x=(a[j]*i)+temp;

        		a[j]=x%10;
        		x=temp=x/10;
        	}
        	while(x)
        	{
        		a[dig++]=x%10;
        		x=x/10;
        	}

        }
        for(int i=dig-1;i>=0;i--)
        {
        	cout<<a[i];
        }
        cout<<endl;

    }
    int main()
    {
    	int t;
    	cin>>t;
    	while(t--)
    	{
    		int n;
    		cin>>n;
    		fact(n);
    	}
    }


*/
#include<iostream>
using namespace std;

int main()
{
    int no;
    cin>>no;
    int arr[205],temp=1;
    for(int i=0;i<no;i++)
    {
        cin>>arr[i];
    }
    for(int i=0;i<no;i++)
    {

        for(int j=1;j<=arr[i];j++)
        {
          temp*=j;
        }
        arr[i]=temp;
        temp=1;
     cout<<arr[i]<<endl;
    }
    return 0;
}
