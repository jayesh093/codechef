#include<iostream>
using namespace std;

int main(void){
    int test_cases,no,day,node,value;
    cin>>test_cases;
    while(test_cases>0){
        cin>>no;
        int A[no];
    for(int i=0;i<no;i++){
        cin>>A[i];
    }
    node=no;
    day=0;
    node=node-1;
    value=A[0];
    int i=1,Count,sum;
    while(true){
    sum=0;
    Count=0;
    for(i;i<=(value)&& i<=no;i++){
        Count++;
        cout<<"Count="<<Count<<" ";
        }
    for(int j=0;j<=value && j<=no;j++){
         sum+=A[j];
         cout<<"sum="<<sum<<" ";
    }

    value=sum+i-1;
    cout<<"i="<<i<<" ";
    day++;
    node-=Count;
    cout<<"day"<<day<<" node="<<node<<" values="<<value<<endl;

    if(node <= 0){
        break;
        }
    }
    cout<<day<<endl;

    test_cases--;
    }
return 0;
}
