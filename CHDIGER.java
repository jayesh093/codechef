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
public class CHDIGER {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int test_cases=sc.nextInt();
       while(test_cases-->0){
           long  N=sc.nextLong();
           int d=sc.nextInt();
           
           String s=Long.toString(N);
           char c[]=s.toCharArray();
           String ns="0";
           int len=s.length();
           
           for (long i = 0; i <len; i++) {
               
               for (long j = 0; j <len; j++) {
                   if(i!=j){
                    ns+=c[(int)j];
                   }
               }
               ns+=d;
            if(N>Long.parseLong(ns)){
                N=Long.parseLong(ns);
            }
            //   System.out.println(Integer.parseInt(ns));
               ns="0";
           }
           System.out.println(N);
       }
       
    }
}
