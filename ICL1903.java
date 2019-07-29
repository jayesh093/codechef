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
public class ICL1903 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);   
        int Test_cases=sc.nextInt();
        while(Test_cases-->0){
            int N=sc.nextInt();
            int M=sc.nextInt();
            int K=sc.nextInt();
            if(M>N){
                System.out.println("-1");
            }else{
             int a=N%M;
             if(a==0){
                   System.out.println("0");
               }else{
                  if(a%K==0){
                      System.out.println(a/K);
                  }else{
                      System.out.println((a/K)+1);
                  }
               }
            }
        }
    
        
    }
}

