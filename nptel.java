/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package code_cheff_problem;

import java.util.Scanner;



import java.util.Scanner;
/*
class nptel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Size_arr=sc.nextInt();
        int arr[][]=new int[Size_arr][2];
        for (int i = 0; i <Size_arr; i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        for (int i = 0; i <Size_arr; i++) {
            for (int j = i+1; j < Size_arr; j++) {
                if(arr[i][0]>arr[j][0]){
                int temp0;
                int temp1;
                temp0=arr[j][0];
                temp1=arr[j][1];
                arr[j][0]=arr[i][0];
                arr[j][1]=arr[i][1];
                arr[i][0]=temp0;
                arr[i][1]=temp1;
                }
            }
        }
        int count=1;
        int i ;
        for (i=1; i < Size_arr; i++) {
            int tes=arr[i-1][1];
            int ja=0;
            while(arr[i-1][0]==arr[i][0]){
                    if(arr[i-1][1]>arr[i][1]){
                        tes=arr[i][1];
                    }else{
                    tes=arr[i-1][1];
                    }
                    i++;
                    ja=1;
                }
                if(ja==1){
                    i--;
                }

            int sum=arr[i-1][0]+tes;
            if(ja==1){
            if(arr[i+1][0]>=sum){
            count++;
            }
            }else{
            if(arr[i+1][0]>=sum){
            count++;
            }
            }
            ja=0;
	if(i==Size_arr-1){
            break;
            }
        }
        System.out.println(count);
    }
 
}


*/

/**
 *
 * @author jayesh
 */
public class nptel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Size_arr=sc.nextInt();
        int arr[][]=new int[Size_arr][2];
        for (int i = 0; i <Size_arr; i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        for (int i = 0; i <Size_arr; i++) {
            for (int j = i+1; j < Size_arr; j++) {
                if(arr[i][0]>arr[j][0]){
                int temp0;
                int temp1;
                temp0=arr[j][0];
                temp1=arr[j][1];
                arr[j][0]=arr[i][0];
                arr[j][1]=arr[i][1];
                arr[i][0]=temp0;
                arr[i][1]=temp1;
                }
            }
        }
        int count=1;
        for(int i = 1; i < Size_arr; i++) {
            int tes=arr[i-1][0];
            while(arr[i-1][0]==arr[i][0]){
                if(arr[i-1][1]>arr[i][1]){
                    tes=arr[i][1];
                }else{
                tes=arr[i-1][1];
                }
                i++;
            }
            int sum=arr[i-1][0]+tes;
            if(arr[i][0]>=sum){
            count++;
            }
            if(i==Size_arr-1){
                break;
            }
        }
        System.out.println(count);
    }
 
}
