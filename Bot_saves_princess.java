/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_cheff_problem;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bot_saves_princess {

static void displayPathtoPrincess(int n, String [] grid){
    
    int no=n/2;
    int m_r=no;
    int m_c=no;
    
    int p_r=0;
    int p_c=0;
    char arr[]=grid[0].toCharArray();
    char arr1[]=grid[n-1].toCharArray();
    
    if(arr[0]=='p'){
        p_r=0;
        p_c=0;
    }
    if(arr[n-1]=='p'){
        p_r=0;
        p_c=n-1;
    }
    if(arr1[0]=='p'){
        p_r=n-1;
        p_c=0;
    }
    if(arr1[n-1]=='p'){
        p_r=n-1;
        p_c=n-1;
    }
    
    int r=m_r-(p_r);
    int c=m_c-(p_c);
    
    if(r>0 && c>0){
        for (int i = 0; i <no; i++) {
            System.out.println("UP");
        }
         for (int i = 0; i <no; i++) {
            System.out.println("LEFT");
        }
    }
    
       if(r<0 && c<0){
        for (int i = 0; i <no; i++) {
            System.out.println("DOWN");
        }
         for (int i = 0; i <no; i++) {
            System.out.println("RIGHT");
        }
    }
     
          if(r<0 && c>0){
        for (int i = 0; i <no; i++) {
            System.out.println("DOWN");
        }
         for (int i = 0; i <no; i++) {
            System.out.println("LEFT");
        }
    }
        if(r>0 && c<0){
        for (int i = 0; i <no; i++) {
            System.out.println("UP");
        }
         for (int i = 0; i <no; i++) {
            System.out.println("RIGHT");
        }
    }
    
  }

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

    displayPathtoPrincess(m,grid);
    }
}