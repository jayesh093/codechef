
#include<iostream>
#include<cstring>
using namespace std;

int main()
{
    int t,M,W,no,k=0;
    string s1,s2,s3;
    cin>>t;
    while(t>0)
    {
        cin>>s1>>s2;
        M=s1.size();
        W=s2.size();
        no=(M>=W)?W:M;
        if(M==W)
        {
            if(strcmp(&s1[0],&s2[0])==0)
             {
                 cout<<"YES"<<endl;
             }
             else
             {
                 cout<<"NO"<<endl;
             }
        }
        else
        {
            if(M>W)
            {
                int j=0,i=0,count=0;
                  while(i<W||j<M)
                  {
                    if(s2[i]==s1[j])
                    {
                        i++;
                        j++;
                    }
                    else
                    {
                        s1[j]=NULL;
                        j++;
                    }
                }
                 for(int i=0;i<M;i++)
                 {
                     if(s1[i]!=NULL)
                     {
                         count++;
                     }
                 }
                if(s2.size()==count)
                {
                    cout<<"YES"<<endl;
                }
                else
                {
                    cout<<"NO"<<endl;
                }
                i=j=0,count;
            }
            else
            {
                 int j=0,i=0,count=0;
                  while(i<M||j<W)
                  {
                    if(s1[i]==s2[j])
                    {
                        i++;
                        j++;
                    }
                    else
                    {
                        s2[j]=NULL;
                        j++;
                    }
                }
                for(int i=0;i<W;i++)
                {
                    if(s2[i]!=0)
                    {
                        count++;
                    }
                }
                if(s1.size()==count)
                {
                    cout<<"YES"<<endl;
                }
                else
                {
                    cout<<"NO"<<endl;
                }
                i=j=0,count=0;
            }
            }
           t--;
            }
    return 0;
}
