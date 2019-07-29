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
public class HMAPPY2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Test_cases=sc.nextInt();
        while(Test_cases-->0){
             int N,A,B,K;
             N=sc.nextInt();
             A=sc.nextInt();
             B=sc.nextInt();
             K=sc.nextInt();
             if(N%A==0 && N%B==0){
               if(K<=N){
                   System.out.println("Win");
               }else{
                   System.out.println("Lose");
               }
             }else if(N%A==0){
                   System.out.println("Win");
             }else{
                System.out.println("Lose");

             }
               
        }
    }
}
