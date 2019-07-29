#include<iostream>
using namespace std;

int main()
{
    int t,GCD,flag=0,big,small;
    cin>>t;
    while(t>0)
    {
        int no1,no2,no;
        cin>>no1>>no2;
        no=(no1>no2)?no2:no1;
        small=no;
        big=(no1>no2)?no1:no2;
        for(int i=2;i<=no;i++)
        {
            if(no1%i==0 && no2%i==0)
            {
              GCD=i;
              flag=1;
            }
        }

        for(int i=2;i<=no;i++)
        {
            if(small%i==0 && big%i!=0)
            {
                big*=i;
            }
        }
        if(flag==0)
        {
            GCD=1;
        }
        flag=0;
        cout<<GCD<<" "<<big<<endl;

        t--;
    }
return 0;
}
