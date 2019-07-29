
#include<iostream>
using namespace std;

int main()
{
    int t;
    cin>>t;

    while(t>0)
    {
        int a,b;
        cin>>a;
        int string[a];
        for(int i=0;i<a;i++)
        {
            cin>>string[i];
        }
        cin>>b;
        int substring[b];
        for(int i=0;i<b;i++)
        {
            cin>>substring[i];
        }
        int j=0;
            for(int i=0;i<a && j<b;i++)
            {
                if(string[i]==substring[j])
                    j++;
            }
         if(j==b)
         {
             cout<<"Yes"<<endl;
         }
         else
         {
             cout<<"No"<<endl;
         }
        t--;

    }
    return 0;
}
