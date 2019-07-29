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
public class CFMM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Test_cases=sc.nextInt();
   
        while(Test_cases-->0){
                 int c=0,o=0,d=0,e=0,h=0,f=0; 
            int len=sc.nextInt();
         String[] names = new String[len];
            for (int i = 0; i <len; i++) {
                names[i]=sc.next();
            }
            for (int i = 0; i <names.length; i++) {
                char[] chars = names[i].toCharArray();
                for (int j = 0; j <chars.length; j++) {
                    if(chars[j]=='c'){
                    c++;
                    }
                    if(chars[j]=='o'){
                    o++;
                    }
                    if(chars[j]=='d'){
                    d++;
                    }
                    if(chars[j]=='e'){
                    e++;
                    }
                    if(chars[j]=='h'){
                    h++;
                    }
                    if(chars[j]=='f'){
                    f++;
                    }
                }
            }
            int min[]=new int[4];
            min[0]=o;
            min[1]=d;
            min[2]=h;
            min[3]=f;
                                    
            Arrays.sort(min);
          int mins=min[0];
          
            if (mins==0) {
                System.out.println("0");
            }else{
               if(c>=mins*2 && e>=mins*2){
                   System.out.println(mins);
               }else{
                if(c>e){
                    System.out.println(e/2);
                }else{
                    System.out.println(c/2);
                }
               }
            }
        }
    }
}
