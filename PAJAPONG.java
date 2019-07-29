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
public class PAJAPONG {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_cases=sc.nextInt();
        int x;
        int y;
        int k;
        while(test_cases-->0){
        x=sc.nextInt();
        y=sc.nextInt();
        k=sc.nextInt();
        if(((x+y)/k)%2==0)
        {
         System.out.println("Chef");
        }else
        {
         System.out.println("Paja");
        }
        
        }
    }
}
