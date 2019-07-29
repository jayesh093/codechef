#include<iostream>
#include<string>
using namespace std;

int main()
{
    int t,W;
    string s;
    string a[7]={"mon", "tues", "wed", "thurs", "fri", "sat" ,"sun"};
    cin>>t;
    while(t>0)
    {
       char arr[7]={'4','4','4','4','4','4','4'};
      cin>>W>>s;
        if(W==28)
        {
            for(int i=0;i<7;i++)
            {
                cout<<arr[i]<<" ";
            }
        }
        else
        {
            if(W==29)
            {
                for(int i=0;i<7;i++)
                {
                if(a[i]==s)
                {
                    arr[i]++;
                    break;
                }
                }
                for(int i=0;i<7;i++)
                {
                cout<<arr[i]<<" ";
                }

            }
            else if(W==30)
            {
                for(int i=0;i<7;i++)
                {
                    if(i==6 && a[i]==s)
                    {
                    arr[i]++;
                    arr[0]++;
                    }
                    else if(a[i]==s)
                    {
                    arr[i]++;
                    arr[i+1]++;
                    break;
                    }
                }
                for(int i=0;i<7;i++)
                {
                    cout<<arr[i]<<" ";
                }
            }
            else if(W==31)
            {
                for(int i=0;i<7;i++)
                {
                    if(i==5 &&a[i]==s)
                    {
                        arr[i]++;
                        arr[i+1]++;
                        arr[0]++;
                        break;

                    }
                    else if(i==6 && a[i]==s)
                    {
                        arr[i]++;
                        arr[0]++;
                        arr[1]++;
                        break;

                    }
                    else if(a[i]==s )
                    {
                        arr[i]++;
                        arr[i+1]++;
                        arr[i+2]++;
                        break;
                    }

                }
                for(int i=0;i<7;i++)
                {
                    cout<<arr[i]<<" ";
                }
            }
        }
        t--;
    }
    return 0;
}
