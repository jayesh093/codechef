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
public class REDONE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_cases=sc.nextInt();
        while(test_cases-->0){
            int no=sc.nextInt();
            long temp=no;
            int M = 1000000007;
            if(no==1){
                System.out.println(no);
            }else{
            for (int i = 0; i <no-1; i++) {
                temp=((i+1)+temp+((i+1)*temp))%M;
                
            }
            System.out.println(temp);
            }
        }
    }
   
}
