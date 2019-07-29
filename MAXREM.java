/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_cheff_problem;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jayesh
 */
public class MAXREM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr); 

        int max=-1;
        for (int i = 0; i <n; i++) {
                if(arr[i]%arr[n-1]>max){
                    max=arr[i]%arr[n-1];
            }
        }
        System.out.println(max);
    }
}
