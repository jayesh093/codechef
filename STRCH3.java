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
public class STRCH3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int test_cases=sc.nextInt();
        while(test_cases -- >0){
         
            int n=sc.nextInt();
            String s=sc.next();
            char x = sc.next().charAt(0);
            int size_n=(s.length()*(s.length()+1)/2);
            
           String ss[]=new String[size_n+1];
           int k=0;
            for (int i = 0; i <s.length(); i++) {
                for (int j = 0; j <s.length()-i; j++) {
                      String p=s.substring(j, j+i+1);
                       ss[k]=p;
                      k++;
                }
            }
            int cc=0;
            for (int i = 0; i <k; i++) {
                char ch[]=ss[i].toCharArray();
                for (int j = 0; j < ch.length; j++) {
                    if(ch[j]==x){
                    cc++;
                    break;
                    }
                }
              
            }
            System.out.println(cc);
        }
    }
    
}
