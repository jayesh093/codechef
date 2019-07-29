#include<iostream>
using namespace std;
long int factorial(long int no)
{
    if(no==0)return 1;
    else
        return factorial(no-1)*no;
}
int main()
{
    long int t,no;
    cin>>t;
    while(t>0)
    {
        cin>>no;
        cout<<factorial(no)<<endl;
        t--;
    }
    return 0;
}
