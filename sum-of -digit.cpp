#include<iostream>
using namespace std;

int main()
{
    int t,no,sum=0;
    cin>>t;
    while(t>0)
    {
        cin>>no;
        while(no>0)
        {
            sum+=no%10;
            no=no/10;
        }
        cout<<sum<<endl;
        sum=0;
        t--;
    }
    return 0;
}
