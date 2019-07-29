/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_cheff_problem;

import java.util.Scanner;


public class PPATTERN {
    
       public static  int count=1;
     
	public static void main(String[] args) {
         
         Scanner sc=new Scanner(System.in);
         int test_cases;
         test_cases=sc.nextInt();
         while(test_cases>0){
             int N=sc.nextInt();
             int arr[][] =new int[N][N];
             int i=0;
             int j=0;
             while(j<N){
                 arr[i][j]=count;
                 count++;
                 printDiagonal(i,j,arr);
                 j++;
                 
             }
             j--;
             i++;
             while(i<N){
                arr[i][j] = count++;
                printDiagonal(i, j, arr);
		i++;
             }
             for (int p = 0; p < N; p++) {
		for (int q = 0; q < N; q++) {
                        System.out.print(arr[p][q] + " ");
			}
                	System.out.println();
		}
			count=1;
             test_cases--;
         }
    }
       static void printDiagonal(int i, int j, int[][] arr) {
            int q = j;
		i++;
		j--;
		while (i <= q) {
			arr[i][j] = count++;
			i++;
			j--;
		}
         }
}
