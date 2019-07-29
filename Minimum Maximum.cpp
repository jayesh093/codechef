
#include<iostream>
#include<algorithm>
using namespace std;

int main()
{
    int test,Size,MAX,sum=0;
    int arr[5001];
    cin>>test;
    while(test>0)
    {
        cin>>Size;
        for(int i=0;i<Size;i++)
        {
            cin>>arr[i];
        }
        sort(&arr[0],&arr[Size]);
        MAX=arr[0];
        for(int i=1;i<Size;i++)
        {
            MAX=MAX>arr[i]?arr[i]:MAX;
            sum=sum+MAX;
        }
        cout<<sum<<endl;
        test--;
        sum=0;
    }
    return 0;
}
