#include<iostream>
using namespace std;

int main()
{
    char arr[8];
    int flage,no;
    cin>>no;
    while(no>0)
    {
        flage=0;
    for(int i=0;i<8;i++)
    {
        cin>>arr[i];
    }
    for(int i=0;i<8;i++)
    {
        if(i==7)
        {
        if(arr[i]!=arr[0])
        {
            flage++;
        }
        }
        else
        {
        if(arr[i]!=arr[i+1])
        {
            flage++;
        }
        }
    }
    if(flage<=2)
        cout<<"uniform"<<endl;
    else
    cout<<"non-uniform"<<endl;
    no--;
    }
    return 0;
}
