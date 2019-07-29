/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_cheff_problem;

import java.util.Scanner;

/**
 *
 * @author jayesh
 */
public class JAIN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_case=sc.nextInt();
        while(test_case-->0){
           int si=sc.nextInt();
           String [] s=new String[si];
           String [] ns=new String[si]; 
           for (int i = 0; i <si; i++) {
                s[i]=sc.next();
                char [] ch=s[i].toCharArray();
                int len=s[i].length();
                int a=0;
                int e=0;
                int ii=0;
                int w=0;
                int u=0;
                for (int j = 0; j <len; j++) {
                   if(ch[j]=='a' && a==0){
                       ns[i]+=ch[j];
                       a=1;
                   }
                   if(ch[j]=='e' && e==0){
                       ns[i]+=ch[j];
                       e=1;
                   }
                   if(ch[j]=='i' && ii==0){
                       ns[i]+=ch[j];
                       ii=1;
                   }
                   if(ch[j]=='o' && w==0){
                       ns[i]+=ch[j];
                       w=1;
                   }
                   if(ch[j]=='u' && u==0){
                       ns[i]+=ch[j];
                       u=1;
                   }
               }
                     
            }
                int counts=0;
                int a=0;
                int e=0;
                int ii=0;
                int w=0;
                int u=0;
            for (int i = 0; i <si; i++) {
                char [] first=ns[i].toCharArray();
                for (int j = i+1; j < si; j++) {
                    
                    char []second=ns[j].toCharArray();
                    
                    for (int k = 3; k <first.length; k++) {
                    if(first[k]=='a' && a==0){
                       a=1;
                   }
                   if(first[k]=='e' && e==0){
                       e=1;
                   }
                   if(first[k]=='i' && ii==0){
                       ii=1;
                   }
                   if(first[k]=='o' && w==0){
                       w=1;
                   }
                   if(first[k]=='u' && u==0){
                       u=1;
                   }
                  }
                    
                   for (int k = 3; k <second.length; k++) {
                   if(second[k]=='a' && a==0){
                       a=1;
                   }
                   if(second[k]=='e' && e==0){
                       e=1;
                   }
                   if(second[k]=='i' && ii==0){
                       ii=1;
                   }
                   if(second[k]=='o' && w==0){
                       w=1;
                   }
                   if(second[k]=='u' && u==0){
                       u=1;
                   }
                 }
                   if(a==1 && e==1 && ii==1 && w==1 && u==1){
                       counts++;
                }
                    a=e=ii=w=u=0;
               }
            }
            System.out.println(counts);
            
        }
    }
}
