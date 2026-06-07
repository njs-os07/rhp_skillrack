#include<iostream>
using namespace std;
int main(){
    string s;
    cin>>s;
    int l=s.length();
    for(int i=1;i<(1<<l);i++){
        string sub="";
        for(int j=0;j<l;j++){
            if(i & (1<<j)){
                sub+=s[j];
            }
        }
        cout<<sub<<endl;
    }
}