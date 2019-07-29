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
public class CHEFFED {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        int x=0;
        for (int i =N-100; i <N; i++) {
         if((i+digit(i)+digit(digit(i)))==N){
          x+=1;   
         }
        }
        System.out.println(x);
    }
    public static int digit(int N){
        
        int sum=0;
        while(N!=0){
        sum+=(N%10);
        N=N/10;
        }
        return sum;
    }
    
    
    }
