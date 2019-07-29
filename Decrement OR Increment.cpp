#include<iostream>
using namespace std;

int main()
{
    int no;
    cin>>no;
    if(no%4==0){
        cout<<no+1;
    }else{
    cout<<no-1;
    }
    return 0;
}
