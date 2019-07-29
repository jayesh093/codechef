/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_cheff_problem;
import java.math.BigInteger;
import java.util.Scanner;
 class p3 {
    public static void main(String[] args) {
         BigInteger[] a,b;
         int test_cases;
         int n,c,t,count,counter;
         Scanner sc = new Scanner(System.in);
         test_cases = sc.nextInt();
         for (int i = 0; i < test_cases; i++) {
            n = sc.nextInt();
            a = new BigInteger[n];
            b = new BigInteger[n];
             for (int j = 0; j < n; j++) {
                 a[j]=sc.nextBigInteger();
             }

             counter=0;
             do{             
                 c = 0;t=0;count=2;
             for (int j = counter+1; j < n; j++) {
                b[c]=a[j];
                c++;
             }
                
                for (int j = 0; j <counter+1; j++) {
                    b[c] = a[j];
                    c++;
                }
               

                 for (int j = 0; j < n-1; j++) {
                     
                     if(!(b[j+1].compareTo(b[j])==1 || b[j+1].compareTo(b[j])==0)){
                         count=0;
                     }
                 }
                 counter++;
             }while(count!=2 && counter<n);
             if(count==2){
                 System.out.println("YES");
             }else{
                 System.out.println("NO");
             }
        }
    }
 }