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
public class CHNUM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test_cases=sc.nextInt();
        while(test_cases-->0){
            int arr_size=sc.nextInt();
            int no;
            int sum1=0,c1=0;
            int sum2=0,c2=0;
            while(arr_size-->0){
                no=sc.nextInt();
                if(no>0){
                    sum1+=no;
                    c1++; 
                }else{
                sum2+=no;
                    c2++;
                }
            }
            if(c1==0){
                System.out.println(c2+" "+c2);
            }
            else if(c2==0){
                System.out.println(c1+" "+c1);
            }else{
                if(c1>c2){
                    System.out.println(c1+" "+c2);
                }else{
                    System.out.println(c2+" "+c1);
                }
            }
            /*
            else if(sum1==(-sum2)){
                if(c1>c2){
                    System.out.println(c1+" "+c2);
                }else{
                    System.out.println(c2+" "+c1);
                }
            }
            else if(sum1>(-sum2)){
                System.out.println(c1+" "+c2);
            }else{
                System.out.println(c2+" "+c1);
            }*/
        }
    }
}
