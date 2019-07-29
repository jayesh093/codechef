/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_cheff_problem;

import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author jayesh
 */
public class STRCH {
    public static void main(String[] args) {
           int count=0;
        Scanner sc=new Scanner(System.in);
        int test_cases=sc.nextInt();
        while(test_cases -- >0){
         
            int n=sc.nextInt();
            String s=sc.next();
            char x = sc.next().charAt(0);
            int cc=0;
            for (int i = 0; i <n; i++) {
                cc+=String_create(s,i,x);
            }
            
            System.out.println(cc);
        }
    }
    public static int String_create(String s,int n,char x){
        int cc=0;

        char aa[]=s.toCharArray();
        HashMap<String, Integer> map = new HashMap<>(); 

        for(int i = 0; i <s.length()- n; i++) {
            int w=n+1;
            int j=i;
            
            String as=s.substring(i,i+w);
            if(map.containsKey(as)){
                Integer a = map.get(as); 
                if(a==1){
                cc++;
                }
            }else{
                map.put(as,0);
                while(w-->0){
                if(aa[j]==x){
                 cc++;
                 map.put(as,1);
                 break;   
                }
                j++;
                }
            }      
            
        }
        return cc;
    }
}
