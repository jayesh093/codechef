#include<iostream>
using namespace std;

int main(){

int t;
cin>>t;
while(t-->0){
    int n;
    long long int c;
    cin>>n>>c;
    long long int w,sum=0;
    for(int i=0;i<n;i++){
        cin>>w;
        sum=sum+(w);
    }
    if(sum<=c){
        cout<<"Yes"<<endl;
    }else{
        cout<<"No"<<endl;
    }

}
return 0;
}
