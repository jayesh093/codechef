#include<algorithm>
#include<iostream>
#include<vector>
using namespace std;
typedef long long lint;
typedef vector<int>vi;
typedef pair<int,int>pii;
#define rep(i,n)for(int i=0;i<(int)(n);++i)

int main(){
  int t;
  cin>>t;
  while(t--){
    int n;
    cin>>n;
    vi a(2*n);
    rep(i,2*n)cin>>a[i];
    rep(i,2*n)a[i]--;
    int tot=0;
    rep(i,n){
      int sz=a.size();
      vector<vi> t(n+1);
      rep(j,a.size()){
	t[a[j]].push_back(j);
      }
      pii mi(-1,-1);
      rep(i,n+1){
	if(t[i].size()==2){
	  int diff=t[i][0]-t[i][1];
	  if(diff<0)diff+=sz;
	  if(diff>sz/2)diff=sz-diff;
	  mi=max(mi,pii(diff,i));
	}
      }
      int idx=mi.second;
      tot+=mi.first-1;
      vi na;
      rep(j,sz){
	if(a[j]!=idx)na.push_back(a[j]);
      }
      a=na;
    }
    cout<<tot<<endl;
  }
}

