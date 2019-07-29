#include<iostream>
using namespace std;

int main()
{
    int t,a,b,remindar;
    cin>>t;
    while(t>0)
    {
        cin>>a>>b;
        remindar=a%b;
        cout<<remindar<<endl;
        t--;
    }
    return 0;
}
