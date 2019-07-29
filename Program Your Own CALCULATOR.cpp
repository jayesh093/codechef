#include<iostream>
#include <iomanip>

using namespace std;

int main()
{
    double a,b;
    cin>>a>>b;
    char c;
    cin>>c;
    switch(c){
    case '+':
            cout<<fixed<<setprecision(6)<<a+b;
            break;
    case '-':
            cout<<fixed<<setprecision(6)<<a-b;
            break;
    case '*':
            cout<<fixed<<setprecision(6)<<a*b;
            break;
    case '/':
            cout<<fixed<<setprecision(6)<<a/b;
            break;
    }
    return 0;
}
