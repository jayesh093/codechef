#include<iostream>
using namespace std;

int main()
{
    int no;
    while(1)
    {
        cin>>no;
        if(no==42)
        {
           break;
        }
        else
        {
            cout<<no<<endl;
        }
    }
    return 0;
}
