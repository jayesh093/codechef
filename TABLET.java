package code_cheff_problem;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jayesh
 */
public class TABLET {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Test_cases=Integer.parseInt(sc.nextLine()); 
        while(Test_cases-->0){
           int N=sc.nextInt();
           int B=sc.nextInt();
           int[][] arr=new int[101][3];
            for (int i = 0; i < N; i++) {
                arr[i][0]=sc.nextInt();
                arr[i][1]=sc.nextInt();
                arr[i][2]=sc.nextInt();
            }
            
            int temp=0,k=0;
            while(k<N){
                
                if(arr[k][0]*arr[k][1]>temp && arr[k][2]<=B){
                    temp=arr[k][0]*arr[k][1];
                   }
                k++;
            }
            if(temp==0){
                System.out.println("no tablet");
            }else
            {
                System.out.println(temp);
            }
        }
        
    }

}

