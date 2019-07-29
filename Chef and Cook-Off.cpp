#include<iostream>
using namespace std;

int main()
{
    int no;
    cin>>no;
    while(no>0)
    {
        int a[5],count=0;
        for(int i=0;i<5;i++)
        {
            cin>>a[i];
        }
        for(int i=0;i<5;i++)
        {
            if(a[i]==1)
            {
            count++;
            }
        }
        if(count==0)
        {
            cout<<"Beginner"<<endl;
        }
        else if(count==1)
        {
            cout<<"Junior Developer"<<endl;
        }
        else if(count==2)
        {
            cout<<"Middle Developer"<<endl;
        }
        else if(count==3)
        {
            cout<<"Senior Developer"<<endl;
        }
        else if(count==4)
       {
         cout<<"Hacker"<<endl;
       }
       else
       {
           cout<<"Jeff Dean"<<endl;
       }
        no--;
    }
    return 0;
}
