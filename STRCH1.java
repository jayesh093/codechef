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
public class STRCH1 {
    public static void main(String[] args) {
           int count=0;
        Scanner sc=new Scanner(System.in);
        int test_cases=sc.nextInt();
        while(test_cases -- >0){
         
            int n=sc.nextInt();
            String s=sc.next();
            char x = sc.next().charAt(0);
            
            int cc=0;
            int s_f=0;
            char aa[]=s.toCharArray();
            int size_f[] =new int[s.length()];
            for (int i = 0; i <s.length(); i++) {
                if(aa[i]==x){
                    size_f[s_f]=i;
                    s_f++;
                }
            }  
            for (int i = 0; i <n; i++) {
                cc+=String_create(s,i,size_f,s_f);
            }
            
            System.out.println(cc);
        }
    }
    public static int String_create(String s,int n,int[] x,int s_f){
        int cc=0;
        for(int i = 0; i <s.length()- n; i++) {
           cc+=find(i,i+n,x,s_f);
        }
            return cc;
    }
    public static int find(int i,int j,int []x,int s_f){
        for (int k = 0; k <s_f; k++) {
            if(x[k]>=i && x[k]<=j){
                return 1;
            }
        }
       return 0;
    }
}
