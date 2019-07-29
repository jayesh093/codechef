#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main(){

int t;
cin>>t;
while(t-->0){
    int n,k;
    cin>>n>>k;
    long long int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    sort(arr,arr+n);
    long long int sum_p=0,sum_c=0;
    for(int i=0;i<k;i++){
        sum_c=sum_c+arr[i];
    }
    for(int i=k;i<n;i++){
        sum_p=sum_p+arr[i];
    }
    cout<<sum_p-sum_c<<endl;
}
return 0;
}
