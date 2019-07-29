#include<iostream>
#include<string.h>
#include<stdio.h>
#include <ctype.h>
using namespace std;
int main()
{
    int test,temp,k=0;
    //char arr[10000],ch;
    cin>>test;
    for(int j=0;j<test;j++)
    {
       for(int i=0; i<k;i++)
        {
            temp=0;
            if(arr[i]==' ')
            {
                cout<<toupper(arr[temp]);
                cout<<". ";
                temp=i+1;
            }
        }
        cout<<toupper(arr[temp]);
        for(int i=temp+1;i<k;i++)
        {
            cout<<tolower(arr[i]);

        }

    }

    return 0;
}
