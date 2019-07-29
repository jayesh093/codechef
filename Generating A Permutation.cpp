
#include<iostream>
using namespace std;
int pro=0;

int max(int no,int no1)
{
    if(no>no1)
     return no;
    else
    return no1;

}
int product(int no,int no1)
{

   pro+=max(no,no1);
   no--;
   if(no<=1) return pro;
   product(no,no-1);
}
int main()
{
    int t,no,sum;
    cin>>t;
    while(t>0)
    {
       cin>>no>>sum;
       if(product(no,no-1)==sum)
       {
           if(no==2)
           {
             cout<<"2"<<" "<<"1"<<endl;
           }
           else
           {
                cout<<"2"<<" "<<"3"<<" ";
                if(no>3)
                {
                   for(long long i=4;i<=no;i++)
                   {
                     cout<<i<<" ";
                   }
                }
                 cout<<"1"<<endl;
           }
       }
       else
        cout<<"-1"<<endl;
       pro=0;
       t--;
    }
    return 0;
}

/*
    #include <iostream>

    using namespace std;

    int sum_of_n_natural_numbers(int n) {
        return (n*(n+1))/2;
    }

    int main() {
        int T, N, K;

        cin >> T;
        while(T--) {
            cin >> N >> K;

            long total = sum_of_n_natural_numbers(N);
            long diff = total-K;
            if(N==1 && K==0) {
                cout << "1\n";
            } else if(diff>0 && diff < N) {
                for(int i=1; i<=N; ++i) {
                    if(i!=diff) {
                        cout << i << " ";
                    }
                }
                cout << diff << endl;
            } else {
                cout << "-1\n";
            }
        }
    }
*/
