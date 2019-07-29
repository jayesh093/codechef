#include<iostream>
using namespace std;

int main()
{
    long int n,a,b,c;
    int t;
    cin>>t;
    while(t>0)
    {
        cin>>n>>a>>b>>c;
        int count=0;
        int sum;
        if(n%2==0)
        {
            for(int i=2;i<=a;i=i+2)
            {
                for(int j=2;j<=b;j=j+2)
                {
                    if(i*j>n)
                    {
                        break;
                    }
                    else
                    {
                        for(int z=2;z<=c;z=z+2)
                        {
                            sum=i*j*z;
                            if(sum==n)
                            {
                                count++;
                            }
                        if(sum>n)
                        break;
                        }
                    }
            }
        }
        }
        else
        {
                for(int i=1;i<=a;i=i+2)
                {
                for(int j=1;j<=b;j=j+2)
                {
                    if(i*j>n)
                    {
                        break;
                    }
                    else
                    {
                        for(int z=1;z<=c;z=z+2)
                        {
                            sum=i*j*z;
                            if(sum==n)
                            {
                                count++;
                            }
                        if(sum>n)
                        break;
                        }
                    }
            }
        }

        }
        cout<<count;
        t--;
    }
    return 0;
}
