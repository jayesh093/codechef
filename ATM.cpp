/*    #include<iostream>
    using namespace std;

    int main(){
        int withdraw_amount;
        float bank_balance;

        cin>>withdraw_amount>>bank_balance;
        if((withdraw_amount+0.5)>=bank_balance)
        {
            cout<<bank_balance;
        }
        else{
            if(withdraw_amount % 5 == 0)
                cout<<(bank_balance-withdraw_amount-0.5);
            else
                cout<<bank_balance;
        }
        return 0;
    }


*/
#include <iostream>
using namespace std;

int main() {

     int x;
     float y;
     cin>>x;
     cin>>y;
     if(y>x)
     {
         if(x%5==0)
         {
             y=y-x-0.5;
             cout<<y;
         }
         else
        cout<<y;
     }
     else
     {
        cout<<y;
     }
    return 0;
}
