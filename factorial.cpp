
#include<iostream>
using namespace std;
int main()
{
    long t,no,div=0;
    cin>>t;
    while(t>0)
    {
        cin>>no;
        while(no)
        {
            no/=5;
            div+=no;
        }
      cout<<div<<endl;
        div=0;
        t--;
    }
    return 0;
}

