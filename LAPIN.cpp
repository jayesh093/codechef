#include<iostream>
#include<string>
#include <bits/stdc++.h>

using namespace std;

int main(){

int t;
cin>>t;
while(t-->0){
    string s;
    cin>>s;
    int len=s.length();
    int left[len/2];
    int right[len/2];
    int rem=len%2;
    for(int i=0;i<(len/2);i++){
        left[i]=s[i];
    }
    int t=0;
    for(int j=(len/2)+rem;j<len;j++){
        right[t]=s[j];
        t++;
    }
    sort(left,left+(len/2));
    sort(right,right+(len/2));
    int c=0;
    for(int i=0;i<(len/2);i++){
        if(left[i]!=right[i]){
            c=1;
            break;
        }
    }
    if(c==0){
        cout<<"YES"<<endl;
    }else{
        cout<<"NO"<<endl;
    }
}
return 0;
}


