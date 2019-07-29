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
public class MGAME {
    public static void main(String args[]){
        int Test_cases,N,P;
        Scanner sc=new Scanner(System.in);
        Test_cases=sc.nextInt();
        while(Test_cases > 0){
            N=sc.nextInt();
            P=sc.nextInt();
            int s[]=new int[1000000];
            int m=0;
            for (int i = 1; i <= P; i++) {
                for (int j =1 ; j <=P; j++) {
                    for (int k = 1; k <=P; k++) {
                      int w=(int)(((N%i)%j)%k);
                        if(w!=0){
                        s[m]=w;
                            m++;
                        }

                    }
                }
            }
            //logic for sorting
            for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
            if (s[i] >= s[j]) {
                int x = s[i];
                s[i] = s[j];
                s[j] = x;
            }
            }
           }

            //count number of element repiting
            int t=s[0];
            int count=1;
            int arrc[]=new int[m];
            int fa=0;
            for (int i = 1; i <=m; i++) {
                if(t==s[i]){
                count++;
                }else{
                arrc[fa]=count;
                t=s[i];
                fa++;
                count=1;
                }

            }
            //maximum number searching
            int pa=0;
            for (int i = 0; i <fa; i++) {
                if(pa <arrc[i]){
                pa=arrc[i];
                }
            }
           System.out.println(pa);
      
            Test_cases--; 
        
        }
    }
}
