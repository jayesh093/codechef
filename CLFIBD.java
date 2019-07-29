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
    
public class CLFIBD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Test_cases=Integer.parseInt(sc.nextLine()); 
        while(Test_cases-->0){
           int  al[]=new int[26];
           int count_al[]=new int[26];
           int count=0,flag=0;
            String str;
            str=sc.nextLine();
            char[] stringTochar=str.toCharArray();
            for(int i=0;i<str.length();i++){
			al[stringTochar[i]-'a']++;}
            for(int i=0;i<26;i++){
            	if(al[i]>0)
		count_al[count++]=al[i];				
            }
            if(count>2){
		for(int i=2;i<count;i++){
                    flag=check(count_al[i],count_al[i-1],count_al[i-2]);
		      if(flag==1)
			break;
                    }	
		}
            if(flag==1){
                System.out.println("Dynamic");
            }else{
                System.out.println("Not");
            }		
        }
    }
   public static int check(int a,int b,int c)
    {
    if(a==(b+c)||b==(a+c)||c==(a+b))
    	return 1;
    else	 
    	return 0;
    }
}
