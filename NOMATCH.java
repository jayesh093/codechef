/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_cheff_problem;
import java.util.Scanner;
import java.util.Arrays; 

/**
 *
 * @author jayesh
 */
public class NOMATCH {
    public static void main(String [] args){
    
        Scanner sc=new Scanner(System.in);
        int Test_case;
        Test_case = sc.nextInt();
        while(Test_case>0){
        int size=sc.nextInt();
        int arr[]=new int[size];
            for (int i = 0; i <size; i++) {
                arr[i]=sc.nextInt();
            }
            //sorting of aray
            Arrays.sort(arr); 

            int sum=0;
            for (int i = 0,j=arr.length-1; i <(size/2); i++,j--) {
                sum+=Math.abs(arr[i]-arr[j]);
            }
            System.out.println(sum);
              Test_case--;
        }
    }
    
}
