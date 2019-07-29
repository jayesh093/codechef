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
public class Chef_and_SnackDown_B {
      public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int Test_cases;
          String values;
          Test_cases = sc.nextInt();
              System.out.println(Test_cases);
          
          for (int i = 0; i < Test_cases; i++) {
              
              values=sc.next();
             System.out.println(values);
              
              if(values.equals("2010")||values.equals("2015") || values.equals("2016") ||values.equals("2017") ||values.equals("2019") ){
              System.out.println("HOSTED");
              }else{
               System.out.println("NOT HOSTED");
              }
          }
      }
}
