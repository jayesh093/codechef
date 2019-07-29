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
class Code_cheff_problem{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int test_cases,p1,p2,k,sum,no;
        test_cases=sc.nextInt();
        for (int j = 0; j < test_cases; j++) {
            
            p1=sc.nextInt();
            p2=sc.nextInt();
            k=sc.nextInt();
            sum=p1+p2;
            if(sum==0){
                  System.out.println("CHEF");
            }else{
            no=0;
            int i=0;
            String temp="CHEF";
          while(!(sum == no || sum-no<k)){
              no+=k;
              if(i%2==0){
                  temp="CHEF";
              }else{
              temp="COOK";
              }
              i++;
           }
          if(sum==no){
             if(temp=="CHEF"){
                 System.out.println("COOK");
             }else{
                System.out.println("CHEF");
             }
          }else{
                if(temp=="CHEF"){
                 System.out.println("COOK");
             }else{
                System.out.println("CHEF");
             }
          }
        }
        }
        }
}
