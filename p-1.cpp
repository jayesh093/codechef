#include<iostream>
using namespace std;

int main()
{
    int no,e_no,c_no,sum=0,flag=0;
 //   cout<<"enter the line"<<endl;
    cin>>no;
    for(int i=0;i<no;i++)
    {
   //     cout<<"enter the no of elephant "<<endl;
        cin>>e_no;
     //   cout<<"enter the no of candies"<<endl;
        cin>>c_no;
        int arr[e_no];
       // cout<<"enter the arr elements"<<endl;
          for(int j=0;j<e_no;j++)
          {
              cin>>arr[j];
          }
          for(int j=0;j<e_no;j++)
          {

              sum=sum+arr[j];

        }
            if(sum>c_no)
              {
                  cout<<"No"<<endl;
              }
              else
              {
                  cout<<"Yes"<<endl;
              }
}
    return 0;
}
