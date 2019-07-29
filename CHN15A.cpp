#include<iostream>
using namespace std;

int main(){
int t;
cin>>t;
while(t-->0){
    int n,k,w,c=0;
    cin>>n>>k;
    for(int i=0;i<n;i++){
        cin>>w;
        if((w+k)%7==0){
            c++;
        }
    }
    cout<<c<<endl;
}
return 0;
}
