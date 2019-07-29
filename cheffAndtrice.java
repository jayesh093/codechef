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
public class cheffAndtrice {
    public static void main(String []args){
    
        Scanner sc=new Scanner(System.in);
        int test_case,no,a[],Count;
        test_case=sc.nextInt();
        for (int i = 0; i < test_case; i++) {
            no=sc.nextInt();
            a=new int[no];
            for (int j = 0; j < no; j++) {
                a[j]=sc.nextInt();
            }
            Count=0;
            for (int j =1; j <no; j++) {
                if(a[j]<a[j-1]){
                Count++;
                }
            }
            if (Count==0 || (Count==1 && a[0]>=a[no-1])) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        
    }
}
