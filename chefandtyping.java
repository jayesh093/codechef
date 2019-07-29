/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_cheff_problem;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Krunal
 */
public class chefandtyping {
    public static void main(String[] args) {
        int test_cases;
        Scanner sc = new Scanner(System.in);
        test_cases = sc.nextInt();
        char[][] a;
        double finaltime,totaltime;
        double time;
        int strsize;
        HashMap<Character,String> hmp = new HashMap<Character,String>();
        hmp.put('d',"left");
        hmp.put('f',"left");
        hmp.put('j',"right");
        hmp.put('k',"right");
        
        for(int i = 0; i < test_cases; i++) {
            strsize = sc.nextInt();
            a = new char[strsize][20];
            for (int j = 0; j < strsize; j++) {
                 a[j] = sc.next().toCharArray();
            }
            char[] b;
            char[] c;
            int count;
         finaltime=0;
         
            for (int j = 0; j < strsize; j++) {
             time = 0.2;
             count = 0;
              b=a[j];
              for (int k = j-1; k >= 0; k--) {
		c=a[k];
 
                boolean h = Arrays.equals(b, c);
                if(h){
                    count=1;
                }
              }
                for (int k = 1; k < a[j].length; k++) {  
                    if (hmp.get(a[j][k]) == hmp.get(a[j][k-1])) {
                        time+=0.4;
                    }else{
                        time+=0.2;
                    }
                }
                if(count==1){
                    time = time/2;
                }
               finaltime = finaltime+time;
            }
       // System.out.println((int)(totaltime*10));
        }
       
    }
}
