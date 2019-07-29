#include<iostream>
#include<string.h>

using namespace std;
int arr[]={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
void Prime(int no){
    int mul,Count=0;
    if(no%2==0){
        for(int i=0;i<(sizeof(arr) / sizeof(arr[0]));i++){
            for(int j=i+1;j<(sizeof(arr)/sizeof(arr[0]));j++){
                mul=arr[i]*arr[j];
                if(mul==no ||(mul==no/2)){
                Count++;
                }
            }
        }
    }else{
        int temp;
        for(int i=0;i<(sizeof(arr) / sizeof(arr[0]));i++){
            for(int j=i+1;j<(sizeof(arr)/sizeof(arr[0]));j++){
                mul=arr[i]*arr[j];
                if(no >mul){
                    temp=no-mul;
                    for(int k=0;k<(sizeof(arr)/sizeof(arr[0]));k++){
                        for(int l=k+1;l<(sizeof(arr)/sizeof(arr[0]));l++){
                            if(arr[k]*arr[l]==temp){

                            Count++;
                            }
                        }
                    }
                }
            }
        }
    }
    if(Count!=0){
        cout<<"YES";
    }else{
    cout<<"NO";
    }
}

int main(){
int test_cases,no;
cin>>test_cases;
while(test_cases>0){
    cin>>no;
    Prime(no);
    test_cases--;
}
return 0;
}
