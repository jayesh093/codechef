
#include<iostream>
#include<algorithm>
using namespace std;

int main()
{
    int t,no,temp;
    string s;
    cin>>t;
    while(t>0)
    {
         cin>>s;
         no=s.length();
         int arr[no];
        for(int i=0;i<no;i++)
        {
          arr[i]=s[i];
        }
        temp=arr[0];
        for(int i=0;i<no;i++)
        {
            if(arr[i]==no-1)
            {
              arr[0]=no-1;
              arr[i]=temp;
            }
        }
         sort(&arr[1],&arr[no]);
        cout<<arr[no-1]<<endl;
        t--;
    }
}
