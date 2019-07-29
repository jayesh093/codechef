/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_cheff_problem;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *Valid Stack Operations Problem Code: VALIDSTK

 * @author jayesh
 */
public class icpc1 {
      public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int Test_cases,temp,loops;
          Test_cases = sc.nextInt();
           
          while(Test_cases>0){
              loops=sc.nextInt();
              int arr[]=new int[loops];
             int test=0;
             temp=0;
              for (int i = 0; i < loops; i++) {
                  arr[i]=sc.nextInt();
              }
              for (int i = 0; i < loops; i++) {
               if(arr[i]==0){
               if(temp==0){
               test++;
               break;
                }
                   temp--;
               }else{
               temp++;
               }
              }
              if(test==0){
              System.out.println("Valid");
              }else{
              System.out.println("Invalid");
              
              }
              Test_cases--;
          }
      }
      }

