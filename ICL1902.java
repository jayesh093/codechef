/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_cheff_problem;

import java.util.Scanner;
import java.lang.Math; 

/**
 *
 * @author jayesh
 */
public class ICL1902 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Test_cases=sc.nextInt();
        while(Test_cases-->0){
            int no=sc.nextInt();
            int c=0;
            while(no!=0){
                int a=(int)Math.sqrt(no);
                no-=(a*a);
                c++;
            }
            System.out.println(c);
        }
    }
}
