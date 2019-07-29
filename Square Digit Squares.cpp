#include<iostream>
#include<math.h>
using namespace std;

int main()
{
    int t,a,b,count=0;
    int no;
    cin>>t;
    while(t>0)
    {
        cin>>a>>b;
        for(int i=0;i<100000;i++)
        {
            no=(int)sqrt(i);
            if((int)sqrt(a)<=no && (int)sqrt(b)>=no)
            {
                count++;
            }
            if(no>=(int)sqrt(b))
                break;
        }
        cout<<count<<endl;
        count=0;
        t--;
    }
    return 0;
}
