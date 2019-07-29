/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_cheff_problem;

import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author jayesh
 */
public class SILLYPRS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long test_cases=sc.nextInt();
        long x;
        long y;
        long sum1;
        long n;
        while(test_cases-->0){
        n=sc.nextLong();
        x=0;y=0;
        sum1=0;
            long k;
            for (long i = 0; i <n; i++) {
                k=sc.nextLong();
                if(k%2!=0){
                x++;
                }
                sum1+=k;
            }
               for (long i = 0; i <n; i++) {
                k=sc.nextLong();
                if(k%2!=0){
                y++;
                }
                sum1+=k;
            }
               sum1/=2;
               long loss= (Math.abs(x-y))/2;
               System.out.println((sum1-loss));
        }
    }
}
