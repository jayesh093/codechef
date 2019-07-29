#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
    int t,a,b,c;
    cin>>t;
    while(t>0)
    {
        cin>>a>>b>>c;
        int arr[3]={a,b,c};
      sort(&arr[0],&arr[3]);
      cout<<arr[1]<<endl;
      t--;
    }
    return 0;
}
