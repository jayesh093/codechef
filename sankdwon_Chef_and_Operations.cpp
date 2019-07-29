#include<iostream>
#include<string.h>

using namespace std;
int main(){
    int test_ceses,check,no,temp1,temp2,temp3,Count;
    cin>>test_ceses;
    while(test_ceses>0){
        cin>>no;
        int A[no];
        int B[no];
        for(int i=0;i<no;i++){
            cin>>A[i];
        }

        for(int i=0;i<no;i++){
            cin>>B[i];
        }

        while(true){
        check=0;
        for(int i=0;i<no-2;i++){
            temp1=B[i];
            temp2=B[i+1];
            temp3=B[i+2];
            if( (A[i]+1<=(temp1)) && (A[i+1]+2<=(temp2)) && (A[i+2]+3<=(temp3)) ){
                A[i]+=1;
                A[i+1]+=2;
                A[i+2]+=3;
                check++;
                }
            }
            if(check==0){
                break;
            }
        }
        Count=0;
        for(int i=0;i<no;i++){
            if(A[i]!=B[i]){
                Count++;
            }
        }
        if(Count==0){
            cout<<"TAK"<<endl;
        }else{
            cout<<"NIE";
        }
        test_ceses--;
    }
return 0;}
