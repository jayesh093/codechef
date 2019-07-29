#include<iostream>
using namespace std;

int main()
{
    int test,base;
    cin>>test;
    while(test>0)
    {
        cin>>base;
        base=base-2;
        base=base/2;
        cout<<(base*(base+1)/2)<<endl;
        test--;
    }
}
