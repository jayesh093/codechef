#include<iostream>
using namespace std;
int arr[10];

int main()
{
    int t,no,count=0;
    cin>>t;
    while(t>0)
    {
        cin>>no;
        while(no>0)
        {
         arr[count]=no%10;
         count++;
         no=no/10;

        }
        cout<<arr[0]+arr[count-1]<<endl;
        count=0;
        t--;
    }

    return 0;
}
