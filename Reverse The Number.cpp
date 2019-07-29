#include<iostream>
#include<math.h>
using namespace std;

int main()
{
    int t,no,no1,count=0,sum=0,a;
    double p;
    cin>>t;
    while(t>0)
    {
        cin>>no;
        no1=no;
        while(no>0)
        {
            no=no/10;
            count++;
        }
        p=pow(10,(count-1));
        while(no1>0)
        {

            a=no1%10;
            sum+=a*p;
            no1=no1/10;
            p=p/10;

        }
        cout<<sum<<endl;
        count=0;
        sum=0;
        t--;
    }
return 0;
}
