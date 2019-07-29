#include<iostream>
using namespace std;

int main()
{
    int t;
    int arr[6]={1,2,5,10,50,100}
    cin>>t;
    while(t>0)
    {
       cin>>no;
       for(int i=5;i<=0;i--)
       {
        sum=no/arr[i];
        div=no%arr[i];
         if(div==0)
         {
             cout<<sum<<endl;
             break;
         }
       }
        t--;
    }
    return 0;
}
