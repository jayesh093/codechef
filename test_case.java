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
public class test_case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_cases=sc.nextInt();
        while(test_cases-->0){
            int a=sc.nextInt();
            for (int i = 1; i < 10; i++) {
                System.out.println(a+" "+i);
            }
        }
    }
}
