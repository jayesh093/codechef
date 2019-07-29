#include<iostream>
#include<string.h>
using namespace std;
int main()
{
    int t,arr[51],h;
    cin>>t;
    while(t>0)
    {
        h=0;
		int l=0,i=0,f=0;
		char temp=' ';
   		while(temp==32)
        {
        	cin>>arr[i];
        	cin>>temp;
            i++;
          }
        for(int i=0;i<5;i++)
        {
            cout<<arr[i]<<endl;;
        }
		t--;
    }
    return 0;
}
