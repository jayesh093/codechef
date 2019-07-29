#include<iostream>
#include<algorithm>
using namespace std;

int main()
{
  int t,arr[4];
  cin>>t;
  while(t>0)
  {
     for(int i=0;i<4;i++)
     {
         cin>>arr[i];
     }
     sort(arr,&arr[4]);
     if(arr[0]==arr[1] && arr[2]==arr[3])
        cout<<"YES"<<endl;
     else
        cout<<"NO"<<endl;
     t--;
  }
    return 0;
}
