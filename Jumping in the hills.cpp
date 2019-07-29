#include<iostream>
#include<vector>
using namespace std;

int main()
{
    vector<int> arr;
    int t,N,U,D,Count,pera;
    cin>>t;
    while(t>0)
    {
        cin>>N>>U>>D;
        arr.resize(N);
    for(int i=0;i<N;i++)
    {
        cin>>arr[i];
    }
    Count=1;
    pera=1;
    for(int i=0;i<N-1;i++)
    {
        if(arr[i]==0)
        {
            break;
        }
        if(arr[i+1]==0)
        {
            break;
        }
        if(arr[i]==arr[i+1])
        {
            Count++;
            continue;
        }
        else if(arr[i]<arr[i+1])
        {
            if((arr[i+1]-arr[i])>U)
            {
                break;
            }
            else
            {
                Count++;
                continue;
            }
        }
        else
        {
            if((arr[i]-arr[i+1])>D)
            {
                if(pera==1)
                {
                    Count++;
                    pera--;
                    continue;
                }
                break;
            }
            else
            {
                Count++;
            }
        }

    }

      cout<<Count<<endl;
      t--;
    }
}
