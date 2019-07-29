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
public class SNCKYEAR {
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Test_cases=Integer.parseInt(sc.nextLine()); 
        while(Test_cases-->0){
        String N=String.valueOf(sc.nextInt());
        if(N.equals("2010") || N.equals("2015") || N.equals("2016") || N.equals("2017") || N.equals("2019")){
            System.out.println("HOSTED");
        }else{
            System.out.println("NOT HOSTED");
        }
       }
      }
}
