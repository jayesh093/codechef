#include<iostream>
using namespace std;

int main()
{
    int t,no;
    cin>>t;
    while(t>0)
    {
        cin>>no;
        int arr[no][no];
        for(int i=0;i<no;i++)
        {
            for(int j=0;j<=i;j++)
            {
                cin>>arr[i][j];
            }
        }
        for(int i=no-1;i>=1;i--)
        {
          for(int j=0;j<=no-2;j++)
          {
              if(arr[i][j]>=arr[i][j+1])
              {
                  arr[i-1][j]+=arr[i][j];
              }
              else
              {
                   arr[i-1][j]+=arr[i][j+1];;
              }
          }
        }
        cout<<arr[0][0]<<endl;
        t--;
    }
    return 0;
}
