#include<iostream>
using namespace std;

int main()
{
    long int no1,no2,Re,sum,j;
    int t;
    cin>>t;
    while(t>0)
    {
        cin>>no1>>no2;
        if(no1>no2)
        {
            do{
            sum=no1/no2;
            Re=no1%no2;
            no1=no2;
            no2=Re;`
             j=sum;
            }while(Re!=0);
            cout<<j;
        }
        else
        {
             do{
            sum=no2/no1;
            Re=no2%no1;
            no2=no1;
            no1=Re;
            sum=Re;
            }while(Re!=0);
            cout<<sum;
        }

        t--;
    }

    return 0;
}
