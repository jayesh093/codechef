
#include<iostream>
#include <cmath>

using namespace std;

int main(){

    long long int test_case,N,K;
    cin>>test_case;
    while(test_case-->0){

        cin>>N>>K;

               long long int val=N/K;

            if(val%K!=0){
                cout<<"YES"<<endl;
            }else{
            cout<<"NO"<<endl;
            }


    }
    return 0;

}
