#include<iostream>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t-->0){
        int n;
        cin>>n;
        long long int arr[n],pro,sum=0,fi=0;
        for(int i=0;i<n;i++){
            cin>>arr[i];
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                pro=arr[i]*arr[j];
                sum=0;
                while(pro!=0){
                    sum+=pro%10;
                    pro=pro/10;
                }
                if(sum>fi){
                    fi=sum;
                }
            }
        }
        cout<<fi<<endl;
    }
    return 0;
}


