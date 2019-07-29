/*
    #include <iostream>
    #define ll long long
    using namespace std;

    int main() {
    	// your code goes here
    	int t;
    	cin>>t;
    	while(t--)
    	{
    		ll a , b , n;
    		cin>>a>>b>>n;
    		if(n % 2 == 1)
    			a *= 2;
    		if(min(a , b) > 0)
    			cout<<max(a , b) / min(a , b)<<endl;
    	}
    	return 0;
    } */
#include<iostream>
#define ll long double
using namespace std;

int main()
{
    int t;
    ll a,b;
    long long int n;
    cin>>t;
    while(t>0)
    {
      cin>>a>>b>>n;
      while(n>0)
      {
          if(n%2==0)
          {
              b=b*2;
          }
          else
          {
              a=a*2;
          }

          n--;
      }
      if(a>=b)
      cout<<a/b<<endl;
      else
        cout<<b/a<<endl;
        t--;
    }
    return 0;
}
