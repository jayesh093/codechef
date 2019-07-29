#include<iostream>
#include<iomanip>
using namespace std;

int main()
{
    int test;
    float quantity ,price,temp;
    cin>>test;
    while(test>0)
    {
        cin>>quantity;
        cin>>price;
        if(quantity>=1000)
        {
            //temp=quantity/10;
            //cout<<fixed<<setprecision(6)<<(quantity-temp)*price<<endl;
            cout<<fixed<<setprecision(6)<<(0.9*quantity*price);

        }
        else
        {
            cout<<fixed<<setprecision(6)<<(quantity*price)<<endl;
        }
        test--;
    }
}
