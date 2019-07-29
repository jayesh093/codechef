#include<iostream>

using namespace std;
int main()
{
    int no,test,arr[50],dec,flage=0;
    cin>>test;
    while(test>0)
    {
        cin>>no;
        for(int i=0;i<no;i++)
        {
            cin>>arr[i];
        }
        for(int i=1;i<=no;i++)
        {
            dec=no-i+1;
            int k=0;
            while(dec>0)
            {
                int mul=1,sum=0,cont=i;
                while(cont>0)
                {
                    sum+=arr[k];
                    mul*=arr[k];
                    cont--;
                    k++;
                }
                if(sum==mul)
                {
                    flage++;
                }
                if(i==1)
                {
                }else
                k=k-i+1;
                dec--;
            }
        }
        cout<<flage<<endl;
        flage=0;
        test--;
    }
    return 0;
}
