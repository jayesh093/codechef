#include<iostream>
using namespace std;

int main()
{
    int test,N,K,sum=0;
    cin>>test;
    while(test>0){
        cin>>N>>K;
        int arr[N];
        for(int i=0;i<N;i++){
            cin>>arr[i];
        }
        for(int i=(N-1);i>=0;i--){

            sum=sum+arr[i];
        }
        if(sum>=K){
              cout<<"1";
        }else{
            cout<<"2";
        }
        sum=0;
        test--;
    }
 return 0;
}
